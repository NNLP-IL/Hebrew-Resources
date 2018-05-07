package classificationFileReaders;

import java.io.IOException;

import MyFileReader.MyFileReader;

public class ClassificationOutputFileReader extends MyFileReader{

	public static int[] getOneClassOutClassification(String filePath){
		int[] classes;
		try {
			String classesStr = MyFileReader.readFileAsString(filePath);
			String[] splittedClassesStr = classesStr.split("\n");
			classes = new int[splittedClassesStr.length];
			for(int i=0; i<classes.length; i++){
				classes[i] = (new Double(Double.parseDouble(splittedClassesStr[i]))).intValue();
			}
			return classes;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
