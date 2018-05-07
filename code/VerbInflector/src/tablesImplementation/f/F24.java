package f;

import java.util.ArrayList;

import hebrewVerb.HebrewVerb;

public class F24 extends F21{

	/*
	 * Past
	 */
	public HebrewVerb past1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavHirik_Yod(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavHirik_Yod(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.setVocalization_DAGESH();
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_Nun_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_Nun_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavSegol_MemS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavSegol_MemS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Yod(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavSegol_NunS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavHolamM_TavSegol_NunS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.past3MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Present
	 */
	public HebrewVerb present1MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemTsere(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemShva(wNew, 2);
		wNew.setVocalization_DAGESH();
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
		this.replaceLetterTo_MemShva(wNew, 2);
		wNew.setVocalization_DAGESH();
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb present1FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_MemShva(wNew, 2);
		wNew.setVocalization_DAGESH();
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
		futureInflictions.add(this.future1S(w));
		futureInflictions.add(this.future2MS(w));
		futureInflictions.add(this.future2FS(w));
		futureInflictions.add(this.future3MS(w));
		futureInflictions.add(this.future3FS(w));
		futureInflictions.add(this.future1P(w));
		futureInflictions.add(this.future2MP(w));
		futureInflictions.add(this.future2FP(w));
		futureInflictions.add(this.future2FPB(w));
		futureInflictions.add(this.future3MP(w));
		futureInflictions.add(this.future3FP(w));
		futureInflictions.add(this.future3FPB(w));
		return futureInflictions;
	}
	
	public HebrewVerb future1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_AlefKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshKamats(wNew, 2);
		wNew.setVocalization_DAGESH();
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_YodKamats(wNew, 2);
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
		this.replaceLetterTo_NunKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_TavDageshKamats(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
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
		this.replaceLetterTo_TavDageshKamats(wNew, 1);
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.replaceLetterTo_YodKamats(wNew, 2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
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
	public ArrayList<HebrewVerb> makeImperativeInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> imperativeInflictions = new ArrayList<HebrewVerb>();
		imperativeInflictions.add(this.imperative2MS(w));
		imperativeInflictions.add(this.imperative2FS(w));
		imperativeInflictions.add(this.imperative2MP(w));
		imperativeInflictions.add(this.imperative2FP(w));
		imperativeInflictions.add(this.imperative2FPB(w));
		return imperativeInflictions;
	}
	
	public HebrewVerb imperative2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(2);
		wNew.setVocalization_DAGESH();
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(2);
		wNew.removeVocalization();
		wNew.setVocalization_DAGESH();
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
		wNew.setVocalization_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive - same as F21
	 */
}
