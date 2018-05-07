package tablesManegment;

import java.util.ArrayList;
import java.util.List;

import table.Table;
import a.*;
import b.*;
import c.*;
import d.*;
import e.*;
import f.*;
import g.*;


public class TableGetter {

	protected static String[] _aNames = 
	{"A1", "A2",  "A3",  "A4",  "A5",  "A6",  "A7",  "A8",  "A9",  "A10", 
		"A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20",
		"A21", "A22", "A23", "A24", "A25", "A26", "A27", "A28", "A29", "A30",
		"A31", "A32", "A33", "A34", "A35", "A36", "A37", "A38", "A39", "A40",
		"A41", "A42", "A43", "A44", "A45", "A46", "A47", "A48", "A49", "A50",
		"A51", "A52", "A53", "A54", "A55", "A56", "A57"};
	protected static String[] _bNames = 
	{"B1", "B2",  "B3",  "B4",  "B5",  "B6",  "B7",  "B8",  "B9",  "B10", 
		"B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20",
		"B21", "B22", "B23", "B24", "B25", "B26", "B27", "B28", "B29", "B30",
		"B31", "B32", "B33"};
	protected static String[] _cNames = 
	{"C1", "C2",  "C3",  "C4",  "C5",  "C6",  "C7",  "C8",  "C9",  "C10", 
		"C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20",
		"C21", "C22", "C23", "C24", "C25", "C26", "C27", "C28", "C29", "C30"};
	protected static String[] _dNames = 
	{"D1", "D2",  "D3",  "D4",  "D5",  "D6",  "D7",  "D8",  "D9",  "D10", 
		"D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20",
		"D21", "D22"};
	protected static String[] _eNames = 
	{"E1", "E2",  "E3",  "E4",  "E5",  "E6",  "E7",  "E8",  "E9",  "E10", 
		"E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20",
		"E21", "E22", "E23", "E24", "E25", "E26", "E27", "E28", "E29", "E30",
		"E31", "E32", "E33", "E34", "E35", "E36", "E37", "E38", "E39", "E40",
		"E41", "E42", "E43", "E44", "E45", "E46", "E47", "E48", "E49", "E50",
		"E51", "E52", "E53", "E54", "E55", "E56", "E57", "E58", "E59", "E60"};
	protected static String[] _fNames = 
	{"F1", "F2",  "F3",  "F4",  "F5",  "F6",  "F7",  "F8",  "F9",  "F10", 
		"F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20",
		"F21", "F22", "F23", "F24", "F25", "F26", "F27", "F28", "F29", "F30",
		"F31", "F32", "F33", "F34", "F35", "F36", "F37", "F38"};
	protected static String[] _gNames = 
	{"G1", "G2",  "G3",  "G4",  "G5",  "G6",  "G7",  "G8",  "G9",  "G10", 
		"G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20",
		"G21", "G22", "G23", "G24"};

	protected static int[] _aBaseWordSize = 
	{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
		3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
		3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
		3, 3, 3, 3, 2, 2, 2, 3, 2, 2,
		3, 3, 3, 3, 3, 3, 2, 3, 3, 3,
		3, 3, 3, 3, 3, 3, 2};
	protected static int[] _bBaseWordSize = 
	{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
		4, 3, 3, 3, 4, 4, 4, 4, 4, 4,
		4, 3, 4, 4, 4, 3, 4, 4, 4, 4,
		4, 4, 4};
	protected static int[] _cBaseWordSize = 
	{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
		3, 4, 4, 4, 4, 3, 3, 3, 3, 4,
		4, 4, 4, 4, 4, 4, 4, 4, 5, 5};
	protected static int[] _dBaseWordSize = 
	{3, 3, 3, 3, 3, 3, 3,  4,  3,  3, 
		3, 3, 3, 4, 4, 4, 4, 4, 4, 4,
		4, 5};
	protected static int[] _eBaseWordSize = 
	{5, 5,  5,  5,  5,  5,  5,  5,  5,  5, 
		5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
		5, 5, 5, 6, 6, 6, 6, 6, 5, 5,
		5, 5, 5, 5, 5, 5, 5, 5, 5, 4,
		4, 4, 6, 6, 6, 6, 6, 6, 6, 6,
		6, 6, 6, 6, 6, 6, 6, 5, 7, 5};
	protected static int[] _fBaseWordSize = 
	{5, 5,  5,  5,  5,  5,  5,  5,  4,  4, 
		4, 4, 5, 5, 5, 4, 4, 4, 4, 4,
		3, 3, 3, 3, 3, 5, 5, 5, 4, 5,
		4, 4, 4, 4, 4, 3, 4, 6};
	protected static int[] _gBaseWordSize = 
	{4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 
		3, 3, 4, 4, 4, 4, 4, 4, 4, 4,
		4, 4, 3, 4};

