package Features;

public class BinyanFeature extends Feature{

private String binyan;
	
	public BinyanFeature(String binyan){
		this.binyan = binyan;
	}
	
	public BinyanFeature(BinyanFeature f){
		this.binyan = f.getBinyan();
	}
	
	public String getBinyan(){
		return this.binyan;
	}
	
	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.featureBinyanToken + Feature.featureSpacingToken + this.binyan + additionalString;
	}
	
	protected boolean equalFeature(Feature f){
		return (this.getClass().toString().equals(f.getClass().toString())&&((BinyanFeature)f).getBinyan()==this.binyan);
	}
	
	public double getFeatureWeight(){
		return 1;
	}
}
