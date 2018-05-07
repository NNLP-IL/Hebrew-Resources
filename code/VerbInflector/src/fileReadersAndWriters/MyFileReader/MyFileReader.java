package MyFileReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import letters.HebrewLetter;

public class MyFileReader {
	
	protected String newLine = new String("\n");
	protected String comma = new String(",");
	private static final String UTF8_BOM = "\uFEFF";
	
	public static String readFileAsString(String filePath) throws IOException{
	        FileInputStream fis = new FileInputStream(filePath);
	        BufferedReader r = new BufferedReader(new InputStreamReader(fis,"UTF8"));
	        StringBuilder sb = new StringBuilder();
	        boolean firstLine = true;
	        for (String s = ""; (s = r.readLine()) != null;) {
	        	if (firstLine) {
                    s = removeUTF8BOM(s);
                    firstLine = false;
                }
	            sb.append(s+"\n");
	        }
	        r.close();
	        return sb.toString();
	}
	
	private static String removeUTF8BOM(String s) {
        if (s.startsWith(UTF8_BOM)) {
            s = s.substring(1);
        }
        return s;
    }
	
	protected HebrewLetter[] lettersToArray(String w){
		ArrayList<HebrewLetter> lettersList = new ArrayList<HebrewLetter>();
		for(int i=0; i<w.length();i++){
			if ((i+1<w.length())&&(HebrewLetter.QUOTE.equals(w.substring(i+1, i+2)))){
				lettersList.add(HebrewLetter.makeLetterFromString(w.substring(i,i+2)));
				i++;
			}
			else{
				lettersList.add(HebrewLetter.makeLetterFromString(w.substring(i,i+1)));
			}
		}
		HebrewLetter[] letters = new HebrewLetter[lettersList.size()];
		for(int i=0;i<lettersList.size();i++){
			letters[i] = lettersList.get(i);
		}
		return letters;
	}
}
