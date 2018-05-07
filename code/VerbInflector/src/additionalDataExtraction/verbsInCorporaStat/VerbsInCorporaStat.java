package verbsInCorporaStat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nonVocalizedWordsFileReader.VerbCSVReader;

import corporaFileReaders.MorphologyAnalyzedCorporaReader;


import letters.HebrewLetter;


public class VerbsInCorporaStat {
	
	private int totalVerbsInCorpora = 0;
	private int knownVerbsInCorpora = 0;
	private HashMap<String, Integer> corporaVerbs;
	private List<String> knownVerbs;
	
	public VerbsInCorporaStat(String verbCountsFile, String theVerbIndexFile) {
		MorphologyAnalyzedCorporaReader r = new MorphologyAnalyzedCorporaReader();
		r.readVerbCountsFromFile(verbCountsFile);
		this.corporaVerbs = r.getVerbCounts();
		VerbCSVReader vr = new VerbCSVReader(theVerbIndexFile);
		String[] inflectionsExtendedToStrings = vr.toStringExtended().split("\n");
		this.knownVerbs = new ArrayList<String>();
		
		
		for (String inf:inflectionsExtendedToStrings){
			//List<String> knownKeys = new ArrayList<String>();
			String[] splittedInf = inf.split(",");
			String vocalizedInf = splittedInf[2];
			
			String nonVocalizedInf = vocalizedInf.replaceAll(HebrewLetter.DAGESH, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.H_KAMATS, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.H_PATAH, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.H_SEGOL, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.HIRIK, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.HOLAM_H, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.HOLAM_M, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.KAMATS, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.KAMATS_KATAN, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.KUBUTS, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.MAPIK, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.PATAH, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.SEGOL, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.SHIN_DOT, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.SHURUK, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.SHVA, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.SIN_DOT, "");
			nonVocalizedInf = nonVocalizedInf.replaceAll(HebrewLetter.TSERE, "");
			
			//String[] morphAttrs = splittedInf[3].split("+");
			this.knownVerbs.add(nonVocalizedInf);
			
			
		}
		
		
		for (String k : this.corporaVerbs.keySet()){
			//System.out.println("key=" + k + ", value=" + this.corporaVerbs.get(k));
			int value = this.corporaVerbs.get(k);
			String kWitoutMorph = k.split(",")[0];
			this.totalVerbsInCorpora += value;
			if (this.knownVerbs.contains(kWitoutMorph)){
				this.knownVerbsInCorpora += value;
			}
		}
	}
	
	public void printStats(){
		System.out.println("Known verbs: " + (double)this.knownVerbsInCorpora/this.totalVerbsInCorpora + 
				" (" + this.knownVerbsInCorpora + "/" + this.totalVerbsInCorpora + ")");
	}
	

}
