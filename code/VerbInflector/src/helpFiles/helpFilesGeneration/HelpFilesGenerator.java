package helpFilesGeneration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import fileWriters.StringFileWriter;

public class HelpFilesGenerator {


	public static void makeReadMeFile(String outFile){
		StringBuilder sb = new StringBuilder();
		// Methods
		sb.append(HelpFilesStrings.README_HEADER);
		sb.append(HelpFilesStrings.README_DELIMITER);
		sb.append(HelpFilesStrings.README_PAR1 + HelpFilesStrings.README_PAR2);   
		sb.append(HelpFilesStrings.README_INSTRUCTIONS);
		sb.append(HelpFilesStrings.README_METHODS);
		sb.append(HelpFilesStrings.README_INSTRUCTIONS_GENERATE);
		sb.append(HelpFilesStrings.README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_HEURISTIC_A +
				HelpFilesStrings.README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_HEURISTIC_B);
		sb.append(HelpFilesStrings.README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A + 
				HelpFilesStrings.README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B);
		sb.append(HelpFilesStrings.README_INSTRUCTIONS_ZAMARESHET_CRAWLER);
		
		// Datasets
		sb.append(HelpFilesStrings.README_DATASETS);
		sb.append(HelpFilesStrings.README_VERB_INDEX_DATASET);
		sb.append(HelpFilesStrings.README_ZAMARESHET_DATASET);

		// Help
		sb.append(HelpFilesStrings.README_HELP);
		sb.append(HelpFilesStrings.README);
		sb.append(HelpFilesStrings.BATCH);
		
		
		// FAQ
		sb.append(HelpFilesStrings.FAQ);
		sb.append(HelpFilesStrings.FAQ_CONTANT);
		
		StringFileWriter fw = new StringFileWriter(sb.toString());
		fw.writeToFile(outFile);
	}

	public static void makebatchFile(String outFile, String[] args){
		String batchFiledata = new String("");
		batchFiledata += HelpFilesStrings.RUNNING_JAR_FILE_WITH_CHARSET;
		for(int i=0; i<args.length;++i){
			batchFiledata += " " + args[i];
		}
		StringFileWriter fw = new StringFileWriter(batchFiledata);
		fw.writeToFile(outFile);
	}

	public static void makeStreamCopy(InputStream inStream, String outFile){
		StringBuilder toWrite = new StringBuilder("");
		InputStreamReader isr = new InputStreamReader(inStream);
		BufferedReader br = new BufferedReader(isr);
		String theLine;
		try{
			while ((theLine = br.readLine()) != null) {
				toWrite.append(theLine + "\n");
			}
		}
		catch (IOException e) {
			System.err.println(e);
		}
		StringFileWriter fw = new StringFileWriter(toWrite.toString());
		fw.writeToFile(outFile);
	}

}
