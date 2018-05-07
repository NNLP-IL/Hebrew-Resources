package hebrewWord;

import hebrewVerb.VerbInflection;
import java.util.ArrayList;

import stringTools.EditDistanceCalculator;
import syllableDismantling.SyllableDismantlerByBaseForm;
import syllableDismantling.SyllableSegmentationByHurristic;
import syllableDismantling.SyllabledWord;
import letters.HebrewLetter;

public class VocalizedWord {

	protected ArrayList<HebrewLetter> _word;
	
	public VocalizedWord(VerbInflection w){
		_word = new ArrayList<HebrewLetter>();
		ArrayList<HebrewLetter> letters = w.getLetters();
		for (int i=0; i<letters.size(); i++){
			_word.add(new HebrewLetter(letters.get(i)));
		}
	}
	
	public VocalizedWord(VocalizedWord w){
		_word = new ArrayList<HebrewLetter>();
		ArrayList<HebrewLetter> letters = w.getLetters();
		for (int i=0; i<letters.size(); i++){
			_word.add(new HebrewLetter(letters.get(i)));
		}
	}
	
	public VocalizedWord(HebrewLetter[] arr){
		_word = new ArrayList<HebrewLetter>();
		for (int i=0; i<arr.length; i++){
			_word.add(new HebrewLetter(arr[i]));
		}
	}
	
	private HebrewLetter makeVocalizedLetter(String letter, String diacritics){
		HebrewLetter l = HebrewLetter.makeLetterFromString(letter);
		for(int k=0;k<diacritics.length();k++){
			String c = diacritics.substring(k, k+1);
			if(HebrewLetter.isShuruk(c) && l.isVav()){
				l.setVocalization_SHURUK();
			}else if(HebrewLetter.isDagesh(c) && !l.isHaacheaa() && !l.isVav()){
				l.setVocalization_DAGESH();
			}else if(HebrewLetter.isH_KAMATS(c)){
				l.setVocalization_H_KAMATS();
			}else if(HebrewLetter.isH_PATAH(c)){
				l.setVocalization_H_PATAH();
			}else if(HebrewLetter.isH_SEGOL(c)){
				l.setVocalization_H_SEGOL();
			}else if(HebrewLetter.isHirik(c)){
				l.setVocalization_HIRIK();
			}else if(HebrewLetter.isHolam_M(c) && l.isVav()){
				l.setVocalization_HOLAM_M();
			}else if(HebrewLetter.isHolam_H(c)){
				l.setVocalization_HOLAM_H();
			}else if(HebrewLetter.isKamats(c)){
				l.setVocalization_KAMATS();
			}else if(HebrewLetter.isKamats_Katan(c)){
				l.setVocalization_KAMATS_KATAN();
			}else if(HebrewLetter.isKubuts(c)){
				l.setVocalization_KUBUTS();
			}else if(HebrewLetter.isMapik(c) && l.isHey()){
				l.setVocalization_MAPIK();
			}else if(HebrewLetter.isPatah(c)){
				l.setVocalization_PATAH();
			}else if(HebrewLetter.isSegol(c)){
				l.setVocalization_SEGOL();
			}else if(HebrewLetter.isShva(c)){
				l.setVocalization_SHVA();
			}else if(HebrewLetter.isTsere(c)){
				l.setVocalization_TSERE();
			}
		}
		return l;
	}
	
	public VocalizedWord(String vWord){
		this._word = new ArrayList<HebrewLetter>();
		// the loop goes once for each letter
		for(int i=0;i<vWord.length(); ){
			String currentLetter = new String(vWord.substring(i, i+1));
			if (!HebrewLetter.isHebrewLetter(currentLetter)){
				System.out.println("the word " + vWord +" is not a valid Hebrew word");
				break;
			}
			String currentDiacritics = new String("");
			int j = i+1; 
			// the loop goes once for each diacritic sign
			while(j<vWord.length() && !HebrewLetter.isHebrewLetter(vWord.substring(j, j+1))){
				String c = vWord.substring(j, j+1);
				if(HebrewLetter.isSinDot(c) && currentLetter.equals(HebrewLetter.SHIN)){
					currentLetter += HebrewLetter.QUOTE;
				}else if(HebrewLetter.isQuote(c) && (currentLetter.equals(HebrewLetter.TSADI) || currentLetter.equals(HebrewLetter.GIMEL))){
					currentLetter += HebrewLetter.QUOTE;
				}else{
					currentDiacritics += c;
				}
				j++;
			}
			i=j;
			HebrewLetter l = this.makeVocalizedLetter(currentLetter, currentDiacritics);
			if (l.getLetter().equals(HebrewLetter.EMPTY)){
				System.out.println("the word " + vWord +" is not a valid Hebrew word");
				break;
			}
			this._word.add(l);
		}
	}
	
	public String toString(){
		String ret="";
		for(int i=0; i<_word.size();i++){
			ret += _word.get(i).toString();
		}
		return ret;
	}
	
	public SyllabledWord makeSyllabledWordByHuristic(){
		return (new SyllableSegmentationByHurristic()).makeSyllabledWordByHuristic(this._word);
	}
	
	public SyllabledWord makeSyllabledWordByBaseForm(VocalizedWord baseForm,EditDistanceCalculator calc){
		return (new SyllableDismantlerByBaseForm(calc)).makeSyllabledWordByBaseForm(baseForm,this);
	}
	
	public ArrayList<HebrewLetter> getLetters(){
		return this._word;
	}
}
