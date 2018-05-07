package d;

import table.*;
import hebrewVerb.*;
import hebrewWord.BaseWord;
import letters.HebrewLetter;
import java.util.ArrayList;

public class D1 extends Table{

	public void inflectVerbs(){
		for(BaseWord iw:_baseVerbs){
			ArrayList<VerbInflection> newinflx = new ArrayList<VerbInflection>();
			HebrewVerb w = new HebrewVerb(iw);
			newinflx.addAll(makeInflictedArrayList(this.makePastInflictions(w)));
			newinflx.addAll(makeInflictedArrayList(this.makePresentInflictions(w)));
			newinflx.addAll(makeInflictedArrayList(this.makeFutureInflictions(w)));
			_inflections.add(newinflx);
		}
	}
	
	private static ArrayList<VerbInflection> makeInflictedArrayList(ArrayList<HebrewVerb> arrlst){
		ArrayList<VerbInflection> ret = new ArrayList<VerbInflection>();
		for(int i=0; i<arrlst.size();i++){
			ret.add(new VerbInflection(arrlst.get(i)));
		}
		return ret;
	}
	
	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_KUBUTS();
		letterArr[1].setVocalization_DAGESH();
		letterArr[1].setVocalization_PATAH();
		if (letterArr[2].isKafSofit()){
			letterArr[2].setVocalization_SHVA();
		}
		return letterArr;
	}
	
	/*
	 * Past 
	 */
	public ArrayList<HebrewVerb> makePastInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> pastInflictions = new ArrayList<HebrewVerb>();
		pastInflictions.add(this.past1SComp(w));
		pastInflictions.add(this.past1SMiss(w));
		pastInflictions.add(this.past2MSComp(w));
		pastInflictions.add(this.past2MSMiss(w));
		pastInflictions.add(this.past2FSComp(w));
		pastInflictions.add(this.past2FSMiss(w));
		pastInflictions.add(this.past3MSComp(w));
		pastInflictions.add(this.past3MSMiss(w));
		pastInflictions.add(this.past3FSComp(w));
		pastInflictions.add(this.past3FSMiss(w));
		pastInflictions.add(this.past1PComp(w));
		pastInflictions.add(this.past1PMiss(w));
		pastInflictions.add(this.past2MPComp(w));
		pastInflictions.add(this.past2MPMiss(w));
		pastInflictions.add(this.past2FPComp(w));
		pastInflictions.add(this.past2FPMiss(w));
		pastInflictions.add(this.past3MPComp(w));
		pastInflictions.add(this.past3MPMiss(w));
		pastInflictions.add(this.past3FPComp(w));
		pastInflictions.add(this.past3FPMiss(w));
		return pastInflictions;
	}
	
	public HebrewVerb past1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 3);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.past3MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.past3MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Present
	 */
	public ArrayList<HebrewVerb> makePresentInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> presentInflictions = new ArrayList<HebrewVerb>();
		presentInflictions.add(this.present1MSComp(w));
		presentInflictions.add(this.present1MSMiss(w));
		presentInflictions.add(this.present1FSComp(w));
		presentInflictions.add(this.present1FSMiss(w));
		presentInflictions.add(this.present2MSComp(w));
		presentInflictions.add(this.present2MSMiss(w));
		presentInflictions.add(this.present2FSComp(w));
		presentInflictions.add(this.present2FSMiss(w));
		presentInflictions.add(this.present3MSComp(w));
		presentInflictions.add(this.present3MSMiss(w));
		presentInflictions.add(this.present3FSComp(w));
		presentInflictions.add(this.present3FSMiss(w));
		presentInflictions.add(this.present1MPComp(w));
		presentInflictions.add(this.present1MPMiss(w));
		presentInflictions.add(this.present1FPComp(w));
		presentInflictions.add(this.present1FPMiss(w));
		presentInflictions.add(this.present2MPComp(w));
		presentInflictions.add(this.present2MPMiss(w));
		presentInflictions.add(this.present2FPComp(w));
		presentInflictions.add(this.present2FPMiss(w));
		presentInflictions.add(this.present3MPComp(w));
		presentInflictions.add(this.present3MPMiss(w));
		presentInflictions.add(this.present3FPComp(w));
		presentInflictions.add(this.present3FPMiss(w));
		return presentInflictions;
	}

	public HebrewVerb present1MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present1FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		this.macro_Segol_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		this.macro_Segol_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2MSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2FSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3MSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3FSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present1MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present1FPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2MPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3MPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Future
	 */
	public ArrayList<HebrewVerb> makeFutureInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> futureInflictions = new ArrayList<HebrewVerb>();
		futureInflictions.add(this.future1SComp(w));
		futureInflictions.add(this.future1SMiss(w));
		futureInflictions.add(this.future2MSComp(w));
		futureInflictions.add(this.future2MSMiss(w));
		futureInflictions.add(this.future2FSComp(w));
		futureInflictions.add(this.future2FSMiss(w));
		futureInflictions.add(this.future3MSComp(w));
		futureInflictions.add(this.future3MSMiss(w));
		futureInflictions.add(this.future3FSComp(w));
		futureInflictions.add(this.future3FSMiss(w));
		futureInflictions.add(this.future1PComp(w));
		futureInflictions.add(this.future1PMiss(w));
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
		this.macro_BEFORE_AlefHPatah(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHPatah(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeDagesh();
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
		this.macro_BEFORE_YodShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
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
		this.macro_BEFORE_NunShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
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
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeDagesh();
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
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
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
		this.macro_BEFORE_TavDageshShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
		this.macro_Shva_NunKamats_Hey(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
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
		this.macro_BEFORE_YodShva(wNew, 1);
		wNew.removeDagesh();
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
		HebrewVerb wNew = this.future2FPCompB(w);
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
}
