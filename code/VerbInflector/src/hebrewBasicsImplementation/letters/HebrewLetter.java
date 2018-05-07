package letters;


public class HebrewLetter {

	protected String _letter;
	protected String _letterName;
	protected String _vocalization;
	protected String _dagesh;
	protected String _mapik;
	protected boolean _finLetter;
	protected String _quote;

	public final static String EMPTY= new String("");

	// LETTERS

	public final static String ALEF = "\u05D0";
	public final static String BET = "\u05D1";
	public final static String GIMEL = "\u05D2";
	public final static String DALET = "\u05D3";
	public final static String HEY = "\u05D4";
	public final static String VAV = "\u05D5";
	public final static String ZAIN = "\u05D6";
	public final static String HET = "\u05D7";
	public final static String TET = "\u05D8";
	public final static String YOD = "\u05D9";
	public final static String KAF_SOFIT = "\u05DA";
	public final static String KAF = "\u05DB";
	public final static String LAMED = "\u05DC";
	public final static String MEM_SOFIT = "\u05DD";
	public final static String MEM = "\u05DE";
	public final static String NUN_SOFIT = "\u05DF";
	public final static String NUN = "\u05E0";
	public final static String SAMECH = "\u05E1";
	public final static String AIN = "\u05E2";
	public final static String PEH_SOFIT = "\u05E3";
	public final static String PEH = "\u05E4";
	public final static String TSADI_SOFIT = "\u05E5";
	public final static String TSADI = "\u05E6";
	public final static String KUF = "\u05E7";
	public final static String REISH = "\u05E8";
	public final static String SHIN = "\u05E9";
	public final static String TAV = "\u05EA";

	// LETTER NAMES
	public final static String ALEF_NAME = "ALEF";
	public final static String BET_NAME = "BET";
	public final static String GIMEL_NAME = "GIMEL";
	public final static String JIMEL_NAME = "JIMEL";
	public final static String DALET_NAME = "DALET";
	public final static String HEY_NAME = "HEY";
	public final static String VAV_NAME = "VAV";
	public final static String ZAIN_NAME = "ZAIN";
	public final static String HET_NAME = "HET";
	public final static String TET_NAME = "TET";
	public final static String YOD_NAME = "YOD";
	public final static String KAF_SOFIT_NAME = "KAF_SOFIT";
	public final static String KAF_NAME = "KAF";
	public final static String LAMED_NAME = "LAMED";
	public final static String MEM_SOFIT_NAME = "MEM_SOFIT";
	public final static String MEM_NAME = "MEM";
	public final static String NUN_SOFIT_NAME = "NUN_SOFIT";
	public final static String NUN_NAME = "NUN";
	public final static String SAMECH_NAME = "SAMECH";
	public final static String AIN_NAME = "AIN";
	public final static String PEH_SOFIT_NAME = "PEH_SOFIT";
	public final static String PEH_NAME = "PEH";
	public final static String TSADI_SOFIT_NAME = "TSADI_SOFIT";
	public final static String TSADI_NAME = "TSADI";
	public final static String CHADI_SOFIT_NAME = "CHADI_SOFIT";
	public final static String CHADI_NAME = "CHADI";
	public final static String KUF_NAME = "KUF";
	public final static String REISH_NAME = "REISH";
	public final static String SHIN_NAME = "SHIN";
	public final static String SIN_NAME = "SIN";
	public final static String TAV_NAME = "TAV";

	// DOTS
	public final static String SHVA = "\u05B0";
	public final static String H_SEGOL = "\u05B1";
	public final static String H_PATAH = "\u05B2";
	public final static String H_KAMATS = "\u05B3";
	public final static String HIRIK = "\u05B4";
	public final static String TSERE = "\u05B5";
	public final static String SEGOL = "\u05B6";
	public final static String PATAH = "\u05B7";
	public final static String KAMATS = "\u05B8";
	public final static String KAMATS_KATAN = "\u05B8";
	public final static String HOLAM_H = "\u05B9";
	public final static String KUBUTS = "\u05BB";
	public final static String DAGESH = "\u05BC";
	public final static String MAPIK = "\u05BC";
	public final static String SHURUK = "\u05BC";
	public final static String SHIN_DOT = "\u05C1";
	public final static String SIN_DOT = "\u05C2";
	public final static String HOLAM_M = "\u05B9";
	public final static String QUOTE = "\u0027";