	public static List<Table[]> getNewBinyanimTables(){
		List<Table[]> ret = new ArrayList<Table[]>();

		ret.add(TableGetter.getBinyanA());
		ret.add(TableGetter.getBinyanB());
		ret.add(TableGetter.getBinyanC());
		ret.add(TableGetter.getBinyanD());
		ret.add(TableGetter.getBinyanE());
		ret.add(TableGetter.getBinyanF());
		ret.add(TableGetter.getBinyanG());
		return ret;
	}

	public static List<String[]> getBinyanimTableNames(){
		List<String[]> ret = new ArrayList<String[]>();
		ret.add(TableGetter._aNames);
		ret.add(TableGetter._bNames);
		ret.add(TableGetter._cNames);
		ret.add(TableGetter._dNames);
		ret.add(TableGetter._eNames);
		ret.add(TableGetter._fNames);
		ret.add(TableGetter._gNames);
		return ret;
	}

	public static String[] getFlatBinyanimTableNames(){
		List<String[]> allTableNames = TableGetter.getBinyanimTableNames();
		int totalNumberOfTables = 0;
		for(String[] binyan : allTableNames){
			totalNumberOfTables += binyan.length;
		}
		String[] ret = new String[totalNumberOfTables];
		int pos = 0;
		for(String[] binyan : allTableNames){
			for(int i=0; i<binyan.length; i++){
				ret[pos] = binyan[i];
				pos++;
			}
		}
		return ret;
	}

	public static List<int[]> getBinyanimTablesBaseWordLength(){
		List<int[]> ret = new ArrayList<int[]>();
		ret.add(TableGetter._aBaseWordSize);
		ret.add(TableGetter._bBaseWordSize);
		ret.add(TableGetter._cBaseWordSize);
		ret.add(TableGetter._dBaseWordSize);
		ret.add(TableGetter._eBaseWordSize);
		ret.add(TableGetter._fBaseWordSize);
		ret.add(TableGetter._gBaseWordSize);
		return ret;
	}

	public static Table getNewTableFromTableName(String tableName){
		String binyan = tableName.substring(0, 1);
		int tableNum = Integer.parseInt(tableName.substring(1))-1;
		if (binyan.equals("A")){
			return TableGetter.getBinyanA()[tableNum];
		} else if(binyan.equals("B")){
			return TableGetter.getBinyanB()[tableNum];
		} else if(binyan.equals("C")){
			return TableGetter.getBinyanC()[tableNum];
		} else if(binyan.equals("D")){
			return TableGetter.getBinyanD()[tableNum];
		} else if(binyan.equals("E")){
			return TableGetter.getBinyanE()[tableNum];
		} else if(binyan.equals("F")){
			return TableGetter.getBinyanF()[tableNum];
		} else if(binyan.equals("G")){
			return TableGetter.getBinyanG()[tableNum];
		} else {
			System.out.println("Unknown Table: " + tableName);
			return null;
		}
	}

