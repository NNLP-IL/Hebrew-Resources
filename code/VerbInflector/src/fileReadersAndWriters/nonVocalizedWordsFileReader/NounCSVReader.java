package nonVocalizedWordsFileReader;

import hebrewWord.BaseWord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import MyFileReader.MyFileReader;


/*
 * NOTE: A bug in Excel makes some of the lines in the CSV file end with a COMMA,
 * 		 be sure to remove these commas before applying this Object over a CSV file.
 */
public class NounCSVReader extends MyFileReader{

	protected ArrayList<BaseWord> _words;
	protected ArrayList<Integer> _tables;

	public NounCSVReader(String filePath){	
		this._tables = new ArrayList<Integer>();
		this._words = new ArrayList<BaseWord>();
		try {
			String content = MyFileReader.readFileAsString(filePath);
			StringTokenizer tokenizer = new StringTokenizer(content,this.newLine);
			while(tokenizer.hasMoreTokens()){
				String line = tokenizer.nextToken();
				StringTokenizer lineToken = new StringTokenizer(line,this.comma);
				int tableNumber = (new Integer(lineToken.nextToken())).intValue();
				ArrayList<String> wordsInLine = new ArrayList<String>();
				while(lineToken.hasMoreTokens()){
					String wordAsString = lineToken.nextToken();
					wordsInLine.add(wordAsString);
				}
				for(int i=0; i<wordsInLine.size();i++){
					this._words.add(new BaseWord(this.lettersToArray(wordsInLine.get(i))));
					this._tables.add(new Integer(tableNumber));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int[] getTables(){
		int[] ret = new int[this._tables.size()];
		for(int i=0; i<this._tables.size(); i++){
			ret[i] = this._tables.get(i).intValue();
		}
		return ret;
	}
	
	public BaseWord[] getBaseWords(){
		BaseWord[] ret = new BaseWord[this._words.size()];
		for(int i=0; i<this._words.size(); i++){
			ret[i] = this._words.get(i);
		}
		return ret;
	}
}
