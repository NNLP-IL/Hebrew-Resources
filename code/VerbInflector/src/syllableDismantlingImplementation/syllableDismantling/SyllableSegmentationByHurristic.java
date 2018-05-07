package syllableDismantling;

import java.util.ArrayList;

import letters.HebrewLetter;

public class SyllableSegmentationByHurristic {

	public ArrayList<HebrewLetter> _word;
	
	public SyllableSegmentationByHurristic(){
		
	}
	
	public SyllabledWord makeSyllabledWordByHuristic(ArrayList<HebrewLetter> w){
		this._word = new ArrayList<HebrewLetter>();
		for (HebrewLetter a:w){
			this._word.add(new HebrewLetter(a));
		}
		int pointer = 0;
		ArrayList<Integer> sylArrList = new ArrayList<Integer>();
		sylArrList.add(new Integer(0));
		//System.out.println("word: "+this._word);
		while(pointer<this._word.size()-1){
			
			if(this.isVocalizetionSmallVowel(pointer)){
				//System.out.println("!"+pointer);
				pointer = this.smallStartSyllable(pointer, sylArrList);
			}
			else if(this.isVocalizetionBigVowel(pointer)) {
				//System.out.println("!!"+pointer);
				pointer = this.bigStartSyllable(pointer, sylArrList);
			}
			else if(this._word.get(pointer).isVocalizetionEmpty()) {
				//System.out.println("!!!"+pointer);
				pointer = this.nonVocStartSyllable(pointer, sylArrList);
			}
			else if(this._word.get(pointer).isVocalizetionShva()||this._word.get(pointer).isVocalizetionHataf()){
				//System.out.println("!!!!"+pointer);
				pointer = this.shva_HatafStartSyllable(pointer, sylArrList);
			}
			else{
				pointer++;
			}
		}	
		int[] sylArr = new int[sylArrList.size()];
		for (int i=0; i<sylArr.length;i++){
			sylArr[i] = sylArrList.get(i).intValue();
		}
		return new SyllabledWord(_word,sylArr);
	}
	
	// First letter in the current syllable is vocalized by a small vowel
	private int smallStartSyllable(int pointer, ArrayList<Integer> sylArrList){
		if (	((pointer+3<this._word.size()-1)&&
				(this._word.get(pointer+1).isVocalizetionShva()))&&
				(this._word.get(pointer+1).isVav())&&
				(this._word.get(pointer+2).isVav())&&
				(this._word.get(pointer+2).isVocalizetionEmpty())){
			pointer++;													// Small-VavShva(Nach)-VavUnvocalized~
			pointer++;
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	((pointer+2<this._word.size()-1)&&(this._word.get(pointer+1).isVocalizetionShva()))||
				((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats()))){
			pointer++;													// Small-Shva(Nach)~
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(pointer+1<this._word.size()-1)&&					// Small~Vowel or Small~Hataf 
					(	(this._word.get(pointer+1).isVocalizetionVowel())||
						(this._word.get(pointer+1).isVocalizetionHataf()))){
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(pointer+2<this._word.size())&&						// Small~Unvocalized
					(this._word.get(pointer+1).isVocalizetionEmpty())&&
					(this._word.get(pointer+2).isVav())&&
					(this._word.get(pointer+2).isVocalizetionShuruk()||(this._word.get(pointer+2).isVocalizetionHolam_M()))){
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(pointer+3<this._word.size())&&						// VavSmall-UnvocalizedVav-Yod~
				(this._word.get(pointer).isVav())&&
				(this._word.get(pointer+1).isVav())&&
				(this._word.get(pointer+1).isVocalizetionEmpty())&&
				(this._word.get(pointer+2).isYod())&&
				(this._word.get(pointer+2).isVocalizetionEmpty())&&
				(	!this._word.get(pointer+3).isVocalizetionEmpty()||
					(	(pointer+4<this._word.size())&&
						(((this._word.get(pointer+4).isVav())&&(this._word.get(pointer+4).isVocalizetionHolam_M()))||
						((this._word.get(pointer+4).isVav())&&(this._word.get(pointer+4).isVocalizetionShuruk())))))){
			pointer++;
			pointer++;
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(pointer+3<this._word.size())&&						// Small~Unvocalized
				(this._word.get(pointer+1).isVocalizetionEmpty())&&
				(this._word.get(pointer+2).isVav())&&
				!(this._word.get(pointer+2).isVocalizetionShuruk()||(this._word.get(pointer+2).isVocalizetionHolam_M()))){
			System.out.println("ERROR: Small-UnVoc-NonVavSuruk_NonVavHolam_M.");
			System.out.println("	word:" + this._word + " pointer:" + pointer);
		}
		else {															// End Of Word syllable
			pointer = _word.size();
		}
		return pointer;
	}
	
