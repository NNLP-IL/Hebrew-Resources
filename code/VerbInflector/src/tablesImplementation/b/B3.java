package b;

import hebrewVerb.HebrewVerb;

public class B3 extends B1{

	/*
	 * Past
	 */
	public HebrewVerb past1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshShva(wNew, 1);
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
		wNew.movePointer(2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_Nun_VavShuruk(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
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
	 * Present - same as B1
	 */

	/*
	 * Future
	 */
	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefSegol(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1SCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3FSComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future2FPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.future3MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FPCompC(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.future3MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future3FPMissB(HebrewVerb w){
		HebrewVerb wNew = this.future2FPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future3FPMissC(HebrewVerb w){
		HebrewVerb wNew = this.future2FPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Imperative
	 */
	public HebrewVerb imperative2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb imperative2FPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 0);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Infinitive - same as B1
	 */
}
