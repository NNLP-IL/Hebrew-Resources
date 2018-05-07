package a;

import java.util.ArrayList;

import hebrewVerb.HebrewVerb;

public class A19 extends A17 {

	/*
	 * Past - same as A17 (with exception of past1P)
	 */
	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Present - same as A17
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
	 * Future - same as A17 (with exception of future2FPCompB, future3FPCompB)
	 */
	public HebrewVerb future2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew,0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Imperative - same as A17 (with exception of )
	 */
	public HebrewVerb imperative2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive - same as A17
	 */
}
