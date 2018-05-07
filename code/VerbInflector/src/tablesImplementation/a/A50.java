package a;

import java.util.ArrayList;

import hebrewVerb.HebrewVerb;

public class A50 extends A48{

	/*
	 * Past
	 */
	public HebrewVerb past1S(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
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
		wNew.movePointer(1);
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
		wNew.movePointer(1);
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
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		this.removeNextLetter(wNew);
		this.macro_Tav(wNew, 1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb past1P(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
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
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
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
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
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
		wNew.movePointer(1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
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
	 * Present - same as A48
	 */

	/*
	 * Beinoni - NONE
	 */
	public ArrayList<HebrewVerb> makeBeinoniInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> BeinoniInflictions = new ArrayList<HebrewVerb>();
		return BeinoniInflictions;
	}

	/*
	 * Future 
	 */
	public ArrayList<HebrewVerb> makeFutureInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> futureInflictions = new ArrayList<HebrewVerb>();
		futureInflictions.add(this.future1SComp(w));
		futureInflictions.add(this.future1SCompB(w));
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
		futureInflictions.add(this.future2FPCompD(w));
		futureInflictions.add(this.future3MPComp(w));
		futureInflictions.add(this.future3MPCompB(w));
		futureInflictions.add(this.future3FPComp(w));
		futureInflictions.add(this.future3FPCompB(w));
		futureInflictions.add(this.future3FPCompC(w));
		futureInflictions.add(this.future3FPCompD(w));
		return futureInflictions;
	}

	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefSegol(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_DAGESH_IF_BEGEDKEFET();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1SCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefSegol(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_SEGOL();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
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
		this.macro_BEFORE_NunPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future1PCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
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
		HebrewVerb wNew = this.future2MPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_NunKamats_Hey(wNew,2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_NunKamats_Hey(wNew,2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew,1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew,1);
		this.removeNextLetter(wNew);
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
		HebrewVerb wNew = this.future3MPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FPCompC(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FPCompD(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Imperative 
	 */
	public HebrewVerb imperative2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		this.removeNextLetter(wNew);
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
		wNew.setVocalization_H_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 0);
		this.macro_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive
	 */
	public ArrayList<HebrewVerb> makeInfinitiveInflictions(HebrewVerb w){
		 ArrayList<HebrewVerb> infinitiveInflictions = new ArrayList<HebrewVerb>();
		 infinitiveInflictions.add(this.infinitiveComp(w));
		 infinitiveInflictions.add(this.infinitiveCompB(w));
		 return infinitiveInflictions;
	 }
	
	public HebrewVerb infinitiveComp(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 wNew.removeDagesh();
		 this.macro_BEFORE_LamedPatah(wNew, 1);
		 wNew.setVocalization_SHVA();
		 wNew.movePointer(1);
		 wNew.removeVocalization();
		 this.macro_VavHolamM(wNew, 1);
		 this.removeNextLetter(wNew);
		 this.macro_Tav(wNew, 1);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }
	
	public HebrewVerb infinitiveCompB(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 wNew.removeDagesh();
		 this.macro_BEFORE_LamedPatah(wNew, 1);
		 wNew.setVocalization_H_PATAH();
		 wNew.movePointer(1);
		 wNew.removeVocalization();
		 this.macro_VavHolamM(wNew, 1);
		 this.removeNextLetter(wNew);
		 this.macro_Tav(wNew, 1);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }
	
}
