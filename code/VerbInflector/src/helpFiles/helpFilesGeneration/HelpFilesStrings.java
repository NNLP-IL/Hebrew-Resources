package helpFilesGeneration;

import java.net.URL;

import letters.HebrewLetter;
import main.JarMain;

public class HelpFilesStrings {

	// Jar execution
	public static final String JAR_FILE_DEFAULT_NAME = "thesis.jar";
	public static final String JAR_FILE_NAME = getJarName();
	public static final String RUNNING_JAR_FILE_CHARSET = "-Dfile.encoding=utf-8";
	public static final String RUNNING_JAR_FILE = "java -jar " + JAR_FILE_NAME;
	public static final String RUNNING_JAR_FILE_WITH_CHARSET = "java " + RUNNING_JAR_FILE_CHARSET + " -jar " + JAR_FILE_NAME;
	
	// Execution messages for the JarMain methods 
	public static final String GENERATE_INFLECTIONS_COMMAND = "generate";
	public static final String SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A = "segmentation_heuristic_a";
	public static final String SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B = "segmentation_heuristic_b";
	public static final String SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_A = "segmentation_matching_a";
	public static final String SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B = "segmentation_matching_b";
	public static final String CLASSIFY_BASE_FORMS_TO_BINYAN = "classify_to_binyan";
	public static final String CLASSIFY_BASE_FORMS_TO_INFLECTION_TABLE = "classify_to_table";
	public static final String ZAMARESHET_CRAWLER_COMMAND = "z_crawler";

	// Execution messages for the JarMain help files
	public static final String README_COMMAND = "readme";
	public static final String BATCH_COMMAND = "batch";
	public static final String AUTORUN = "run";
	
	// Execution messages for the JarMain corpora
	public static final String VERBINDEX_COMMAND = "verbindex";
	public static final String ZAMARESHET_CORPORA_COMMAND = "zamareshet";

	// Batch files names
	public static final String BATCH_GENERATE_NAME = "generate inflections.bat";
	public static final String BATCH_SYLLABLE_BY_HEURISTIC_NAME_A = "syllables by heuristic A.bat";
	public static final String BATCH_SYLLABLE_BY_HEURISTIC_NAME_B = "syllables by heuristic B.bat";
	public static final String BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_A = "syllables by string matching A.bat";
	public static final String BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_B = "syllables by string matching B.bat";
	public static final String BATCH_ZAMARESHET_NAME = "zamareshet crawler.bat";
	public static final String BATCH_RUN_ALL_NAME = "run.bat";

	// file names
	public static final String VERB_INDEX_FILE_NAME = "VerbIndex.txt";
	public static final String GENERATED_INFLECTIONS_FILE_NAME = "Generated Inflections.txt";
	public static final String SYLLABLE_SEGMENTATION_BY_HEURISTIC_A_FILE_NAME = "Heuristic syllable segmentation A.txt";
	public static final String SYLLABLE_SEGMENTATION_BY_HEURISTIC_B_FILE_NAME = "Heuristic syllable segmentation B.txt";
	public static final String SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A_FILE_NAME = "String Matching syllable segmentation A.txt";
	public static final String SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B_FILE_NAME = "String Matching syllable segmentation B.txt";
	public static final String ZAMARESHET_CRAWLER_FILE_NAME = "Zamareshet from website.txt";
	public static final String ZAMARESHET_CORPORA_FILE_NAME = "Zamareshet corpora.txt";
	public static final String README_FILE_NAME = "readme.txt";
	
	public static String getJarName(){
		String jarName = HelpFilesStrings.JAR_FILE_DEFAULT_NAME;
		URL url = JarMain.class.getClassLoader().getResource("The Verb Index.csv");
		String fileAndPath = url.getFile();
		for(String x : fileAndPath.split("/")){
			if(x.indexOf(".jar")>-1){
				jarName = x.substring(0,x.length()-1);
			}
		}
		return jarName;
	}
	
