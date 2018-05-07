package main;

import java.io.InputStream;
import java.util.ArrayList;
import nonVocalizedWordsFileReader.VerbCSVReader;
import hebrewWord.VocalizedWord;
import hebrewWord.VocalizedWordAndVocalizedBaseForm;
import helpFilesGeneration.HelpFilesGenerator;
import helpFilesGeneration.HelpFilesStrings;
import stringTools.EditDistanceCalculatorForHebrew;
import vocalizedWordsFileReaders.VocalizedWordsAndBaseFormFileReader;
import vocalizedWordsFileReaders.VocalizedWordsFileReader;
import fileWriters.StringFileWriter;
import zamareshetCrawler.ZamareshetCrawler;

public class JarMain {

	public static void main(String[] args) {
		if(args.length>0){
			String methodName = args[0];

			////////////////////////////////////////////
			//////////////// Generation ////////////////
			if(methodName.equalsIgnoreCase(HelpFilesStrings.GENERATE_INFLECTIONS_COMMAND)){

				if(methodNotSupported(methodName, args.length, 2)){
					makeExtendedInflectedVerbsPlusMorphologyFile(args[1]);
				}

			}
			///////////////////////////////////////////////////////			
			//////////////// Syllable segmentation ////////////////
			else if(methodName.equalsIgnoreCase(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A)){

				if(methodNotSupported(methodName, args.length, 2)){
					makeSyllabledWordsByHuristicFile(args[1]);
				}

			}else if(methodName.equalsIgnoreCase(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B)){

				if(methodNotSupported(methodName, args.length, 2)){
					makeInflectedSyllabledVerbsByHuristicFile(args[1]);
				}

			}else if(methodName.equalsIgnoreCase(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_A)){

				if(methodNotSupported(methodName, args.length, 2)){
					makeSyllabledWordsByBaseFormFile(args[1]);
				}

			}else if(methodName.equalsIgnoreCase(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B)){

				if(methodNotSupported(methodName, args.length, 2)){
					makeInflectedSyllabledVerbsByBaseFormFile(args[1]);
				}

			}
			////////////////////////////////////////////////////			
			//////////////// ZamaReshet crawler ////////////////
			else if(methodName.equalsIgnoreCase(HelpFilesStrings.ZAMARESHET_CRAWLER_COMMAND)){

				if(methodNotSupported(methodName, args.length, 1)){
					makeZamaReshetCrawlerSongsFile();
				}

			}
			//////////////////////////////////////////////	
			//////////////// Help methods ////////////////
			else if(methodName.equalsIgnoreCase(HelpFilesStrings.README_COMMAND)){
				if(methodNotSupported(methodName, args.length, 1)){
					makeReadMe();
				}
			}else if(methodName.equalsIgnoreCase(HelpFilesStrings.BATCH_COMMAND)){
				if(methodNotSupported(methodName, args.length, 1)){
					makeBatchFiles();
				}
			}else if(methodName.equalsIgnoreCase(HelpFilesStrings.AUTORUN)){
				if(methodNotSupported(methodName, args.length, 1)){
					autorun();
				}
			}
			
			//////////////////////////////////////////////////////
			//////////////// Make corpora methods ////////////////
			else if(methodName.equalsIgnoreCase(HelpFilesStrings.VERBINDEX_COMMAND)){
				if(methodNotSupported(methodName, args.length, 1)){
					makeVerbIndex();
				}
			}
			else if(methodName.equalsIgnoreCase(HelpFilesStrings.ZAMARESHET_CORPORA_COMMAND)){
				if(methodNotSupported(methodName, args.length, 1)){
					makeZamaReshetCorporaFile();
				}
			}

			//////////////////////////////////////
			//////////////// ELSE ////////////////
			else{
				System.out.println("The method " + methodName + " is not one of the supported methods by this Jar file, see the readme.txt file\n" +
						"for more information regarding the supported methods and arguments. If you don't have the readme.txt file" +
						" run \"" + HelpFilesStrings.RUNNING_JAR_FILE + " " + HelpFilesStrings.README_COMMAND + "\"");
			}

		}else{
			System.out.println("This Jar file uses arguments to invoke various methods, see the readme.txt file for more information\n" +
					"regarding the supported methods and arguments. If you don't have the readme.txt file" +
					" run \"" + HelpFilesStrings.RUNNING_JAR_FILE + " " + HelpFilesStrings.README_COMMAND + "\"");
		}
	}


