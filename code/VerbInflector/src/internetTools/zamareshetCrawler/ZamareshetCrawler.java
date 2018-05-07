package zamareshetCrawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import fileWriters.StringFileWriter;


public class ZamareshetCrawler {

	protected ArrayList<String> _songs;
	private final String songDelimiter = "*******************";
	
	/*
	 * If takeSongsFromWebSite=true then the songs are taken from the Web Site of ZamaReshet;
	 * otherwise, the files are taken from resources\Zamareshet songs.txt
	 */
	public ZamareshetCrawler(){
		this._songs = this.getSongsContentFromWebSite();
	}
	
	public ArrayList<String> getSongs(){
		return this._songs;
	}
	
	public void writeSongsToFile(String filePath){
		StringFileWriter fw = new StringFileWriter(this.delimitedSongsToString());
		fw.writeToFile(filePath);
	}
	
	private String delimitedSongsToString(){
		StringBuilder strBuilder = new StringBuilder("");
		for(int i=0;i<this._songs.size();i++){
			strBuilder.append(this._songs.get(i));
			strBuilder.append("\n"+songDelimiter+"\n");
		}
		return strBuilder.toString();
	}
	
	private ArrayList<String> getSongsContentFromWebSite(){
		String[] songsDomains = this.getSongsDomains();
		ArrayList<String> songs = new ArrayList<String>();
		String prefix = new String("<div class='lyrics_punctuated'>");
		for(int i=0;i<songsDomains.length; i++){
			String song = this.getSiteContent(songsDomains[i], prefix, "</div>");
			if (song.startsWith(prefix, 0)){
				System.out.println("Taking from site song "+(i+1));
				songs.add(this.myFormatSongString(song.substring(prefix.length())));
				//System.out.println("String length: "+songs[i].length()+"  Prefix length:"+prefix.length());
			}
			/*System.out.println(songs.get(0));
			return songs;*/
		}
		return songs;
	}
	
	/*
	 * Replaces the "<br>" chars with newlines.
	 */
	private String myFormatSongString(String song){
		song = song.replaceAll("<br>", "\n");
		return song;
	}
	
	private String[] getSongsDomains(){
		String[] songsList = 
			this.getSiteContent("songs.asp?letr=999","<div class=\"mainDIV\">","</div>").split("<a href=\"");
		String[] songsSiteList = new String[songsList.length-1];
		for(int i=1; i<songsList.length;i++){
			String[] song = songsList[i].split("\">");
			songsSiteList[i-1]=song[0];
		}
		return songsSiteList;
	}
	
	private String getSiteContent(String site,String prefix,String postfix){
		//String ad = new String("http://www.zemereshet.co.il/songs.asp?letr=999");
		try {
			//WebFile zamareshet = new WebFile("http://www.google.com");
			WebFile zamareshet = new WebFile("http://www.zemereshet.co.il/"+site);
			Object cont = zamareshet.getContent();
			//System.out.println("**"+cont);
			if (cont instanceof String){
				String content = (String)cont;
				//String content = new String((byte[])cont,Charset.forName("windows-1255"));
				//content = content.getBytes(),Charset.forName("UTF-8"));
				//System.out.println(content);
				boolean foundStart = false;
				boolean foundEnd = false;
				int beginIndex;
				for(beginIndex=0; (!foundStart)&&(beginIndex<content.length());beginIndex++){
					if (content.startsWith(prefix, beginIndex)){
						foundStart = true;
					}
				}
				beginIndex--;
				int endIndex;
				for(endIndex=beginIndex; (!foundEnd)&&(endIndex<content.length());endIndex++){
					if (content.startsWith(postfix, endIndex)){
						foundEnd = true;
					}
				}
				endIndex--;
				//System.out.println("start: " + beginIndex+" end: " + endIndex);
				//System.out.println(content.substring(beginIndex, endIndex));
				return new String(content.substring(beginIndex, endIndex));
			}
			else{
				System.out.println("CRAWLER ERROR: The zamareshet site has no source,    TYPE: "+cont.getClass());
				System.out.println("MIME:" + zamareshet.getMIMEType());
				System.out.println("Responce Code:" + zamareshet.getResponseCode());
				System.out.println("Header Field" + zamareshet.getHeaderFields().values().toArray()[0]);
			}
		} catch (MalformedURLException e) {
			System.out.println("CRAWLER ERROR: The zamareshet site is not avalible");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("CRAWLER ERROR: Internet connection problem");
			e.printStackTrace();
		}
		return new String("Crawler Error!");
	}	
}
