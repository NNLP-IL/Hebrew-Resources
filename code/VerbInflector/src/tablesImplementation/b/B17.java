package b;

import java.util.ArrayList;

import hebrewVerb.HebrewVerb;

public class B17 extends B15{

	/*
	 * Past
	 */
	public ArrayList<HebrewVerb> makePastInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> pastInflictions = new ArrayList<HebrewVerb>();
		pastInflictions.add(this.past1S(w));
		pastInflictions.add(this.past2MS(w));
		pastInflictions.add(this.past2FS(w));
		pastInflictions.add(this.past2FSB(w));
		pastInflictions.add(this.past3MS(w));
		pastInflictions.add(this.past3FS(w));
		pastInflictions.add(this.past1P(w));
		pastInflictions.add(this.past2MP(w));
		pastInflictions.add(this.past2FP(w));
		pastInflictions.add(this.past3MP(w));
		pastInflictions.add(this.past3FP(w));
		return pastInflictions;
	}
	
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
	
	public HebrewVerb past2FSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
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
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
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
	 * Present
	 */
	public HebrewVerb present1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Patah_Tav(wNew, 1);
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
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
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
	 * Future
	 */
	public ArrayList<HebrewVerb> makeFutureInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> futureInflictions = new ArrayList<HebrewVerb>();
		futureInflictions.add(this.future1SComp(w));
		futureInflictions.add(this.future1SCompB(w));
		futureInflictions.add(this.future1SMiss(w));
		futureInflictions.add(this.future1SMissB(w));
		futureInflictions.add(this.future2MSComp(w));
		futureInflictions.add(this.future2MSCompB(w));
		futureInflictions.add(this.future2MSMiss(w));
		futureInflictions.add(this.future2MSMissB(w));
		futureInflictions.add(this.future2FSComp(w));
		futureInflictions.add(this.future2FSMiss(w));
		futureInflictions.add(this.future3MSComp(w));
		futureInflictions.add(this.future3MSCompB(w));
		futureInflictions.add(this.future3MSMiss(w));
		futureInflictions.add(this.future3MSMissB(w));
		futureInflictions.add(this.future3FSComp(w));
		futureInflictions.add(this.future3FSCompB(w));
		futureInflictions.add(this.future3FSMiss(w));
		futureInflictions.add(this.future3FSMissB(w));
		futureInflictions.add(this.future1PComp(w));
		futureInflictions.add(this.future1PCompB(w));
		futureInflictions.add(this.future1PMiss(w));
		futureInflictions.add(this.future1PMissB(w));
		futureInflictions.add(this.future2MPComp(w));
		futureInflictions.add(this.future2MPMiss(w));
		futureInflictions.add(this.future2FPComp(w));
		futureInflictions.add(this.future2FPCompB(w));
		futureInflictions.add(this.future2FPMiss(w));
		futureInflictions.add(this.future2FPMissB(w));
		futureInflictions.add(this.future3MPComp(w));
		futureInflictions.add(this.future3MPMiss(w));
		futureInflictions.add(this.future3FPComp(w));
		futureInflictions.add(this.future3FPCompB(w));
		futureInflictions.add(this.future3FPMiss(w));
		futureInflictions.add(this.future3FPMissB(w));
		return futureInflictions;
	}

	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 3);
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
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future1SMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		this.macro_Vav(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future2MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_SHVA();
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
		this.macro_Vav(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future3MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3FSComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FSCompB(HebrewVerb w){
		HebrewVerb wNew = this.future2MSCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future3FSMissB(HebrewVerb w){
		HebrewVerb wNew = this.future2MSMissB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1PCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb future1PMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_SHVA();
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
		this.macro_Vav(wNew, 3);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
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
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
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
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_SHVA();
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
		HebrewVerb wNew = this.future2FPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Imperative 
	 */
	public ArrayList<HebrewVerb> makeImperativeInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> imperativeInflictions = new ArrayList<HebrewVerb>();
		imperativeInflictions.add(this.imperative2MSComp(w));
		imperativeInflictions.add(this.imperative2MSCompB(w));
		imperativeInflictions.add(this.imperative2MSMiss(w));
		imperativeInflictions.add(this.imperative2MSMissB(w));
		imperativeInflictions.add(this.imperative2FSComp(w));
		imperativeInflictions.add(this.imperative2FSMiss(w));
		imperativeInflictions.add(this.imperative2MPComp(w));
		imperativeInflictions.add(this.imperative2MPMiss(w));
		imperativeInflictions.add(this.imperative2FPComp(w));
		imperativeInflictions.add(this.imperative2FPCompB(w));
		imperativeInflictions.add(this.imperative2FPMiss(w));
		imperativeInflictions.add(this.imperative2FPMissB(w));
		return imperativeInflictions;
	}
	
	public HebrewVerb imperative2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb imperative2MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 2);
		wNew.removeLetter();
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_SHVA();
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
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
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
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		this.macro_Vav(wNew, 2);
		wNew.setVocalization_SHVA();
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
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
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
		this.macro_Vav(wNew, 3);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
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
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Infinitive
	 */
	public ArrayList<HebrewVerb> makeInfinitiveInflictions(HebrewVerb w){
		 ArrayList<HebrewVerb> infinitiveInflictions = new ArrayList<HebrewVerb>();
		 infinitiveInflictions.add(this.infinitiveComp(w));
		 infinitiveInflictions.add(this.infinitiveCompB(w));
		 infinitiveInflictions.add(this.infinitiveMiss(w));
		 infinitiveInflictions.add(this.infinitiveMissB(w));
		 return infinitiveInflictions;
	 }

	 public HebrewVerb infinitiveComp(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik_Yod(wNew, 3);
		 wNew.removeLetter();
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 this.macro_Vav(wNew, 3);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }
	 
	 public HebrewVerb infinitiveCompB(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik_Yod(wNew, 3);
		 wNew.removeLetter();
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 this.macro_Vav(wNew, 2);
		 wNew.setVocalization_TSERE();
		 wNew.movePointer(1);
		 wNew.setVocalization_PATAH();
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }

	 public HebrewVerb infinitiveMiss(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik(wNew, 2);
		 wNew.removeLetter();
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 wNew.movePointer(2);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.MISSING);
		 return wNew;
	 }
	 
	 public HebrewVerb infinitiveMissB(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik(wNew, 2);
		 wNew.removeLetter();
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 wNew.movePointer(1);
		 wNew.setVocalization_TSERE();
		 wNew.movePointer(1);
		 wNew.setVocalization_PATAH();
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.MISSING);
		 return wNew;
	 }
	 
}
