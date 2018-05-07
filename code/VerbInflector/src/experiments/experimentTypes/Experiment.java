package experimentTypes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import classificationSampleTypes.ClassificationSampleIfc;
import statisticalTools.Histogram;
import Features.Feature;
import Features.UnseenFeature;
import featureExtraction.FeatureExtractorIfc;

public abstract class Experiment {

	protected double training = 1;
	protected double testing = 0;
	protected List<ClassAndFeatureListContainer> _trainingSet;
	protected List<ClassAndFeatureListContainer> _testingSet;
	protected FeatureExtractorIfc featureExtractor;
	protected HashMap<String,Integer> featureTrnStringToNumbers;
	protected HashMap<Integer,Feature> featureNumbersToTrnSetFeatures;
	protected HashMap<String,Integer> classStringToNumber;
	protected HashMap<Integer,String> classNumberToString;
	protected Histogram histogram;
	
	public Experiment(ExperimentDataContainer experimentDataContainer,FeatureExtractorIfc ftrExtractor){
		this.training = experimentDataContainer.getTraning();
		this.testing = 1 - training;
		this._trainingSet = new ArrayList<ClassAndFeatureListContainer>();
		this._testingSet = new ArrayList<ClassAndFeatureListContainer>();
		this.featureExtractor = ftrExtractor;
		init(experimentDataContainer.getSamples());
	}
	
	public Experiment(List<ClassificationSampleIfc> trainingSet, List<ClassificationSampleIfc> testingSet, FeatureExtractorIfc ftrExtractor){
		double totalSamples = trainingSet.size() + testingSet.size();
		this.training = trainingSet.size()/totalSamples;
		this.testing = 1 - this.training;
		this._trainingSet = new ArrayList<ClassAndFeatureListContainer>();
		this._testingSet = new ArrayList<ClassAndFeatureListContainer>();
		this.featureExtractor = ftrExtractor;
		this.initWithGivenTrnAndTst(trainingSet, testingSet);
	}
	
	private void init(List<ClassificationSampleIfc> samples){
		List<String> classes = new ArrayList<String>();
		for(ClassificationSampleIfc instance : samples){
			classes.add(instance.getClassName());
		}
		this.histogram = new Histogram(classes);
		
		samples = this.shuffleFeatures(samples);
		List<List<ClassificationSampleIfc>> testAndTrain = this.splitToTrainAndTest(samples);
		for(ClassificationSampleIfc sample : testAndTrain.get(0)){
			this._trainingSet.add(new ClassAndFeatureListContainer(sample,this.featureExtractor.getWordFeatures(sample)));
		}
		this.featureTrnStringToNumbers = new HashMap<String, Integer>();
		this.featureNumbersToTrnSetFeatures = new HashMap<Integer, Feature>();
		this.classStringToNumber = new HashMap<String, Integer>();
		this.classNumberToString = new HashMap<Integer, String>();
		int ftrIndx = 1;
		int classIndx = 1;
		// adding the class and feature types of the training set
		for(ClassAndFeatureListContainer cfCont: this._trainingSet){
			if (!this.classStringToNumber.containsKey(cfCont.getClss())){
				this.classStringToNumber.put(cfCont.getClss(), classIndx);
				this.classNumberToString.put(classIndx, cfCont.getClss());
				classIndx++;
			}
			for(Feature f: cfCont.getFeatures()){	
				if(!this.featureTrnStringToNumbers.containsKey(f.toString())){
					this.featureTrnStringToNumbers.put(f.toString(), ftrIndx);
					this.featureNumbersToTrnSetFeatures.put(ftrIndx, f);
					ftrIndx++;
				}
			}
		}
		for(ClassificationSampleIfc sample : testAndTrain.get(1)){
			List<Feature> allTstFeatures = this.featureExtractor.getWordFeatures(sample);
			List<Feature> tstFeaturesPlusUnseen = new ArrayList<Feature>();
			for(int i=0; i<allTstFeatures.size(); i++){
				Feature f = allTstFeatures.get(i);
				if(this.featureTrnStringToNumbers.containsKey(f.toString())){					
					tstFeaturesPlusUnseen.add(f);
				} else{
					tstFeaturesPlusUnseen.add(new UnseenFeature());
				}
			}
			this._testingSet.add(new ClassAndFeatureListContainer(sample,tstFeaturesPlusUnseen));
		}
		// adding the class types of the test set
		for(ClassAndFeatureListContainer cfCont: this._testingSet){
			if (!this.classStringToNumber.containsKey(cfCont.getClss())){
				this.classStringToNumber.put(cfCont.getClss(), classIndx);
				this.classNumberToString.put(classIndx, cfCont.getClss());
				classIndx++;
			}
		}
	}
	
