package experimentTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import statisticalTools.ConfusionMatrix;

import classificationSampleTypes.BaseWordGroupedSample;
import classificationSampleTypes.ClassificationSampleIfc;
import featureExtraction.BasicAndCorporaFeatureExtractor;
import featureExtraction.FeatureExtractorIfc;

public class TableClassification2StepGroupExperiment{
	private TableClassificationWithGroupsExperiment _firstStepExperimnt;
	//private FeatureExtractorIfc _tmpFE; 

	public TableClassification2StepGroupExperiment(ExperimentDataContainer experimentDataContainer, FeatureExtractorIfc firstFeatureExtractor, String groupsConfigurationFile) {
		this._firstStepExperimnt = new TableClassificationWithGroupsExperiment(experimentDataContainer, firstFeatureExtractor, groupsConfigurationFile);
		//this._tmpFE = firstFeatureExtractor;
	}

	public void runExperiment(String experimentPath,int secondPhaseTopFeatureSize, HashMap<String, Integer> corporaCounts){
		Experiment.createFolderIfNotExist(experimentPath);
		this._firstStepExperimnt.runExperiment(experimentPath+"1st Step - Group Experimnt\\");
		List<String> groupNames = this._firstStepExperimnt.getGroupsNames();
		String grpAcc = new String("");
		double totalExperimentHits = this._firstStepExperimnt.getConfusionMatrix().getTotalNumberOfHits();
		double totalExperimentSamples = this._firstStepExperimnt.getConfusionMatrix().getTotalNumberOfSamples();
		for(String groupName: groupNames){
			totalExperimentHits -= this._firstStepExperimnt.getConfusionMatrix().getHitsForClass(groupName);
			List<ClassificationSampleIfc> traningSet = filetrTraningSetByGroupName(this._firstStepExperimnt.getTraningSet(), groupName);
			List<ClassificationSampleIfc> testingSet = filetrTestingSetByGroupName(this._firstStepExperimnt.getTestingSet(), this._firstStepExperimnt.getTestingOutClasses(), groupName);
			if(testingSet.size()>0){
				FeatureExtractorIfc secondFeatureExtractor = new BasicAndCorporaFeatureExtractor(secondPhaseTopFeatureSize,this._firstStepExperimnt.getGroup(groupName),corporaCounts);
				for (ClassificationSampleIfc trn : traningSet){
					((BaseWordGroupedSample)trn).setTableToOriginalTable();
				}
				for (ClassificationSampleIfc tst : testingSet){
					((BaseWordGroupedSample)tst).setTableToOriginalTable();
				}
				TableClassificationExperiment exprmnt = new TableClassificationExperiment(traningSet,testingSet,secondFeatureExtractor);
				String secondPhaseExperimentDir = experimentPath + groupName + " experiment\\";
				exprmnt.runExperiment(secondPhaseExperimentDir);
				ConfusionMatrix cMat = exprmnt.getConfusionMatrix();
				totalExperimentHits += cMat.getTotalNumberOfHits();
				grpAcc += groupName + ": " + cMat.getAccuracy() + 
								" (" + cMat.getTotalNumberOfHits() + 
								"/" + cMat.getTotalNumberOfSamples() + ")" + "\n";
			}
		}
		System.out.println(grpAcc);
		System.out.println("First Step Accuracy: " + this._firstStepExperimnt.getConfusionMatrix().getAccuracy() + " " + this._firstStepExperimnt.getConfusionMatrix().getTotalNumberOfHits() + "/" + this._firstStepExperimnt.getConfusionMatrix().getTotalNumberOfSamples());
		System.out.println("Total Accuracy: " + totalExperimentHits/totalExperimentSamples + " ("+(int)totalExperimentHits+"/"+(int)totalExperimentSamples+")");
	}

	private List<ClassificationSampleIfc> filetrTraningSetByGroupName(List<ClassAndFeatureListContainer> samples, String groupName){
		List<ClassificationSampleIfc> ret = new ArrayList<ClassificationSampleIfc>();
		for(ClassAndFeatureListContainer sample : samples){
			ClassificationSampleIfc samp = sample.getSample();
			if(samp.getClassName().equals(groupName)){
				ret.add(samp);
			}
		}
		return ret;
	}

	private List<ClassificationSampleIfc> filetrTestingSetByGroupName(List<ClassAndFeatureListContainer> samples,String[] outClasses, String groupName){
		List<ClassificationSampleIfc> ret = new ArrayList<ClassificationSampleIfc>();
		for(int i=0; i<samples.size(); i++){
			ClassificationSampleIfc samp = samples.get(i).getSample();
			if(outClasses[i].equals(groupName)){
				ret.add(samp);
			}
		}
		return ret;
	}


}
