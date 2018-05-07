package syllableDismantling;

import hebrewWord.VocalizedWord;

import java.util.ArrayList;

import stringTools.EditDistanceCalculator;
import letters.HebrewLetter;

public class SyllableDismantlerByBaseForm {

	protected ArrayList<HebrewLetter> _word;
	protected EditDistanceCalculator _editDistanceCalc;
	
	public SyllableDismantlerByBaseForm(EditDistanceCalculator edc){
		this._editDistanceCalc = edc;
	}
	
	public SyllabledWord makeSyllabledWordByBaseForm(VocalizedWord baseForm,VocalizedWord inflectedForm){
		int index = 0;
		ArrayList<HebrewLetter> bform = (new VocalizedWord(baseForm)).getLetters();
		ArrayList<HebrewLetter> iform = inflectedForm.getLetters();
		if (bform.get(bform.size()-1).isVocalizetionEmpty()||bform.get(bform.size()-1).isVocalizetionPatah()){
			bform.get(bform.size()-1).setVocalization_SHVA();
		}
		ArrayList<Integer> sylls = new ArrayList<Integer>();
		while(index<iform.size()){
			sylls.add(new Integer(index));
			boolean foundVowel = false;
			while(!foundVowel&&index<iform.size()){
				if ((!this.isCompleteVowel(iform, index))&&
						this.isVowel(iform,index)){
					index = analyzeEndOfSyllable(bform,iform,index);
					foundVowel = true;
				}
				else if (this.isCompleteVowel(iform, index)){
					index = analyzeEndOfSyllable(bform,iform,index+1);
					foundVowel =true;
				}
				else{
					index++;
				}
			}
		}
		return (new SyllabledWord(iform,this.arrayListIntegerToIntArray(sylls)));
	}
	
	private boolean isPatahGanuv(ArrayList<HebrewLetter> w, int index){
		return ((index == w.size()-1)&&(w.get(index).isVocalizetionPatah()));
	}
	
	private int analyzeEndOfSyllable(ArrayList<HebrewLetter> baseForm,ArrayList<HebrewLetter> inflectedForm, int index){
		// ~CompleteVowel
		if(this.isCompleteVowel(inflectedForm, index+1)){
			return index+1;
		}
		// NonVocalized~
		else if(index<inflectedForm.size()-1&&inflectedForm.get(index+1).isVocalizetionEmpty()){
			return this.analyzeEndOfSyllable(baseForm, inflectedForm, index+1); //Recursion
		}
		// Shva
		else if(index+1<inflectedForm.size()&&inflectedForm.get(index+1).isVocalizetionShva()){
			// ShvaNach~
			if (this.isShvaNach(baseForm, inflectedForm, index+1)){
				if ((index+2==inflectedForm.size()-1)&&
						((inflectedForm.get(index+2).isVocalizetionEmpty())||(inflectedForm.get(index+2).isVocalizetionShva()))){
					return index+3;
				}
				else{
					return index+2;
				}
			}
			// ~ShvaNaa or ~Tnuaa
			else{
				return index+1;
			}
		}
		// PatahGanuv~
		else if (this.isPatahGanuv(inflectedForm, index+1)){
			return index+2;
		}
		// ~Vowel
		else {
			return index+1;
		}
	}
	
	private boolean isShvaNach(ArrayList<HebrewLetter> baseForm,ArrayList<HebrewLetter> inflectedForm, int index){
		if(!inflectedForm.get(index).isVocalizetionShva()){
			return false;
		}
		else if(index == 0){
			return false;
		}
		else if(index == inflectedForm.size()){
			return true;
		}
		else{
			VocalizedWord bForm = new VocalizedWord(this.hebrewLetterArrayListToArray(baseForm));
			VocalizedWord iForm = new VocalizedWord(this.hebrewLetterArrayListToArray(inflectedForm));
			this._editDistanceCalc.calc(bForm.toString(), iForm.toString());
			int shvaIndexInInflectedAlignment = this.getShvaIndexInAllignment(this._editDistanceCalc.getYAliignment(), index);
			return HebrewLetter.SHVA.equals(this._editDistanceCalc.getXAliignment().substring(shvaIndexInInflectedAlignment, shvaIndexInInflectedAlignment+1));
		}
	}
	
	private int getShvaIndexInAllignment(String inflectedForm, int letterIndex){
		int allignmentindex = 0;
		for(int i=0;i<letterIndex+1;i++){
			if (i==letterIndex){
				allignmentindex++;
				while (!inflectedForm.substring(allignmentindex, allignmentindex+1).equals(HebrewLetter.SHVA)){
					allignmentindex++;
				}
			}
			else{
				allignmentindex++;
				while (!HebrewLetter.isHebrewLetter(inflectedForm.substring(allignmentindex, allignmentindex+1))){
					allignmentindex++;
				}
			}
		}
		return allignmentindex;
	}
	
	private boolean isCompleteVowel(ArrayList<HebrewLetter> w,int index){
		return (index+1<w.size())&&
		((w.get(index).isVocalizetionEmpty()&&w.get(index+1).isVav()&&w.get(index+1).isVocalizetionHolam_H())||
				(w.get(index).isVocalizetionEmpty()&&w.get(index+1).isVav()&&w.get(index+1).isVocalizetionShuruk())||
				(w.get(index).isVocalizetionHirik()&&w.get(index+1).isYod())||
				(w.get(index).isVocalizetionTsere()&&w.get(index+1).isYod())||
				(w.get(index).isVocalizetionSegol()&&w.get(index+1).isYod()));
	}
	
	private boolean isVowel(ArrayList<HebrewLetter> w,int index){
		return w.get(index).isVocalizetionVowel();
	}
	
	private HebrewLetter[] hebrewLetterArrayListToArray(ArrayList<HebrewLetter> lst){
		int len = lst.size();
		HebrewLetter[] ret = new HebrewLetter[len];
		for(int i=0;i<len; i++){
			ret[i] = lst.get(i);
		}
		return ret;
	}

	private int[] arrayListIntegerToIntArray(ArrayList<Integer> lst){
		int len = lst.size();
		int[] ret = new int[len];
		for(int i=0;i<len; i++){
			ret[i] = lst.get(i).intValue();
		}
		return ret;
	}
}
