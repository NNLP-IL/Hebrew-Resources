package stringTools;

import letters.HebrewLetter;

public class EditDistanceCalculatorForTableMetric extends EditDistanceCalculatorForHebrew{

	public EditDistanceCalculatorForTableMetric(int wStrongCopy, int wWeakCopy,int wReplace, int wDelete, int wInsert){
		super(wStrongCopy,wWeakCopy,wReplace,wDelete,wInsert);
	}
	
	private boolean isShvaHataf(String a, String b) {
		boolean aShva = HebrewLetter.SHVA.equals(a);
		boolean bHataf = (HebrewLetter.H_KAMATS.equals(b)||
				HebrewLetter.H_PATAH.equals(b)||
				HebrewLetter.H_SEGOL.equals(b));
		return aShva&&bHataf;
	}
	
	protected int delta(String a, String b){
		if (a.equals(b)){
				return this._wCopy;
			}
		else if(isShvaHataf(a,b)||isShvaHataf(b,a)){
			return this._wWeakCopy;
		}
		else{
			return this._wReplace;
		}
	}
}
