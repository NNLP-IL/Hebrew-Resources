package main;

import java.util.ArrayList;

import nonVocalizedWordsFileReader.VerbCSVReader;

import corporaFileReaders.MorphologyAnalyzedCorporaReader;
import classDistanceMetrices.VerbTablesDistanceMatric;
import stringTools.EditDistanceCalculator;
import stringTools.EditDistanceCalculatorForHebrew;
import syllables.GetSyllablesFromFiles;
import table.Table;
import table.UnknownVerbBaseFormException;
import verbsInCorporaStat.VerbsInCorporaStat;
import zamareshetCrawler.ZamareshetCrawler;
import hebrewVerb.HebrewVerb.Time;
import experimentTypes.ExperimentDataContainer;
import experimentTypes.TableClassification2StepGroupExperiment;
import experimentTypes.TableClassificationExperiment;
import experimentTypes.TableClassificationWithGroupsExperiment;
import hebrewVerb.*;
import hebrewWord.VocalizedWord;
import helpFilesGeneration.HelpFilesGenerator;
import helpFilesGeneration.HelpFilesStrings;
import featureExtraction.BasicAndBinyanFeatureExtractor;
import featureExtraction.BasicFeatureExtractor;
import fileWriters.StringFileWriter;

public class Main {
	private static String projFolder = "src";
	private static String resourcesFolder = "resources\\";
	private static String experimentOutputFiles = "experiment output files\\";
	private static String cfgFile = projFolder + "\\experiments\\experimentTypes\\groupTablesDefenitions.cfg";

	public static void main(String[] args) {

		// syllable dismentling of auto-generated verb inflections (from the
		// Tables).
		// printSyllabledTableInflectionsByBaseForm(a25);
		// getCheckedSyllables(resourcesFolder+"Syllabled Inflected Verbs By BaseForm.txt");
		// getCheckedSyllables(resourcesFolder+"Syllabled Inflected Verbs By Huristic.txt");

		// writeInflectedVerbsPlusMorphologyToFile();
		// writeExtendedInflectedVerbsPlusMorphologyToFile();
		// writeInflectedSyllabledVerbsByHuristicToFile();
		// writeInflectedSyllabledVerbsByBaseFormToFile();

		// generateSuffledTestVerbsFeatures();
		// generateSuffledTrainAndTestVerbsFeatures();
		// writeTableDistanceMetricToFile();
		// runTableClassificationExperiment();
		// runTableClassificationGroupExperiment();
		// writeVerbCountsFromCorporaToFile();
		// readVerbCountsFromFile();
		// run2PhaseTableClassificationGroupExperiment();
		
		// tst();
		// makeBatchFiles();
		// makeReadmeFile();
		runTableClassificationExperimentWithBinyanFeature();
		
		// countKnownVerbsInCorpora();

		/*
		 * MorphologyAnalyzedCorporaReader r = new
		 * MorphologyAnalyzedCorporaReader();
		 * r.readVerbCountsFromFile(resourcesFolder
		 * +"\\verbCountsFromCorpora.txt"); WordInflectionsCountFeature f = new
		 * WordInflectionsCountFeature( new HebrewLetter[]{new Tav(), new Kuf(),
		 * new PehSofit()},new C1(), "C1",r.getVerbCounts());
		 * System.out.println(f.getFeatureCount());
		 */

		// Read noun file
		/*
		 * SyllableDismantler syllDis = new SyllableDismantler(); NounCSVReader
		 * nounReader = new NounCSVReader(resourcesFolder +
		 * "Narrowed Noun List.csv"); int[] tables = nounReader.getTables();
		 * BaseWord[] nouns = nounReader.getBaseWords(); for(int i=0;
		 * i<tables.length;i++){ syllDis.makeSyllabledNoun(nouns[i],tables[i]);
		 * } System.out.println(syllDis.toString(tables));
		 */

		// ZamaReshetSongsFileReader zrfr = new
		// ZamaReshetSongsFileReader(resourcesFolder+"Zamareshet songs.txt");
		// zrfr.getSong_i_ValidWords(zrfr.getSongs()[100],
		// "[\\Q!?.,:-â€“[](){} \\E\"'\n]");
	}

