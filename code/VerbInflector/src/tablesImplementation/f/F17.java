package f;

import hebrewVerb.HebrewVerb;

public class F17 extends F16{

	/*
	 * Past
	 */
	public HebrewVerb past1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_TavDageshHirik_Yod(wNew, 0);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_TavHirik_Yod(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_TavDageshKamats(wNew, 0);
		wNew.removeLetter();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_TavKamats(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_TavDageshShva(wNew, 0);
		wNew.removeLetter();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_Tav(wNew, 2);
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
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_Nun_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_TavDageshSegol_MemS(wNew, 0);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_TavSegol_MemS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Shva_TavDageshSegol_NunS(wNew, 0);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(3);
		wNew.removeVocalization();
		this.macro_VavHolamM_TavSegol_NunS(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past3MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
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
	 * Present - same as F16
	 */

	/*
	 * Future - same as F16
	 */

	/*
	 * Imperative - same as F16
	 */

	/*
	 * Infinitive - same as F16
	 */
}
