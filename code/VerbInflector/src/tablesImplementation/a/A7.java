package a;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

public class A7 extends A6{

	/*
	 * Past
	 */
	public ArrayList<HebrewVerb> makePastInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> pastInflictions = new ArrayList<HebrewVerb>();
		pastInflictions.add(this.past1S(w));
		pastInflictions.add(this.past1SMiss(w));
		pastInflictions.add(this.past2MS(w));
		pastInflictions.add(this.past2MSMiss(w));
		pastInflictions.add(this.past2FS(w));
		pastInflictions.add(this.past2FSMiss(w));
		pastInflictions.add(this.past3MS(w));
		pastInflictions.add(this.past3MSB(w));
		pastInflictions.add(this.past3MSMiss(w));
		pastInflictions.add(this.past3FS(w));
		pastInflictions.add(this.past1P(w));
		pastInflictions.add(this.past1PMiss(w));
		pastInflictions.add(this.past2MP(w));
		pastInflictions.add(this.past2MPMiss(w));
		pastInflictions.add(this.past2FP(w));
		pastInflictions.add(this.past2FPMiss(w));
		pastInflictions.add(this.past3MP(w));
		pastInflictions.add(this.past3FP(w));
		return pastInflictions;
	}

	public HebrewVerb past1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	// past3FS same as A6

	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_Nun_VavShuruk(wNew, 0);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_Nun_VavShuruk(wNew, 0);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	// past3MP same as A6

	// past3FP same as A6
	
	/*
	 * Present - same as A6
	 */

	/*
	 * Beinoni - same as A6
	 */

	/*
	 * Future - same as A6
	 */

	/*
	 * Imperative - same as A6
	 */

	/*
	 * Infinitive - same as A6
	 */
}
