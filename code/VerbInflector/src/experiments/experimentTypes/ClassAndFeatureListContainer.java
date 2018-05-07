package experimentTypes;

import java.util.HashMap;
import java.util.List;

import classificationSampleTypes.ClassificationSampleIfc;

import Features.Feature;

public class ClassAndFeatureListContainer {

	protected List<Feature> _features;
	protected ClassificationSampleIfc _sample;
	protected String _clss;
	
	public ClassAndFeatureListContainer(ClassificationSampleIfc sample, List<Feature> features){
		this._sample = sample;
		this._clss = sample.getClassName();
		this._features = features;
	}
	
	public List<Feature> getFeatures(){
		return this._features;
	}
	
	public String getClss(){
		return this._clss;
	}
	
	public String toString(){
		return _clss + " " + this.makeFeaturesToString();
	}

	private String makeFeaturesToString() {
		String ret = new String("");
		int size = this._features.size();
		for(int i=0; i<size; i++){
			Feature f = this._features.get(i);
			String space = i<size-1 ? " " : "";
			ret+=f.toString() + ":" + f.getFeatureWeight() + space;
		}
		return ret;
	}
	
	public String classifierToString(HashMap<String, Integer> ftrToIntMap, HashMap<String, Integer> clssToIntMap){
		return clssToIntMap.get(_clss) + " " + this.makeFeaturesForClassificationToString(ftrToIntMap, clssToIntMap);
	}
	
	public ClassificationSampleIfc getSample(){
		return this._sample;
	}
	
	private String makeFeaturesForClassificationToString(HashMap<String, Integer> ftrToIntMap, HashMap<String, Integer> clssToIntMap) {
		String ret = new String("");
		int size = this._features.size();
		for(int i=0; i<size; i++){
			Feature f = this._features.get(i);
			String space = i<size-1 ? " " : "";
			if (ftrToIntMap.containsKey(f.toString())){
				ret += ftrToIntMap.get(f.toString()) + ":" + f.getFeatureWeight() + space;				
			} else {					// UNSEEN
				ret += "0" + ":1" + space;
			}
		}
		return ret;
	}
}