	/*
	 * Constructors
	 */	
	public HebrewLetter() {
		this._vocalization = new String(HebrewLetter.EMPTY);
		this._dagesh = new String(HebrewLetter.EMPTY);
		this._mapik = new String(HebrewLetter.EMPTY);
		this._finLetter = false;
		this._quote = new String(HebrewLetter.EMPTY);
	}

	public HebrewLetter(HebrewLetter l){
		this._letter = new String(l.getLetter());
		this._letterName = new String(l.getLetterName());
		this._vocalization = new String(l.getVocalization());
		this._dagesh = new String(l.getDagesh());
		this._mapik = new String(l.getMapik());
		this._finLetter = l.getFinLetter();
		if (l.isQuoted()){
			this._quote = new String(HebrewLetter.QUOTE);
		}
		else{
			this._quote = new String(HebrewLetter.EMPTY);
		}
	}

	/*
	 * Getters
	 */
	public String getVocalization(){
		return _vocalization;
	}

	public String getLetter(){
		return _letter;
	}

	public String getLetterName(){
		return _letterName;
	}

	public String getDagesh(){
		return _dagesh;
	}

	public String getMapik(){
		return _mapik;
	}

	public boolean getFinLetter(){
		return _finLetter;
	}

	public boolean isQuoted(){
		return _quote.equals(HebrewLetter.QUOTE); 
	}

	public boolean isBegedkefet(){
		return (_letter.equals(HebrewLetter.BET) || _letter.equals(HebrewLetter.GIMEL) || 
				_letter.equals(HebrewLetter.DALET) || _letter.equals(HebrewLetter.KAF) ||
				_letter.equals(HebrewLetter.PEH) || _letter.equals(HebrewLetter.TAV) ||
				_letter.equals(HebrewLetter.KAF_SOFIT) || _letter.equals(HebrewLetter.PEH_SOFIT));
	}

	public boolean isHaacheaa(){
		return (_letter.equals(HebrewLetter.HEY) || _letter.equals(HebrewLetter.ALEF) || 
				_letter.equals(HebrewLetter.HET) || _letter.equals(HebrewLetter.REISH) ||
				_letter.equals(HebrewLetter.AIN));
	}

	public boolean isKafSofit(){
		return _letter.equals(HebrewLetter.KAF_SOFIT);
	}

	public boolean isHey(){
		return _letter.equals(HebrewLetter.HEY);
	}

	public boolean isYod(){
		return _letter.equals(HebrewLetter.YOD);
	}

	public boolean isVav(){
		return _letter.equals(HebrewLetter.VAV);
	}

	public boolean isAlef(){
		return _letter.equals(HebrewLetter.ALEF);
	}

	public boolean isVocalizetionEmpty(){
		return HebrewLetter.EMPTY.equals(this._vocalization);
	}

	public boolean isVocalizetionShva(){
		return HebrewLetter.SHVA.equals(this._vocalization);
	}

	public boolean isVocalizetionHataf(){
		return (HebrewLetter.H_KAMATS.equals(this._vocalization)||
				HebrewLetter.H_PATAH.equals(this._vocalization)||
				HebrewLetter.H_SEGOL.equals(this._vocalization));
	}

	public boolean isVocalizetionHirik(){
		return HebrewLetter.HIRIK.equals(this._vocalization);
	}

	public boolean isVocalizetionTsere(){
		return HebrewLetter.TSERE.equals(this._vocalization);
	}

	public boolean isVocalizetionSegol(){
		return HebrewLetter.SEGOL.equals(this._vocalization);
	}

	public boolean isVocalizetionPatah(){
		return HebrewLetter.PATAH.equals(this._vocalization);
	}

	public boolean isVocalizetionKamats(){
		return HebrewLetter.KAMATS.equals(this._vocalization);
	}

