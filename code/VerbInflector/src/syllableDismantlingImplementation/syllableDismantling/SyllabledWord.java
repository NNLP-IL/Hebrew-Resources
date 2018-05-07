package syllableDismantling;

import java.util.ArrayList;

import letters.HebrewLetter;

public class SyllabledWord {

	protected ArrayList<HebrewLetter> _word;
	protected int[] _syllables;


	public SyllabledWord(HebrewLetter[] letterArr, int[] syllables){
		_word = new ArrayList<HebrewLetter>();
		for (int i=0; i<letterArr.length; i++){
			_word.add(letterArr[i]);
		}
		_syllables = new int[syllables.length];
		for (int i=0; i<syllables.length; i++){
			_syllables[i] = syllables[i];
		}
	}
	
	public SyllabledWord(ArrayList<HebrewLetter> letterArr, int[] syllables){
		_word = new ArrayList<HebrewLetter>();
		for (int i=0; i<letterArr.size(); i++){
			_word.add(letterArr.get(i));
		}
		_syllables = new int[syllables.length];
		for (int i=0; i<syllables.length; i++){
			_syllables[i] = syllables[i];
		}
	}

	public SyllabledWord(SyllabledWord iw){
		_word = new ArrayList<HebrewLetter>();
		ArrayList<HebrewLetter> letters = iw.getLetters();
		for (int i=0; i<letters.size(); i++){
			_word.add(new HebrewLetter(letters.get(i)));
		}
		int[] syllables = iw.getSyllables();
		for (int i=0; i<syllables.length; i++){
			_syllables[i] = syllables[i];;
		}
	}

	public ArrayList<HebrewLetter> getLetters(){
		return _word;
	}
	
	public int[] getSyllables(){
		return _syllables;
	}

	public String toString(){
		String ret = "";
		int j = 0;
		for(int i=0; i<_word.size();i++){
			if ((j<_syllables.length)&&(_syllables[j]==i)){
				ret +="-";
				j++;
			}
			ret += _word.get(i).toString();
		}
		return ret;
	}
}
