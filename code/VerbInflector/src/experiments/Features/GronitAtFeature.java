package Features;

public class GronitAtFeature extends Feature{

	private int _possition;
	
	public GronitAtFeature(int possition){
		this._possition = possition;
	}
	
	public GronitAtFeature(GronitAtFeature f){
		this._possition = f.getPossition();
	}
	
	public int getPossition(){
		return this._possition;
	}
	
	public String toString(){
		String additionalString = "";
		additionalString = Feature.featureSpacingToken + this.additionalToStringArg;
		return Feature.featureAtToken+this._possition+Feature.featureSpacingToken+Feature.featureGronitToken + additionalString;
	}
	
	protected boolean equalFeature(Feature f){
		return (this.getClass().equals(f.getClass())&&((GronitAtFeature)f).getPossition()==this._possition);
	}
	
	public double getFeatureWeight(){
		return 1;
	}
}