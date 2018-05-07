package table;

import letters.HebrewLetter;

public class UnknownTableException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnknownTableException(HebrewLetter[] word,String tableName,int tableNumber){

	}

	public UnknownTableException(String tableName,int tableNumber){

	}
}
