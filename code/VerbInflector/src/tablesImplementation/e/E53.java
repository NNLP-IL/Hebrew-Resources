package e;

import java.util.ArrayList;

import hebrewVerb.HebrewVerb;

public class E53 extends E51{

	/*
	 * Past - same as E51
	 */

	/*
	 * Present - same as E51
	 */

	/*
	 * Future - same as E51
	 */

	/*
	 * Imperative - same as E51
	 */

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
		this.macro_BEFORE_LamedShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(5);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb infinitiveCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_LamedShva(wNew, 1);
		wNew.removeDagesh();
		wNew.movePointer(4);
		wNew.setVocalization_PATAH();
		wNew.movePointer(1);
		wNew.removeVocalization();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
}
