package hebrewVerb;

import hebrewVerb.HebrewVerb.Gender;
import hebrewVerb.HebrewVerb.Number;
import hebrewVerb.HebrewVerb.Person;
import hebrewVerb.HebrewVerb.Spelling;
import hebrewVerb.HebrewVerb.Time;

import java.util.ArrayList;

import letters.HebrewLetter;

public class VerbInflection {

	protected ArrayList<HebrewLetter> _word;
	protected Time _time;
	protected Gender _gender;
	protected Person _person;
	protected Number _number;
	protected Spelling _spelling;
	
	public VerbInflection(HebrewVerb w){
		_word = new ArrayList<HebrewLetter>();
		ArrayList<HebrewLetter> letters = w.getLetters();
		for (int i=0; i<letters.size(); i++){
			_word.add(letters.get(i));
		}
		_time = w.getTime();
		_gender = w.getGender();
		_person = w.getPerson();
		_number = w.getNumber();
		_spelling = w.getSpelling();
	}
	
	public ArrayList<HebrewLetter> getLetters(){
		return this._word;
	}
	
	public String toString(){
		String ret="";
		for(int i=0; i<_word.size();i++){
			ret += _word.get(i).toString();
		}
		return ret;
	}

	public String toStringMorphology(){
		return _time.toString()+"+"+_person.toString()+"+"+_gender.toString()+"+"+_number.toString()+"+"+_spelling.toString();
	}

	public boolean equals(VerbInflection o){
		boolean sameLetters = true;
		if (this._word.size() != o.getLetters().size()){
			sameLetters = false;
		}
		for(int i=0; i<this._word.size()&&sameLetters; i++){
			if(!this._word.get(i).equals(o.getLetters().get(i))){
				sameLetters = false;
			}
		}
		return sameLetters&&(this._gender.equals(o.getGender()))&&(this._number.equals(o.getNumber()))&&
		(this._person.equals(o.getPerson()))&&(this._spelling.equals(o.getSpelling()))&&
		(this._time.equals(o.getTime()));
	}
	
	public ArrayList<HebrewLetter> getWord() {
		return _word;
	}

	public Time getTime() {
		return _time;
	}

	public Gender getGender() {
		return _gender;
	}

	public Person getPerson() {
		return _person;
	}

	public Number getNumber() {
		return _number;
	}

	public Spelling getSpelling() {
		return _spelling;
	}
}
