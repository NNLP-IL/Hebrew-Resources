package statisticalTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import experimentTypes.ClassificationClassComparable;

/**
 * 
 * @author ערן
 * This object represents a confusion matrix. The rows represent the TRUE labeling
 * and the columns represent the classifier's out label.
 */
public class ConfusionMatrix {

	protected int[][] _m;
	protected int _totalNumberOfSamples;
	protected int _totalNumberOfMistakes;
	protected int _totalNumberOfHits;
	protected HashMap<Integer, String> _classNumToClassString;
	protected HashMap<String, Integer> _classStringToclassNum;
	protected HashMap<Integer, Integer> _PosInMatrixToclassNumber;
	protected HashMap<Integer, Integer> _classNumberToPosInMatrix;
	protected int[] _trueLabeling; 
	protected int[] _classificationOutLabeling;
	protected Histogram _classMistakesHistogram;

	public ConfusionMatrix(int[] trueLabeling, int[] classificationOutLabeling,
			HashMap<Integer, String> classNumToClassString, HashMap<String, Integer> classStringToclassNum){
		this._classNumToClassString = classNumToClassString;
		this._classStringToclassNum = classStringToclassNum;
		this._totalNumberOfSamples = trueLabeling.length;
		this._totalNumberOfMistakes = 0;
		this._totalNumberOfHits = 0;
		this._trueLabeling = new int[this._totalNumberOfSamples];
		this._classificationOutLabeling = new int[this._totalNumberOfSamples];
		// Init true and classification labels.
		for (int i=0; i<this._totalNumberOfSamples; i++){
			this._trueLabeling[i] = trueLabeling[i];
			this._classificationOutLabeling[i] = classificationOutLabeling[i];
		}
		// Init Confusion Matrix to 0.
		int numberOfClasses = this._classNumToClassString.size();
		this._m = new int[numberOfClasses][numberOfClasses];
		for(int i=0; i<this._m.length; i++){
			for(int j=0; j<this._m[0].length; j++){
				this._m[i][j] = 0;
			}
		}
		// Filling Hash pos-in-confusion-matrix <-> feature-String
		int[] classNumbers = new int[this._classNumToClassString.size()];
		int count = 0;
		for(Integer i : this._classNumToClassString.keySet()){
			classNumbers[count] = i.intValue();
			count++;
		}
		Arrays.sort(classNumbers);
		this._PosInMatrixToclassNumber = new HashMap<Integer, Integer>();
		this._classNumberToPosInMatrix = new HashMap<Integer, Integer>();
		for(int i=0; i<classNumbers.length; i++){
			this._PosInMatrixToclassNumber.put(i, classNumbers[i]);
			this._classNumberToPosInMatrix.put(classNumbers[i], i);
		}

		// Filling Confusion Matrix with values.
		for(int i=0; i<this._trueLabeling.length; i++){
			int trueLabel = this._trueLabeling[i];
			int classificationLabel = this._classificationOutLabeling[i];
			this._m[this._classNumberToPosInMatrix.get(trueLabel)][this._classNumberToPosInMatrix.get(classificationLabel)]++;
			if (trueLabel == classificationLabel){
				this._totalNumberOfHits++;
			} else{
				this._totalNumberOfMistakes++;
			}
		}

		// Filling Mistakes Histogram
		this._classMistakesHistogram = new Histogram(new ArrayList<String>());
		for(int i=0; i<this._m.length; i++){
			String clsStr = this._classNumToClassString.get(this._PosInMatrixToclassNumber.get(i));
			this._classMistakesHistogram.add(clsStr,this.getMistakesForRow(i));
		}
	}

	public double getAccuracy(){
		if(this._totalNumberOfSamples==0){
			System.out.println("No Samples!!");
			return 0;
		}
		return (double)this._totalNumberOfHits/(double)this._totalNumberOfSamples;
	}

	public int getTotalNumberOfSamples(){
		return this._totalNumberOfSamples;
	}
	
	public int getTotalNumberOfMistakes(){
		return this._totalNumberOfMistakes;
	}
	
	public int getTotalNumberOfHits(){
		return this._totalNumberOfHits;
	}

	public int getTotalForClass(int cls){
		int row = this._classNumberToPosInMatrix.get(cls);
		return this.getTotalForRow(row);
	}
	
	public int getTotalForClass(String cls){
		int row = this._classNumberToPosInMatrix.get(this._classStringToclassNum.get(cls));
		return this.getTotalForRow(row);
	}

	protected int getTotalForRow(int row){
		int totalInClass = 0;
		for (int i=0; i<this._m[row].length; i++){
			totalInClass += this._m[row][i];
		}
		return totalInClass;
	}

	public int getHitsForClass(int cls){
		int row = this._classNumberToPosInMatrix.get(cls);
		return this.getHitsForRow(row);
	}
	
	public int getHitsForClass(String cls){
		int row = this._classNumberToPosInMatrix.get(this._classStringToclassNum.get(cls));
		return this.getHitsForRow(row);
	}

	protected int getHitsForRow(int row){
		return this._m[row][row];
	}

	public int getMistakesForClass(int cls){
		int row = this._classNumberToPosInMatrix.get(cls);
		return this.getMistakesForRow(row);
	}

	protected int getMistakesForRow(int row){
		int totalInClass = 0;
		for (int i=0; i<this._m[row].length; i++){
			totalInClass += this._m[row][i];
		}
		return totalInClass-this._m[row][row];
	}
	
	public int getMistakes(int trueClass, int classifiedClass){
		return this._m[this._classNumberToPosInMatrix.get(trueClass)][this._classNumberToPosInMatrix.get(classifiedClass)];
	}

	public double getAccuracyForClass(int cls){
		int row = this._classNumberToPosInMatrix.get(cls);
		return this.getAccuracyForRow(row);
	}

	protected double getAccuracyForRow(int row){
		return this.getHitsForRow(row)/this.getTotalForRow(row);
	}

	public Histogram getMistakesHistogram(){
		return this._classMistakesHistogram;
	}
	
	public int getNumberOfClasses(){
		return this._classNumToClassString.size();
	}
	
	public HashMap<Integer, String> getClassNumToClassString(){
		return this._classNumToClassString;
	}
	
	public HashMap<String, Integer> getClassStringToClassNum(){
		return this._classStringToclassNum;
	}

	public String toString(){
		String ret = new String("");
		// the matrix printing is sorted by the Strings of the classes
		ClassificationClassComparable[] classStrings = new ClassificationClassComparable[this._classNumToClassString.size()];
		int count = 0;
		for(String s : this._classNumToClassString.values()){
			classStrings[count] = new ClassificationClassComparable(s);
			count++;
		}
		Arrays.sort(classStrings);
		int[] classNumbers = new int[classStrings.length];
		for (int i=0; i<classStrings.length; i++){
			classNumbers[i] = this._classStringToclassNum.get(classStrings[i].getCls());
		}
		// first row is class names.
		ret += "\t";
		for(int i=0; i<classNumbers.length; i++){
			ret += classStrings[i].getCls() + "\t";
		}
		ret += "\n";
		for(int i=0; i<this._m.length; i++){
			for(int j=0; j<this._m[0].length; j++){
				// first column is class names.
				if (j==0){
					ret += classStrings[i].getCls() + "\t";
				}
				ret += this._m[this._classNumberToPosInMatrix.get(classNumbers[i])][this._classNumberToPosInMatrix.get(classNumbers[j])] + "\t";
			}
			ret += "\n";
		}
		return ret;
	}
}