	// First letter in the current syllable is vocalized by a big vowel
	private int bigStartSyllable(int pointer, ArrayList<Integer> sylArrList){
		if (	(	(pointer+1<this._word.size()-1)||					// Big~Vowel or Big~Shva or Big~Hataf
					((pointer+1==this._word.size()-1)&&(this._word.get(pointer+1).isVocalizetionKamats()))) &&						 
				(	(this._word.get(pointer+1).isVocalizetionVowel())||
					(this._word.get(pointer+1).isVocalizetionShva())||
					(this._word.get(pointer+1).isVocalizetionHataf()))){
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(	(pointer+2<this._word.size()-1)||
						((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats())))&&
					(this._word.get(pointer).isVocalizetionHirik())&&
					(this._word.get(pointer+1).isYod())&&(this._word.get(pointer+1).isVocalizetionEmpty())){
				pointer++;												// Hirik-Yod~
				pointer++;
				sylArrList.add(new Integer(pointer));
		}
		else if (	(	(pointer+2<this._word.size()-1)||
						((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats())))&&
				(this._word.get(pointer).isVocalizetionTsere())&&(this._word.get(pointer+1).isYod())){
				pointer++;												// Tsere-Yod~
				pointer++;
				sylArrList.add(new Integer(pointer));
		}
		else if (	(	(pointer+2<this._word.size()-1)||
						((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats())))&&
					(this._word.get(pointer).isVocalizetionSegol())&&(this._word.get(pointer+1).isYod())){
		pointer++;														// Segol-Yod~
		pointer++;
		sylArrList.add(new Integer(pointer));
		}
		else if(	(	(pointer+2<this._word.size()-1)	||				// Big-Alef_Rafa~
						((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats())))&&
					(this._word.get(pointer+1).isVocalizetionEmpty())&&
					(this._word.get(pointer+1).isAlef())&&
					((!((this._word.get(pointer+2).isVav())&&(this._word.get(pointer+2).isVocalizetionHolam_M())))||
					(!((this._word.get(pointer+2).isVav())&&(this._word.get(pointer+2).isVocalizetionShuruk()))))){
				pointer++;
				pointer++;
				sylArrList.add(new Integer(pointer));
		}
		else if(	(	(pointer+2<this._word.size()-1)||					// Big~Unvocalized-(VavHolam_M or vavShuruk)
						((pointer+2==this._word.size()-1)&&(this._word.get(pointer+2).isVocalizetionKamats())))&&
					(this._word.get(pointer+1).isVocalizetionEmpty())&&
					(((this._word.get(pointer+2).isVav())&&(this._word.get(pointer+2).isVocalizetionHolam_M()))||
					((this._word.get(pointer+2).isVav())&&(this._word.get(pointer+2).isVocalizetionShuruk())))){
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else if (	(pointer+3<this._word.size())&&						// VavBig-UnvocalizedVav-Yod~
				(this._word.get(pointer).isVav())&&
				(this._word.get(pointer+1).isVav())&&
				(this._word.get(pointer+1).isVocalizetionEmpty())&&
				(this._word.get(pointer+2).isYod())&&
				(this._word.get(pointer+2).isVocalizetionEmpty())&&
				(	!this._word.get(pointer+3).isVocalizetionEmpty()||
					(	(pointer+4<this._word.size())&&
						(((this._word.get(pointer+4).isVav())&&(this._word.get(pointer+4).isVocalizetionHolam_M()))||
						((this._word.get(pointer+4).isVav())&&(this._word.get(pointer+4).isVocalizetionShuruk())))))){
			pointer++;
			pointer++;
			pointer++;
			sylArrList.add(new Integer(pointer));
		}
		else{
			pointer = _word.size();
		}
		return pointer;
	}
	
	// First letter in the current syllable is non-vocalized
	private int nonVocStartSyllable(int pointer, ArrayList<Integer> sylArrList){
		if(		(pointer+2<this._word.size()-1)&&						// Unvocalized-(VavHolam_M or vavShuruk)~
				(((this._word.get(pointer+1).isVav())&&(this._word.get(pointer+1).isVocalizetionHolam_M()))||
				((this._word.get(pointer+1).isVav())&&(this._word.get(pointer+1).isVocalizetionShuruk())))){
		pointer++;
		pointer++;
		sylArrList.add(new Integer(pointer));
		}
		else if(pointer+2<this._word.size()-1){
			System.out.println("ERROR: Syllable starts with an unvocalized letter and no VavHolam_M or vavShuruk afterwords.");
			System.out.println("	word:" + this._word + " pointer:" + pointer);
			pointer=this._word.size(); //??
		}
		else{
			pointer++;
			pointer++;
		}
		return pointer;
	}
	
	// First letter in the current syllable is vocalized by shva or hataf
	private int shva_HatafStartSyllable(int pointer, ArrayList<Integer> sylArrList){
		pointer++;
		if(this.isVocalizetionSmallVowel(pointer)){
			//System.out.println("$"+pointer);
			pointer = this.smallStartSyllable(pointer, sylArrList);
		}
		else if(this.isVocalizetionBigVowel(pointer)) {
			//System.out.println("$$"+pointer);
			pointer = this.bigStartSyllable(pointer, sylArrList);
		}
		else if(this._word.get(pointer).isVocalizetionEmpty()) {
			//System.out.println("$$$"+pointer);
			pointer = this.nonVocStartSyllable(pointer, sylArrList);
		}
		return pointer;
	}
	
	private boolean isVocalizetionSmallVowel(int pointer){
		return (	(this._word.get(pointer).isVocalizetionHirik()&&(pointer+1<this._word.size())&&
						(!(this._word.get(pointer+1).isYod()&&this._word.get(pointer+1).isVocalizetionEmpty())))||
					//(this._word.get(pointer).isVocalizetionKamats_Katan())||
					(this._word.get(pointer).isVocalizetionPatah())||
					(this._word.get(pointer).isVocalizetionSegol()&&(pointer<this._word.size()-1)&&
							!(this._word.get(pointer+1).isYod()&&this._word.get(pointer+1).isVocalizetionEmpty())&&
							!(	(this._word.get(pointer+1).isVocalizetionEmpty())&&
								(pointer+1==this._word.size()-1))&&
							!(	(this._word.get(pointer+1).isVocalizetionEmpty())&&
								(pointer+1<this._word.size()-1)&&
									(	this._word.get(pointer+2).isVocalizetionHolam_M()||
										this._word.get(pointer+2).isVocalizetionShuruk())))||
					(this._word.get(pointer).isVocalizetionKubuts()));
	}
	
	private boolean isVocalizetionBigVowel(int pointer){
		return (	(this._word.get(pointer).isVocalizetionHirik()&&(pointer+1<this._word.size())&&
						this._word.get(pointer+1).isYod()&&this._word.get(pointer+1).isVocalizetionEmpty())|| 
					(this._word.get(pointer).isVocalizetionSegol()&&(pointer+1<this._word.size())&&
						this._word.get(pointer+1).isYod()&&this._word.get(pointer+1).isVocalizetionEmpty())||
					(this._word.get(pointer).isVocalizetionHolam_H())||
					(this._word.get(pointer).isVocalizetionHolam_M())||
					(this._word.get(pointer).isVocalizetionKamats())||
					(this._word.get(pointer).isVocalizetionTsere())||
					(this._word.get(pointer).isVocalizetionShuruk()));
	}
}
