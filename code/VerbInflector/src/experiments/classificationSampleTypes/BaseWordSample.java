package classificationSampleTypes;

import table.Table;
import hebrewWord.BaseWord;

public class BaseWordSample implements ClassificationSampleIfc{

	protected String _tableName;
	protected BaseWord _bw;
	protected Table _table;
	
	
	public BaseWordSample(String tableName, BaseWord bw, Table table){
		this._tableName = tableName;
		this._bw = bw;
		this._table = table;
	}

	public BaseWord getBaseWord(){
		return this._bw;
	}
	
	public String getClassName(){
		return this._tableName;
	}
	
	public Table getTable(){
		return this._table;
	}
	
	public String toString(){
		return this._bw.toString();
	}
}
