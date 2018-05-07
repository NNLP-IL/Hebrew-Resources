package nonVocalizedWordsFileReader;


import hebrewVerb.VerbInflection;
import hebrewVerb.HebrewVerb.Time;
import hebrewWord.BaseWord;
import hebrewWord.VocalizedWord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import classificationSampleTypes.BaseWordSample;
import classificationSampleTypes.ClassificationSampleIfc;
import letters.HebrewLetter;
import stringTools.EditDistanceCalculator;
import table.Table;
import table.UnknownTableException;
import table.UnknownVerbBaseFormException;
import MyFileReader.MyFileReader;
import a.*;
import b.*;
import c.*;
import d.*;
import e.*;
import f.*;
import g.*;

public class VerbCSVReader extends MyFileReader{

	protected ArrayList<ClassificationSampleIfc> _verbsAndTables;
	
	protected Table[] _a = 
		{new A1(), new A2(),  new A3(),  new A4(),  new A5(),  new A6(),  new A7(),  new A8(),  new A9(),  new A10(), 
		new A11(), new A12(), new A13(), new A14(), new A15(), new A16(), new A17(), new A18(), new A19(), new A20(),
		new A21(), new A22(), new A23(), new A24(), new A25(), new A26(), new A27(), new A28(), new A29(), new A30(),
		new A31(), new A32(), new A33(), new A34(), new A35(), new A36(), new A37(), new A38(), new A39(), new A40(),
		new A41(), new A42(), new A43(), new A44(), new A45(), new A46(), new A47(), new A48(), new A49(), new A50(),
		new A51(), new A52(), new A53(), new A54(), new A55(), new A56(), new A57()};
	protected Table[] _b = 
		{new B1(), new B2(),  new B3(),  new B4(),  new B5(),  new B6(),  new B7(),  new B8(),  new B9(),  new B10(), 
		new B11(), new B12(), new B13(), new B14(), new B15(), new B16(), new B17(), new B18(), new B19(), new B20(),
		new B21(), new B22(), new B23(), new B24(), new B25(), new B26(), new B27(), new B28(), new B29(), new B30(),
		new B31(), new B32(), new B33()};
	protected Table[] _c = 
		{new C1(), new C2(),  new C3(),  new C4(),  new C5(),  new C6(),  new C7(),  new C8(),  new C9(),  new C10(), 
		new C11(), new C12(), new C13(), new C14(), new C15(), new C16(), new C17(), new C18(), new C19(), new C20(),
		new C21(), new C22(), new C23(), new C24(), new C25(), new C26(), new C27(), new C28(), new C29(), new C30()};
	protected Table[] _d = 
		{new D1(), new D2(),  new D3(),  new D4(),  new D5(),  new D6(),  new D7(),  new D8(),  new D9(),  new D10(), 
		new D11(), new D12(), new D13(), new D14(), new D15(), new D16(), new D17(), new D18(), new D19(), new D20(),
		new D21(), new D22()};
	protected Table[] _e = 
		{new E1(), new E2(),  new E3(),  new E4(),  new E5(),  new E6(),  new E7(),  new E8(),  new E9(),  new E10(), 
		new E11(), new E12(), new E13(), new E14(), new E15(), new E16(), new E17(), new E18(), new E19(), new E20(),
		new E21(), new E22(), new E23(), new E24(), new E25(), new E26(), new E27(), new E28(), new E29(), new E30(),
		new E31(), new E32(), new E33(), new E34(), new E35(), new E36(), new E37(), new E38(), new E39(), new E40(),
		new E41(), new E42(), new E43(), new E44(), new E45(), new E46(), new E47(), new E48(), new E49(), new E50(),
		new E51(), new E52(), new E53(), new E54(), new E55(), new E56(), new E57(), new E58(), new E59(), new E60()};
	protected Table[] _f = 
		{new F1(), new F2(),  new F3(),  new F4(),  new F5(),  new F6(),  new F7(),  new F8(),  new F9(),  new F10(), 
		new F11(), new F12(), new F13(), new F14(), new F15(), new F16(), new F17(), new F18(), new F19(), new F20(),
		new F21(), new F22(), new F23(), new F24(), new F25(), new F26(), new F27(), new F28(), new F29(), new F30(),
		new F31(), new F32(), new F33(), new F34(), new F35(), new F36(), new F37(), new F38()};
	protected Table[] _g = 
		{new G1(), new G2(),  new G3(),  new G4(),  new G5(),  new G6(),  new G7(),  new G8(),  new G9(),  new G10(), 
		new G11(), new G12(), new G13(), new G14(), new G15(), new G16(), new G17(), new G18(), new G19(), new G20(),
		new G21(), new G22(), new G23(), new G24()};
	