	///////////////////////////////////////////////////////////////
	/////////////////////   PRIVATE METHODS   /////////////////////
	///////////////////////////////////////////////////////////////



	private static boolean methodNotSupported(String methodName, int argNum, int goodArgNum) {
		if(argNum == goodArgNum){
			return true;
		}else{
			System.out.println("The method " + methodName + " uses " + (goodArgNum-1) + " arguments, rather then " + (argNum-1) +".");
			return false;
		}
	}

	/*private static void makeReadMeFile(String outFile){

	}*/


	///////////////////////////////////////////////////////////////
	///////////////////   EXPOSED JAR METHODS   ///////////////////
	///////////////////////////////////////////////////////////////


	/**
	 * Creates Verb inflections given a file with base-forms and proper inflection table
	 */
	public static void makeExtendedInflectedVerbsPlusMorphologyFile(String baseFormsFile) {
		VerbCSVReader vr = new VerbCSVReader(baseFormsFile);
		if (vr.getVerbsAndTables().isEmpty()){
			System.out.println("The file " + baseFormsFile + " is either empty or it does not exist.");
		}else{
			StringFileWriter fw = new StringFileWriter(vr.toStringExtended());
			fw.writeToFile(HelpFilesStrings.GENERATED_INFLECTIONS_FILE_NAME);
			System.out.println("The file " + HelpFilesStrings.GENERATED_INFLECTIONS_FILE_NAME +" was created on the current directory");
		}
	}
	
	/**
	 * Creates a file containing the syllabled words by heuristic
	 */
	public static void makeSyllabledWordsByHuristicFile(String vocalizedWordsFile) {
		VocalizedWordsFileReader vwfr = new VocalizedWordsFileReader(vocalizedWordsFile);
		ArrayList<VocalizedWord> words = vwfr.getVocalizedWords();
		if (words.isEmpty()){
			System.out.println("The file " + vocalizedWordsFile + " is either empty/holds corapted data, or it does not exist.");
		}else{
			StringBuilder b = new StringBuilder();
			for(VocalizedWord word : words){
				b.append(word.makeSyllabledWordByHuristic() + "\n");
			}
			StringFileWriter fw = new StringFileWriter(b.toString());
			fw.writeToFile(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_A_FILE_NAME);
			System.out.println("The file " + HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_A_FILE_NAME +" was created on the current directory");
		}
	}

	/**
	 * Creates a file containing the syllabled verbs by heuristic
	 */
	public static void makeInflectedSyllabledVerbsByHuristicFile(String baseFormsFile) {
		VerbCSVReader vr = new VerbCSVReader(baseFormsFile);
		if (vr.getVerbsAndTables().isEmpty()){
			System.out.println("The file " + baseFormsFile + " is either empty or it does not exist.");
		}else{
			StringFileWriter fw = new StringFileWriter(
					vr.huristicSyllableToString());
			fw.writeToFile(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_B_FILE_NAME);
			System.out.println("The file " + HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_B_FILE_NAME +" was created on the current directory");
		}
	}
	
	
	/**
	 * Creates a file containing the syllabled words by baseForm
	 */
	public static void makeSyllabledWordsByBaseFormFile(String vocalizedWordsAndBaseFormsFile) {
		VocalizedWordsAndBaseFormFileReader vwbfr = new VocalizedWordsAndBaseFormFileReader(vocalizedWordsAndBaseFormsFile);
		ArrayList<VocalizedWordAndVocalizedBaseForm> wordsAndBaseForms = vwbfr.getVocalizedWordAndVocalizedBaseForm();
		if (wordsAndBaseForms.isEmpty()){
			System.out.println("The file " + vocalizedWordsAndBaseFormsFile + " is either empty/holds corapted data, or it does not exist.");
		}else{
			StringBuilder b = new StringBuilder();
			for(VocalizedWordAndVocalizedBaseForm word : wordsAndBaseForms){
				VocalizedWord w = word.getWord();
				VocalizedWord baseForm = word.getBase();
				b.append(w.makeSyllabledWordByBaseForm(baseForm, new EditDistanceCalculatorForHebrew(-50, -1, 2, 3, 3)) + "\n");
			}
			StringFileWriter fw = new StringFileWriter(b.toString());
			fw.writeToFile(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A_FILE_NAME);
			System.out.println("The file " + HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A_FILE_NAME +" was created on the current directory");
		}
	}

