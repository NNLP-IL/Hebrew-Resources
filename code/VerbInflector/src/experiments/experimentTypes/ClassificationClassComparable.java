package experimentTypes;

public class ClassificationClassComparable implements Comparable<ClassificationClassComparable>{

	private String _cls;

	public ClassificationClassComparable(String s){
		this._cls = s;
	}

	public int compareTo(ClassificationClassComparable cls2){
		String s1 = this._cls;
		String s2 = cls2.getCls();
		int topLength = Math.max(s1.length(), s2.length());
		for(int i=0; i<topLength; i++){
			if (i<s1.length()&&i<s2.length()){
				boolean num1 = (int)s1.charAt(i)>=48&&(int)s1.charAt(i)<=57;
				boolean num2 = (int)s2.charAt(i)>=48&&(int)s2.charAt(i)<=57;
				boolean bothNumbers = num1&&num2;
				boolean bothNonNumbers = (!num1&&!num2);
				if (bothNonNumbers){
					if (s1.charAt(i)>s2.charAt(i)) {return 1;}
					else if (s1.charAt(i)<s2.charAt(i)) {return -1;}
				} else if(bothNumbers){
					int j = i;
					int l1 = 0;
					int l2 = 0;
					while(j<s1.length()&&(int)s1.charAt(j)>=48&&(int)s1.charAt(j)<=57){
						l1 += (int)s1.charAt(j) - 48;
						l1 *= 10;
						j++;
					}
					j = i;
					while(j<s2.length()&&(int)s2.charAt(j)>=48&&(int)s2.charAt(j)<=57){
						l2 += (int)s2.charAt(j) - 48;
						l2 *= 10;
						j++;
					}
					if (l1>l2) {return 1;}
					if (l1<l2) {return -1;}
				} else if(num1){
					return 1;
				} else{
					return -1;
				}
			} else if(i<s1.length()){
				return 1;
			}else{
				return -1; 
			}
		}
		return 1;
	}

	public boolean equals(ClassificationClassComparable other){
		return this._cls.equals(other);
	}

	public String getCls(){
		return this._cls;
	}
}