	public boolean isVocalizetionKamats_Katan(){
		return HebrewLetter.KAMATS_KATAN.equals(this._vocalization);
	}

	public boolean isVocalizetionHolam_H(){
		return HebrewLetter.HOLAM_H.equals(this._vocalization);
	}

	public boolean isVocalizetionKubuts(){
		return HebrewLetter.KUBUTS.equals(this._vocalization);
	}

	public boolean isVocalizetionShuruk(){
		return HebrewLetter.SHURUK.equals(this._vocalization);
	}

	public boolean isVocalizetionHolam_M(){
		return HebrewLetter.HOLAM_M.equals(this._vocalization);
	}

	public boolean isVocalizetionVowel(){
		return (this.isVocalizetionHirik()||this.isVocalizetionHolam_H()||this.isVocalizetionHolam_M()||
				this.isVocalizetionKamats()||this.isVocalizetionKamats_Katan()||this.isVocalizetionKubuts()||
				this.isVocalizetionPatah()||this.isVocalizetionSegol()||this.isVocalizetionShuruk()||
				this.isVocalizetionTsere());
	}

	/*
	 * Setters
	 */

	 // Finalize / Unfinilize setters 

	public void finalizeLetter(){
		if (_letter.equals(HebrewLetter.KAF) || _letter.equals(HebrewLetter.MEM) || 
				_letter.equals(HebrewLetter.NUN) || _letter.equals(HebrewLetter.PEH) ||
				_letter.equals(HebrewLetter.TSADI)) {
			if (_letter.equals(HebrewLetter.KAF)) {
				_letter = HebrewLetter.KAF_SOFIT; 
				_letterName = HebrewLetter.KAF_SOFIT_NAME; 
				_finLetter = true;
			}
			if (_letter.equals(HebrewLetter.MEM)) {
				_letter = HebrewLetter.MEM_SOFIT; 
				_letterName = HebrewLetter.MEM_SOFIT_NAME;
				_finLetter = true;
			}
			if (_letter.equals(HebrewLetter.NUN)) {
				_letter = HebrewLetter.NUN_SOFIT; 
				_letterName = HebrewLetter.NUN_SOFIT_NAME;
				_finLetter = true;
			}
			if (_letter.equals(HebrewLetter.PEH)) {
				_letter = HebrewLetter.PEH_SOFIT; 
				_letterName = HebrewLetter.PEH_SOFIT_NAME;
				_finLetter = true;
			}
			if (_letter.equals(HebrewLetter.TSADI)) {
				_letter = HebrewLetter.TSADI_SOFIT; 
				if(this.isQuoted()){
					_letterName = HebrewLetter.CHADI_SOFIT_NAME;
				} else {
					_letterName = HebrewLetter.TSADI_SOFIT_NAME;
				}
				_finLetter = true;}
		}
		else {
			return;
		}
	}

	public void unfinalizeLetter(){
		if (_letter.equals(HebrewLetter.KAF_SOFIT) || _letter.equals(HebrewLetter.MEM_SOFIT) || 
				_letter.equals(HebrewLetter.NUN_SOFIT) || _letter.equals(HebrewLetter.PEH_SOFIT) ||
				_letter.equals(HebrewLetter.TSADI_SOFIT)) {
			if (_letter.equals(HebrewLetter.KAF_SOFIT)) {
				_letter = HebrewLetter.KAF; 
				_letterName = HebrewLetter.KAF_NAME;
				_finLetter = false;
			}
			if (_letter.equals(HebrewLetter.MEM_SOFIT)) {
				_letter = HebrewLetter.MEM; 
				_letterName = HebrewLetter.MEM_NAME;
				_finLetter = false;
			}
			if (_letter.equals(HebrewLetter.NUN_SOFIT)) {
				_letter = HebrewLetter.NUN; 
				_letterName = HebrewLetter.NUN_NAME;
				_finLetter = false;
			}
			if (_letter.equals(HebrewLetter.PEH_SOFIT)) {
				_letter = HebrewLetter.PEH; 
				_letterName = HebrewLetter.PEH_NAME;
				_finLetter = false;}
			if (_letter.equals(HebrewLetter.TSADI_SOFIT)) {
				_letter = HebrewLetter.TSADI;
				if(this.isQuoted()){
					_letterName = HebrewLetter.CHADI_NAME;
				} else {
					_letterName = HebrewLetter.TSADI_NAME;
				}
				_finLetter = false;}
		}
		else {
			return;
		}
	}


