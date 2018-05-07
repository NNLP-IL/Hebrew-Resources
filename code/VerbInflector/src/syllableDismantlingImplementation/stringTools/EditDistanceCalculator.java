package stringTools;

public class EditDistanceCalculator {

	protected String _x;
	protected String _y;
	protected int[][] _distMat;
	protected int _editDistance;
	protected String _xOut;
	protected String _yOut;
	protected int _wCopy; 
	protected int _wReplace; 
	protected int _wDelete; 
	protected int _wInsert;
	private final static String SPACE = "0";
	
	public EditDistanceCalculator(int wCopy, int wReplace, int wDelete, int wInsert){
		this._wCopy = wCopy;
		this._wReplace = wReplace;
		this._wDelete = wDelete;
		this._wInsert = wInsert;
	}
	
	public int getEditDistance(){
		return this._editDistance;
	}
	
	public String getXAliignment(){
		return this._xOut;
	}
	
	public String getYAliignment(){
		return this._yOut;
	}
	
	public int calc(String x, String y){
		int xLen = x.length()+1;
		int yLen = y.length()+1;
		this._x = x;
		this._y = y;
		this._distMat = new int[xLen][yLen];
		int maxLen = Math.max(xLen, yLen);
		for(int i=0; i<maxLen; i++){  // initialization of the distance matrix
			if(i<xLen){
				this._distMat[i][0] = i*this._wDelete;
			}
			if(i<yLen){
				this._distMat[0][i] = i*this._wInsert;
			}
		}
		for(int i=1;i<xLen;i++){
			for(int j=1;j<yLen;j++){
				this._distMat[i][j] = min3(
					this._distMat[i-1][j-1]+this.delta(new String(x.substring(i-1, i)), y.substring(j-1, j)),
					this._distMat[i-1][j]+this._wDelete,
					this._distMat[i][j-1]+this._wInsert); 
			}
		}
		this._editDistance = this._distMat[xLen-1][yLen-1];
		this.calcAllignment();
		return this._editDistance;
	}
	
	private void calcAllignment(){
		this._xOut = new String("");
		this._yOut = new String("");
		int xLen = _x.length()+1;
		int yLen = _y.length()+1;
		int i = xLen-1;
		int j = yLen-1;
		while (!(i==0&&j==0)){
			if (j==0){
				this._yOut = EditDistanceCalculator.SPACE+this._yOut;
				this._xOut = this._x.substring(i-1,i)+this._xOut;
				i--;
			}
			else if (i==0){
				this._xOut = EditDistanceCalculator.SPACE+this._xOut;
				this._yOut = this._y.substring(j-1,j)+this._yOut;
				j--;
			}
			else if (this._distMat[i][j]==this._distMat[i][j-1]+this._wInsert){
				this._xOut = EditDistanceCalculator.SPACE+this._xOut;
				this._yOut = this._y.substring(j-1,j)+this._yOut;
				j--;
			}
			else if (this._distMat[i][j]==this._distMat[i-1][j]+this._wDelete){
				this._yOut = EditDistanceCalculator.SPACE+this._yOut;
				this._xOut = this._x.substring(i-1,i)+this._xOut;
				i--;
			}
			else{
				this._yOut = this._y.substring(j-1,j)+this._yOut;
				this._xOut = this._x.substring(i-1,i)+this._xOut;
				j--;
				i--;
			}
		}
	}
	
	private int min3(int x, int y, int z){
		return Math.min(x, Math.min(y, z));
	}
	
	protected int delta(String a, String b){
		if (a.equals(b)){
			return this._wCopy;
		}
		else{
			return this._wReplace;
		}
	}
}
