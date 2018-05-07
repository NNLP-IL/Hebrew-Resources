package hebrewWord;

public class VocalizedWordAndVocalizedBaseForm {
	private VocalizedWord _word;
	private VocalizedWord _base;

	public VocalizedWordAndVocalizedBaseForm(VocalizedWord w, VocalizedWord b){
		this._word = w;
		this._base = b;
	}

	public VocalizedWord getWord(){
		return this._word;
	}

	public VocalizedWord getBase(){
		return this._base;
	}
}
