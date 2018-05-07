package e;

import letters.HebrewLetter;

public class E37 extends E30{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_HIRIK();
		letterArr[1].setVocalization_SHVA();
		letterArr[2].setVocalization_KAMATS();
		letterArr[2].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[3].setVocalization_KAMATS();
		letterArr[3].setVocalization_DAGESH();
		if (letterArr[4].isKafSofit()){
			letterArr[4].setVocalization_SHVA();
		}
		return letterArr;
	}
}
