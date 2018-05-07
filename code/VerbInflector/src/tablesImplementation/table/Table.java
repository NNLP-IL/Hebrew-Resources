package table;


import java.util.ArrayList;

import hebrewVerb.HebrewVerb;
import hebrewVerb.VerbInflection;
import hebrewWord.BaseWord;
import hebrewVerb.HebrewVerb.Gender;
import hebrewVerb.HebrewVerb.Number;
import hebrewVerb.HebrewVerb.Person;
import hebrewVerb.HebrewVerb.Time;
import letters.*;

public abstract class Table {
	
	protected ArrayList<BaseWord> _baseVerbs;
	protected ArrayList<ArrayList<VerbInflection>> _inflections;
	
	public Table(){
		_baseVerbs = new ArrayList<BaseWord>();
		_inflections = new ArrayList<ArrayList<VerbInflection>>();
	}
	
	public abstract void inflectVerbs();
	
	public abstract HebrewLetter[] vocalize(HebrewLetter[] letterArr);
	
	public void addToBaseVerbs(HebrewLetter[] letterArr){
		_baseVerbs.add(new BaseWord(this.vocalize(letterArr)));
	}
	
	public String toString(){
		StringBuilder ret = new StringBuilder("");
		for(int i=0; i<_baseVerbs.size();i++){
			ret.append(_baseVerbs.get(i).toString()+":\n");
			ArrayList<VerbInflection> inflx = _inflections.get(i);
			for(int j=0;j<inflx.size();j++){
				ret.append("\t"+inflx.get(j).toString()+"  -  "+inflx.get(j).toStringMorphology()+"\n");
			}
		}
		return ret.toString();		
	}
	
	public String toStringExtended(){
		StringBuilder ret = new StringBuilder("");
		String className = this.getClass().getSimpleName();
		className = className.substring(0, 1)+","+className.substring(1);
		for(int i=0; i<_baseVerbs.size();i++){
			String baseVerb = _baseVerbs.get(i).toString();
			ArrayList<VerbInflection> inflx = _inflections.get(i);
			for(int j=0;j<inflx.size();j++){
				String inf = inflx.get(j).toString();
				String morph = inflx.get(j).toStringMorphology();
				ret.append(className+","+inf+","+morph+","+baseVerb+"\n");
			}
		}
		return ret.toString();		
	}
	
	public String toStringBaseOnly(){
		String ret = new String("");
		for(int i=0; i<_baseVerbs.size();i++){
			ret += _baseVerbs.get(i).toString()+"\n";
		}
		return ret;		
	}
	
	public ArrayList<ArrayList<VerbInflection>> getInflections(){
		return _inflections;
	}
	
