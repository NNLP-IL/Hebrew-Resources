package Features;

import hebrewVerb.HebrewVerb.Number;
import hebrewVerb.HebrewVerb.Gender;
import hebrewVerb.HebrewVerb.Person;
import hebrewVerb.HebrewVerb.Time;
import hebrewVerb.VerbInflection;
import hebrewWord.BaseWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import corporaFileReaders.MorphologyAnalyzedCorporaReader.TaggerGender;
import corporaFileReaders.MorphologyAnalyzedCorporaReader.TaggerNumber;
import corporaFileReaders.MorphologyAnalyzedCorporaReader.TaggerPerson;
import corporaFileReaders.MorphologyAnalyzedCorporaReader.TaggerTime;


import table.Table;

import letters.HebrewLetter;

public class WordInflectionsCountFeature extends Feature{

	private HashMap<String, Integer> _wordAndMorphologyToCountInCorpora;
	private List<VerbInflection> _infs;
	private HebrewLetter[] _featureLetters; //***
	private Table _t;  //***
	private String _tableName;
	private double _normalizingFactor = 1;
	
	//***
	public WordInflectionsCountFeature(HebrewLetter[] featureLetters, Table t, String tableName, HashMap<String, Integer> verbCounts){
		this._t = t;
		this._featureLetters = featureLetters;
		this._t.addToBaseVerbs(featureLetters);
		this._t.inflectVerbs();
		this._wordAndMorphologyToCountInCorpora = verbCounts;
		this._tableName = tableName;
		this._infs = this._t.getInflections().get(0);
	}
	
	public WordInflectionsCountFeature(List<VerbInflection> infs, String tableName, HashMap<String, Integer> verbCounts){
		this._infs = infs;
		this._wordAndMorphologyToCountInCorpora = verbCounts;
		this._tableName = tableName;
	}
	
	//***
	public Table getTable(){
		return this._t;
	}
	
	//***
	public BaseWord getBaseWord(){
		return new BaseWord(this._featureLetters);
	}
	
	private int countApperancesInCorpora(List<VerbInflection> inflections) {
		int totalCountInCorpora = 0;
		ArrayList<String> infs = new ArrayList<String>();
		for(VerbInflection i : inflections){
			int currInfCount = 0;
			String word = getNonVocalizedString(i.getLetters()).replaceAll(HebrewLetter.SHIN_DOT, "").replaceAll(HebrewLetter.SIN_DOT, "");
			Time t = i.getTime();
			Gender g = i.getGender();
			Person p = i.getPerson();
			Number n = i.getNumber();
			
			
			// Time
			String tString;
			if(t==Time.PAST){
				tString = TaggerTime.PAST.toString();
			} else if(t==Time.BEINONI){
				tString = TaggerTime.BEINONI.toString();
			} else if(t==Time.PRESENT){
				tString = TaggerTime.BEINONI.toString();
			} else if(t==Time.FUTURE){
				tString = TaggerTime.FUTURE.toString();
			} else if(t==Time.IMPERATIVE){
				tString = TaggerTime.IMPERATIVE.toString();
			} else if(t==Time.INFINITIVE){
				tString = TaggerTime.INFINITIVE.toString();
			} else {
				tString = TaggerTime.E.toString();
			}
			
			// Gender
			String gString = g.toString();
			if(g==Gender.M){
				gString = TaggerGender.M.toString();
			} else if(g==Gender.F){
				gString = TaggerGender.F.toString();
			} else if(g==Gender.MF){
				gString = TaggerGender.MF.toString();
			} else {
				gString = TaggerGender.E.toString();
			}
			
			// Person
			String pString;
			String pString2 = null;
			if(p==Person.FIRST){
				pString = TaggerPerson.ONE.toString();
				pString2 = TaggerPerson.A.toString();
			} else if(p==Person.SECOND){
				pString = TaggerPerson.TWO.toString();
				pString2 = TaggerPerson.A.toString();
			} else if(p==Person.THIRD){
				pString = TaggerPerson.THREE.toString();
				pString2 = TaggerPerson.A.toString();
			} else {
				pString = TaggerPerson.E.toString();
			}
			
			// Number
			String nString;
			if(n==Number.SINGULAR){
				nString = TaggerNumber.S.toString();
			} else if(n==Number.PLURAL){
				nString = TaggerNumber.P.toString();
			} else{
				nString = TaggerNumber.E.toString();
			}
			
			String comp = word + "," + tString + "," + gString + "," + pString + "," + nString;
			
			//turn to MF 2 options with A or 1,2,3	
			if(!this._wordAndMorphologyToCountInCorpora.containsKey(comp)&&
					!gString.equals(TaggerGender.MF.toString())){
				String comp2 = word + "," + tString + "," + TaggerGender.MF.toString() + "," + pString + "," + nString;
				if(this._wordAndMorphologyToCountInCorpora.containsKey(comp2)){
					infs.add(comp2);
					currInfCount = this._wordAndMorphologyToCountInCorpora.get(comp2);
				}
			}
			
			if(this._wordAndMorphologyToCountInCorpora.containsKey(comp)&&!infs.contains(comp)){
				infs.add(comp);
				currInfCount = this._wordAndMorphologyToCountInCorpora.get(comp);
			}
			if(pString2 != null) {
				comp = word + "," + tString + "," + gString + "," + pString2 + "," + nString;
				if(this._wordAndMorphologyToCountInCorpora.containsKey(comp)&&!infs.contains(comp)){
					infs.add(comp);
					currInfCount += this._wordAndMorphologyToCountInCorpora.get(comp);
				}
				//turn to MF 2 options with A or 1,2,3	
				if(!this._wordAndMorphologyToCountInCorpora.containsKey(comp)&&
						!gString.equals(TaggerGender.MF.toString())){
					String comp2 = word + "," + tString + "," + TaggerGender.MF.toString() + "," + pString + "," + nString;
					if(this._wordAndMorphologyToCountInCorpora.containsKey(comp2)){
						infs.add(comp2);
						currInfCount = this._wordAndMorphologyToCountInCorpora.get(comp2);
					}
				}
			}
			//System.out.println(comp+":"+currInfCount);
			totalCountInCorpora += currInfCount;
		}
		
		return totalCountInCorpora;
	}
	
	private String getNonVocalizedString(ArrayList<HebrewLetter> w){
		String ret = "";
		for(int i=0; i<w.size(); i++){
			ret += w.get(i).getLetter();
		}
		return ret;
	}

	@Override
	protected boolean equalFeature(Feature f) {
		boolean sameInfs = false;
		if(this.getClass().equals(f.getClass())&&(this._infs.size()==((WordInflectionsCountFeature)f).getInflections().size())){
			sameInfs = true;
			for(int i=0; i<this._infs.size() && sameInfs;i++){
				if(!((WordInflectionsCountFeature)f).getInflections().contains(this._infs.get(i))){
					sameInfs = false;
				}
			}
		}
		return sameInfs;
	}
	
	public List<VerbInflection> getInflections(){
		return this._infs;
	}

	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.inflectionsCountForTable + Feature.featureSpacingToken + this._tableName + additionalString;
	}
	
	public double getFeatureWeight(){
		double w = 0;
		if(this._normalizingFactor==0){
			w = 1;
		}else {
			w = this.getFeatureCount()/this._normalizingFactor;
		}
		return w;
	}
	
	public int getFeatureCount(){
		return this.countApperancesInCorpora(this._infs);
	}
	
	public void setNormalizingFactor(double devideBy){
		this._normalizingFactor = devideBy;
	}
	
}
