package Features;

public class UnseenFeature extends Feature{
	
	public UnseenFeature(){
		
	}

	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.featureUnseenToken + additionalString;
	}
	
	protected boolean equalFeature(Feature f){
		return f.getClass().equals(this.getClass());
	}
	
	public double getFeatureWeight(){
		return 1;
	}
}
