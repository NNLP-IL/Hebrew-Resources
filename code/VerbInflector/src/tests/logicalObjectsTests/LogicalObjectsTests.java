package logicalObjectsTests;

import hebrewWord.BaseWord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Features.Feature;
import Features.GronitAtFeature;
import Features.LettersAtFeature;
import Features.WordSizeFeature;
import a.A22;
import classificationSampleTypes.BaseWordSample;
import featureExtraction.BasicFeatureExtractor;
import statisticalTools.ConfusionMatrix;
import statisticalTools.Histogram;
import stringTools.EditDistanceCalculator;
import stringTools.EditDistanceCalculatorForHebrew;
import stringTools.EditDistanceCalculatorForTableMetric;
import junit.framework.TestCase;
import letters.HebrewLetter;
import letters.Het;
import letters.Peh;
import letters.Reish;

public class LogicalObjectsTests extends TestCase{

	public LogicalObjectsTests(String name) {
		super(name);
	}
	
	public void testConfusionMatrix(){
		int[] trueLabels = {1,1,1,3,2};
		int[] classificationOutLabels = {1,1,3,2,2};
		HashMap<Integer, String> clsToStr = new HashMap<Integer, String>();
		HashMap<String, Integer> strTocls = new HashMap<String, Integer>();
		clsToStr.put(1, "A10"); clsToStr.put(2, "A1B"); clsToStr.put(3, "A2");
		strTocls.put("A10", 1); strTocls.put("A1B", 2); strTocls.put("A2", 3);
		ConfusionMatrix cMat = new ConfusionMatrix(trueLabels,classificationOutLabels,clsToStr,strTocls);
		assertEquals(cMat.getTotalNumberOfSamples(), 5);
		assertEquals(cMat.getAccuracy(), 0.6);
		assertEquals(cMat.getAccuracyForClass(2), 1.0);
		assertEquals(cMat.getAccuracyForClass(3), 0.0);
		assertEquals(cMat.getHitsForClass(2), 1);
		assertEquals(cMat.getMistakesForClass(1), 1);
		String toStr = "\tA1B\tA2\tA10\t\nA1B\t1\t0\t0\t\nA2\t1\t0\t0\t\nA10\t0\t1\t2\t\n";
		assertEquals(toStr, cMat.toString());
	}
	
	public void testHistogram(){
		Histogram h = new Histogram(new ArrayList<String>());
		h.add("One", 4);
		h.addOne("Two");
		assertEquals(0.8, h.getClassProbibility("One"));
		h.add("Two", 5);
		assertEquals(0.4, h.getClassProbibility("One"));
		assertEquals(0.6, h.getClassProbibility("Two"));
	}
	
	public void testEditDistance(){
		EditDistanceCalculator edc = new EditDistanceCalculatorForHebrew(-50,-1,2,3,3);
		edc.calc(new String("נשב"), new String("ישבנו"));
		assertEquals("נשב00", edc.getXAliignment());
		assertEquals("ישבנו", edc.getYAliignment());
		assertEquals(-92, edc.getEditDistance());
	}
	
	public void testFeatureExtractor(){
		BasicFeatureExtractor fe = new BasicFeatureExtractor(2);
		HebrewLetter[] bwArr = {new Peh(), new Reish(), new Het()};		//	SHAFACH  //
		BaseWordSample bw = new BaseWordSample("Test Table", new BaseWord(bwArr), new A22());
		List<Feature> features = new ArrayList<Feature>();
		features.add(new WordSizeFeature(3));
		features.add(new GronitAtFeature(1)); features.add(new GronitAtFeature(2));
		features.add(new LettersAtFeature(0,new HebrewLetter[] {new Peh()}));
		features.add(new LettersAtFeature(1,new HebrewLetter[] {new Reish()}));
		features.add(new LettersAtFeature(2,new HebrewLetter[] {new Het()}));
		features.add(new LettersAtFeature(0,new HebrewLetter[] {new Peh(),new Reish()}));
		features.add(new LettersAtFeature(1,new HebrewLetter[] {new Reish(),new Het()}));
		assertTrue(fe.getWordFeatures(bw).containsAll(features));
		assertTrue(features.containsAll(fe.getWordFeatures(bw)));
	}
	
	public void testEditDistanceCalculatorForTableMetric(){
		EditDistanceCalculatorForTableMetric edc = new EditDistanceCalculatorForTableMetric(0, 1, 3, 4, 4);
		assertEquals(5, edc.calc("נִבַּבֳת", "נִיבַּבְת"));
		System.out.println(edc.getXAliignment());
		assertEquals("נִ0בַּבֳת", edc.getXAliignment());
		assertEquals(5, edc.calc("נִיבַּבְת","נִבַּבֳת"));
	}
}