	public VerbCSVReader(String filePath) {
		try {
			this._verbsAndTables = new ArrayList<ClassificationSampleIfc>();
			String content = MyFileReader.readFileAsString(filePath);
			String[] lines = content.split(this.newLine);
			for (int i=0; i<lines.length;i++){
				String[] line = lines[i].split(",");
				HebrewLetter[] word = this.lettersToArray(line[0]);
				if ((line.length == 3)||(line.length == 5)){
					try {
						this.addWordToTable(word,line[1],(new Integer(line[2])).intValue());
						BaseWordSample bwCont = new BaseWordSample(
								new String(line[1]+line[2]),
								new BaseWord(word),
								this.tableStringToTable(line[1]+line[2]));
						this._verbsAndTables.add(bwCont);
					} catch (NumberFormatException e) {
						System.out.println("On line "+i+" after the second colomn there in no numeric symbol.");
						e.printStackTrace();
					} catch (UnknownTableException e) {
						System.out.println("On line "+i+", no such table: "+line[1]+"-"+line[2]);
						e.printStackTrace();
					}
				}
				else{
					System.out.println("ERROR: incorrect file format, line "+i);
					return;
				}
				if (line.length == 5){
					try {
						this.addWordToTable(word,line[3],(new Integer(line[4])).intValue());
						BaseWordSample bwCont = new BaseWordSample(
								new String(line[3]+line[4]),
								new BaseWord(word), 
								this.tableStringToTable(line[3]+line[4]));
						this._verbsAndTables.add(bwCont);
					} catch (NumberFormatException e) {
						System.out.println("On line "+i+" after the second colomn there in no numeric symbol.");
						e.printStackTrace();
					} catch (UnknownTableException e) {
						System.out.println("On line "+i+", no such table: "+line[1]+"-"+line[2]);
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<ClassificationSampleIfc> getVerbsAndTables(){
		return this._verbsAndTables;
	}
	
	private void addWordToTable(HebrewLetter[] word,String tableName, int tableNumber) throws UnknownTableException{
		if(tableName.equals("A")&&this.between(tableNumber,1,57)){
			this._a[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("B")&&this.between(tableNumber,1,33)){
			this._b[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("C")&&this.between(tableNumber,1,30)){
			this._c[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("D")&&this.between(tableNumber,1,22)){
			this._d[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("E")&&this.between(tableNumber,1,60)){
			this._e[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("F")&&this.between(tableNumber,1,38)){
			this._f[tableNumber-1].addToBaseVerbs(word);
		}
		else if(tableName.equals("G")&&this.between(tableNumber,1,24)){
			this._g[tableNumber-1].addToBaseVerbs(word);
		}
		else{
			throw new UnknownTableException(word,tableName,tableNumber);
		}
	}
	
	private boolean between(int num, int low, int high){
		return (num>=low)&&(num<=high);
	}
	
	/* Builds the toString for an entire BINYAN
	 * e.g. Table:A
	 * 		Table Number:1
	 * 			All inflections of words in A1 
	 */
	private StringBuilder binyanString(String letter, Table[] tables){
		StringBuilder res = new StringBuilder("");
		System.out.println("Starting "+letter);
		res.append("Table: "+letter+"\n\n");
		for(int i=0;i<tables.length;i++){
			System.out.print(i+",");
			res.append("Table Number:"+(i+1)+"\n\n");
			tables[i].inflectVerbs();
			res.append(tables[i].toString());
		}
		System.out.println();
		return res;
	}
	
	/* Builds the Extended toString for an entire BINYAN
	 * e.g. A,1,inflection,morphology,baseform 
	 */
	private StringBuilder binyanExtendedString(String letter, Table[] tables){
		StringBuilder res = new StringBuilder("");
		System.out.println("Starting "+letter);
		for(int i=0;i<tables.length;i++){
			System.out.print(i+",");
			tables[i].inflectVerbs();
			res.append(tables[i].toStringExtended());
		}
		System.out.println();
		return res;
	}
	
	// Builds the syllable toString for an entire BINYAN by huristic
	private StringBuilder tableSyllableStringbyHuristic(String letter,Table[] tables){
		StringBuilder res = new StringBuilder("");
		System.out.println("Starting "+letter);
		for(int i=0;i<tables.length;i++){
			System.out.print(i+",");
			tables[i].inflectVerbs();
			ArrayList<ArrayList<VerbInflection>> inflx = tables[i].getInflections();
			for(ArrayList<VerbInflection> l:inflx){
				for(VerbInflection inf:l){
					if(!inf.getTime().equals(Time.INFINITIVE)){
						res.append((new VocalizedWord(inf)).makeSyllabledWordByHuristic().toString()+"\n");
					}else{
						// Infinitive is treated as a noun - needed a corresponding base form
					}
				}
			}
		}
		System.out.println();
		return res;
	}
	
	// Builds the syllable toString for an entire BINYAN by BaseForm
	private StringBuilder tableSyllableStringByBaseForm(String letter,Table[] tables,EditDistanceCalculator calc){
		StringBuilder res = new StringBuilder("");
		System.out.println("Starting "+letter);
		for(int i=0;i<tables.length;i++){
			System.out.print(i+",");
			tables[i].inflectVerbs();
			ArrayList<ArrayList<VerbInflection>> inflx = tables[i].getInflections();
			for(ArrayList<VerbInflection> l:inflx){
				for(VerbInflection inf:l){
					try {
						if(!inf.getTime().equals(Time.INFINITIVE)){
							res.append((new VocalizedWord(inf)).makeSyllabledWordByBaseForm(new VocalizedWord(tables[i].getBaseFormInflection(inf)), calc).toString()+"\n");
						}
						else{
							// Infinitive is treated as a noun - needed a corresponding base form
						}
						
					} catch (UnknownVerbBaseFormException e) {
						// The given word is not a verb. 
					}
				}
			}
		}
		System.out.println();
		return res;
	}
	
	// toString of all inflections of every word in every BINYAN
	public String toString(){
		StringBuilder res = new StringBuilder("");
		res.append(binyanString("A", this._a));
		res.append(binyanString("B", this._b));
		res.append(binyanString("C", this._c));
		res.append(binyanString("D", this._d));
		res.append(binyanString("E", this._e));
		res.append(binyanString("F", this._f));
		res.append(binyanString("G", this._g));
		return res.toString();
	}
	
	public String toStringExtended(){
		StringBuilder res = new StringBuilder("");
		res.append(binyanExtendedString("A", this._a));
		res.append(binyanExtendedString("B", this._b));
		res.append(binyanExtendedString("C", this._c));
		res.append(binyanExtendedString("D", this._d));
		res.append(binyanExtendedString("E", this._e));
		res.append(binyanExtendedString("F", this._f));
		res.append(binyanExtendedString("G", this._g));
		return res.toString();
	}
	
	
	// toString of all syllabled inflections of every word in every BINYAN  by huristic
	public String huristicSyllableToString(){
		StringBuilder res = new StringBuilder("");
		res.append(this.tableSyllableStringbyHuristic("A",this._a));
		res.append(this.tableSyllableStringbyHuristic("B",this._b));
		res.append(this.tableSyllableStringbyHuristic("C",this._c));
		res.append(this.tableSyllableStringbyHuristic("D",this._d));
		res.append(this.tableSyllableStringbyHuristic("E",this._e));
		res.append(this.tableSyllableStringbyHuristic("F",this._f));
		res.append(this.tableSyllableStringbyHuristic("G",this._g));
		return res.toString();
	}
	
	// toString of all syllabled inflections of every word in every BINYAN  by BaseForm
	public String baseFormSyllableToString(EditDistanceCalculator calc){
		StringBuilder res = new StringBuilder("");
		res.append(this.tableSyllableStringByBaseForm("A",this._a,calc));
		res.append(this.tableSyllableStringByBaseForm("B",this._b,calc));
		res.append(this.tableSyllableStringByBaseForm("C",this._c,calc));
		res.append(this.tableSyllableStringByBaseForm("D",this._d,calc));
		res.append(this.tableSyllableStringByBaseForm("E",this._e,calc));
		res.append(this.tableSyllableStringByBaseForm("F",this._f,calc));
		res.append(this.tableSyllableStringByBaseForm("G",this._g,calc));
		return res.toString();
	}
	
	/*public String baseFormSyllableToString(EditDistanceCalculator calc){
		String res = new String("");
		res+=this.tableSyllableStringByBaseForm("A",this._a,calc);
		res+=this.tableSyllableStringByBaseForm("B",this._b,calc);
		res+=this.tableSyllableStringByBaseForm("C",this._c,calc);
		res+=this.tableSyllableStringByBaseForm("D",this._d,calc);
		res+=this.tableSyllableStringByBaseForm("E",this._e,calc);
		res+=this.tableSyllableStringByBaseForm("F",this._f,calc);
		res+=this.tableSyllableStringByBaseForm("G",this._g,calc);
		return res;
	}*/
	
	private Table tableStringToTable(String tableString){
		String binyan = tableString.substring(0, 1); 
		int tableNumber = Integer.parseInt(tableString.substring(1))-1;
		if(binyan.equals("A")){
			return this._a[tableNumber];
		}else if(binyan.equals("B")){
			return this._b[tableNumber];
		}else if(binyan.equals("C")){
			return this._c[tableNumber];
		}else if(binyan.equals("D")){
			return this._d[tableNumber];
		}else if(binyan.equals("E")){
			return this._e[tableNumber];
		}else if(binyan.equals("F")){
			return this._f[tableNumber];
		}else if(binyan.equals("G")){
			return this._g[tableNumber];
		} else{
			UnknownTableException e = new UnknownTableException(binyan,tableNumber+1);
			e.printStackTrace();
			return null;
		}
	}
	
	public int[] getTablesCountForEachBINYAN(){
		int[] sizes= new int[7];
		sizes[0] = this._a.length;
		sizes[1] = this._b.length;
		sizes[2] = this._c.length;
		sizes[3] = this._d.length;
		sizes[4] = this._e.length;
		sizes[5] = this._f.length;
		sizes[6] = this._g.length;
		return  sizes;
	}
}
