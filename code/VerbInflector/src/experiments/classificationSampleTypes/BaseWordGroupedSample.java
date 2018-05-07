package classificationSampleTypes;

import hebrewWord.BaseWord;
import table.Table;

public class BaseWordGroupedSample extends BaseWordSample{
	
	private String _originalClassName;
	private Table _originalClass;
	
	public BaseWordGroupedSample(String group, String originalClass, BaseWord bw, Table table){
		super(group,bw,table);
		this._originalClassName = originalClass;
		this._originalClass = table;
	}
	
	public String getOriginalClassName(){
		return this._originalClassName;
	}
	
	public Table getOriginalClass(){
		return this._originalClass;
	}
	
	public void setTableToOriginalTable(){
		this._tableName = this._originalClassName;
		this._table = this._originalClass;
	}

}
