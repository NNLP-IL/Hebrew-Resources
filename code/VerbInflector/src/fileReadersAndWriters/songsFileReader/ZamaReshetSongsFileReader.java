package songsFileReader;

import java.io.IOException;
import java.util.ArrayList;

import MyFileReader.MyFileReader;


public class ZamaReshetSongsFileReader extends MyFileReader{
	
	protected String[] _songs;
	protected ArrayList<String> _songsWords;
	private static final String SONG_DELIMITER = "*******************";
	
	public ZamaReshetSongsFileReader(String filePath){
		try {
			String fileContent = MyFileReader.readFileAsString(filePath);
			this._songs = fileContent.split("\\Q"+SONG_DELIMITER);
		} catch (IOException e) {
			System.out.println("READ: The File "+filePath+" is not accessible.");
			e.printStackTrace();
		}
	}

	public String[] getSongs(){
		return this._songs;
	}
	
	/*public ArrayList<String> getSongsValidWords(){
		if(this._songsWords == null){
			this._songsWords = new ArrayList<String>();
			String songDelimiters = new String("[\\Q!?.,:-[](){} \\E\"'\n]");
			for(int i=0; i<this._songs.length;i++){
				String[] song_iWords = this._songs[i].split(songDelimiters);
				//if the i-th word in song_iWords is vocalized => add it to _songsWords.
			}
		}
		return this._songsWords;
	}*/
	
	public ArrayList<String> getSong_i_ValidWords(String song,String delimiter){
		String[] songWords = song.split(delimiter);
		ArrayList<String> ret = new ArrayList<String>();
		for(int i=0;i<songWords.length;i++){
			if (!songWords[i].equals("")){
				ret.add(songWords[i]);
				System.out.println(songWords[i]);
			}
		}
		return ret;
	}
	
	//public boolean isWordValid(String w){
		
	//}
}
