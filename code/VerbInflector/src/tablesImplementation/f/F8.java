package f;

import letters.HebrewLetter;

public class F8 extends F7{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_HIRIK();
		letterArr[1].setVocalization_SHVA();
		letterArr[2].setVocalization_HIRIK();
		letterArr[2].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[4].setVocalization_PATAH();
		letterArr[4].setVocalization_MAPIK();
		return letterArr;
	}
}