	// ReadMe file strings
	public static final String README_HEADER = 
			"Hebrew Vocalization Tools\n" +
					"	Eran Tomer\n" +
					"	Jan 2012\n";
	public static final String README_DELIMITER = "-----------------------\n\n";

	public static final String README_PAR1 = 
			"This Java package allows you to work on Hebrew text to analyze and generate vocalized Hebrew texts.\n" +
					"The specific functionality is the following:\n" +
					"	1. Generate all inflected vocalized forms of a specific Hebrew verb given its base form.\n" +
					"	2. Segment vocalized words into syllables.\n" +
					"	3. Classify the base form of a non-vocalized Hebrew verb into its BINYAN.\n" +
					"	4. Classify the base form of a non-vocalized Hebrew verb into its verb form.\n" +
					"	5. Crawl into the Zamareshet website (http://www.zemereshet.co.il) and assemble a corpora\n" +
					"	   of vocalized songs.\n";


	public static final String README_PAR2 = 
			"In addition, the package contains datasets that can help research on Hebrew vocalization.\n" +
					"	1. Hebrew Verb dataset\n" +
					"	2. Zemereshet dataset\n\n";

	public static final String README_INSTRUCTIONS = 
			"Instructions:\n" + 
					README_DELIMITER;
	
	public static final String README_METHODS = 
			"Main methods:\n";

	public static final String README_INSTRUCTIONS_GENERATE =
			"	1. Generation:\n\n" +
					"		Functional description:\n" +
					"			By using the generation option, a user may inflect a non-vocalized Hebrew base-form of\n" +
					"			a verb into all its possible inflections. Moreover, the output inflections will be\n" +
					"			accompanied by a morphological tag which fully describes tense, person, gender, number\n" +
					"			and the spelling scheme (deficient vs. Plene spelling).\n" +
					"		Input specification:\n" +
					"			The input for the generation option is a file encoded in UTF-8, which contains\n" +
					"			a base-form in each row. The base forms should be written in simple, non-vocalized, Hebrew\n" +
					"			characters with few exceptions:\n" +
					"				(i)		To denote " + HebrewLetter.SHIN + HebrewLetter.SIN_DOT + " we write '" + HebrewLetter.SHIN + ".\n" +
					"				(ii)	The letters '" + HebrewLetter.GIMEL + " and '" + HebrewLetter.TSADI + " are also valid.\n" +
					"			Other than the base-form, the file has to indicate an appropriate inflection table for\n" +
					"			each base-form. The inflection table is given by writing the Binyan corresponding to\n" +
					"			the base-form where:\n" +
					"				(i)		A corresponds to Paal\n" +
					"				(ii)	B corresponds to Nifal\n" +
					"				(iii)	C corresponds to Piel\n" +
					"				(iv)	D corresponds to Pual\n" +
					"				(v)		E corresponds to Hitpael\n" +
					"				(vi)	F corresponds to Hifil\n" +
					"				(vii)	G corresponds to Hufal\n" +
					"			In addition to the letter describing the Binyan, the file has to specify a number\n" +
					"			describing the exact inflection table. The numbers convention may be reasoned by\n" +
					"			following the examples supplied in the VerbIndex.txt file. In some cases,\n" +
					"			a base form may be inflected by two tables. In such cases two letters specifying\n" +
					"			the Binyan, and two numbers specifying the exact inflection table will be present in\n" +
					"			the row corresponding to that base-form. In conclusion, each row in the file holds:\n" +
					"				Base-form,Binyan,Number\n" +
					"			or: \n" +
					"				Base-form,Binyan,Number,Binyan,Number\n" +
					"			(in case two inflection tables correspond to the base-form). For example, here are\n" +
					"			some rows that may be written in the input file:\n" +
					"				" + HebrewLetter.ALEF + HebrewLetter.PEH + HebrewLetter.SAMECH + ",C,1\n" +
					"				" + HebrewLetter.SHIN + "'" + HebrewLetter.REISH + HebrewLetter.TET + HebrewLetter.TET +",D,16\n" +
					"				" + HebrewLetter.HEY + HebrewLetter.TAV + HebrewLetter.GIMEL + HebrewLetter.AIN + HebrewLetter.GIMEL +HebrewLetter.AIN + ",E,54,E,51\n" +
					"		Output specification:\n" +
					"			The output UTF-8 file will include the following in each row:\n" +
					"				Binyan,Table,Inflection,Morphology,Base-form\n" +
					"			Such that:\n" +
					"				Binyan		- 	The Binyan by which the corresponding base-form is inflected\n" +
					"				Table		- 	The number specifying the exact inflection table by which the\n" +
					"								corresponding base-form is inflected\n" +
					"				Inflection	- 	The fully vocalized inflection\n" +
					"				Morphology	- 	The morphological attributes corresponding to the inflection.\n" +
					"								These attributes are in the following format:\n" +
					"									tense+person+gender+number+spelling scheme\n" +
					"				Base-form	- 	The vocalized base-form corresponding to the inflection\n" +
					"			For example, the row:\n" +
					"				C,1," + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.YOD + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.SAMECH + HebrewLetter.SHVA + HebrewLetter.TAV + HebrewLetter.HIRIK + HebrewLetter.YOD +",PAST+FIRST+MF+SINGULAR+COMPLETE," + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.TSERE + HebrewLetter.SAMECH + "\n" +
					"			Will be one of the generated rows in the output file if the following line is given in\n" +
					"			the input file:\n" +
					"				" + HebrewLetter.ALEF + HebrewLetter.PEH + HebrewLetter.SAMECH + ",C,1\n" +
					"		Usage:\n" +
					"			In order to use the generation functionality, run the Jar file in the following way:\n" +
					"				" + RUNNING_JAR_FILE_WITH_CHARSET + " " + GENERATE_INFLECTIONS_COMMAND + " inputFile\n" +
					"			Where the input file is the file containing the base forms and their corresponding\n" +
					"			inflection table (as described above), For example:\n" +
					"				" + RUNNING_JAR_FILE_WITH_CHARSET + " " + GENERATE_INFLECTIONS_COMMAND +" C:\\verbIndex.txt\n" +
					"			The output inflections file will be created in the current directory under the name\n" +
					"			\"" + GENERATED_INFLECTIONS_FILE_NAME + "\".\n" +
					"\n\n";
	
