package experimentTypes;

import java.util.List;

import classificationFileReaders.ClassificationOutputFileReader;
import classificationSampleTypes.ClassificationSampleIfc;
import statisticalTools.ConfusionMatrix;
import statisticalTools.ExperimentStatistics;
import libsvm.MySvmClassifier;
import featureExtraction.FeatureExtractorIfc;
import fileWriters.StringFileWriter;

public class TableClassificationExperiment extends Experiment{

	protected int topFeatureSize;
	protected ConfusionMatrix cMat;
	protected int[] testingOutClasses;
	

	public TableClassificationExperiment(ExperimentDataContainer experimentDataContainer,FeatureExtractorIfc ftrExtractor){
		super(experimentDataContainer, ftrExtractor);
	}
	
	public TableClassificationExperiment(List<ClassificationSampleIfc> trainingSet, List<ClassificationSampleIfc> testingSet,FeatureExtractorIfc ftrExtractor){
		super(trainingSet, testingSet, ftrExtractor);
	}

	public void runExperiment(String experimentPath){
		
		// Create experiment folder
		Experiment.createFolderIfNotExist(experimentPath);

		// Create SVM folder
		String svmFilesPath = experimentPath + "SVM Files\\";
		Experiment.createFolderIfNotExist(svmFilesPath);

		// SVM Files
		String trainFileName = svmFilesPath + "trainingSet";
		String testFileName = svmFilesPath + "testingSet";
		String outFileName = svmFilesPath + "outClassification";
		StringFileWriter fWritertrn = new StringFileWriter(this.getClassifierTrainingSetToString());
		StringFileWriter fWritertst = new StringFileWriter(this.getClassifierTestingSetToString());
		fWritertrn.writeToFile(trainFileName);
		fWritertst.writeToFile(testFileName);
			// the -ToString files contain the feature's and tables Strings (and not their corresponding numbers)
		StringFileWriter fWriterStrtrn = new StringFileWriter(this.getTrainingSetToString());
		StringFileWriter fWriterStrtst = new StringFileWriter(this.getTestingSetToString());
		fWriterStrtrn.writeToFile(trainFileName + "-ToString"); 
		fWriterStrtst.writeToFile(testFileName + "-ToString");
		MySvmClassifier svm = new MySvmClassifier();
		double c = 4;
		double g = 1;
		svm.train(trainFileName, c, g);
		svm.predict(testFileName, trainFileName + ".model", outFileName);
		
		// Make Statistics folder
		String statisticsFilesPath = experimentPath + "Statistics Files\\";
		Experiment.createFolderIfNotExist(statisticsFilesPath);
		
		// Confusion Matrix
		this.testingOutClasses = ClassificationOutputFileReader.getOneClassOutClassification(outFileName);
		int[] trueLabeling = new int[this._testingSet.size()];
		for(int i=0; i<trueLabeling.length; i++){
			trueLabeling[i] = this.classStringToNumber.get(this._testingSet.get(i).getClss());
		}
		this.cMat = new ConfusionMatrix(trueLabeling,this.testingOutClasses,this.classNumberToString,this.classStringToNumber);
		String confusionMatrixFileName = statisticsFilesPath + "Confusion Matrix";
		StringFileWriter fWriterConfusionMatrix = new StringFileWriter(this.cMat.toString());
		fWriterConfusionMatrix.writeToFile(confusionMatrixFileName);
		
		// Experiment Statistics
		ExperimentStatistics expStat = new ExperimentStatistics(this.cMat, 10);
		String experimentStatisticsFileName = statisticsFilesPath + "Experiment Statistics.txt";
		StringFileWriter fWriterexperimentStatistics = new StringFileWriter(expStat.statisticsString(10));
		fWriterexperimentStatistics.writeToFile(experimentStatisticsFileName);
		
		// Mistakes Deviation Histogram Files
		String mistakesHistogramPngFileName = statisticsFilesPath + "Misatkes Deviation Histogram.png";
		String mistakesHistogramStringFileName = statisticsFilesPath + "Misatkes Deviation Histogram.csv";
		StringFileWriter fWritermistakesHistogram = new StringFileWriter(this.cMat.getMistakesHistogram().toString());
		fWritermistakesHistogram.writeToFile(mistakesHistogramStringFileName);
		this.cMat.getMistakesHistogram().plotToPNG(mistakesHistogramPngFileName,"Mistakes per table type");
		
		// Class Deviation Histogram Files
		String classesHistogramPngFileName = statisticsFilesPath + "Class Deviation Histogram.png";
		String classesHistogramStringFileName = statisticsFilesPath + "Class Deviation Histogram.csv";
		StringFileWriter fWriterClassesHist = new StringFileWriter(this.histogram.toString());
		fWriterClassesHist.writeToFile(classesHistogramStringFileName);
		this.histogram.plotToPNG(classesHistogramPngFileName,"Instances per table type");
	}
	
	protected ConfusionMatrix getConfusionMatrix(){
		return this.cMat;
	}
	
	public String[] getTestingOutClasses(){
		String[] ret = new String[this.testingOutClasses.length];
		for(int i=0; i<this.testingOutClasses.length; i++){
			ret[i] = this.classNumberToString.get(this.testingOutClasses[i]);
		}
		return ret;
	}
}
