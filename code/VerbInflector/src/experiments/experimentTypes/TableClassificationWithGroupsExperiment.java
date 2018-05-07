package experimentTypes;

import hebrewWord.BaseWord;

import java.util.ArrayList;
import java.util.List;

import statisticalTools.ConfusionMatrix;
import table.Table;

import classificationFileReaders.GroupClassesDefinitionsReader;
import classificationSampleTypes.BaseWordGroupedSample;
import classificationSampleTypes.BaseWordSample;
import classificationSampleTypes.ClassificationSampleIfc;
import featureExtraction.FeatureExtractorIfc;

public class TableClassificationWithGroupsExperiment{
	TableClassificationExperiment _exprmnt;
	GroupClassesDefinitionsReader groupReader;

	public TableClassificationWithGroupsExperiment(ExperimentDataContainer experimentDataContainer,FeatureExtractorIfc ftrExtractor, String groupsConfigurationFile){
		this.groupReader = new GroupClassesDefinitionsReader(groupsConfigurationFile);
		ExperimentDataContainer newDC = new ExperimentDataContainer(experimentDataContainer.getTraning(),this.preprocessClassesToGroups(experimentDataContainer.getSamples()));
		this._exprmnt = new TableClassificationExperiment(newDC,ftrExtractor);
	}

	private List<ClassificationSampleIfc> preprocessClassesToGroups(List<ClassificationSampleIfc> baseWordAndTableContainer) {
		List<ClassificationSampleIfc> ret = new ArrayList<ClassificationSampleIfc>();
		for(ClassificationSampleIfc clsAndData : baseWordAndTableContainer){
			String cls = clsAndData.getClassName();
			BaseWord bw = ((BaseWordSample)clsAndData).getBaseWord();
			Table t = ((BaseWordSample)clsAndData).getTable();
			if(groupReader.isInGroup(cls)){
				//change this
				BaseWordSample bws = new BaseWordGroupedSample(groupReader.getGroupName(cls), cls, bw, t);
				ret.add(bws);
			}else{
				ret.add(new BaseWordGroupedSample(cls,cls,bw,t));
			}
		}
		return ret;
	}
	
	public void runExperiment(String experimentPath){
		this._exprmnt.runExperiment(experimentPath);
	}
	
	public List<String> getGroupsNames(){
		return this.groupReader.getGroupNames();
	}
	
	public List<String> getGroup(String groupName){
		return this.groupReader.getGroup(groupName);
	}
	
	public List<ClassAndFeatureListContainer> getTraningSet(){
		return this._exprmnt.getTrainingSet();
	}
	
	public List<ClassAndFeatureListContainer> getTestingSet(){
		return this._exprmnt.getTestingSet();
	}
	
	public String[] getTestingOutClasses(){
		return this._exprmnt.getTestingOutClasses();
	}
	
	protected ConfusionMatrix getConfusionMatrix(){
		return this._exprmnt.getConfusionMatrix();
	}
}