	// Vocalization setters

	public void setVocalization_SHVA() {
		this._vocalization = new String(HebrewLetter.SHVA);
	}

	public void setVocalization_H_SEGOL() {
		this._vocalization = new String(HebrewLetter.H_SEGOL);
	}

	public void setVocalization_H_PATAH() {
		this._vocalization = new String(HebrewLetter.H_PATAH);
	}

	public void setVocalization_H_KAMATS() {
		this._vocalization = new String(HebrewLetter.H_KAMATS);
	}

	public void setVocalization_HIRIK() {
		this._vocalization = new String(HebrewLetter.HIRIK);
	}

	public void setVocalization_TSERE() {
		this._vocalization = new String(HebrewLetter.TSERE);
	}

	public void setVocalization_SEGOL() {
		this._vocalization = new String(HebrewLetter.SEGOL);
	}

	public void setVocalization_PATAH() {
		this._vocalization = new String(HebrewLetter.PATAH);
	}

	public void setVocalization_KAMATS() {
		this._vocalization = new String(HebrewLetter.KAMATS);
	}

	public void setVocalization_KAMATS_KATAN() {
		this._vocalization = new String(HebrewLetter.KAMATS_KATAN);
	}

	public void setVocalization_HOLAM_H() {
		if (!_letter.equals(HebrewLetter.VAV)) {
			_vocalization = new String(HebrewLetter.HOLAM_H);
		}
	}

	public void setVocalization_KUBUTS() {
		this._vocalization = new String(HebrewLetter.KUBUTS);
	}

	public void setVocalization_DAGESH() {
		if (!this.isHaacheaa()) {
			this._dagesh = new String(HebrewLetter.DAGESH);
		}
	}

	public void setVocalization_DAGESH_BEGEDKEFET() {
		if (this.isBegedkefet()) {
			this._dagesh = new String(HebrewLetter.DAGESH);
		}
	}

	public void setVocalization_MAPIK() {
		if (_letter.equals(HebrewLetter.HEY)) {
			_mapik = HebrewLetter.MAPIK;
		}
	} // Only Hey have this.

	public void setVocalization_SHURUK() {
		if (_letter.equals(HebrewLetter.VAV)) {
			_vocalization = HebrewLetter.SHURUK;
		}
	} // Only Vav have this.

	public void setVocalization_HOLAM_M() {
		if (_letter.equals(HebrewLetter.VAV)) {
			_vocalization = HebrewLetter.HOLAM_M;
		}
	} // Only Vav have this.


	// Vocalization removers

	public void removeVocalization() {
		this._vocalization = new String(HebrewLetter.EMPTY);
	}

	public void removeDagesh() {
		this._dagesh = new String(HebrewLetter.EMPTY);
	}

	public void removeMapik() {
		this._mapik = new String(HebrewLetter.EMPTY);
	}

	public boolean isFinLetter(){
		return this._finLetter;
	}