	public static final String README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_HEURISTIC_A =
			"	2. Syllable segmentation:\n\n" +
	
			"		Syllable segmentation by heuristic:\n" +
			"		Option A:\n" +
			"			Functional description:\n" +
			"				By using this syllable segmentation option, a user may segment vocalized\n" +
			"				Hebrew words into syllables. This syllable segmentation algorithm follows a heuristic\n" +
			"				suggested by Rabi-Eliyahu-Behor which is described in full in the thesis (chapter 6.2.1).\n" +
			"			Input specification:\n" +
			"				The input for this syllable segmentation by heuristic option is a file encoded in UTF-8,\n" +
			"				which contains a vocalized Hebrew word in each row. For example, here are some rows that may\n" +
			"				be written in the input file:\n" +
			"					" + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.YOD + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.SAMECH + HebrewLetter.SHVA + HebrewLetter.TAV + HebrewLetter.DAGESH + HebrewLetter.HIRIK + HebrewLetter.YOD + "\n" +
			"					" + HebrewLetter.HEY + HebrewLetter.HIRIK + HebrewLetter.TAV + HebrewLetter.SHVA + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.NUN + HebrewLetter.SHVA + HebrewLetter.TSADI + HebrewLetter.SHVA + "'" + HebrewLetter.REISH + HebrewLetter.VAV + HebrewLetter.SHURUK + "\n" +
			"			Output specification:\n" +
			"				The output UTF-8 file will include a vocalized Hebrew word that is segmented to syllables\n" +
			"				in each row. The syllables are delimited by the \"-\" character. For example, here are the\n" +
			"				output lines corresponding to the previous input lines:\n" +
			"					" + "-" + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.YOD + "-" + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.SAMECH + HebrewLetter.SHVA + "-" + HebrewLetter.TAV + HebrewLetter.DAGESH + HebrewLetter.HIRIK + HebrewLetter.YOD + "\n" +
			"					" + "-" + HebrewLetter.HEY + HebrewLetter.HIRIK + HebrewLetter.TAV + HebrewLetter.SHVA + "-" + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.NUN + HebrewLetter.SHVA + "-" + HebrewLetter.TSADI + HebrewLetter.SHVA + "'" + HebrewLetter.REISH + HebrewLetter.VAV + HebrewLetter.SHURUK + "\n" +
			"			Usage:\n" +
			"				In order to use the syllable segmentation by heuristic (A) functionality, run the Jar file in\n" +
			"				the following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A + " inputFile\n" +
			"				Where the input file is the file containing the vocalized Hebrew words (as described above),\n" +
			"				For example:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A +" C:\\vocalizedWords.txt\n" + 
			"				The output file will be created in the current directory under the name \"" + SYLLABLE_SEGMENTATION_BY_HEURISTIC_A_FILE_NAME +"\".\n";