	public static Table[] getBinyanA(){
		Table[] a = 
		{new A1(), new A2(),  new A3(),  new A4(),  new A5(),  new A6(),  new A7(),  new A8(),  new A9(),  new A10(), 
				new A11(), new A12(), new A13(), new A14(), new A15(), new A16(), new A17(), new A18(), new A19(), new A20(),
				new A21(), new A22(), new A23(), new A24(), new A25(), new A26(), new A27(), new A28(), new A29(), new A30(),
				new A31(), new A32(), new A33(), new A34(), new A35(), new A36(), new A37(), new A38(), new A39(), new A40(),
				new A41(), new A42(), new A43(), new A44(), new A45(), new A46(), new A47(), new A48(), new A49(), new A50(),
				new A51(), new A52(), new A53(), new A54(), new A55(), new A56(), new A57()};
		return a;
	}

	public static Table[] getBinyanB(){
		Table[] b = 
		{new B1(), new B2(),  new B3(),  new B4(),  new B5(),  new B6(),  new B7(),  new B8(),  new B9(),  new B10(), 
				new B11(), new B12(), new B13(), new B14(), new B15(), new B16(), new B17(), new B18(), new B19(), new B20(),
				new B21(), new B22(), new B23(), new B24(), new B25(), new B26(), new B27(), new B28(), new B29(), new B30(),
				new B31(), new B32(), new B33()};
		return b;
	}

	public static Table[] getBinyanC(){
		Table[] c = 
		{new C1(), new C2(),  new C3(),  new C4(),  new C5(),  new C6(),  new C7(),  new C8(),  new C9(),  new C10(), 
				new C11(), new C12(), new C13(), new C14(), new C15(), new C16(), new C17(), new C18(), new C19(), new C20(),
				new C21(), new C22(), new C23(), new C24(), new C25(), new C26(), new C27(), new C28(), new C29(), new C30()};
		return c;
	}

	public static Table[] getBinyanD(){
		Table[] d = 
		{new D1(), new D2(),  new D3(),  new D4(),  new D5(),  new D6(),  new D7(),  new D8(),  new D9(),  new D10(), 
				new D11(), new D12(), new D13(), new D14(), new D15(), new D16(), new D17(), new D18(), new D19(), new D20(),
				new D21(), new D22()};
		return d;
	}

	public static Table[] getBinyanE(){
		Table[] e = 
		{new E1(), new E2(),  new E3(),  new E4(),  new E5(),  new E6(),  new E7(),  new E8(),  new E9(),  new E10(), 
				new E11(), new E12(), new E13(), new E14(), new E15(), new E16(), new E17(), new E18(), new E19(), new E20(),
				new E21(), new E22(), new E23(), new E24(), new E25(), new E26(), new E27(), new E28(), new E29(), new E30(),
				new E31(), new E32(), new E33(), new E34(), new E35(), new E36(), new E37(), new E38(), new E39(), new E40(),
				new E41(), new E42(), new E43(), new E44(), new E45(), new E46(), new E47(), new E48(), new E49(), new E50(),
				new E51(), new E52(), new E53(), new E54(), new E55(), new E56(), new E57(), new E58(), new E59(), new E60()};
		return e;
	}

	public static Table[] getBinyanF(){
		Table[] f = 
		{new F1(), new F2(),  new F3(),  new F4(),  new F5(),  new F6(),  new F7(),  new F8(),  new F9(),  new F10(), 
				new F11(), new F12(), new F13(), new F14(), new F15(), new F16(), new F17(), new F18(), new F19(), new F20(),
				new F21(), new F22(), new F23(), new F24(), new F25(), new F26(), new F27(), new F28(), new F29(), new F30(),
				new F31(), new F32(), new F33(), new F34(), new F35(), new F36(), new F37(), new F38()};
		return f;
	}

	public static Table[] getBinyanG(){
		Table[] g = 
		{new G1(), new G2(),  new G3(),  new G4(),  new G5(),  new G6(),  new G7(),  new G8(),  new G9(),  new G10(), 
				new G11(), new G12(), new G13(), new G14(), new G15(), new G16(), new G17(), new G18(), new G19(), new G20(),
				new G21(), new G22(), new G23(), new G24()};
		return g;
	}
}







