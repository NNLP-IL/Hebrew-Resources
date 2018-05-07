package stringTools;

import letters.HebrewLetter;

public class EditDistanceCalculatorForHebrew extends EditDistanceCalculator{

	protected int _wWeakCopy;
	
	/**
	 * 
	 * @param wStrongCopy reward for strong copying (negative)  
	 * @param wWeakCopy reward for weak copying (negative)
	 * @param wReplace penalty for replacing
	 * @param wDelete penalty for deleting
	 * @param wInsert penalty for inserting
	 */
	public EditDistanceCalculatorForHebrew(int wStrongCopy, int wWeakCopy,int wReplace, int wDelete, int wInsert){
		super(wStrongCopy,wReplace,wDelete,wInsert);
		this._wWeakCopy = wWeakCopy;
	}
	
	private boolean isStrongLetter(String a){
		return (a.equals(HebrewLetter.BET)||a.equals(HebrewLetter.GIMEL)||a.equals(HebrewLetter.DALET)||
				a.equals(HebrewLetter.ZAIN)||a.equals(HebrewLetter.HET)||a.equals(HebrewLetter.TET)||
				a.equals(HebrewLetter.LAMED)||a.equals(HebrewLetter.MEM)||a.equals(HebrewLetter.SAMECH)||
				a.equals(HebrewLetter.AIN)||a.equals(HebrewLetter.PEH)||a.equals(HebrewLetter.PEH_SOFIT)||
				a.equals(HebrewLetter.TSADI)||a.equals(HebrewLetter.TSADI_SOFIT)||a.equals(HebrewLetter.KUF)||
				a.equals(HebrewLetter.REISH)||a.equals(HebrewLetter.SHIN));
	}
	
	private boolean equalNonFin_Fin(String a, String b){
		return ((a.equals(HebrewLetter.KAF) && b.equals(HebrewLetter.KAF_SOFIT))||
				(a.equals(HebrewLetter.MEM) && b.equals(HebrewLetter.MEM_SOFIT))||
				(a.equals(HebrewLetter.NUN) && b.equals(HebrewLetter.NUN_SOFIT))||
				(a.equals(HebrewLetter.PEH) && b.equals(HebrewLetter.PEH_SOFIT))||
				(a.equals(HebrewLetter.TSADI)&&b.equals(HebrewLetter.TSADI_SOFIT)));
	}
	
	protected int delta(String a, String b){
		if (a.equals(b)||this.equalNonFin_Fin(a,b)||this.equalNonFin_Fin(b,a)){
			if (isStrongLetter(a)){
				return this._wCopy;
			}
			else{
				return this._wWeakCopy;
			}
		}
		else{
			return this._wReplace;
		}
	}
}
