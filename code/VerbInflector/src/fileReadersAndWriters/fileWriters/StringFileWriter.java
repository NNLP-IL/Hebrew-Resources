package fileWriters;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class StringFileWriter {

	protected String _toWrite;
	
	public StringFileWriter(String toWrite){
		try {
			this._toWrite = new String(toWrite.getBytes(),"UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public void writeToFile(String filePath){
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(this._toWrite);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("WRITE: The File "+filePath+" is not accessible.");
			e.printStackTrace();
		}
	}
}
