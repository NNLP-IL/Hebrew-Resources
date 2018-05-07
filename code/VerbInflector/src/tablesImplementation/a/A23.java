package a;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

public class A23 extends A22{

	/*
	 * Past - same as A22
	 */

	/*
	 * Present
	 */
	public HebrewVerb present1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present2MS(HebrewVerb w){
		HebrewVerb wNew = this.present1MS(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FS(HebrewVerb w){
		HebrewVerb wNew = this.present1FS(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
		
	public HebrewVerb present3MS(HebrewVerb w){
		HebrewVerb wNew = this.present1MS(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present3FS(HebrewVerb w){
		HebrewVerb wNew = this.present1FS(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
		
	public HebrewVerb present1MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present2MP(HebrewVerb w){
		HebrewVerb wNew = this.present1MP(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FP(HebrewVerb w){
		HebrewVerb wNew = this.present1FP(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present3MP(HebrewVerb w){
		HebrewVerb wNew = this.present1MP(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FP(HebrewVerb w){
		HebrewVerb wNew = this.present1FP(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Beinoni - NONE
	 */
	public ArrayList<HebrewVerb> makeBeinoniInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> BeinoniInflictions = new ArrayList<HebrewVerb>();
		return BeinoniInflictions;
	}

	/*
	 * Future - same as A22
	 */

	/*
	 * Imperative - same as A22
	 */

	/*
	 * Infinitive - same as A22
	 */
}
