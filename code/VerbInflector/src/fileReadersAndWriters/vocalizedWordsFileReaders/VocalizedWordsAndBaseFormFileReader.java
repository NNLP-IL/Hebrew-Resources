package vocalizedWordsFileReaders;

import hebrewWord.VocalizedWord;
import hebrewWord.VocalizedWordAndVocalizedBaseForm;

import java.io.IOException;
import java.util.ArrayList;

import MyFileReader.MyFileReader;

public class VocalizedWordsAndBaseFormFileReader {

	ArrayList<VocalizedWordAndVocalizedBaseForm> _wordsAndBaseForms;

	public VocalizedWordsAndBaseFormFileReader(String filePath){
		this._wordsAndBaseForms = new ArrayList<VocalizedWordAndVocalizedBaseForm>();
		try {
			String txt = MyFileReader.readFileAsString(filePath);
			String[] lines = txt.split("\n");
			for(int i=0; i<lines.length; i++){
				if(!lines[i].equals("\n")){
					String[] line = lines[i].split(",");
					if(line.length==2){
						VocalizedWord word = new VocalizedWord(line[0]);
						VocalizedWord base = new VocalizedWord(line[1]);
						this._wordsAndBaseForms.add(new VocalizedWordAndVocalizedBaseForm(word,base));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<VocalizedWordAndVocalizedBaseForm> getVocalizedWordAndVocalizedBaseForm(){
		return this._wordsAndBaseForms;
	}
}
