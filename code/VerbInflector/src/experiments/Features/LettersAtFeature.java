package Features;

import letters.HebrewLetter;

public class LettersAtFeature extends Feature{

	private int possition;
	private HebrewLetter[] featureLetters;
	
	public LettersAtFeature(LettersAtFeature f){
		this.possition = f.getPossition();
		HebrewLetter[] larr = this.featureLetters;
		HebrewLetter[] larrCopy = new HebrewLetter[larr.length];
		for(int i=0; i<larrCopy.length; i++){
			larrCopy[i] = new HebrewLetter(larr[i]);
		}
	}
	
	public LettersAtFeature(int pos, HebrewLetter[] featureLetters){
		this.possition = pos;
		this.featureLetters = featureLetters;
	}
	
	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.featureAtToken+this.possition+Feature.featureSpacingToken+this.makeLettersString() + additionalString;
	}

	public int getPossition(){
		return this.possition;
	}
	
	public HebrewLetter[] getFeatureLetters(){
		return this.featureLetters;
	}
	
	private String makeLettersString() {
		String ret = new String();
		for(int i=0;i<this.featureLetters.length;i++){
			String spacing = (i==0) ? "" : Feature.featureDelimiterToken;
			ret += spacing+this.featureLetters[i].getLetterName();
		}
		return ret;
	}
	
	protected boolean equalFeature(Feature f){
		return (this.getClass().equals(f.getClass())&&this.toString().equals(f.toString()));
	}
	
	public double getFeatureWeight(){
		return 1;
	}
}
