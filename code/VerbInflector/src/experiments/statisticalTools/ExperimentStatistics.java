package statisticalTools;

import java.util.Arrays;

public class ExperimentStatistics {
	private ConfusionMatrix _cMat;
	private double _accuracy;
	private int _totalNumberOfSamples;
	private int _totalNumberOfHits;
	private int _totalNumberOfMistakes;
	private int _numberOfClasses;
	private StrStrIntContainer[] _mistakes;
	private StrIntContainer[] _mistakesPerClass;


	public ExperimentStatistics(ConfusionMatrix cMat,int spcificMistakesMax){
		this._cMat = cMat;
		this._accuracy = cMat.getAccuracy();
		this._totalNumberOfSamples = cMat.getTotalNumberOfSamples();
		this._totalNumberOfHits = cMat.getTotalNumberOfHits();
		this._totalNumberOfMistakes = cMat.getTotalNumberOfMistakes();
		this._numberOfClasses = cMat.getNumberOfClasses();
		System.out.println("# of classes in conf mat: " + this._numberOfClasses);
		this._mistakes = new StrStrIntContainer[this._numberOfClasses*this._numberOfClasses-this._numberOfClasses];
		int pos = 0;
		for(Integer i : cMat.getClassNumToClassString().keySet()){
			for(Integer j : cMat.getClassNumToClassString().keySet()){
				if(i!=j){
					this._mistakes[pos] = new StrStrIntContainer(cMat.getClassNumToClassString().get(i), 
							cMat.getClassNumToClassString().get(j),
							cMat.getMistakes(i, j));
					pos++;
				}
			}
		}
		Arrays.sort(this._mistakes);
		this._mistakesPerClass = new StrIntContainer[cMat.getClassNumToClassString().size()];
		pos = 0;
		for(Integer i : cMat.getClassNumToClassString().keySet()){
			this._mistakesPerClass[pos] = new StrIntContainer(cMat.getClassNumToClassString().get(i),cMat.getMistakesForClass(i));
			pos++;
		}
		Arrays.sort(this._mistakesPerClass);
	}


	public String statisticsString(int numberOfTopMistakesShown){
		String ret = new String("");
		// Accuracy
		ret += "Accuracy: \t" + this._accuracy + "\t" + this.xOutOfyString(this._totalNumberOfHits, this._totalNumberOfSamples) + ")\n";

		// Top Mistakes
		if(this._mistakes[this._mistakes.length-1].getMistakes()>0){
			ret += "Top Mistakes: " + "\n";
			for(int i=0; i<numberOfTopMistakesShown; i++){
				int topPos = this._mistakes.length - i - 1;
				if(topPos>=0 && this._mistakes[topPos].getMistakes()>0){
					String times = this._mistakes[topPos].getMistakes()==1 ? "time" : "times"; 
					ret += "\t\t\tClass " + this._mistakes[topPos].getTrueClass() + " was classified as class " + this._mistakes[topPos].getClassedClass() + " " + this._mistakes[topPos].getMistakes() + " " + times + "\n";
				}
			}
		}

		// Most mistakes for class
		if(this._mistakesPerClass[this._mistakesPerClass.length-1].getNum()>0){
			ret += "Most Mistakes For Class: " + "\n";
			for(int i=0; i<Math.min(this._mistakesPerClass.length, numberOfTopMistakesShown); i++){
				int topPos = this._mistakesPerClass.length - i - 1;
				if(this._mistakesPerClass[topPos].getNum()>0){
					String cls = this._mistakesPerClass[topPos].getStr();
					int mistakes = this._mistakesPerClass[topPos].getNum();
					int hits = this._cMat.getHitsForClass(this._mistakesPerClass[topPos].getStr());
					int total = this._cMat.getTotalForClass(this._mistakesPerClass[topPos].getStr());
					ret += "\t\t\t" + cls + ": " + mistakes + " " + this.xOutOfyString(hits, total) + "\n"; 
				}
			}
		}
		return ret;
	}

	public double getAccuracy() {
		return _accuracy;
	}


	public int getTotalNumberOfSamples() {
		return _totalNumberOfSamples;
	}


	public int getTotalNumberOfHits() {
		return _totalNumberOfHits;
	}


	public int getTotalNumberOfMistakes() {
		return _totalNumberOfMistakes;
	}


	public int getNumberOfClasses() {
		return _numberOfClasses;
	}
	
	private String xOutOfyString(int x, int y){
		return "("+x+"/"+y+")";
	}
	
	private class StrIntContainer implements Comparable<StrIntContainer>{
		private String _str;
		private int _num;

		public StrIntContainer(String str, int num){
			this._str = str;
			this._num = num;
		}

		public String getStr(){
			return this._str;
		}

		public int getNum(){
			return this._num;
		}

		public int compareTo(StrIntContainer other){
			if(this._num > other.getNum()) {
				return 1;
			} else if(this._num == other.getNum()){
				return 0;
			} else{
				return -1;
			}
		}
	}

	private class StrStrIntContainer implements Comparable<StrStrIntContainer>{
		private String _trueCls;
		private String _classedCls;
		private int _mistakes;

		public StrStrIntContainer(String trueCls, String classedCls, int mistakes){
			this._trueCls = trueCls;
			this._classedCls = classedCls;
			this._mistakes = mistakes;
		}

		public String getTrueClass(){
			return this._trueCls;
		}

		public String getClassedClass(){
			return this._classedCls;
		}

		public int getMistakes(){
			return this._mistakes;
		}

		public int compareTo(StrStrIntContainer other){
			if(this._mistakes > other.getMistakes()) {
				return 1;
			} else if(this._mistakes == other.getMistakes()){
				return 0;
			} else{
				return -1;
			}
		}
	}
}