	/**
	 * Prints the syllabled verbs in a given table by the corresponding baseForm
	 */
	public static void printSyllabledTableInflectionsByBaseForm(Table t) {
		EditDistanceCalculator calc = new EditDistanceCalculatorForHebrew(-50,
				-1, 2, 3, 3);
		for (ArrayList<VerbInflection> infltions : t.getInflections()) {
			for (VerbInflection inf : infltions) {
				VocalizedWord w = new VocalizedWord(inf);
				VocalizedWord baseForm;
				try {
					if (!inf.getTime().equals(Time.INFINITIVE)) {
						baseForm = new VocalizedWord(
								t.getBaseFormInflection(inf));
						System.out.println(w.makeSyllabledWordByBaseForm(
								baseForm, calc));
					} else {
						// need to get the proper (Noun) BaseForm
					}
				} catch (UnknownVerbBaseFormException e) {
					System.out.println("The word " + inf
							+ " was not syllabled since it has no base form!");
					// e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Creates the inflected verbs file that includes all
	 * VerbInflections+Morphology+TableReference from the base
	 * verbs+table-reference
	 */
	public static void writeInflectedVerbsPlusMorphologyToFile() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		StringFileWriter fw = new StringFileWriter(vr.toString());
		fw.writeToFile(resourcesFolder + "Inflected verbs.txt");
	}

	public static void writeExtendedInflectedVerbsPlusMorphologyToFile() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		StringFileWriter fw = new StringFileWriter(vr.toStringExtended());
		fw.writeToFile(resourcesFolder + "Inflected verbs Extended.txt");
	}

	/**
	 * Creates a file containing the syllabled verbs by huristic
	 */
	public static void writeInflectedSyllabledVerbsByHuristicToFile() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		StringFileWriter fw = new StringFileWriter(
				vr.huristicSyllableToString());
		fw.writeToFile(resourcesFolder
				+ "Syllabled Inflected Verbs By Huristic.txt");
	}

	/**
	 * Creates a file containing the syllabled verbs by BaseForm
	 */
	public static void writeInflectedSyllabledVerbsByBaseFormToFile() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		StringFileWriter fw = new StringFileWriter(
				vr.baseFormSyllableToString(new EditDistanceCalculatorForHebrew(
						-50, -1, 2, 3, 3)));
		fw.writeToFile(resourcesFolder
				+ "Syllabled Inflected Verbs By BaseForm.txt");
	}

	/**
	 * Creates ZamaReshet delimited songs file
	 */
	public static void writeZamaReshetSongsToFile() {
		ZamareshetCrawler zCrawler = new ZamareshetCrawler();
		zCrawler.writeSongsToFile(resourcesFolder + "new Zamareshet songs.txt");
	}