	public static final String README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_HEURISTIC_B =
			"	   Option B:\n" +
			"			Functional description:\n" +
			"				By using this syllable segmentation option, a user may input a file containing\n" +
			"				non-vocalized, Hebrew base-forms, and receive all the corresponding vocalized verb inflections\n" +
			"				segmented into syllables. Again, this syllable segmentation algorithm follows the heuristic\n" +
			"				suggested by Rabi-Eliyahu-Behor which is fully described in the thesis (chapter 6.2.1).\n" +
			"			Input specification:\n" +
			"				The input for this syllable segmentation by heuristic option is similar to the input specification\n" +
			"				for the \"Generation\" option.\n" + 
			"			Output specification:\n" +
			"				The output UTF-8 file is similar to the output specification for the \"Syllable segmentation by\n" +
			"				heuristic A\" option.\n" + 
			"			Usage:\n" +
			"				In order to use the syllable segmentation by heuristic (B) functionality, run the Jar file in the\n" +
			"				following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B + " inputFile\n" +
			"				Where the input file is the file containing the base-forms (as described above), For example:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B +" C:\\verbIndex.txt\n" +
			"				The output file will be created in the current directory under the name \"" + SYLLABLE_SEGMENTATION_BY_HEURISTIC_B_FILE_NAME +"\".\n" + 
			"\n";
	
