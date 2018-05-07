package Features;

public abstract class Feature {

	protected static String featureAtToken = "AT_";
	protected static String featureWordSizeToken = "WORD_SIZE";
	protected static String featureBinyanToken = "BINYAN";
	protected static String featureGronitToken = "GRONIT";
	protected static String featureSpacingToken = "__";
	protected static String featureDelimiterToken = "&";
	protected static String featureUnseenToken = "UNSEEN";
	protected static String inflectionsCountForTable = "TABLE";
	
	protected String additionalToStringArg = "";
	
	public boolean isUnseenFeature(){
		return false;
	}

	protected abstract boolean equalFeature(Feature f);
	
	public boolean equals(Object f){
		return f.getClass().equals(this.getClass())&&equalFeature((Feature)f);
	}
	
	public abstract double getFeatureWeight();
	
	public void setAdditionalToStriongArg(String arg){
		this.additionalToStringArg += arg;
	}
}
