package e;

import java.util.ArrayList;

import letters.HebrewLetter;

import hebrewVerb.HebrewVerb;

public class E30 extends E1{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_HIRIK();
		letterArr[1].setVocalization_SHVA();
		letterArr[2].setVocalization_PATAH();
		letterArr[2].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[3].setVocalization_KAMATS();
		letterArr[3].setVocalization_DAGESH();
		if (letterArr[4].isKafSofit()){
			letterArr[4].setVocalization_SHVA();
		}
		return letterArr;
	}
	
	/*
	 * Past
	 */
	public ArrayList<HebrewVerb> makePastInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> pastInflictions = new ArrayList<HebrewVerb>();
		pastInflictions.add(this.past1S(w));
		pastInflictions.add(this.past1SB(w));
		pastInflictions.add(this.past2MS(w));
		pastInflictions.add(this.past2MSB(w));
		pastInflictions.add(this.past2FS(w));
		pastInflictions.add(this.past2FSB(w));
		pastInflictions.add(this.past3MS(w));
		pastInflictions.add(this.past3FS(w));
		pastInflictions.add(this.past1P(w));
		pastInflictions.add(this.past1PB(w));
		pastInflictions.add(this.past2MP(w));
		pastInflictions.add(this.past2MPB(w));
		pastInflictions.add(this.past2FP(w));
		pastInflictions.add(this.past2FPB(w));
		pastInflictions.add(this.past3MP(w));
		pastInflictions.add(this.past3FP(w));
		return pastInflictions;
	}
	
	public HebrewVerb past1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_SHVA();
		this.macro_Tav(wNew, 1);
		this.macro_Kamats_Hey(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_HIRIK();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_TavSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3FP(HebrewVerb w){
		HebrewVerb wNew = this.past3MP(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Present
	 */
	public HebrewVerb present1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemHirik(wNew, 3);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemHirik(wNew, 5);
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
		this.replaceLetterTo_MemHirik(wNew, 3);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemHirik(wNew, 3);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		this.removeNextLetter(wNew);
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
		this.replaceLetterTo_AlefSegol(wNew, 3);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshHirik(wNew, 3);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshHirik(wNew, 3);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_YodHirik(wNew, 3);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
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
		this.replaceLetterTo_NunHirik(wNew, 3);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshHirik(wNew, 3);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
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
		this.replaceLetterTo_TavDageshHirik(wNew, 3);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 2);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_YodHirik(wNew, 3);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
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
		wNew.movePointer(3);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
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
		wNew.movePointer(3);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 2);
		this.removeNextLetter(wNew);
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
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_Tav(wNew, 2);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
}
