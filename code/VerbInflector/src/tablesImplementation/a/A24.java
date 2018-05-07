package a;

import java.util.ArrayList;

import letters.HebrewLetter;

import hebrewVerb.HebrewVerb;

public class A24 extends A23{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_KAMATS();
		letterArr[1].setVocalization_PATAH();
		if (letterArr[2].isKafSofit()){
			letterArr[2].setVocalization_SHVA();
		}
		if (letterArr[2].isHey()){
			letterArr[2].setVocalization_MAPIK();
		}
		return letterArr;
	}
	
	/*
	 * Past - same as A23
	 */

	/*
	 * Present - same as A23
	 */

	/*
	 * Beinoni
	 */
	public ArrayList<HebrewVerb> makeBeinoniInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> BeinoniInflictions = new ArrayList<HebrewVerb>();
		BeinoniInflictions.add(this.beinoni1MS(w));
		BeinoniInflictions.add(this.beinoni1FS(w));
		BeinoniInflictions.add(this.beinoni2MS(w));
		BeinoniInflictions.add(this.beinoni2FS(w));
		BeinoniInflictions.add(this.beinoni3MS(w));
		BeinoniInflictions.add(this.beinoni3FS(w));
		BeinoniInflictions.add(this.beinoni1MP(w));
		BeinoniInflictions.add(this.beinoni1FP(w));
		BeinoniInflictions.add(this.beinoni2MP(w));
		BeinoniInflictions.add(this.beinoni2FP(w));
		BeinoniInflictions.add(this.beinoni3MP(w));
		BeinoniInflictions.add(this.beinoni3FP(w));
		return BeinoniInflictions;
	}
	
	public HebrewVerb beinoni1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_PATAH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni2MS(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1MS(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni2FS(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1FS(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni3MS(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1MS(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni3FS(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1FS(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni1MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		this.macro_RemoveVoc_VavHolam_Tav(wNew,2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni2MP(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1MP(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni2FP(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1FP(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni3MP(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1MP(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb beinoni3FP(HebrewVerb w){
		HebrewVerb wNew = this.beinoni1FP(w);
		wNew.setMorphology(HebrewVerb.Time.BEINONI, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Future - same as A23
	 */

	/*
	 * Imperative - same as A23
	 */

	/*
	 * Infinitive - same as A23
	 */
}