	public static final String README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A =
			"		Syllable segmentation by string matching:\n" +
			"		Option A:\n" +
			"			Functional description:\n" +
			"				By using this syllable segmentation option, a user may segment vocalized\n" +
			"				Hebrew words into syllables. This syllable segmentation algorithm uses the masculine, 3rd person, single\n" +
			"				form of the word (with similar tense and spelling scheme) for verbs, and the absolute state form\n" +
			"				for nouns. The full description of this syllable segmentation method is described in the thesis (chapter 6.2.2).\n" +
			"			Input specification:\n" +
			"				The input for this syllable segmentation by heuristic option is a file encoded in UTF-8,\n" +
			"				which contains a vocalized Hebrew word and its corresponding vocalized base-tense-form/absolute state in each row.\n" +
			"				For example, here are some rows that may be written in the input file:\n" +
			"					" + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.YOD + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.TSERE + HebrewLetter.SAMECH +
								"," + HebrewLetter.ALEF + HebrewLetter.HIRIK + HebrewLetter.YOD + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.SAMECH + HebrewLetter.SHVA + HebrewLetter.TAV + HebrewLetter.DAGESH + HebrewLetter.HIRIK + HebrewLetter.YOD + "\n" +
			"					" + HebrewLetter.HEY + HebrewLetter.HIRIK + HebrewLetter.TAV + HebrewLetter.SHVA + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.NUN + HebrewLetter.SHVA + HebrewLetter.TSADI + HebrewLetter.TSERE + "'" + HebrewLetter.REISH + 
								"," + HebrewLetter.HEY + HebrewLetter.HIRIK + HebrewLetter.TAV + HebrewLetter.SHVA + HebrewLetter.PEH + HebrewLetter.DAGESH + HebrewLetter.PATAH + HebrewLetter.NUN + HebrewLetter.SHVA + HebrewLetter.TSADI + HebrewLetter.SHVA + "'" + HebrewLetter.REISH + HebrewLetter.VAV + HebrewLetter.SHURUK + "\n" +
			"					" + HebrewLetter.MEM + HebrewLetter.PATAH + HebrewLetter.TAV + HebrewLetter.DAGESH + HebrewLetter.KAMATS + HebrewLetter.NUN + HebrewLetter.KAMATS + HebrewLetter.HEY +  
								"," + HebrewLetter.MEM + HebrewLetter.PATAH + HebrewLetter.TAV + HebrewLetter.DAGESH + HebrewLetter.SHVA + HebrewLetter.NUN + HebrewLetter.VAV + HebrewLetter.HOLAM_M + HebrewLetter.TAV + HebrewLetter.TSERE + HebrewLetter.YOD + HebrewLetter.KAF + HebrewLetter.SEGOL + HebrewLetter.NUN_SOFIT + "\n" +
			"			Output specification:\n" +
			"				The output UTF-8 file is similar to the output specification for the \"Syllable segmentation by\n" +
			"				heuristic A\" option.\n" +				
			"			Usage:\n" +
			"				In order to use the syllable segmentation by string matching (A) functionality, run the Jar file in\n" +
			"				the following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B + " inputFile\n" +
			"				Where the input file is the file containing the vocalized Hebrew words (as described above),\n" +
			"				For example:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B +" C:\\vocalizedWordsAndBaseWords.txt\n" + 
			"				The output file will be created in the current directory under the name \"" + SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_A_FILE_NAME +"\".\n";

	
	public static final String README_INSTRUCTIONS_SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B =
			"	   Option B:\n" +
			"			Functional description:\n" +
			"				By using this syllable segmentation option, a user may input a file containing\n" +
			"				non-vocalized, Hebrew base-forms, and receive all the corresponding vocalized verb inflections\n" +
			"				segmented into syllables. The full description of this syllable segmentation method is described\n" +
			"				in the thesis (chapter 6.2.2).\n" +
			"			Input specification:\n" +
			"				The input for this syllable segmentation by heuristic option is similar to the input specification\n" +
			"				for the \"Generation\" option.\n" + 
			"			Output specification:\n" +
			"				The output UTF-8 file is similar to the output specification for the \"Syllable segmentation by\n" +
			"				heuristic A\" option.\n" + 
			"			Usage:\n" +
			"				In order to use the syllable segmentation by string matching (B) functionality, run the Jar file in the\n" +
			"				following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B + " inputFile\n" +
			"				Where the input file is the file containing the base-forms (as described above), For example:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B +" C:\\verbIndex.txt\n" +
			"				The output file will be created in the current directory under the name \"" + SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_B_FILE_NAME +"\".\n" + 
			"\n\n";
	
	public static final String README_INSTRUCTIONS_ZAMARESHET_CRAWLER =
			"	5. Assembling a vocalized songs corpora from the Zamareshet website:\n\n" +
	
			"			Functional description:\n" +
			"				By using this option, a user may create a vast corpora including about 3k, fully vocalized\n" +
			"				Hebrew songs from the Zamareshet website. This functionality is given by the Jar file additionally\n" +
			"				to supplying the corpora since the website is updated on regular bases (so by using this option.\n" +
			"				you may get more songs).\n" +
			"			Input specification:\n" +
			"				No input is required.\n" + 				
			"			Output specification:\n" +
			"				The output UTF-8 file will include vocalized songs delimited by a line including the string\n" +
			"				\"*******************\".\n" + 
			"			Usage:\n" +
			"				In order to use the corpora assembling from Zamareshet functionality, the computer has to have internet\n " +
			"				accessability to the http://www.zemereshet.co.il/ website. To invoke this option run the Jar file in\n" +
			"				the following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + ZAMARESHET_CRAWLER_COMMAND + "\n" +
			"				The output file will be created in the current directory under the name \"" + ZAMARESHET_CRAWLER_FILE_NAME +"\".\n" +
			"\n\n";
	