	public VerbInflection getBaseFormInflection(VerbInflection inf) throws UnknownVerbBaseFormException{
		int i = 0;
		while (!this._inflections.get(i).contains(inf)){
			i++;
		}
		ArrayList<VerbInflection> infs = this._inflections.get(i);
		if (!inf.getTime().equals(Time.IMPERATIVE)){
			for(i=0;i<infs.size();i++){
				if ((infs.get(i).getGender().equals(Gender.M))&&(infs.get(i).getNumber().equals(Number.SINGULAR))&&
						(infs.get(i).getPerson().equals(Person.THIRD))&&(infs.get(i).getSpelling().equals(inf.getSpelling()))&&
						(infs.get(i).getTime().equals(inf.getTime()))){
					return infs.get(i);
				}
			}
			for(i=0;i<infs.size();i++){
				if ((infs.get(i).getGender().equals(Gender.M))&&(infs.get(i).getNumber().equals(Number.SINGULAR))&&
						(infs.get(i).getPerson().equals(Person.THIRD))&&(infs.get(i).getTime().equals(inf.getTime()))){
					return infs.get(i);
				}
			}
			throw new UnknownVerbBaseFormException(inf);
		}
		else{
			for(i=0;i<infs.size();i++){
				if ((infs.get(i).getGender().equals(Gender.M))&&(infs.get(i).getNumber().equals(Number.SINGULAR))&&
						(infs.get(i).getPerson().equals(Person.SECOND))&&(infs.get(i).getSpelling().equals(inf.getSpelling()))&&
						(infs.get(i).getTime().equals(inf.getTime()))){
					return infs.get(i);
				}
			}
			for(i=0;i<infs.size();i++){
				if ((infs.get(i).getGender().equals(Gender.M))&&(infs.get(i).getNumber().equals(Number.SINGULAR))&&
						(infs.get(i).getPerson().equals(Person.SECOND))&&(infs.get(i).getTime().equals(inf.getTime()))){
					return infs.get(i);
				}
			}
			throw new UnknownVerbBaseFormException(inf);
		}
	}
	
/*
 * Macros
 */
	/*
	 * Adds VAV with HOLAM_M after the current letter
	 */
	protected void macro_VavHolamM(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		vav.setVocalization_HOLAM_M();
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds VAV after the current letter
	 */
	protected void macro_Vav(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds VAV with SHURUK after the current letter 
	 */
	protected void macro_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HIRIK + YOD + MEM_SOFIT after the current letter 
	 */
	protected void macro_Hirik_Yod_MemS(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		HebrewLetter memSofit = new MemSofit();
		w.setVocalization_HIRIK();
		w.addLetterAfter(yod);
		w.movePointer(1);
		w.addLetterAfter(memSofit);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Removes the vocalization of the current letter + VAV with HOLAM_M + TAV 
	 * after the current letter 
	 */
	protected void macro_RemoveVoc_VavHolam_Tav(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		vav.setVocalization_HOLAM_M();
		w.removeVocalization();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds SHVA + TAV with DAGESH and SEGOL + NUN_SOFIT after the current letter 
	 */
	protected void macro_Shva_TavDageshSegol_NunS(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SEGOL();
		tav.setVocalization_DAGESH();
		HebrewLetter nunSofit = new NunSofit();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(nunSofit);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds TAV with SEGOL + NUN_SOFIT after the current letter 
	 */
	protected void macro_TavSegol_NunS(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SEGOL();
		HebrewLetter nunSofit = new NunSofit();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(nunSofit);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds SHVA + TAV with DAGESH and SEGOL + MEM_SOFIT after the current letter 
	 */
	protected void macro_Shva_TavDageshSegol_MemS(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SEGOL();
		tav.setVocalization_DAGESH();
		HebrewLetter memSofit = new MemSofit();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(memSofit);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds TAV with SEGOL + MEM_SOFIT after the current letter 
	 */
	protected void macro_TavSegol_MemS(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SEGOL();
		HebrewLetter memSofit = new MemSofit();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(memSofit);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds SHVA + TAV with DAGESH and HIRIK + YOD after the current letter 
	 */
	protected void macro_Shva_TavDageshHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_HIRIK();
		tav.setVocalization_DAGESH();
		HebrewLetter yod = new Yod();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds SHVA + TAV with DAGESH and KAMATS after the current letter 
	 */
	protected void macro_Shva_TavDageshKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_KAMATS();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
		
	/*
	 * Adds TAV with DAGESH and KAMATS after the current letter 
	 */
	protected void macro_TavDageshKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_KAMATS();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with DAGESH and HIRIK + YOD after the current letter 
	 */
	protected void macro_TavHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		HebrewLetter yod = new Yod();
		tav.setVocalization_HIRIK();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds TAV with KAMATS + HEY after the current letter 
	 */
	protected void macro_TavKamats_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		HebrewLetter hey = new Hey();
		tav.setVocalization_KAMATS();
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds TAV with KAMATS after the current letter 
	 */
	protected void macro_TavKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_KAMATS();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SHVA + TAV with DAGESH and SHVA after the current letter 
	 */
	protected void macro_Shva_TavDageshShva(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_SHVA();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SHVA + TAV with SHVA after the current letter 
	 */
	protected void macro_Shva_TavShva(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SHVA();
		w.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with DAGESH and SHVA after the current letter 
	 */
	protected void macro_TavDageshShva(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SHVA + NUN with KAMATS + HEY after the current letter 
	 */
	protected void macro_Shva_NunKamats_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter hey = new Hey();
		nun.setVocalization_KAMATS();
		w.setVocalization_SHVA();
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds  NUN with KAMATS + HEY after the current letter 
	 */
	protected void macro_NunKamats_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter hey = new Hey();
		nun.setVocalization_KAMATS();
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds KAMATS + HEY after the current letter 
	 */
	protected void macro_Kamats_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		w.setVocalization_KAMATS();
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HEY after the current letter 
	 */
	protected void macro_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SHVA + NUN + VAV with SURUK after the current letter 
	 */
	protected void macro_Shva_Nun_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.setVocalization_SHVA();
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds  NUN + VAV with SURUK after the current letter 
	 */
	protected void macro_Nun_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds SEGOL + TAV after the current letter 
	 */
	protected void macro_Segol_Tav(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		w.setVocalization_SEGOL();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds PATAH + TAV after the current letter 
	 */
	protected void macro_Patah_Tav(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		w.setVocalization_PATAH();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV after the current letter 
	 */
	protected void macro_Tav(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		w.addLetterAfter(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HIRIK + YOD after the current letter 
	 */
	protected void macro_Hirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		w.setVocalization_HIRIK();
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with SEGOL before the current letter 
	 */
	protected void macro_BEFORE_AlefSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_SEGOL();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with TSERE before the current letter 
	 */
	protected void macro_BEFORE_AlefTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_TSERE();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with TSERE + Yod before the current letter 
	 */
	protected void macro_BEFORE_AlefTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		HebrewLetter yod = new Yod();
		alef.setVocalization_TSERE();
		w.addLetterBefore(alef);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with HIRIK and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_HIRIK();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with SHVA and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshShva(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SHVA();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HEY with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_HeyHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		HebrewLetter yod = new Yod();
		hey.setVocalization_HIRIK();
		w.addLetterBefore(hey);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HEY with TSERE + YOD before the current letter 
	 */
	protected void macro_BEFORE_HeyTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		HebrewLetter yod = new Yod();
		hey.setVocalization_TSERE();
		w.addLetterBefore(hey);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HEY with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_HeyHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		hey.setVocalization_HIRIK();
		w.addLetterBefore(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds HEY with TSERE before the current letter 
	 */
	protected void macro_BEFORE_HeyTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		hey.setVocalization_TSERE();
		w.addLetterBefore(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with KAMATS and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_KAMATS();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with DAGESH + VAV with SHURUK before the current letter 
	 */
	protected void macro_BEFORE_TavDagesh_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		HebrewLetter vav = new Vav();
		tav.setVocalization_DAGESH();
		vav.setVocalization_SHURUK();
		w.addLetterBefore(tav);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with TSERE and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_TSERE();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with HIRIK and DAGESH + YOD before the current letter 
	 */
	protected void macro_BEFORE_TavDageshHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		HebrewLetter yod = new Yod();
		tav.setVocalization_HIRIK();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with TSERE and DAGESH + YOD before the current letter 
	 */
	protected void macro_BEFORE_TavDageshTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		HebrewLetter yod = new Yod();
		tav.setVocalization_TSERE();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with PATAH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_PATAH();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with SEGOL and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_SEGOL();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TAV with HOLAM_H and DAGESH before the current letter 
	 */
	protected void macro_BEFORE_TavDageshHolamH(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_HOLAM_H();
		tav.setVocalization_DAGESH();
		w.addLetterBefore(tav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_YodHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_HIRIK();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with KAMATS before the current letter 
	 */
	protected void macro_BEFORE_YodKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_KAMATS();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD + VAV with SHURUK before the current letter 
	 */
	protected void macro_BEFORE_Yod_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterBefore(yod);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with TSERE before the current letter 
	 */
	protected void macro_BEFORE_YodTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_TSERE();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_YodHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		HebrewLetter yod2 = new Yod();
		yod.setVocalization_HIRIK();
		w.addLetterBefore(yod);
		w.addLetterAfter(yod2);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with TSERE + YOD before the current letter 
	 */
	protected void macro_BEFORE_YodTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		HebrewLetter yod2 = new Yod();
		yod.setVocalization_TSERE();
		w.addLetterBefore(yod);
		w.addLetterAfter(yod2);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with SEGOL before the current letter 
	 */
	protected void macro_BEFORE_YodSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_SEGOL();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with PATAH before the current letter 
	 */
	protected void macro_BEFORE_YodPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_PATAH();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with HOLAM_H before the current letter 
	 */
	protected void macro_BEFORE_YodHolamH(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_HOLAM_H();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_NunHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_HIRIK();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with KAMATS before the current letter 
	 */
	protected void macro_BEFORE_NunKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_KAMATS();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN + VAV with SHURUK before the current letter 
	 */
	protected void macro_BEFORE_Nun_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterBefore(nun);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with TSERE before the current letter 
	 */
	protected void macro_BEFORE_NunTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_TSERE();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_NunHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter yod = new Yod();
		nun.setVocalization_HIRIK();
		w.addLetterBefore(nun);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with TSERE + YOD before the current letter 
	 */
	protected void macro_BEFORE_NunTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		HebrewLetter yod = new Yod();
		nun.setVocalization_TSERE();
		w.addLetterBefore(nun);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with SEGOL before the current letter 
	 */
	protected void macro_BEFORE_NunSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_SEGOL();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with PATAH before the current letter 
	 */
	protected void macro_BEFORE_NunPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_PATAH();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with HOLAM_H before the current letter 
	 */
	protected void macro_BEFORE_NunHolamH(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_HOLAM_H();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_LamedHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_HIRIK();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with SHVA + HEY with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_LamedShva_HeyHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter hey = new Hey();
		HebrewLetter yod = new Yod();
		lamed.setVocalization_SHVA();
		hey.setVocalization_HIRIK();
		w.addLetterBefore(lamed);
		w.addLetterAfter(hey);
		w.movePointer(1);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds LAMED with SHVA + HEY with TSERE + YOD before the current letter 
	 */
	protected void macro_BEFORE_LamedShva_HeyTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter hey = new Hey();
		HebrewLetter yod = new Yod();
		lamed.setVocalization_SHVA();
		hey.setVocalization_TSERE();
		w.addLetterBefore(lamed);
		w.addLetterAfter(hey);
		w.movePointer(1);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds LAMED with SHVA + HEY with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_LamedShva_HeyHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter hey = new Hey();
		lamed.setVocalization_SHVA();
		hey.setVocalization_HIRIK();
		w.addLetterBefore(lamed);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with TSERE + YOD before the current letter 
	 */
	protected void macro_BEFORE_LamedTsere_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter yod = new Yod();
		lamed.setVocalization_TSERE();
		w.addLetterBefore(lamed);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with SHVA + HEY with TSERE before the current letter 
	 */
	protected void macro_BEFORE_LamedShva_HeyTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter hey = new Hey();
		lamed.setVocalization_SHVA();
		hey.setVocalization_TSERE();
		w.addLetterBefore(lamed);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with Tsere before the current letter 
	 */
	protected void macro_BEFORE_LamedTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_TSERE();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_LamedHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		HebrewLetter yod = new Yod();
		lamed.setVocalization_HIRIK();
		w.addLetterBefore(lamed);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with PATAH before the current letter 
	 */
	protected void macro_BEFORE_LamedPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_PATAH();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with SEGOL before the current letter 
	 */
	protected void macro_BEFORE_LamedSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_SEGOL();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with KAMATS before the current letter 
	 */
	protected void macro_BEFORE_LamedKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_KAMATS();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	
	/*
	 * Adds ALEF + VAV with HOLAM_M before the current letter 
	 */
	protected void macro_BEFORE_Alef_VavHolamM(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		HebrewLetter vav = new Vav();
		w.addLetterBefore(alef);
		vav.setVocalization_HOLAM_M();
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with HIRIK before the current letter 
	 */
	protected void macro_BEFORE_AlefHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_HIRIK();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with HIRIK + YOD before the current letter 
	 */
	protected void macro_BEFORE_AlefHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		HebrewLetter yod = new Yod();
		alef.setVocalization_HIRIK();
		w.addLetterBefore(alef);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with KAMATS before the current letter 
	 */
	protected void macro_BEFORE_AlefKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_KAMATS();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF + VAV with SHURUK before the current letter 
	 */
	protected void macro_BEFORE_Alef_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterBefore(alef);
		w.addLetterAfter(vav);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with HOLAM_H before the current letter 
	 */
	protected void macro_BEFORE_AlefHolamH(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_HOLAM_H();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds MEM with SHVA before the current letter 
	 */
	protected void macro_BEFORE_MemShva(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_SHVA();
		w.addLetterBefore(mem);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds MEM with SEGOL before the current letter 
	 */
	protected void macro_BEFORE_MemSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_SEGOL();
		w.addLetterBefore(mem);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with HATAF_PATAH before the current letter 
	 */
	protected void macro_BEFORE_AlefHPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_H_PATAH();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds ALEF with PATAH before the current letter 
	 */
	protected void macro_BEFORE_AlefPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_PATAH();
		w.addLetterBefore(alef);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds YOD with SHVA before the current letter 
	 */
	protected void macro_BEFORE_YodShva(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_SHVA();
		w.addLetterBefore(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with SHVA before the current letter 
	 */
	protected void macro_BEFORE_NunShva(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_SHVA();
		w.addLetterBefore(nun);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds LAMED with SHVA before the current letter 
	 */
	protected void macro_BEFORE_LamedShva(HebrewVerb w,int pointerChange) {
		HebrewLetter lamed = new Lamed();
		lamed.setVocalization_SHVA();
		w.addLetterBefore(lamed);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SEGOL + YOD + NUN with KAMATS + Hey After the current letter 
	 */
	protected void macro_Segol_Yod_NunKamats_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		HebrewLetter nun = new Nun();
		HebrewLetter hey = new Hey();
		nun.setVocalization_KAMATS();
		w.setVocalization_SEGOL();
		w.addLetterAfter(yod);
		w.movePointer(1);
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(hey);
		w.movePointer(pointerChange-2);
	}
	
	/*
	 * Adds YOD  After the current letter 
	 */
	protected void macro_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		w.addLetterAfter(yod);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds SEGOL + HEY After the current letter 
	 */
	protected void macro_Segol_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		w.setVocalization_SEGOL();
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds TSERE + HEY After the current letter 
	 */
	protected void macro_Tsere_Hey(HebrewVerb w,int pointerChange) {
		HebrewLetter hey = new Hey();
		w.setVocalization_TSERE();
		w.addLetterAfter(hey);
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds VAV with HOLAM_M + TAV with HIRIK + YOD After the current letter 
	 */
	protected void macro_VavHolamM_TavHirik_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		HebrewLetter yod = new Yod();
		vav.setVocalization_HOLAM_M();
		tav.setVocalization_HIRIK();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(yod);
		w.movePointer(pointerChange-2);
	}
	
	/*
	 * Adds VAV with HOLAM_M + TAV with KAMATS After the current letter 
	 */
	protected void macro_VavHolamM_TavKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		vav.setVocalization_HOLAM_M();
		tav.setVocalization_KAMATS();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds VAV with HOLAM_M + TAV After the current letter 
	 */
	protected void macro_VavHolamM_Tav(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		vav.setVocalization_HOLAM_M();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(pointerChange-1);
	}
	
	/*
	 * Adds VAV with HOLAM_M + NUN + VAV with SHURUK After the current letter 
	 */
	protected void macro_VavHolamM_Nun_VavShuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter nun = new Nun();
		HebrewLetter vav2 = new Vav();
		vav.setVocalization_HOLAM_M();
		vav2.setVocalization_SHURUK();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(nun);
		w.movePointer(1);
		w.addLetterAfter(vav2);
		w.movePointer(pointerChange-2);
	}
	
	/*
	 * Adds VAV with HOLAM_M + TAV with SEGOL +MEM_S After the current letter 
	 */
	protected void macro_VavHolamM_TavSegol_MemS(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		HebrewLetter memS = new MemSofit();
		vav.setVocalization_HOLAM_M();
		tav.setVocalization_SEGOL();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(memS);
		w.movePointer(pointerChange-2);
	}
	
	/*
	 * Adds VAV with HOLAM_M + TAV with SEGOL +NUN_S After the current letter 
	 */
	protected void macro_VavHolamM_TavSegol_NunS(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		HebrewLetter tav = new Tav();
		HebrewLetter nunS = new NunSofit();
		vav.setVocalization_HOLAM_M();
		tav.setVocalization_SEGOL();
		w.addLetterAfter(vav);
		w.movePointer(1);
		w.addLetterAfter(tav);
		w.movePointer(1);
		w.addLetterAfter(nunS);
		w.movePointer(pointerChange-2);
	}
	
	/*
	 * Removes the next letter
	 */
	protected void removeNextLetter(HebrewVerb w) {
		w.movePointer(1);
		w.removeLetter();
		w.movePointer(-1);
	}
	
	/*
	 * Replaces the current letter to YOD 
	 */
	protected void replaceLetterTo_Yod(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter VAV with SHURUK 
	 */
	protected void replaceLetterTo_VavSuruk(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		vav.setVocalization_SHURUK();
		w.addLetterAfter(vav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to VAV 
	 */
	protected void replaceLetterTo_Vav(HebrewVerb w,int pointerChange) {
		HebrewLetter vav = new Vav();
		w.addLetterAfter(vav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM
	 */
	protected void replaceLetterTo_Mem(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM with HIRIK
	 */
	protected void replaceLetterTo_MemHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_HIRIK();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM with PATAH
	 */
	protected void replaceLetterTo_MemPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_PATAH();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM with TSERE
	 */
	protected void replaceLetterTo_MemTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_TSERE();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM with SHVA
	 */
	protected void replaceLetterTo_MemShva(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_SHVA();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to MEM with KUBUTS
	 */
	protected void replaceLetterTo_MemKubuts(HebrewVerb w,int pointerChange) {
		HebrewLetter mem = new Mem();
		mem.setVocalization_KUBUTS();
		w.addLetterAfter(mem);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF
	 */
	protected void replaceLetterTo_Alef(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF with SEGOL
	 */
	protected void replaceLetterTo_AlefSegol(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_SEGOL();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF with PATAH
	 */
	protected void replaceLetterTo_AlefPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_PATAH();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF with KAMATS
	 */
	protected void replaceLetterTo_AlefKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_KAMATS();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF with TSERE
	 */
	protected void replaceLetterTo_AlefTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_TSERE();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to ALEF with KUBUTS
	 */
	protected void replaceLetterTo_AlefKubuts(HebrewVerb w,int pointerChange) {
		HebrewLetter alef = new Alef();
		alef.setVocalization_KUBUTS();
		w.addLetterAfter(alef);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and HIRIK
	 */
	protected void replaceLetterTo_TavDageshHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_HIRIK();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and HIRIK
	 */
	protected void replaceLetterTo_TavDagesh(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and PATAH
	 */
	protected void replaceLetterTo_TavDageshPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_PATAH();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and KAMATS
	 */
	protected void replaceLetterTo_TavDageshKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_KAMATS();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and TSERE
	 */
	protected void replaceLetterTo_TavDageshTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_TSERE();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and SHVA
	 */
	protected void replaceLetterTo_TavDageshShva(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_SHVA();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to TAV with DAGESH and KUBUTS
	 */
	protected void replaceLetterTo_TavDageshKubuts(HebrewVerb w,int pointerChange) {
		HebrewLetter tav = new Tav();
		tav.setVocalization_DAGESH();
		tav.setVocalization_KUBUTS();
		w.addLetterAfter(tav);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to YOD with HIRIK
	 */
	protected void replaceLetterTo_YodHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_HIRIK();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to YOD with PATAH
	 */
	protected void replaceLetterTo_YodPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_PATAH();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to YOD with KAMATS
	 */
	protected void replaceLetterTo_YodKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_KAMATS();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to YOD with TSERE
	 */
	protected void replaceLetterTo_YodTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_TSERE();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to YOD with KUBUTS
	 */
	protected void replaceLetterTo_YodKubuts(HebrewVerb w,int pointerChange) {
		HebrewLetter yod = new Yod();
		yod.setVocalization_KUBUTS();
		w.addLetterAfter(yod);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN
	 */
	protected void replaceLetterTo_Nun(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN with HIRIK
	 */
	protected void replaceLetterTo_NunHirik(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_HIRIK();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN with PATAH
	 */
	protected void replaceLetterTo_NunPatah(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_PATAH();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN with KAMATS
	 */
	protected void replaceLetterTo_NunKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_KAMATS();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN with TSERE
	 */
	protected void replaceLetterTo_NunTsere(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_TSERE();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Replaces the current letter to NUN with KUBUTS
	 */
	protected void replaceLetterTo_NunKubuts(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_KUBUTS();
		w.addLetterAfter(nun);
		w.removeLetter();
		w.movePointer(pointerChange);
	}
	
	/*
	 * Adds NUN with DAGESH and KAMATS After the current letter 
	 */
	protected void macro_NunDageshKamats(HebrewVerb w,int pointerChange) {
		HebrewLetter nun = new Nun();
		nun.setVocalization_DAGESH();
		nun.setVocalization_KAMATS();
		w.addLetterAfter(nun);
		w.movePointer(pointerChange);
	}
	
}
