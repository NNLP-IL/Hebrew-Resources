package vocalizedWordsFileReaders;

import java.io.IOException;
import java.util.ArrayList;

import MyFileReader.MyFileReader;


import hebrewWord.VocalizedWord;

public class VocalizedWordsFileReader {

	ArrayList<VocalizedWord> _words;

	public VocalizedWordsFileReader(String filePath){
		this._words = new ArrayList<VocalizedWord>();
		try {
			String txt = MyFileReader.readFileAsString(filePath);
			String[] lines = txt.split("\n");
			for(int i=0; i<lines.length; i++){
				if(!lines[i].equals("\n")){
					this._words.add(new VocalizedWord(lines[i]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<VocalizedWord> getVocalizedWords(){
		return this._words;
	}
}
