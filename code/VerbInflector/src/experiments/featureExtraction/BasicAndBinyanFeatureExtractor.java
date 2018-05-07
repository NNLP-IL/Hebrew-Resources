package featureExtraction;

import java.util.ArrayList;
import java.util.List;
import Features.BinyanFeature;
import Features.Feature;
import classificationSampleTypes.ClassificationSampleIfc;

public class BasicAndBinyanFeatureExtractor extends BasicFeatureExtractor{

	
	public BasicAndBinyanFeatureExtractor(int topFeatureSize) {
		super(topFeatureSize);
	}
	
	public List<Feature> getWordFeatures(ClassificationSampleIfc bwo){
		List<Feature> ret = new ArrayList<Feature>();
		ret.addAll(super.getWordFeatures(bwo));
		String binyan = bwo.getClassName().substring(0, 1);
		for(Feature f : ret){
			f.setAdditionalToStriongArg(binyan);
		}
		Feature bf = new BinyanFeature(binyan);
		ret.add(bf);
		return ret;
	}

}
