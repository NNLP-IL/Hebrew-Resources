package g;

import letters.HebrewLetter;

public class G9 extends G8{

	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[0].setVocalization_KUBUTS();
		letterArr[1].setVocalization_SHVA();
		letterArr[2].setVocalization_PATAH();
		letterArr[2].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[3].setVocalization_MAPIK();
		return letterArr;
	}
}
