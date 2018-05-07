package featureExtraction;

import hebrewVerb.VerbInflection;
import hebrewWord.BaseWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import letters.HebrewLetter;

import table.Table;
import tablesManegment.TableGetter;
import Features.Feature;
import Features.WordInflectionsCountFeature;
import classificationSampleTypes.BaseWordSample;
import classificationSampleTypes.ClassificationSampleIfc;

/**
 * 
 * @author ערן
 * This FeatureExtractor extracts (on top of the basic features),
 * features from the corpora (the corpora is derived by Meni's tagger).
 * the features extracted from the corpora denote the number of
 * appearances of all the inflections of a given BaseForm.
 * This FeatureExtractor recives the optional tables for the BaseForm
 * as an input, and results the <table, # of inflections in corpora> as
 * another feature. 
 */
public class BasicAndCorporaFeatureExtractor extends BasicFeatureExtractor{

	List<String> _optionalTables;
	HashMap<String, Integer> _verbCounts;
	
	public BasicAndCorporaFeatureExtractor(int topFeatureSize, List<String> optionalTables, HashMap<String, Integer> verbCounts){
		super(topFeatureSize);
		this._optionalTables = optionalTables;
		this._verbCounts = verbCounts;
	}
	
	public List<Feature> getWordFeatures(ClassificationSampleIfc bwo){
		BaseWord bw = new BaseWord(((BaseWordSample)bwo).getBaseWord());
		List<Feature> ret = new ArrayList<Feature>();
		ret.addAll(super.getWordFeatures(bwo));
		ret.addAll(this.extractWordFeatures_inflectionsInCorpora(bw));
		return ret;
	}
	
	//*** this function does not ignore inflections that are present in all tables
	protected List<Feature> extractWordFeatures_inflectionsInCorpora(BaseWord bw) {
		List<Feature> ret = new ArrayList<Feature>();
		double allTableInflectionsAcurs = 0;
		for(String tableName : this._optionalTables){
			Table t = TableGetter.getNewTableFromTableName(tableName);
			List<HebrewLetter> letters = bw.getLetters();
			HebrewLetter[] bwLettersArr = new HebrewLetter[letters.size()];
			for(int i=0; i<letters.size(); i++){
				bwLettersArr[i] = letters.get(i);
			}
			// calculating normalizing factor (deviding the # of infs of the current table by 
			// 												the total # of infs for all tables)
			WordInflectionsCountFeature wicf = new WordInflectionsCountFeature(bwLettersArr, t, tableName, this._verbCounts);
			allTableInflectionsAcurs += wicf.getFeatureWeight();
			ret.add(wicf);
		}
		if(allTableInflectionsAcurs>0){
			for(Feature f : ret){
				((WordInflectionsCountFeature)f).setNormalizingFactor(allTableInflectionsAcurs);
			}
		}
		return ret;
	}
	
	protected List<Feature> extractWordFeatures_inflectionsInCorpora1(BaseWord bw) {
		List<Feature> ret = new ArrayList<Feature>();
		double allTableInflectionsAcurs = 0;
		List<List<VerbInflection>> tablesInflections = new ArrayList<List<VerbInflection>>();
		List<HebrewLetter> letters = bw.getLetters();
		for(int i=0; i<this._optionalTables.size(); i++){
			String tableName = this._optionalTables.get(i);
			Table t = TableGetter.getNewTableFromTableName(tableName);
			HebrewLetter[] bwLettersArr = new HebrewLetter[letters.size()];
			for(int j=0; j<letters.size(); j++){
				bwLettersArr[j] = letters.get(j);
			}
			t.addToBaseVerbs(bwLettersArr);
			t.inflectVerbs();
			tablesInflections.add(t.getInflections().get(0));
		}
		
		for(VerbInflection inf: tablesInflections.get(0)){
			boolean presentInAllTables = true;
			for(int i=0; i<tablesInflections.size()&& presentInAllTables;i++){
				if(!tablesInflections.get(i).contains(inf)){
					presentInAllTables = false;
				}
			}
			for(int i=0; i<tablesInflections.size()&& presentInAllTables;i++){
				tablesInflections.get(i).remove(inf);
			}
		}
		
		for(int i=0; i<this._optionalTables.size(); i++){
			String tableName = this._optionalTables.get(i);
			WordInflectionsCountFeature wicf = new WordInflectionsCountFeature(tablesInflections.get(i), tableName, this._verbCounts);
			allTableInflectionsAcurs += wicf.getFeatureWeight();
			ret.add(wicf);
		}

		if(allTableInflectionsAcurs>0){
			for(Feature f : ret){
				((WordInflectionsCountFeature)f).setNormalizingFactor(allTableInflectionsAcurs);
			}
		}
		/*
		double topCount = 0;
		for(Feature f : ret){
			if (((WordInflectionsCountFeature)f).getFeatureWeight()>topCount){
				topCount = ((WordInflectionsCountFeature)f).getFeatureWeight();
			}
		}
		
		List<Feature> newret = new ArrayList<Feature>();
		for(Feature f : ret){
			if (((WordInflectionsCountFeature)f).getFeatureWeight()==topCount){
				newret.add(f);
				((WordInflectionsCountFeature)f).setNormalizingFactor(0);
				return newret;
			}
		}*/
		return ret;
	}
	
}