	public static final String README_DATASETS = 
			"Datasets creation methods:\n";
	
	public static final String README_VERB_INDEX_DATASET =
			"	1. Creating the verb index dataset:\n\n" +
	
			"			Functional description:\n" +
			"				By using this option, a user may create a verb index file. This file may be used as input\n" +
			"				for the generation option and for the syllable segmentation B options.\n" +
			"			Input specification:\n" +
			"				No input is required.\n" + 				
			"			Output specification:\n" +
			"				The output UTF-8 file will include non-vocalized base-forms as described in the Generation\n" +
			"				input part.\n" + 
			"			Usage:\n" +
			"				In order to use the verb index dataset creation functionality run the Jar file in\n" +
			"				the following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + VERBINDEX_COMMAND + "\n" +
			"				The file will be created under the current directory under the name \"" + VERB_INDEX_FILE_NAME + "\".\n" +
			"\n\n";
	
	public static final String README_ZAMARESHET_DATASET =
			"	2. Creating the Zamareshet songs dataset:\n\n" +
	
			"			Functional description:\n" +
			"				By using this option, a user may create a file including the songs that were in the Zamareshet\n" +
			"				website on Jan 2012.\n" +
			"			Input specification:\n" +
			"				No input is required.\n" + 				
			"			Output specification:\n" +
			"				The output file follows the convention described in \"Assembling a vocalized songs\n" +
			"				corpora from the Zamareshet website\" on the output secification part.\n" +
			"			Usage:\n" +
			"				In order to use the Zamareshet dataset creation functionality run the Jar file in\n" +
			"				the following way:\n" +
			"					" + RUNNING_JAR_FILE_WITH_CHARSET + " " + ZAMARESHET_CORPORA_COMMAND + "\n" +
			"				The file will be created under the current directory under the name \"" + ZAMARESHET_CORPORA_FILE_NAME + "\".\n" +
			"\n\n";
	
	public static final String README_HELP = 
			"Help methods:\n";
	
	public static final String README =
			"	1. Creating this readme file:\n" +
			"			To create this readme file run:\n" +
			"						" + RUNNING_JAR_FILE + " " + README_COMMAND + "\n" +
			"			The file will be created under the current directory under the name \"" + README_FILE_NAME + "\".\n" +
			"\n";
	
	public static final String BATCH =
			"	2. Creating batch files for simple invocation:\n" +
			"			Using this option will create several \".bat\" files in the current directory, these files may\n" +
			"			be used to invoke the methods described in this file. To create these batch files run:\n" +
			"						" + RUNNING_JAR_FILE + " " + BATCH_COMMAND + "\n" +
			"			The files will be created under the current directory.\n" +
			"\n\n";
	
	public static final String FAQ =
			"FAQ:\n";
	
	public static final String FAQ_CONTANT =
			"	Q:	My output files do not show the Hebrew characters correctly.\n" +
			"	A:	Make sure you are using the charset specification option (" + RUNNING_JAR_FILE_CHARSET + ")on execution\n" +
			"		and if you are useing an input file, make sure it is encoded in UTF-8.\n\n" +
			"	Q:	The Zamareshet crawler does not seem to work.\n" +
			"	A:	Make sure you have internet connection, and you can access the Zamareshet website\n" +
			"		(http://www.zemereshet.co.il). Generally, the Zamareshet songs webpage is a bit heavy\n" +
			"		so it may take about 1 minute until the crawler starts collecting the songs, depending\n" +
			"		on the network bandwidth.\n\n" +
			"	Q: 	I'm getting \"The file <filename> is either empty or it does not exist\", what am I doing wrong?\n" +
			"	A:	This massege appears when a given input file is either empty or it does not exist, make sure\n" +
			"		you are typing the file name correctly (don't forget the extantion).\n";
}