	private void initWithGivenTrnAndTst(List<ClassificationSampleIfc> trnSamples, List<ClassificationSampleIfc> tstSamples){
		List<String> classes = new ArrayList<String>();
		List<ClassificationSampleIfc> allSamples = new ArrayList<ClassificationSampleIfc>();
		allSamples.addAll(trnSamples);
		allSamples.addAll(tstSamples);
		for(ClassificationSampleIfc instance : allSamples){
			classes.add(instance.getClassName());
		}
		this.histogram = new Histogram(classes);
		
		trnSamples = this.shuffleFeatures(trnSamples);
		tstSamples = this.shuffleFeatures(tstSamples);
		
		for(ClassificationSampleIfc sample : trnSamples){
			this._trainingSet.add(new ClassAndFeatureListContainer(sample,this.featureExtractor.getWordFeatures(sample)));
		}
		this.featureTrnStringToNumbers = new HashMap<String, Integer>();
		this.featureNumbersToTrnSetFeatures = new HashMap<Integer, Feature>();
		this.classStringToNumber = new HashMap<String, Integer>();
		this.classNumberToString = new HashMap<Integer, String>();
		int ftrIndx = 1;
		int classIndx = 1;
		
		// adding the class and feature types of the training set
		for(ClassAndFeatureListContainer cfCont: this._trainingSet){
			if (!this.classStringToNumber.containsKey(cfCont.getClss())){
				this.classStringToNumber.put(cfCont.getClss(), classIndx);
				this.classNumberToString.put(classIndx, cfCont.getClss());
				classIndx++;
			}
			for(Feature f: cfCont.getFeatures()){	
				if(!this.featureTrnStringToNumbers.containsKey(f.toString())){
					this.featureTrnStringToNumbers.put(f.toString(), ftrIndx);
					this.featureNumbersToTrnSetFeatures.put(ftrIndx, f);
					ftrIndx++;
				}
			}
		}
		
		for(ClassificationSampleIfc sample : tstSamples){
			List<Feature> allTstFeatures = this.featureExtractor.getWordFeatures(sample);
			List<Feature> tstFeaturesPlusUnseen = new ArrayList<Feature>();
			for(int i=0; i<allTstFeatures.size(); i++){
				Feature f = allTstFeatures.get(i);
				if(this.featureTrnStringToNumbers.containsKey(f.toString())){					
					tstFeaturesPlusUnseen.add(f);
				} else{
					tstFeaturesPlusUnseen.add(new UnseenFeature());
				}
			}
			this._testingSet.add(new ClassAndFeatureListContainer(sample,tstFeaturesPlusUnseen));
		}
		
		// adding the class types of the test set
		for(ClassAndFeatureListContainer cfCont: this._testingSet){
			if (!this.classStringToNumber.containsKey(cfCont.getClss())){
				this.classStringToNumber.put(cfCont.getClss(), classIndx);
				this.classNumberToString.put(classIndx, cfCont.getClss());
				classIndx++;
			}
		}
	}
	 
	private List<List<ClassificationSampleIfc>> splitToTrainAndTest(List<ClassificationSampleIfc> samples){
		List<ClassificationSampleIfc> trn = new ArrayList<ClassificationSampleIfc>();
		List<ClassificationSampleIfc> tst = new ArrayList<ClassificationSampleIfc>();
		int totalNumOfFetures = samples.size();
		int trainingNumOfSamples = new Double(new Double(totalNumOfFetures).doubleValue()*this.training).intValue();
		int testingNumOfSamples = totalNumOfFetures - trainingNumOfSamples;
		trn = samples;
		tst = new ArrayList<ClassificationSampleIfc>();
		for (int i=0; i<testingNumOfSamples; i++){
			 int rndPos = new Random().nextInt(trn.size());
			 tst.add(trn.remove(rndPos));
		}
		ArrayList<List<ClassificationSampleIfc>> ret = new ArrayList<List<ClassificationSampleIfc>>();
		ret.add(trn);
		ret.add(tst);
		return ret;
	}
	
	private List<ClassificationSampleIfc> shuffleFeatures(List<ClassificationSampleIfc> samples){
		List<ClassificationSampleIfc> ret = new ArrayList<ClassificationSampleIfc>();
		int size = samples.size();
		for (int i=0; i<size; i++){
			 int rndPos = new Random().nextInt(samples.size());
			 ret.add(samples.remove(rndPos));
		}
		return ret;
	}
	
	// The user readable file contant
	public String getTrainingSetToString(){
		return this.makeExperimentSetToString(this._trainingSet);
	}
	
	public String getTestingSetToString(){
		return this.makeExperimentSetToString(this._testingSet);
	}
	
	// The classifier's file contant
	public String getClassifierTrainingSetToString(){
		return this.makeClassifierSetToString(this._trainingSet);
	}
	
	public String getClassifierTestingSetToString(){
		return this.makeClassifierSetToString(this._testingSet);
	}
	
	private String makeExperimentSetToString(List<ClassAndFeatureListContainer> set){
		String ret = new String();
		int length = set.size();
		for (int i=0; i<length; i++){
			String newline = (i!=length-1) ? "\n" : "";
			ret += set.get(i).getSample().toString() + " " + set.get(i).toString() + newline;
		}
		return ret;
	}
	
	private String makeClassifierSetToString(List<ClassAndFeatureListContainer> set){
		String ret = new String();
		int length = set.size();
		for (int i=0; i<length; i++){
			String newline = (i!=length-1) ? "\n" : "";
			ret += set.get(i).classifierToString(this.featureTrnStringToNumbers, this.classStringToNumber) + newline;
		}
		return ret;
	}
	
	public List<ClassAndFeatureListContainer> getTrainingSet(){
		return this._trainingSet;
	}
	
	public List<ClassAndFeatureListContainer> getTestingSet(){
		return this._testingSet;
	}
	
	public Histogram getHistogram(){
		return this.histogram;
	}
	
	public static void createFolderIfNotExist(String folderPath){
		File f = new File(folderPath);
		if(!f.exists()){
			f.mkdir();
		}
	}
}
