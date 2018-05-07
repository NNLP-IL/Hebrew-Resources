package f;

import letters.HebrewLetter;

public class F27 extends F26{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_SEGOL();
		letterArr[1].setVocalization_SHVA();
		letterArr[2].setVocalization_HIRIK();
		letterArr[2].setVocalization_DAGESH_BEGEDKEFET();
		if (letterArr[4].isKafSofit()){
			letterArr[4].setVocalization_SHVA();
		}
		return letterArr;
	}
}