	/**
	 * Generate the shuffeled TestSet for a given BaseWord list
	 */
	public static void generateSuffledTestVerbsFeatures() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.999,
				vr.getVerbsAndTables());
		BasicFeatureExtractor fe = new BasicFeatureExtractor(3);
		TableClassificationExperiment exprmnt = new TableClassificationExperiment(
				edc, fe);
		System.out.println(exprmnt.getTestingSetToString());
		System.out.println();
		System.out.println(exprmnt.getClassifierTestingSetToString());
	}

	/**
	 * Generate the shuffeled TrainSet for a given BaseWord list
	 */
	public static void generateSuffledTrainAndTestVerbsFeatures() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.7,
				vr.getVerbsAndTables());
		BasicFeatureExtractor fe = new BasicFeatureExtractor(1);
		TableClassificationExperiment exprmnt = new TableClassificationExperiment(
				edc, fe);
		System.out.println("Train:");
		System.out.println(exprmnt.getClassifierTrainingSetToString());
		System.out.println();
		System.out.println("Test:");
		System.out.println(exprmnt.getClassifierTestingSetToString());
	}

	public static void runTableClassificationExperiment() {
		// VerbCSVReader vr = new
		// VerbCSVReader(resourcesFolder+"The Verb Index.csv");
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index with one class per word.csv");
		// VerbCSVReader vr = new
		// VerbCSVReader(resourcesFolder+"Nifal Verbs.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.7,
				vr.getVerbsAndTables());
		BasicFeatureExtractor fe = new BasicFeatureExtractor(1);
		TableClassificationExperiment e = new TableClassificationExperiment(
				edc, fe);
		String folder = experimentOutputFiles + "\\experimentFiles\\";
		e.runExperiment(folder);
	}

	public static void runTableClassificationGroupExperiment() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index with one class per word.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.7,
				vr.getVerbsAndTables());
		BasicFeatureExtractor fe = new BasicFeatureExtractor(1);
		TableClassificationWithGroupsExperiment e = new TableClassificationWithGroupsExperiment(
				edc, fe, cfgFile);
		String folder = experimentOutputFiles + "\\experimentFiles\\";
		e.runExperiment(folder);
	}

	public static void run2PhaseTableClassificationGroupExperiment() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index with one class per word.csv");
		// VerbCSVReader vr = new VerbCSVReader(resourcesFolder+"tstSVM.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.7,
				vr.getVerbsAndTables());
		BasicFeatureExtractor fe = new BasicFeatureExtractor(1);
		TableClassification2StepGroupExperiment e = new TableClassification2StepGroupExperiment(
				edc, fe, cfgFile);
		String folder = experimentOutputFiles + "\\2stepexperimentFiles\\";
		MorphologyAnalyzedCorporaReader r = new MorphologyAnalyzedCorporaReader();
		r.readVerbCountsFromFile(resourcesFolder
				+ "\\verbCountsFromCorpora.txt");
		e.runExperiment(folder, 1, r.getVerbCounts());
	}

	public static void writeTableDistanceMetricToFile() {
		VerbTablesDistanceMatric x = new VerbTablesDistanceMatric();
		x.writeMetricToFile(resourcesFolder + "Table Distance Metric.csv");
	}

	public static void writeVerbCountsFromCorporaToFile() {
		MorphologyAnalyzedCorporaReader r = new MorphologyAnalyzedCorporaReader();
		String corporaFolder = resourcesFolder + "\\Corpora\\";
		r.readVerbsFormCorpusFile(corporaFolder + "TheMarker.txt");
		r.readVerbsFormCorpusFile(corporaFolder + "Haaretz.txt");
		r.readVerbsFormCorpusFile(corporaFolder + "Channel7.txt");
		r.readVerbsFormCorpusFile(corporaFolder + "Tapuz.txt");
		r.readVerbsFormCorpusFile(corporaFolder + "Literacy.txt");
		r.readVerbsFormCorpusFile(corporaFolder + "Kneset.txt");
		r.writeVerbCountsToFile(resourcesFolder + "\\verbCountsFromCorpora.txt");
	}

	public static void readVerbCountsFromFile() {
		MorphologyAnalyzedCorporaReader r = new MorphologyAnalyzedCorporaReader();
		r.readVerbCountsFromFile(resourcesFolder
				+ "\\verbCountsFromCorpora.txt");
		for (String s : r.getVerbCounts().keySet()) {
			System.out.println(s + ":" + r.getVerbCounts().get(s));
		}
		System.out.println(r.getVerbCounts().size());
	}

	public static void getCheckedSyllables(String file) {
		new GetSyllablesFromFiles(file).makeGivenSyllableListFromFile();
	}
	
	/*
	 * Returns the percentage of verbs in the corpora that are present in our generated verb list
	 */
	public static void countKnownVerbsInCorpora(){
		VerbsInCorporaStat stat = new VerbsInCorporaStat(resourcesFolder + "\\verbCountsFromCorpora.txt", 
				resourcesFolder + "The Verb Index.csv");
		stat.printStats();
	}
	
	public static void makeBatchFiles(){
		String dir = "C:\\Users\\User\\Desktop\\";
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_GENERATE_NAME, new String[] {HelpFilesStrings.GENERATE_INFLECTIONS_COMMAND, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_SYLLABLE_BY_HEURISTIC_NAME_A, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_A, "words.txt"});
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_SYLLABLE_BY_HEURISTIC_NAME_B, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_HEURISTIC_COMMAND_B, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_A, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_A, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_SYLLABLE_BY_STRING_MATCHING_NAME_B, new String[] {HelpFilesStrings.SYLLABLE_SEGMENTATION_BY_STRING_MATCHING_COMMAND_B, HelpFilesStrings.VERB_INDEX_FILE_NAME});
		HelpFilesGenerator.makebatchFile(dir + HelpFilesStrings.BATCH_ZAMARESHET_NAME, new String[] {HelpFilesStrings.ZAMARESHET_CRAWLER_COMMAND});
		System.out.println("Batch files created on " + dir);
	}
	
	public static void makeReadmeFile(){
		String dir = "C:\\Users\\User\\Desktop\\";
		HelpFilesGenerator.makeReadMeFile(dir + HelpFilesStrings.README_FILE_NAME);
		System.out.println("ReadMe file created on " + dir);
	}
	
	public static void tst(){
		String s ="מַתְּנוֹתֵיכֶן";
		String s2 ="מַתָּנָה";
		VocalizedWord vw = new VocalizedWord(s);
		System.out.println(vw.makeSyllabledWordByBaseForm(new VocalizedWord(s2), new EditDistanceCalculatorForHebrew(-50, -1, 2, 3, 3)).toString());
	}
	
	public static void runTableClassificationExperimentWithBinyanFeature() {
		VerbCSVReader vr = new VerbCSVReader(resourcesFolder
				+ "The Verb Index with no optional tables.csv");
		ExperimentDataContainer edc = new ExperimentDataContainer(0.7,
				vr.getVerbsAndTables());
		BasicAndBinyanFeatureExtractor fe = new BasicAndBinyanFeatureExtractor(1);
		TableClassificationExperiment e = new TableClassificationExperiment(
				edc, fe);
		String folder = experimentOutputFiles + "\\experimentWithBinyanFiles\\";
		e.runExperiment(folder);
	}
	
}