	/*
	 * General methods
	 */		
	public static HebrewLetter makeLetterFromString(String l){
		if (l.equals(HebrewLetter.ALEF)) { return new Alef();}
		else if (l.equals(HebrewLetter.BET)) { return new Bet();}
		else if (l.equals(HebrewLetter.GIMEL)) { return new Gimel();}
		else if (l.equals(HebrewLetter.GIMEL+HebrewLetter.QUOTE)) { return new Jimel();}
		else if (l.equals(HebrewLetter.DALET)) { return new Dalet();}
		else if (l.equals(HebrewLetter.HEY)) { return new Hey();}
		else if (l.equals(HebrewLetter.VAV)) { return new Vav();}
		else if (l.equals(HebrewLetter.ZAIN)) { return new Zain();}
		else if (l.equals(HebrewLetter.HET)) { return new Het();}
		else if (l.equals(HebrewLetter.TET)) { return new Tet();}
		else if (l.equals(HebrewLetter.YOD)) { return new Yod();}
		else if (l.equals(HebrewLetter.KAF)) { return new Kaf();}
		else if (l.equals(HebrewLetter.KAF_SOFIT)) { return new KafSofit();}
		else if (l.equals(HebrewLetter.LAMED)) { return new Lamed();}
		else if (l.equals(HebrewLetter.MEM)) { return new Mem();}
		else if (l.equals(HebrewLetter.MEM_SOFIT)) { return new MemSofit();}
		else if (l.equals(HebrewLetter.NUN)) { return new Nun();}
		else if (l.equals(HebrewLetter.NUN_SOFIT)) { return new NunSofit();}
		else if (l.equals(HebrewLetter.SAMECH)) { return new Samech();}
		else if (l.equals(HebrewLetter.AIN)) { return new Ain();}
		else if (l.equals(HebrewLetter.PEH)) { return new Peh();}
		else if (l.equals(HebrewLetter.PEH_SOFIT)) { return new PehSofit();}
		else if (l.equals(HebrewLetter.TSADI)) { return new Tsadi();}
		else if (l.equals(HebrewLetter.TSADI+HebrewLetter.QUOTE)) { return new Chadi();}
		else if (l.equals(HebrewLetter.TSADI_SOFIT)) { return new TsadiSofit();}
		else if (l.equals(HebrewLetter.TSADI_SOFIT+HebrewLetter.QUOTE)) { return new ChadiSofit();}
		else if (l.equals(HebrewLetter.KUF)) { return new Kuf();}
		else if (l.equals(HebrewLetter.REISH)) { return new Reish();}
		else if (l.equals(HebrewLetter.SHIN)) { return new Shin();}
		else if (l.equals(HebrewLetter.SHIN+HebrewLetter.QUOTE)) { return new Sin();}
		else if (l.equals(HebrewLetter.TAV)) { return new Tav();}
		else {
			System.out.println("Warning - created empty letter (may indicate encoding problem... try to convert file to \"UTF8 without BOM\" by ntpd++)");
			return new HebrewLetter();
		}
	}

	public static HebrewLetter makeLetterFromLetterName(String l){
		if (l.equals(HebrewLetter.ALEF_NAME)) { return new Alef();}
		else if (l.equals(HebrewLetter.BET_NAME)) { return new Bet();}
		else if (l.equals(HebrewLetter.GIMEL_NAME)) { return new Gimel();}
		else if (l.equals(HebrewLetter.JIMEL_NAME)) { return new Jimel();}
		else if (l.equals(HebrewLetter.DALET_NAME)) { return new Dalet();}
		else if (l.equals(HebrewLetter.HEY_NAME)) { return new Hey();}
		else if (l.equals(HebrewLetter.VAV_NAME)) { return new Vav();}
		else if (l.equals(HebrewLetter.ZAIN_NAME)) { return new Zain();}
		else if (l.equals(HebrewLetter.HET_NAME)) { return new Het();}
		else if (l.equals(HebrewLetter.TET_NAME)) { return new Tet();}
		else if (l.equals(HebrewLetter.YOD_NAME)) { return new Yod();}
		else if (l.equals(HebrewLetter.KAF_NAME)) { return new Kaf();}
		else if (l.equals(HebrewLetter.KAF_SOFIT_NAME)) { return new KafSofit();}
		else if (l.equals(HebrewLetter.LAMED_NAME)) { return new Lamed();}
		else if (l.equals(HebrewLetter.MEM_NAME)) { return new Mem();}
		else if (l.equals(HebrewLetter.MEM_SOFIT_NAME)) { return new MemSofit();}
		else if (l.equals(HebrewLetter.NUN_NAME)) { return new Nun();}
		else if (l.equals(HebrewLetter.NUN_SOFIT_NAME)) { return new NunSofit();}
		else if (l.equals(HebrewLetter.SAMECH_NAME)) { return new Samech();}
		else if (l.equals(HebrewLetter.AIN_NAME)) { return new Ain();}
		else if (l.equals(HebrewLetter.PEH_NAME)) { return new Peh();}
		else if (l.equals(HebrewLetter.PEH_SOFIT_NAME)) { return new PehSofit();}
		else if (l.equals(HebrewLetter.TSADI_NAME)) { return new Tsadi();}
		else if (l.equals(HebrewLetter.CHADI_SOFIT_NAME)) { return new Chadi();}
		else if (l.equals(HebrewLetter.TSADI_SOFIT_NAME)) { return new TsadiSofit();}
		else if (l.equals(HebrewLetter.CHADI_SOFIT_NAME)) { return new ChadiSofit();}
		else if (l.equals(HebrewLetter.KUF_NAME)) { return new Kuf();}
		else if (l.equals(HebrewLetter.REISH_NAME)) { return new Reish();}
		else if (l.equals(HebrewLetter.SHIN_NAME)) { return new Shin();}
		else if (l.equals(HebrewLetter.SIN_NAME)) { return new Sin();}
		else if (l.equals(HebrewLetter.TAV_NAME)) { return new Tav();}
		else {
			return new HebrewLetter();
		}
	}

