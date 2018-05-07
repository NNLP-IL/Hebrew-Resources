package Features;

public class WordSizeFeature extends Feature{

	private int size;
	
	public WordSizeFeature(int size){
		this.size = size;
	}
	
	public WordSizeFeature(WordSizeFeature f){
		this.size = f.getSize();
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.featureWordSizeToken + Feature.featureSpacingToken+this.size + additionalString;
	}
	
	protected boolean equalFeature(Feature f){
		return (this.getClass().toString().equals(f.getClass().toString())&&((WordSizeFeature)f).getSize()==this.size);
	}
	
	public double getFeatureWeight(){
		return 1;
	}
}
