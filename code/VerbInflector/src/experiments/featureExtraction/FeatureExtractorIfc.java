package featureExtraction;

import java.util.List;

import classificationSampleTypes.ClassificationSampleIfc;

import Features.Feature;

public interface FeatureExtractorIfc {

	public List<Feature> getWordFeatures(ClassificationSampleIfc sample);
}