	public static boolean isHebrewLetter(String l){
		return l.equals(ALEF)||l.equals(BET)||l.equals(GIMEL)||
				l.equals(DALET)||l.equals(HEY)||l.equals(VAV)||
				l.equals(ZAIN)||l.equals(HET)||l.equals(TET)||
				l.equals(YOD)||l.equals(KAF)||l.equals(KAF_SOFIT)||
				l.equals(LAMED)||l.equals(MEM)||l.equals(MEM_SOFIT)||
				l.equals(NUN)||l.equals(NUN_SOFIT)||l.equals(SAMECH)||
				l.equals(AIN)||l.equals(PEH)||l.equals(PEH_SOFIT)||
				l.equals(TSADI)||l.equals(TSADI_SOFIT)||l.equals(KUF)||
				l.equals(REISH)||l.equals(SHIN)||l.equals(TAV);
	}

	public static boolean isShva(String s){
		return s.equals(SHVA); 
	}
	
	public static boolean isH_KAMATS(String s){
		return H_KAMATS.equals(s);
	}
	
	public static boolean isH_PATAH(String s){
		return H_PATAH.equals(s);
	}
	
	public static boolean isH_SEGOL(String s){
		return H_SEGOL.equals(s);
	}

	public static boolean isHirik(String s){
		return HIRIK.equals(s);
	}

	public static boolean isTsere(String s){
		return TSERE.equals(s);
	}

	public static boolean isSegol(String s){
		return SEGOL.equals(s);
	}

	public static boolean isPatah(String s){
		return PATAH.equals(s);
	}

	public static boolean isKamats(String s){
		return KAMATS.equals(s);
	}

	public static boolean isKamats_Katan(String s){
		return KAMATS_KATAN.equals(s);
	}

	public static boolean isHolam_H(String s){
		return HOLAM_H.equals(s);
	}

	public static boolean isKubuts(String s){
		return KUBUTS.equals(s);
	}

	public static boolean isShuruk(String s){
		return SHURUK.equals(s);
	}

	public static boolean isHolam_M(String s){
		return HOLAM_M.equals(s);
	}
	
	public static boolean isDagesh(String s){
		return s.equals(DAGESH);
	}
	
	public static boolean isMapik(String s){
		return s.equals(MAPIK);
	}
	
	public static boolean isShinDot(String s){
		return s.equals(SHIN_DOT);
	}
	
	public static boolean isSinDot(String s){
		return s.equals(SIN_DOT);
	}
	
	public static boolean isQuote(String s){
		return s.equals(QUOTE);
	}

	/*public boolean equals(HebrewVerb v){
		return (this._letter.equals(v.getLetter()));
	}*/

	public boolean equals(HebrewLetter l){
		return (this._letter.equals(l.getLetter()));
	}

	public String toString() {
		return this._letter+this._dagesh+this._mapik+this._vocalization+this._quote;
	}

}


