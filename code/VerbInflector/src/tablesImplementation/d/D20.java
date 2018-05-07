package d;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

public class D20 extends D17{

	/*
	 * Past
	 */
	public ArrayList<HebrewVerb> makePastInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> pastInflictions = new ArrayList<HebrewVerb>();
		pastInflictions.add(this.past1SComp(w));
		pastInflictions.add(this.past1SCompB(w));
		pastInflictions.add(this.past1SCompC(w));
		pastInflictions.add(this.past1SCompD(w));
		pastInflictions.add(this.past1SMiss(w));
		pastInflictions.add(this.past1SMissB(w));
		pastInflictions.add(this.past1SMissC(w));
		pastInflictions.add(this.past1SMissD(w));
		pastInflictions.add(this.past2MSComp(w));
		pastInflictions.add(this.past2MSCompB(w));
		pastInflictions.add(this.past2MSCompC(w));
		pastInflictions.add(this.past2MSCompD(w));
		pastInflictions.add(this.past2MSMiss(w));
		pastInflictions.add(this.past2MSMissB(w));
		pastInflictions.add(this.past2MSMissC(w));
		pastInflictions.add(this.past2MSMissD(w));
		pastInflictions.add(this.past2FSComp(w));
		pastInflictions.add(this.past2FSCompB(w));
		pastInflictions.add(this.past2FSCompC(w));
		pastInflictions.add(this.past2FSCompD(w));
		pastInflictions.add(this.past2FSCompE(w));
		pastInflictions.add(this.past2FSCompF(w));
		pastInflictions.add(this.past2FSCompG(w));
		pastInflictions.add(this.past2FSCompH(w));
		pastInflictions.add(this.past2FSMiss(w));
		pastInflictions.add(this.past2FSMissB(w));
		pastInflictions.add(this.past2FSMissC(w));
		pastInflictions.add(this.past2FSMissD(w));
		pastInflictions.add(this.past2FSMissE(w));
		pastInflictions.add(this.past2FSMissF(w));
		pastInflictions.add(this.past2FSMissG(w));
		pastInflictions.add(this.past2FSMissH(w));
		pastInflictions.add(this.past3MSComp(w));
		pastInflictions.add(this.past3MSCompB(w));
		pastInflictions.add(this.past3MSCompC(w));
		pastInflictions.add(this.past3MSCompD(w));
		pastInflictions.add(this.past3MSMiss(w));
		pastInflictions.add(this.past3MSMissB(w));
		pastInflictions.add(this.past3MSMissC(w));
		pastInflictions.add(this.past3MSMissD(w));
		pastInflictions.add(this.past3FSComp(w));
		pastInflictions.add(this.past3FSCompB(w));
		pastInflictions.add(this.past3FSCompC(w));
		pastInflictions.add(this.past3FSCompD(w));
		pastInflictions.add(this.past3FSMiss(w));
		pastInflictions.add(this.past3FSMissB(w));
		pastInflictions.add(this.past3FSMissC(w));
		pastInflictions.add(this.past3FSMissD(w));
		pastInflictions.add(this.past1PComp(w));
		pastInflictions.add(this.past1PCompB(w));
		pastInflictions.add(this.past1PCompC(w));
		pastInflictions.add(this.past1PCompD(w));
		pastInflictions.add(this.past1PMiss(w));
		pastInflictions.add(this.past1PMissB(w));
		pastInflictions.add(this.past1PMissC(w));
		pastInflictions.add(this.past1PMissD(w));
		pastInflictions.add(this.past2MPComp(w));
		pastInflictions.add(this.past2MPCompB(w));
		pastInflictions.add(this.past2MPCompC(w));
		pastInflictions.add(this.past2MPCompD(w));
		pastInflictions.add(this.past2MPMiss(w));
		pastInflictions.add(this.past2MPMissB(w));
		pastInflictions.add(this.past2MPMissC(w));
		pastInflictions.add(this.past2MPMissD(w));
		pastInflictions.add(this.past2FPComp(w));
		pastInflictions.add(this.past2FPCompB(w));
		pastInflictions.add(this.past2FPCompC(w));
		pastInflictions.add(this.past2FPCompD(w));
		pastInflictions.add(this.past2FPMiss(w));
		pastInflictions.add(this.past2FPMissB(w));
		pastInflictions.add(this.past2FPMissC(w));
		pastInflictions.add(this.past2FPMissD(w));
		pastInflictions.add(this.past3MPComp(w));
		pastInflictions.add(this.past3MPCompB(w));
		pastInflictions.add(this.past3MPCompC(w));
		pastInflictions.add(this.past3MPCompD(w));
		pastInflictions.add(this.past3MPMiss(w));
		pastInflictions.add(this.past3MPMissB(w));
		pastInflictions.add(this.past3MPMissC(w));
		pastInflictions.add(this.past3MPMissD(w));
		pastInflictions.add(this.past3FPComp(w));
		pastInflictions.add(this.past3FPCompB(w));
		pastInflictions.add(this.past3FPCompC(w));
		pastInflictions.add(this.past3FPCompD(w));
		pastInflictions.add(this.past3FPMiss(w));
		pastInflictions.add(this.past3FPMissB(w));
		pastInflictions.add(this.past3FPMissC(w));
		pastInflictions.add(this.past3FPMissD(w));
		return pastInflictions;
	}
	
	public HebrewVerb past1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1SMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1SMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1SMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_TavDageshHirik_Yod(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_TavDageshKamats(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompE(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompF(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompG(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSCompH(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissE(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissF(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissG(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FSMissH(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		wNew.setVocalization_PATAH();
		this.macro_TavDageshShva(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
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
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		this.macro_Kamats_Hey(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1PMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1PMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past1PMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_Nun_VavShuruk(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2MPMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past2FPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 4);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 4);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past2FPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(2);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past2FPMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(3);
		this.macro_Shva_TavDageshSegol_NunS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb past3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3MPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.removeVocalization();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
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
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.removeVocalization();
		this.macro_VavShuruk(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3MPMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
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
	
	public HebrewVerb past3FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.past3MPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FPCompC(HebrewVerb w){
		HebrewVerb wNew = this.past3MPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FPCompD(HebrewVerb w){
		HebrewVerb wNew = this.past3MPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb past3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.past3MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FPMissB(HebrewVerb w){
		HebrewVerb wNew = this.past3MPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FPMissC(HebrewVerb w){
		HebrewVerb wNew = this.past3MPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb past3FPMissD(HebrewVerb w){
		HebrewVerb wNew = this.past3MPMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PAST, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Present
	 */
	public HebrewVerb present1MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 3);
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
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(2);
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
		this.macro_VavShuruk(wNew, 3);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FSCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FSCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FSCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 3);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FSMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FSMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FSMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(2);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		this.macro_Patah_Tav(wNew, 1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2MSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MSCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MSCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MSCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MSMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MSMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MSMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2FSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FSCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FSCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FSCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FSMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FSMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FSMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3MSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MSCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MSCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MSCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1MSCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MSMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MSMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MSMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1MSMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3FSComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FSComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FSCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FSCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FSCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1FSCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FSMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FSMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FSMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1FSMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present1MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 3);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1MPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 3);
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
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod_MemS(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1MPMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(2);
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
		this.macro_VavShuruk(wNew, 3);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavShuruk(wNew, 2);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FPCompC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 2);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present1FPCompD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeVocalization();
		wNew.removeDagesh();
		this.macro_VavHolamM(wNew, 3);
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
		wNew.movePointer(2);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(1);
		wNew.setVocalization_SHVA();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FPMissC(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_KAMATS_KATAN();
		wNew.movePointer(1);
		wNew.setVocalization_H_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_RemoveVoc_VavHolam_Tav(wNew, 2);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present1FPMissD(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_MemShva(wNew, 1);
		wNew.removeDagesh();
		wNew.setVocalization_HOLAM_H();
		wNew.movePointer(2);
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
	
	public HebrewVerb present2MPCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MPCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MPCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2MPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MPMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MPMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2MPMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FPCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FPCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FPMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FPMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present2FPMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3MPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MPCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MPCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MPCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1MPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3MPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MPMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MPMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3MPMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1MPMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb present3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.present1FPComp(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FPCompC(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FPCompD(HebrewVerb w){
		HebrewVerb wNew = this.present1FPCompD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb present3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FPMissB(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FPMissC(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissC(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}
	
	public HebrewVerb present3FPMissD(HebrewVerb w){
		HebrewVerb wNew = this.present1FPMissD(w);
		wNew.setMorphology(HebrewVerb.Time.PRESENT, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Future - same as D17
	 */
}
