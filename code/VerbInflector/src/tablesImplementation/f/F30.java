package f;

import hebrewVerb.HebrewVerb;
import letters.HebrewLetter;

public class F30 extends F26{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[1].setVocalization_HOLAM_M();
		letterArr[2].setVocalization_HIRIK();
		if (letterArr[4].isKafSofit()){
			letterArr[4].setVocalization_SHVA();
		}
		return letterArr;
	}
	
	/*
	 * Past - same as F26
	 */

	/*
	 * Present
	 */
	public HebrewVerb present1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Mem(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Mem(wNew, 4);
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
		this.replaceLetterTo_Mem(wNew, 4);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Mem(wNew, 4);
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
	 * Future 
	 */
	public HebrewVerb future1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Alef(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDagesh(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDagesh(wNew, 4);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Yod(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FS(HebrewVerb w){
		HebrewVerb wNew = this.future2MS(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Nun(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDagesh(wNew, 4);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FP(HebrewVerb w){
		HebrewVerb wNew = this.future2MP(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDagesh(wNew, 2);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_Yod(wNew, 4);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}


	public HebrewVerb future3FP(HebrewVerb w){
		HebrewVerb wNew = this.future3MP(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FPB(HebrewVerb w){
		HebrewVerb wNew = this.future2FPB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Imperative 
	 */
	public HebrewVerb imperative2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_TSERE();
		this.removeNextLetter(wNew);
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(4);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(4);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FP(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MP(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive 
	 */
	public HebrewVerb infinitiveComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_LamedShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
}