	/**
	 * Creates a file containing the syllabled verbs by BaseForm
	 */
	public static void makeInflectedSyllabledVerbsByBaseFormFile(String baseFormsFile) {
		VerbCSVReader vr = new VerbCSVReader(baseFormsFile);
		if (vr.getVerbsAndTables().isEmpty()){
			System.out.println("The file " + baseFormsFile + " is either empty or it does not exist.");
		}else{
			StringFileWriter fw = new StringFileWriter(
					vr.baseFormSyllableToString(new EditDistanceCalculatorForHebrew(-50, -1, 2, 3, 3)));
			fw.writeToFile(HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B_FILE_NAME);
			System.out.println("The file " + HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B_FILE_NAME +" was created on the current directory");
		}
	}

	/**
	 * Creates ZamaReshet delimited songs file
	 */
	public static void makeZamaReshetCrawlerSongsFile() {
		ZamareshetCrawler zCrawler = new ZamareshetCrawler();
		zCrawler.writeSongsToFile(HelpFilesStrings.ZAMARESHET_CRAWLER_FILE_NAME);
		System.out.println("The file " + HelpFilesStrings.ZAMARESHET_CRAWLER_FILE_NAME +" was created on the current directory");
	}

	/////////////////////////////////////////////////////////////////
	///////////////////   EXPOSED CORPORA FILES   ///////////////////
	/////////////////////////////////////////////////////////////////

	public static void makeVerbIndex(){
		InputStream inStream = JarMain.class.getClassLoader().getResourceAsStream("The Verb Index.csv");
		HelpFilesGenerator.makeStreamCopy(inStream, HelpFilesStrings.VERB_INDEX_FILE_NAME);
		System.out.println("The verb index file was created on the current directory");
	}

	public static void makeZamaReshetCorporaFile(){
		InputStream inStream = JarMain.class.getClassLoader().getResourceAsStream("Zamareshet songs.txt");
		HelpFilesGenerator.makeStreamCopy(inStream, HelpFilesStrings.ZAMARESHET_CORPORA_FILE_NAME);
		System.out.println("The file " + HelpFilesStrings.ZAMARESHET_CORPORA_FILE_NAME +" was created on the current directory");
	}
	
	////////////////////////////////////////////////////////////////
	///////////////////   EXPOSED HELP METHODS   ///////////////////
	////////////////////////////////////////////////////////////////
	
	public static void makeReadMe(){
		HelpFilesGenerator.makeReadMeFile(HelpFilesStrings.README_FILE_NAME);
		System.out.println("The readme file was created on the current directory");
	}
	
	public static void makeBatchFiles(){
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_GENERATE_NAME, new String[] {HelpFilesStrings.GENERATE_INFLECTIONS_COMMAND, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_SYLLABLE_BY_HEURISTIC_NAME_A, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A, "words.txt"});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_SYLLABLE_BY_HEURISTIC_NAME_B, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_A, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_A, "wordsAndBaseForms.txt"});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_B, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_ZAMARESHET_NAME, new String[] {HelpFilesStrings.ZAMARESHET_CRAWLER_COMMAND});
		HelpFilesGenerator.makebatchFile(HelpFilesStrings.BATCH_RUN_ALL_NAME, new String[] {HelpFilesStrings.AUTORUN});
		System.out.println("The batch files were created on the current directory");
	}
	
	public static void autorun(){
		makeVerbIndex();
		makeZamaReshetCorporaFile();
		makeReadMe();
		makeBatchFiles();
		makeExtendedInflectedVerbsPlusMorphologyFile("VerbIndex.txt");
		makeInflectedSyllabledVerbsByHuristicFile("VerbIndex.txt");
		makeInflectedSyllabledVerbsByBaseFormFile("VerbIndex.txt");
	}
	
}
