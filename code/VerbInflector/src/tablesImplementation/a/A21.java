package a;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

public class A21 extends A20{

	/*
	 * Past - same as A20
	 */

	/*
	 * Present - same as A20
	 */

	/*
	 * Beinoni - same as A20
	 */

	/*
	 * Future
	 */
	public ArrayList<HebrewVerb> makeFutureInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> futureInflictions = new ArrayList<HebrewVerb>();
		futureInflictions.add(this.future1SComp(w));
		futureInflictions.add(this.future1SCompB(w));
		futureInflictions.add(this.future1SMiss(w));
		futureInflictions.add(this.future2MSComp(w));
		futureInflictions.add(this.future2MSCompB(w));
		futureInflictions.add(this.future2FSComp(w));
		futureInflictions.add(this.future2FSCompB(w));
		futureInflictions.add(this.future3MSComp(w));
		futureInflictions.add(this.future3MSCompB(w));
		futureInflictions.add(this.future3FSComp(w));
		futureInflictions.add(this.future3FSCompB(w));
		futureInflictions.add(this.future1PComp(w));
		futureInflictions.add(this.future1PCompB(w));
		futureInflictions.add(this.future2MPComp(w));
		futureInflictions.add(this.future2MPCompB(w));
		futureInflictions.add(this.future2FPComp(w));
		futureInflictions.add(this.future2FPCompB(w));
		futureInflictions.add(this.future2FPCompC(w));
		futureInflictions.add(this.future3MPComp(w));
		futureInflictions.add(this.future3MPCompB(w));
		futureInflictions.add(this.future3FPComp(w));
		futureInflictions.add(this.future3FPCompB(w));
		futureInflictions.add(this.future3FPCompC(w));
		return futureInflictions;
	}

	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_Alef_VavHolamM(wNew, 2);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1SCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefSegol(wNew, 1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHolamH(wNew, 1);
		wNew.removeLetter();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshSegol(wNew, 1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshSegol(wNew, 1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodSegol(wNew, 1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
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

	public HebrewVerb future1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1PCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunSegol(wNew, 1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshSegol(wNew, 1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew,2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshSegol(wNew, 1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew,2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHolamH(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew,1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodSegol(wNew, 1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew,1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
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

	/*
	 * Imperative - same as 
	 */
	public ArrayList<HebrewVerb> makeImperativeInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> imperativeInflictions = new ArrayList<HebrewVerb>();
		imperativeInflictions.add(this.imperative2MSComp(w));
		imperativeInflictions.add(this.imperative2FS(w));
		imperativeInflictions.add(this.imperative2MP(w));
		imperativeInflictions.add(this.imperative2FPComp(w));
		imperativeInflictions.add(this.imperative2FPCompB(w));
		return imperativeInflictions;
	}

	public HebrewVerb imperative2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MP(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive - same as 
	 */
}
