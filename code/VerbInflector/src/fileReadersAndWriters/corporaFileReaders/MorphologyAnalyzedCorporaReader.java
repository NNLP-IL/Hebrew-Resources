package corporaFileReaders;

import fileWriters.StringFileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import letters.*;

public class MorphologyAnalyzedCorporaReader{

	private HashMap<String, Integer> _verbsCount;
	private int linesRead;
	public static enum TaggerTime {E,PAST,BEINONI,FUTURE,IMPERATIVE,INFINITIVE};
	public static enum TaggerGender {E,M,F,MF};
	public static enum TaggerPerson {E,ONE,TWO,THREE,A};
	public static enum TaggerNumber {E,S,P};

	public MorphologyAnalyzedCorporaReader(){
		this._verbsCount = new HashMap<String, Integer>();
		this.linesRead = 0;
	}
	
	public HashMap<String, Integer> getVerbCounts(){
		return this._verbsCount;
	}
	
	public void readVerbCountsFromFile(String filePathAndName){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePathAndName));
			String line;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			while (line != null){
				String[] lineArr = line.split(":");
				this._verbsCount.put(lineArr[0], Integer.parseInt(lineArr[1]));
				try {
					line = reader.readLine();
				} catch (IOException e) {
					System.out.println(this.linesRead);
				}
			} 
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void readVerbsFormCorpusFile(String filePathAndName){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePathAndName));
			String line;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			while (line != null){
				this.linesRead++;
				if (this.linesRead%100000==0){
					System.out.println(this.linesRead);
				}
				//			System.out.println(line);
				String[] lineArr = line.split("\t");
				if (lineArr.length>4&&this.isVerb(lineArr[3])){
					if(!lineArr[5].equals("_")||lineArr[4].equals("VB-TOINFINITIVE")){
						int pos = 5;
						if(lineArr[4].equals("VB-TOINFINITIVE")){
							pos = 4;
						}
						TaggerOutputWord word = new TaggerOutputWord(lineArr[1],lineArr[pos]);
						if(lineArr[3].equals("BN")){
							word.setTime(TaggerTime.BEINONI);
						}
						if (word.getWord() != null){
							String w = word.toString().replaceAll(HebrewLetter.SHIN_DOT, "").replaceAll(HebrewLetter.SIN_DOT, "");
							if(this._verbsCount.containsKey(w)){
								this._verbsCount.put(w, this._verbsCount.get(w)+1);
							}else{
								this._verbsCount.put(w, 1);
							}
						}
					} 
				}
				try {
					line = reader.readLine();
				} catch (IOException e) {
					System.out.println(this.linesRead);
				}
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void writeVerbCountsToFile(String filePathAndName){
		String txtToWrite = this._verbsCount.toString();
		txtToWrite = txtToWrite.replaceAll(", ", "\n").replaceAll("=", ":");
		txtToWrite = txtToWrite.substring(1, txtToWrite.length()-1);
		StringFileWriter fw = new StringFileWriter(txtToWrite);
		fw.writeToFile(filePathAndName);
	}

	private boolean isVerb(String pos) {
		return pos.equals("VB")||pos.equals("BN"); //||pos.equals("MD") ||pos.equals("VBT")
	}

	public class TaggerOutputWord {
		
		protected HebrewLetter[] _word;
		protected TaggerTime _time;
		protected TaggerGender _gender;
		protected TaggerPerson _person;
		protected TaggerNumber _number;
		
		public TaggerOutputWord(String tiatuk, String morph) {
			this._word = this.convertTiatukToHebrew(tiatuk);
			this._time = TaggerTime.E;
			this._gender = TaggerGender.E;
			this._person = TaggerPerson.E;
			this._number = TaggerNumber.E;
			this.morphSetter(morph);
		}

		public HebrewLetter[] getWord() {
			return _word;
		}

		public TaggerTime getTime() {
			return _time;
		}
		
		public void setTime(TaggerTime time){
			this._time = time;
		}

		public TaggerGender getGender() {
			return _gender;
		}

		public TaggerPerson getPerson() {
			return _person;
		}

		public TaggerNumber getNumber() {
			return _number;
		}
		
		public boolean equals(TaggerOutputWord w){
			return w.equals(this);
		}
		
		public String toString(){
			String ret = new String("");
			String delim = ",";
			for(int i=0; i<this._word.length; i++){
				ret += this._word[i].toString();
			}
			ret += delim+this._time.toString()+delim+this._gender.toString()+delim+this._person.toString()+
					delim+this._number.toString();
			return ret;
		}
		
		private void morphSetter(String morph) {
			String[] morphArr = morph.split("\\|");
			for(int i=0; i<morphArr.length; i++){
				String m = morphArr[i];
				if(m.equals("PAST")){
					this._time = TaggerTime.PAST;
				} else if(m.equals("BEINONI")){
					this._time = TaggerTime.BEINONI;
				} else if(m.equals("FUTURE")){
					this._time = TaggerTime.FUTURE;
				} else if(m.equals("IMPERATIVE")){
					this._time = TaggerTime.IMPERATIVE;
				} else if(m.equals("VB-TOINFINITIVE")){
					this._time = TaggerTime.INFINITIVE;
				} 
				
				else if((m.equals("M")&&this._gender.equals(TaggerGender.F))||(m.equals("F")&&this._gender.equals(TaggerGender.M))){
					this._gender = TaggerGender.MF;
				} else if(m.equals("M")){
					this._gender = TaggerGender.M;
				} else if(m.equals("F")){
					this._gender = TaggerGender.F;
				} 
				
				else if(m.equals("3")){
					this._person = TaggerPerson.THREE;
				} else if(m.equals("A")){
					this._person = TaggerPerson.A;
				} else if(m.equals("1")){
					this._person = TaggerPerson.ONE;
				} else if(m.equals("2")){
					this._person = TaggerPerson.TWO;
				}
				
				else if(m.equals("S")){
					this._number = TaggerNumber.S;
				} else if(m.equals("P")){
					this._number = TaggerNumber.P;
				}
				
				else if(m.equals("PAAL")||m.equals("HITPAEL")||m.equals("PIEL")||m.equals("HIFIL")||m.equals("PUAL")||m.equals("NIFAL")||m.equals("HUFAL")){
					// do nothing
				}else if(m.contains("suf_")){//(m.equals("suf_F")||m.equals("suf_P")||m.equals("suf_3")||m.equals("suf_S")||m.equals("suf_M")||m.equals("suf_2")||m.equals("suf_MF")||m.equals("suf_1")){
					// TODO remove suffixes
					//System.out.println("Unknown morphology:  " + morph + ", At index " + i + " ," + morphArr[i] + Arrays.deepToString(_word));
				} else {
					System.out.println("Unknown morphology:  " + morph + ", At index " + i + " ," + morphArr[i] + Arrays.deepToString(_word));
				}
			}
		}
		
		private HebrewLetter[] convertTiatukToHebrew(String tiatuk){
			HebrewLetter[] ret = new HebrewLetter[tiatuk.length()];
			for(int i=0; i<tiatuk.length(); i++){
				HebrewLetter l = this.convertTiatukLetterToHebrew(tiatuk.substring(i, i+1));
				if (l == null){
					return null;
				} else{
					if(i==tiatuk.length()-1) {
						l.finalizeLetter();
					}
					ret[i] = l; 
				}
			}
			return ret;
		}

		private HebrewLetter convertTiatukLetterToHebrew(String tiatukLetter){
			if(tiatukLetter.equals("A")){
				return new Alef();
			} else if(tiatukLetter.equals("B")){
				return new Bet();
			} else if(tiatukLetter.equals("G")){
				return new Gimel();
			} else if(tiatukLetter.equals("D")){
				return new Dalet();
			} else if(tiatukLetter.equals("H")){
				return new Hey();
			} else if(tiatukLetter.equals("W")){
				return new Vav();
			} else if(tiatukLetter.equals("Z")){
				return new Zain();
			} else if(tiatukLetter.equals("X")){
				return new Het();
			} else if(tiatukLetter.equals("J")){
				return new Tet();
			} else if(tiatukLetter.equals("I")){
				return new Yod();
			} else if(tiatukLetter.equals("K")){
				return new Kaf();
			} else if(tiatukLetter.equals("L")){
				return new Lamed();
			} else if(tiatukLetter.equals("M")){
				return new Mem();
			} else if(tiatukLetter.equals("N")){
				return new Nun();
			} else if(tiatukLetter.equals("S")){
				return new Samech();
			} else if(tiatukLetter.equals("E")){
				return new Ain();
			} else if(tiatukLetter.equals("P")){
				return new Peh();
			} else if(tiatukLetter.equals("C")){
				return new Tsadi();
			} else if(tiatukLetter.equals("Q")){
				return new Kuf();
			} else if(tiatukLetter.equals("R")){
				return new Reish();
			} else if(tiatukLetter.equals("F")){
				return new Shin();
			} else if(tiatukLetter.equals("T")){
				return new Tav();
			} else {
				return null;
			}
		}
		
	}
}

