package a;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

public class A29 extends A1{

	/*
	 * Past - same as A1
	 */

	/*
	 * Present - same as A1
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
		futureInflictions.add(this.future2MSComp(w));
		futureInflictions.add(this.future2FSComp(w));
		futureInflictions.add(this.future3MSComp(w));
		futureInflictions.add(this.future3FSComp(w));
		futureInflictions.add(this.future1PComp(w));
		futureInflictions.add(this.future2MPComp(w));
		futureInflictions.add(this.future2FPComp(w));
		futureInflictions.add(this.future2FPCompB(w));
		futureInflictions.add(this.future2FPCompC(w));
		futureInflictions.add(this.future3MPComp(w));
		futureInflictions.add(this.future3FPComp(w));
		futureInflictions.add(this.future3FPCompB(w));
		futureInflictions.add(this.future3FPCompC(w));
		return futureInflictions;
	}
	
	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_TSERE();
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

	public HebrewVerb future1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_TSERE();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_SHVA();
		wNew.setVocalization_DAGESH();
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
		this.macro_BEFORE_TavDageshTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodTsere(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_SHVA();
		wNew.setVocalization_DAGESH();
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
		imperativeInflictions.add(this.imperative2MS(w));
		imperativeInflictions.add(this.imperative2FS(w));
		imperativeInflictions.add(this.imperative2MP(w));
		imperativeInflictions.add(this.imperative2FP(w));
		imperativeInflictions.add(this.imperative2FPB(w));
		return imperativeInflictions;
	}
	
	public HebrewVerb imperative2MS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH_IF_BEGEDKEFET();
		wNew.setVocalization_TSERE();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FS(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH_IF_BEGEDKEFET();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MP(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeLetter();
		wNew.setVocalization_DAGESH_IF_BEGEDKEFET();
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
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
		wNew.removeLetter();
		wNew.setVocalization_DAGESH_IF_BEGEDKEFET();
		wNew.setVocalization_TSERE();////////
		wNew.movePointer(1);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	/*
	 * Infinitive - same as 
	 */
	public ArrayList<HebrewVerb> makeInfinitiveInflictions(HebrewVerb w){
		 ArrayList<HebrewVerb> infinitiveInflictions = new ArrayList<HebrewVerb>();
		 infinitiveInflictions.add(this.infinitiveComp(w));
		 return infinitiveInflictions;
	 }
	
	public HebrewVerb infinitiveComp(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedKamats(wNew, 1);
		 wNew.removeLetter();
		 wNew.setVocalization_SEGOL();
		 wNew.movePointer(1);
		 this.macro_Segol_Tav(wNew, 1);		 
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }
	
}
