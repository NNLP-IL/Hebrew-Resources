package f;

import letters.HebrewLetter;

public class F12 extends F11{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_HIRIK();
		letterArr[1].setVocalization_HIRIK();
		letterArr[1].setVocalization_DAGESH();
		letterArr[3].setVocalization_PATAH();
		letterArr[3].setVocalization_MAPIK();
		return letterArr;
	}
}
