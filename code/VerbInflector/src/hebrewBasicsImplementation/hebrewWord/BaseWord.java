package hebrewWord;



import java.util.ArrayList;

import letters.*;

public class BaseWord {
	
	protected ArrayList<HebrewLetter> _word;
	
	
	public BaseWord(HebrewLetter[] letterArr){
		_word = new ArrayList<HebrewLetter>();
		for (int i=0; i<letterArr.length; i++){
			_word.add(letterArr[i]);
		}
	}
	
	public BaseWord(BaseWord iw){
		_word = new ArrayList<HebrewLetter>();
		ArrayList<HebrewLetter> letters = iw.getLetters();
		for (int i=0; i<letters.size(); i++){
			_word.add(new HebrewLetter(letters.get(i)));
		}
	}
	
	public ArrayList<HebrewLetter> getLetters(){
		return _word;
	}
	
	public String toString(){
		String ret="";
		for(int i=0; i<_word.size();i++){
			ret += _word.get(i).toString();
		}
		return ret;
	}
}
