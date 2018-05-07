package classDistanceMetrices;

import java.util.Arrays;
import java.util.HashMap;

import experimentTypes.ClassificationClassComparable;
import fileWriters.StringFileWriter;

public abstract class ClassDistanceMetric {

	private double[][] _matric;
	private HashMap<String, Integer> _classStringToPosInMatrix;
	private HashMap<Integer, String> _posInMatrixToclassString;
	
	public ClassDistanceMetric(String[] labels){
		int numOfLabels = labels.length;
		this._matric = new double[numOfLabels][numOfLabels];
		this._classStringToPosInMatrix = new HashMap<String, Integer>();
		this._posInMatrixToclassString = new HashMap<Integer, String>();
		for(int i=0; i<numOfLabels; i++){
			this._classStringToPosInMatrix.put(labels[i], i);
			this._posInMatrixToclassString.put(i, labels[i]);
		}
		for(int i=0; i<this._matric.length; i++){
			for(int j=0; j<this._matric[0].length; j++){
				this._matric[i][j] = 1.0;
			}
		}
	}
	
	public void putDistance(String cls1, String cls2, double distance){
		this._matric[this._classStringToPosInMatrix.get(cls1)][this._classStringToPosInMatrix.get(cls2)] = distance;
	}
	
	public double getDistance(String cls1, String cls2){
		int row = this._classStringToPosInMatrix.get(cls1);
		int col = this._classStringToPosInMatrix.get(cls2); 
		return this._matric[row][col];
	}
	
	public String toString(){
		String ret = new String("");
		// the matric printing is sorted by the Strings of the classes
		ClassificationClassComparable[] classStrings = new ClassificationClassComparable[this._matric.length];
		int count = 0;
		for(String s : this._classStringToPosInMatrix.keySet()){
			classStrings[count] = new ClassificationClassComparable(s);
			count++;
		}
		Arrays.sort(classStrings);
		// first row is class names.
		ret += "Labels,";
		for(int i=0; i<classStrings.length; i++){
			ret += classStrings[i].getCls() + ",";
		}
		ret += "\n";
		for(int i=0; i<this._matric.length; i++){
			for(int j=0; j<this._matric[0].length; j++){
				// first column is class names.
				if (j==0){
					ret += classStrings[i].getCls() + ",";
				}
				ret += this._matric[this._classStringToPosInMatrix.get(classStrings[i].getCls())][this._classStringToPosInMatrix.get(classStrings[j].getCls())] + ",";
			}
			ret += "\n";
		}
		return ret;
	}
	
	public void writeMetricToFile(String fileNameAndPath){
		StringFileWriter writer = new StringFileWriter(this.toString());
		writer.writeToFile(fileNameAndPath);
	}
}
