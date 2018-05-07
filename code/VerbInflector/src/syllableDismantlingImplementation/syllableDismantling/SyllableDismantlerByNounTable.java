package syllableDismantling;

import java.util.ArrayList;
import java.util.Arrays;

import letters.HebrewLetter;

import hebrewWord.BaseWord;

/**
 * 
 * @author ערן
 * @deprecated
 */
public class SyllableDismantlerByNounTable {

	ArrayList<BaseWord> _baseWords;
	ArrayList<SyllabledWord> _syllabledWords;

	public SyllableDismantlerByNounTable(){
		_baseWords = new ArrayList<BaseWord>();
		_syllabledWords = new ArrayList<SyllabledWord>();
	}

	public void makeSyllabledNoun(BaseWord bw,int tableNumber){
		ArrayList<Integer> syllables = new ArrayList<Integer>();

		// LUACH A - MELEIM:
		this.singleSyllableA(bw.getLetters(),syllables, tableNumber);						// I
		this.existingVowelPrecidingCompleteVowelA(bw.getLetters(),syllables, tableNumber);	// II
		this.cancelledVowelPrecidingCompleteVowelA(bw.getLetters(),syllables, tableNumber);	// III
		this.endsWithUTorITA(bw.getLetters(),syllables, tableNumber);						// IV

		// LUACH B - KMUTSIM-ZIHRIIM:
		this.singleSyllableB(bw.getLetters(),syllables, tableNumber);						// I
		this.existingVowelPrecidingKamatsB(bw.getLetters(),syllables, tableNumber);			// II
		this.cancelledVowelPrecidingKamatsB(bw.getLetters(),syllables, tableNumber);		// III

		// LUACH C - KMUTSIM-NIKBIIM:
		this.existingVowelPrecidingKamatsHeyC(bw.getLetters(),syllables, tableNumber);		// I
		this.kamatsPrecidingKamatsHeyC(bw.getLetters(),syllables, tableNumber);				// II
		this.tserePrecidingKamatsHeyC(bw.getLetters(),syllables, tableNumber);				// III

		// LUACH D - TSRUIIM:
		this.singleSyllableD(bw.getLetters(),syllables, tableNumber);						// I
		this.existingVowelPrecidingTsereD(bw.getLetters(),syllables, tableNumber);			// II
		this.cancelledVowelPrecidingTsereD(bw.getLetters(),syllables, tableNumber);			// III
		this.namesInSegolInsteadOfTsereD(bw.getLetters(),syllables, tableNumber);			// IV
		
		// LUACH E - NAMESENDING WITH SEGOL - HEY:
		this.existingVowelPrecidingSegolHeyE(bw.getLetters(),syllables, tableNumber);		// I
		this.cancelledVowelPrecidingSegolHeyE(bw.getLetters(),syllables, tableNumber);		// II
		
		// LUACH F - PTUHIIM:
		this.singleSyllableF(bw.getLetters(),syllables, tableNumber);						// I
		this.existingVowelPrecidingPatahF(bw.getLetters(),syllables, tableNumber);			// II
		this.cancelledVowelPrecidingPatahF(bw.getLetters(),syllables, tableNumber);			// III
		
		// LUACH G - HLUMIIM:
		this.singleSyllableG(bw.getLetters(),syllables, tableNumber);						// I
		this.existingVowelPrecidingHolamHG(bw.getLetters(),syllables, tableNumber);			// II
		this.cancelledVowelPrecidingHolamHG(bw.getLetters(),syllables, tableNumber);		// III
		
		// LUACH G - MILELIIM:
		this.masculanSegolH(bw.getLetters(),syllables, tableNumber);						// I
		this.feminineSegolH(bw.getLetters(),syllables, tableNumber);						// II
		this.nehshalimH(bw.getLetters(),syllables, tableNumber);							// III
		
		
		this.makeStartingSyllable(syllables);
		int[] syllablesArray = new int[syllables.size()];
		for (int i=0; i<syllablesArray.length;i++){
			syllablesArray[i] = syllables.get(i).intValue();
		}
		Arrays.sort(syllablesArray);
		//System.out.println(Arrays.toString(syllablesArray));
		SyllabledWord sw = new SyllabledWord(bw.getLetters(),syllablesArray); 
		this._baseWords.add(bw);
		this._syllabledWords.add(sw);
	}

	private void addSyllable(ArrayList<Integer> syllables,int newSyll) {
		if (!syllables.contains(new Integer(newSyll))){
			syllables.add(new Integer(newSyll));
		}
		return;
	}

	private boolean isYod(HebrewLetter l){
		return (l.getLetter().equals(HebrewLetter.YOD));
	}

	private boolean isVav(HebrewLetter l){
		return (l.getLetter().equals(HebrewLetter.VAV));
	}

	private boolean isAlefOrAin(HebrewLetter l){
		return ((l.getLetter().equals(HebrewLetter.ALEF))||(l.getLetter().equals(HebrewLetter.AIN)));
	}

	private boolean isAlefOrAinOrHet(HebrewLetter l){
		return ((l.getLetter().equals(HebrewLetter.ALEF))||(l.getLetter().equals(HebrewLetter.AIN))||
				(l.getLetter().equals(HebrewLetter.HET)));
	}

	private boolean inRange(int tableNumber,int low, int high){
		return ((tableNumber>=low)&&(tableNumber<=high));
	}

	private void makeStartingSyllable(ArrayList<Integer> syllables){
		this.addSyllable(syllables, 0);
	}

	/*
	 * 	LUACH A - MELEIM:
	 */ 
	private void singleSyllableA(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 0, 13)){
			// NO NEW SYLLABLES
		}
	}

	private void existingVowelPrecidingCompleteVowelA(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 14, 31)){
			int k = word.size();
			if (inRange(tableNumber, 14, 17)){ // THE WORD ENDS WITH 2 COMPLETE VOWELS
				this.addSyllable(syllables, k-3);				// -KI~DON
			}
			else if (inRange(tableNumber, 18, 25)){ // THE WORD ENDS SHVA-NACH - VOWEL
				if (!this.isAlefOrAin(word.get(k-4))){
					this.addSyllable(syllables, k-3); 			// -YAL~KUT
				}
				else{											
					this.addSyllable(syllables, k-4);			// -PA~AMON
				}
			}
			else if (inRange(tableNumber, 26, 31)){ // THE WORD ENDS WITH A VOWEL STARTING WITH DAGESH-HAZAK
				this.addSyllable(syllables, k-3);			// -AVA~DON
			}
			else {
				System.out.println("Error A.II. Table #"+tableNumber);
			}
		}
	}

	private void cancelledVowelPrecidingCompleteVowelA(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 32, 52)){
			int k = word.size();
			if (inRange(tableNumber, 32, 34)){ // THE WORD ENDS WITH KAMATS - COMPLETE VOWELS
				this.addSyllable(syllables, k-3);				// -GA~ON
				this.addSyllable(syllables, k-4);				// ~GA-ON
			}
			else if (inRange(tableNumber, 35, 35)){ // THE WORD ENDS WITH MISHKAL KTALON
				this.addSyllable(syllables, k-3);				// -KNA~FON
				this.addSyllable(syllables, k-5);				// ~KNA-FON
			}
			else if (inRange(tableNumber, 36, 38)){ // THE WORD ENDS WITH MISHKAL KITALON
				this.addSyllable(syllables, k-3);				// -ZI-KA~RON
				this.addSyllable(syllables, k-4);				// -ZI~KA-RON
				this.addSyllable(syllables, k-5);				// ~ZI-KA-RON
			}
			else if (inRange(tableNumber, 39, 42)){ // THE WORD ENDS WITH KAMATS - SURUK_M
				this.addSyllable(syllables, k-3);			// -HA~LUTS
				this.addSyllable(syllables, k-4);			// ~HA-LUTS
			}
			else if (inRange(tableNumber, 43, 46)){ // THE WORD ENDS WITH KAMATS - HIRIK_M
				if (this.isYod(word.get(k-1))&&!this.isVav(word.get(k-2))){
					this.addSyllable(syllables, k-2);			// -TSA~LI
					this.addSyllable(syllables, k-3);			// ~TSA-LI
				}
				else {
					this.addSyllable(syllables, k-3);			// -HA~LUTS
					this.addSyllable(syllables, k-4);			// ~HA-LUTS
				}
			}
			else if (inRange(tableNumber, 47, 47)){ // ??? SPECIAL CASE THE WORD ENDS WITH KAMATS - TNUAH_M
				this.addSyllable(syllables, k-3);				// -AR~ITS
				this.addSyllable(syllables, k-4);				// ~AR-ITS
			}
			else if (inRange(tableNumber, 48, 51)){ // THE WORD ENDS WITH TSERE - TNUAH_M
				this.addSyllable(syllables, k-3);				// -ME~LITS
				this.addSyllable(syllables, k-4);				// ~ME-LITS
			}
			else if (inRange(tableNumber, 52, 52)){ // ??? SPECIAL CASE THE WORD ENDS WITH TSERE - TNUAH_M
				this.addSyllable(syllables, k-3);				// -BE~RUR
				this.addSyllable(syllables, k-4);				// ~BE-RUR
			}
			else {
				System.out.println("Error A.III. Table #"+tableNumber);
			}
		}
	}

	private void endsWithUTorITA(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 53, 66)){
			int k = word.size();
			if (inRange(tableNumber, 53, 53)){ // 
				this.addSyllable(syllables, k-4);				// ~ZHUT
			}
			else if (inRange(tableNumber, 54, 55)){ // 
				this.addSyllable(syllables, k-3);				// -TAR~BUT
				this.addSyllable(syllables, k-5);				// ~TAR-BUT
			}
			else if (inRange(tableNumber, 56, 57)){ // 
				this.addSyllable(syllables, k-3);				// -KA~MUT
				this.addSyllable(syllables, k-4);				// ~KA-MUT
			}
			else if (inRange(tableNumber, 58, 58)){ // 
				this.addSyllable(syllables, k-3);				// -PUR-A~NUT
			}
			else if (inRange(tableNumber, 59, 59)){ // 
				this.addSyllable(syllables, k-3);				// -E~DUT
			}
			else if (inRange(tableNumber, 60, 60)){ // 
				this.addSyllable(syllables, k-4);				//  ~BHIT
			}
			else if (inRange(tableNumber, 61, 61)){ // 
				this.addSyllable(syllables, k-3);				//  -ZHU~HIT
			}
			else if (inRange(tableNumber, 62, 63)){ // 
				if(!this.isAlefOrAin(word.get(k-4))){
					this.addSyllable(syllables, k-3);			//  -TAV~NIT
				}
				else{
					this.addSyllable(syllables, k-4);			//  -TA~ANIT
					this.addSyllable(syllables, k-5);			//  ~TA-ANIT
				}
			}
			else if (inRange(tableNumber, 64, 64)){ // 
				this.addSyllable(syllables, k-3);				//  -ZA~VIT
			}
			else if (inRange(tableNumber, 65, 65)){ // 
				this.addSyllable(syllables, k-3);				//  -RAK-DA~NIT
				this.addSyllable(syllables, k-4);				//  -RAK~DA-NIT
			}
			else if (inRange(tableNumber, 66, 66)){ // 
				this.addSyllable(syllables, k-3);				//  -SHE~RIT
				this.addSyllable(syllables, k-5);				//  ~SHE-RIT
			}
			else {
				System.out.println("Error A.IV. Table #"+tableNumber);
			}
		}
	}

	/*
	 * 	LUACH B - KMUTSIM-ZIHRIIM:
	 */

	private void singleSyllableB(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 67, 74)){
			// NO NEW SYLLABLES
		}
	}

	private void existingVowelPrecidingKamatsB(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 75, 98)){
			int k = word.size();
			if (inRange(tableNumber, 75, 80)){ // THE WORD ENDS WITH COMPLETE VOWEL - KAMATS
				this.addSyllable(syllables, k-2);				//  -O~LAM
			}
			else if (inRange(tableNumber, 81, 90)){ // THE WORD ENDS WITH SHVA_NAH - KAMATS
				if(!this.isAlefOrAin(word.get(k-3))){
					this.addSyllable(syllables, k-2);			//  -AH~BAR
				}
				else{
					this.addSyllable(syllables, k-3);			//  -MA~AHAL				
				}
			}
			else if (inRange(tableNumber, 91, 92)){ // THE WORD ENDS WITH DAGESH_HAZAK + KAMATS
				this.addSyllable(syllables, k-2);				//  -E~KAR
				this.addSyllable(syllables, k-3);				//  ~E-KAR
			}
			else if (inRange(tableNumber, 93, 93)){ // 
				this.addSyllable(syllables, k-2);				//  -PAR~NAS
				this.addSyllable(syllables, k-4);				//  ~PA-NAS
			}
			else if (inRange(tableNumber, 94, 96)){ // THE WORD ENDS WITH DAGESH_HAZAK + KAMATS
				this.addSyllable(syllables, k-2);				//  -KI~KAR
				this.addSyllable(syllables, k-3);				//  ~KI-KAR
			}
			else if (inRange(tableNumber, 97, 98)){ // 
				this.addSyllable(syllables, k-2);				//  -MLU~MAD
				this.addSyllable(syllables, k-4);				//  ~MLU-MAD
			}
			else {
				System.out.println("Error B.II. Table #"+tableNumber);
			}
		}
	}

	private void cancelledVowelPrecidingKamatsB(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 99, 110)){
			int k = word.size();
			if (inRange(tableNumber, 99, 107)){ // THE WORD ENDS WITH KAMATS - KAMATS
				this.addSyllable(syllables, k-2);				//  -ZA~NAV
			}
			else if (inRange(tableNumber, 108, 110)){ // THE WORD ENDS WITH TSERE - KAMATS
				this.addSyllable(syllables, k-2);				//  -SE~AR
				this.addSyllable(syllables, k-3);				//  ~SE-AR
			}
			else {
				System.out.println("Error B.III. Table #"+tableNumber);
			}
		}
	}

	/*
	 * 	LUACH C - KMUTSIM-NIKBIIM:
	 */

	private void existingVowelPrecidingKamatsHeyC(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 111, 134)){
			int k = word.size();
			if (inRange(tableNumber, 111, 116)){ // THE WORD ENDS WITH COMPLETE VOWEL - KAMATS_HEY
				this.addSyllable(syllables, k-2);				//  -DO~DA
			}
			else if (inRange(tableNumber, 117, 117)){ // ??? SPECIAL CASE THE WORD ENDS WITH COMPLETE VOWEL - KAMATS_HEY
				this.addSyllable(syllables, k-2);				//  -BA-GO~DA
				this.addSyllable(syllables, k-4);				//  -BA~GO-DA
			}
			else if (inRange(tableNumber, 118, 124)){ // THE WORD ENDS WITH SHVA_NAH - KAMATS_HEY
				if(!this.isAlefOrAinOrHet(word.get(k-3))){
					this.addSyllable(syllables, k-2);			//  -YAL~DA
					this.addSyllable(syllables, k-4);			//  ~YAL-DA
				}
				else{
					this.addSyllable(syllables, k-3);			//  -TA~HANA
					this.addSyllable(syllables, k-4);			//  ~TA-HANA
				}
			}
			else if (inRange(tableNumber, 125, 126)){ // THE WORD ENDS WITH MISHLAL KATLA/KUTLA
				this.addSyllable(syllables, k-2);				//  -DUG~MA
			}
			else if (inRange(tableNumber, 127, 127)){ // 
				this.addSyllable(syllables, k-3);				//  -AH-SA~NYA
				this.addSyllable(syllables, k-4);				//  -AH~SA-NYA
				this.addSyllable(syllables, k-6);				//  ~AH-SA-NYA
			}
			else if (inRange(tableNumber, 128, 128)){ // 
				this.addSyllable(syllables, k-3);				//  -ITS~TLA
				this.addSyllable(syllables, k-5);				//  -ITS~TLA
			}
			else if (inRange(tableNumber, 129, 134)){ // THE WORD ENDS WITH SDAGESH_HADAK + KAMATS_HEY
				this.addSyllable(syllables, k-2);				//  -SU~KA
			}
			else {
				System.out.println("Error C.I. Table #"+tableNumber);
			}
		}
	}
	
	private void kamatsPrecidingKamatsHeyC(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 135, 155)){
			int k = word.size();
			if (inRange(tableNumber, 135, 137)){ // THE WORD ENDS WITH KAMATS - KAMATS_HEY
				this.addSyllable(syllables, k-2);				//  -SH~NA
				this.addSyllable(syllables, k-3);				//  ~SH-NA
			}
			else if (inRange(tableNumber, 138, 141)){ // THE WORD ENDS WITH MISHKAL KTALA
				this.addSyllable(syllables, k-2);				//  -NDA~VA
				this.addSyllable(syllables, k-4);				//  ~NDA-VA
			}
			else if (inRange(tableNumber, 142, 143)){ // THE WORD ENDS WITH MISHKAL KTALA & PEH HAPOAL IS GRONIT
				this.addSyllable(syllables, k-2);				//  -AD~MA
				this.addSyllable(syllables, k-4);				//  ~AD-MA
			}
			else if (inRange(tableNumber, 144, 145)){ // THE WORD ENDS WITH MISHKAL KATALA
				this.addSyllable(syllables, k-2);				//  -MA-TA~NA
				this.addSyllable(syllables, k-3);				//  -MA~TA-NA
			}
			else if (inRange(tableNumber, 146, 150)){ // THE WORD ENDS WITH MISHKAL HAKTALA 
				if (tableNumber == 149){
					this.addSyllable(syllables, k-2);			//  -HANA~HA
				}
				else {
					this.addSyllable(syllables, k-2);			//  -HEA~RA
					this.addSyllable(syllables, k-3);			//  -HE~A-RA
				}
			}
			else if (inRange(tableNumber, 151, 155)){ // THE WORD ENDS WITH MISHKAL HAKTALA 
				if (tableNumber == 151){
					this.addSyllable(syllables, k-2);			//  -ATA~RA
				}
				else {
					this.addSyllable(syllables, k-2);			//  -MO-RA~SHA
					this.addSyllable(syllables, k-3);			//  -MO~RA-SHA
				}
			}
			else {
				System.out.println("Error C.II. Table #"+tableNumber);
			}
		}
	}
	
	private void tserePrecidingKamatsHeyC(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 156, 167)){
			int k = word.size();
			if (inRange(tableNumber, 156, 158)){ // THE WORD ENDS WITH TSERE - KAMATS_HEY
				this.addSyllable(syllables, k-2);				//  -PE~AH
			}
			else if (inRange(tableNumber, 159, 160)){ // THE WORD ENDS WITH MISHKAL KTELA
				this.addSyllable(syllables, k-2);				//  -NVE~LA
			}
			else if (inRange(tableNumber, 161, 163)){ // THE WORD ENDS WITH MISHKAL MAKTELA/TAKTELA
				this.addSyllable(syllables, k-2);				//  -MAD-RE~GA
				this.addSyllable(syllables, k-3);				//  -MAD~RE-GA
			}
			else if (inRange(tableNumber, 164, 167)){ // THE WORD ENDS WITH MISHKAL MAKTELA/TAKTELA
				if(tableNumber == 164){
					this.addSyllable(syllables, k-2);			//  -SHHE~NA
				}
				else{
					this.addSyllable(syllables, k-2);			//  -TO-HE~HA
					this.addSyllable(syllables, k-3);			//  -TO~HE-HA
				}
			}
			else {
				System.out.println("Error C.III. Table #"+tableNumber);
			}
		}
	}
	
	/*
	 * 	LUACH D - TSRUIIM:
	 */
	
	private void singleSyllableD(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 168, 173)){
			// NO NEW SYLLABLES
		}
	}
	
	private void existingVowelPrecidingTsereD(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 174, 194)){
			int k = word.size();
			if (inRange(tableNumber, 174, 178)){ // THE WORD ENDS WITH COMPLETE VOWEL - TSERE
				if (tableNumber == 177){
					this.addSyllable(syllables, k-2);			//  -MSHO~RER
				}
				else{
					this.addSyllable(syllables, k-2);			//  -MIT-KO~MEM
					this.addSyllable(syllables, k-4);			//  -MIT~KO-MEM
				}
			}
			else if (inRange(tableNumber, 179, 183)){ // THE WORD ENDS WITH SHVA_NAH - TSERE
				if (tableNumber == 182){
					this.addSyllable(syllables, k-3);			//  -MAH~BE
				}
				else{
					this.addSyllable(syllables, k-2);			//  -MAS~MER
				}
			}
			else if (inRange(tableNumber, 184, 186)){ // THE WORD IS IN MISHKAL HEKTEL
				this.addSyllable(syllables, k-2);				//  -HEV~DEL
			}
			else if (inRange(tableNumber, 187, 192)){ // THE WORD ENDS WITH DAGESH_HAZAK + TSERE
				this.addSyllable(syllables, k-2);				//  -MNA~HEL
			}
			else if (inRange(tableNumber, 192, 194)){ // THE WORD IS IN MISHKAL HEKTEL
				this.addSyllable(syllables, k-2);				//  -HE~SEG
			}
			else {
				System.out.println("Error D.II. Table #"+tableNumber);
			}
		}
	}
	
	private void cancelledVowelPrecidingTsereD(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 195, 207)){
			int k = word.size();
			if (inRange(tableNumber, 195, 202)){ // THE WORD ENDS WITH KAMATS - TSERE
				this.addSyllable(syllables, k-2);				//  -HA~TSER	
			}
			else if (inRange(tableNumber, 203, 204)){ // 
				if (tableNumber == 203){
					this.addSyllable(syllables, k-2);			//  -MSHA~RET
				}
				else{
					this.addSyllable(syllables, k-2);			//  -MIT-PA~ER
					this.addSyllable(syllables, k-3);			//  -MIT~PA-ER
				}
			}
			else if (inRange(tableNumber, 205, 207)){ // THE WORD ENDS WITH TSERE - TSERE
				this.addSyllable(syllables, k-2);				//  -ME~FER
			}
			else {
				System.out.println("Error D.III. Table #"+tableNumber);
			}
		}
	}
	
	private void namesInSegolInsteadOfTsereD(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 208, 210)){
			int k = word.size();
			if (inRange(tableNumber, 208, 209)){ // 
				this.addSyllable(syllables, k-2);				//  -HA~TSER	
			}
			else if (inRange(tableNumber, 210, 210)){ // 
			}
			else {
				System.out.println("Error D.IV. Table #"+tableNumber);
			}
		}
	}
	
	/*
	 * 	LUACH E - NAMES ENDING WITH SEGOL - HEY:
	 */
	
	private void existingVowelPrecidingSegolHeyE(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 211, 220)){
			int k = word.size();
			if (inRange(tableNumber, 211, 212)){ // THE WORD ENDS WITH COMPLETE VOWEL - SEGOL - HEY
				this.addSyllable(syllables, k-2);				//  -MO~RE
				this.addSyllable(syllables, k-4);				//  ~MO-RE
			}
			else if (inRange(tableNumber, 213, 220)){ // THE WORD ENDS WITH SHVA_NAH - TSERE
				if ((tableNumber != 216)&&(tableNumber != 217)){
					this.addSyllable(syllables, k-2);			//  -MIK~RE
				}
				else{
					this.addSyllable(syllables, k-3);			//  MAA~SE
				}
			}
			else {
				System.out.println("Error E.I. Table #"+tableNumber);
			}
		}
	}
	
	private void cancelledVowelPrecidingSegolHeyE(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 221, 227)){
			int k = word.size();
			if (inRange(tableNumber, 221, 225)){ // THE WORD ENDS WITH KAMATS/TSERE - SEGOL - HEY
				this.addSyllable(syllables, k-2);				//  -KA~NE
			}
			else if (inRange(tableNumber, 226, 227)){ // SINGULAR INFLECTIONS ENDIN WITH SEGOL - HEY
			}
			else {
				System.out.println("Error E.II. Table #"+tableNumber);
			}
		}
	}
	
	/*
	 * 	LUACH F - PATUHIIM:
	 */
	
	private void singleSyllableF(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 228, 237)){
			// NO NEW SYLLABLES
		}
	}
	
	private void existingVowelPrecidingPatahF(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 238, 248)){
			int k = word.size();
			if (inRange(tableNumber, 238, 240)){ // THE WORD ENDS WITH COMPLETE VOWEL - PATAH
				this.addSyllable(syllables, k-2);				//  -MU~SAH
				this.addSyllable(syllables, k-4);				//  ~MU-SAH
			}
			else if (inRange(tableNumber, 241, 244)){ // THE WORD ENDS WITH SHVA_NAH - PATAH
				if (tableNumber != 242){
					this.addSyllable(syllables, k-2);			//  -MEL~TSAR
				}
				else{
					this.addSyllable(syllables, k-3);			//  -MA~HVAT
				}
			}
			else if (inRange(tableNumber, 245, 246)){ // THE WORD ENDS WITH COMPLETE SHVA_NAH - AIN + PATAH
				this.addSyllable(syllables, k-2);				//  -EM~TSA
			}
			else if (inRange(tableNumber, 247, 248)){ // THE WORD ENDS WITH COMPLETE SHVA_NAH - AIN + PATAH
				if (tableNumber != 247){
					this.addSyllable(syllables, k-3);			//  -GA~BAI
				}
				else{
																//  -TN~AI
				}
				
			}
			else {
				System.out.println("Error F.I. Table #"+tableNumber);
			}
		}
	}
	
	private void cancelledVowelPrecidingPatahF(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 249, 253)){
			int k = word.size();
			if (inRange(tableNumber, 249, 250)){ // 
				this.addSyllable(syllables, k-2);				//  -NA~MAK
			}
			else if (inRange(tableNumber, 251, 253)){ // THE WORD ENDS TSERE - PATAH
				this.addSyllable(syllables, k-2);				//  -EM~TSA
			}
			else {
				System.out.println("Error F.I. Table #"+tableNumber);
			}
		}
	}
	
	/*
	 * 	LUACH G - HALUMIIM:
	 */
	
	private void singleSyllableG(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 254, 258)){
			// NO NEW SYLLABLES
		}
	}
	
	private void existingVowelPrecidingHolamHG(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 259, 266)){
			int k = word.size();
			if (inRange(tableNumber, 259, 263)){ // THE WORD ENDS WITH COMPLETE VOWEL - HOLAM_H
				if(tableNumber != 262){
					this.addSyllable(syllables, k-2);			//  -KAR~SOL
					this.addSyllable(syllables, k-4);			//  ~KAR-SOL
				}
				else{
					this.addSyllable(syllables, k-3);			//  -MA~AROM
				}
			}
			else if (inRange(tableNumber, 264, 266)){ // THE WORD ENDS WITH SHVA_NAH - PATAH
				if (tableNumber != 242){
					this.addSyllable(syllables, k-2);			//  -GIV~OL
					this.addSyllable(syllables, k-4);			//  ~GIV-OL
				}
			}
			else {
				System.out.println("Error G.II. Table #"+tableNumber);
			}
		}
	}
	
	private void cancelledVowelPrecidingHolamHG(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 267, 269)){
			int k = word.size();
			if (inRange(tableNumber, 267, 269)){ // THE WORD ENDS WITH KAMATS - HOLAM_H
					this.addSyllable(syllables, k-2);			//  -A~DOM
					this.addSyllable(syllables, k-3);			//  ~A-DOM
			}
			else {
				System.out.println("Error G.III. Table #"+tableNumber);
			}
		}
	}
	
	private void masculanSegolH(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 270, 300)){
			int k = word.size();
			if (inRange(tableNumber, 270, 287)){ // THE WORD IS IN MISHKAL KETEL (FIRST E IS SEGOL)
					this.addSyllable(syllables, k-2);			//  -DE~LET
			}
			else if (inRange(tableNumber, 288, 293)){ // THE WORD IS IN MISHKAL KETEL (FIRST E IS TSERE)
				this.addSyllable(syllables, k-2);				//  -SE~FER
			}
			else if (inRange(tableNumber, 294, 300)){ // THE WORD IS IN MISHKAL KOTEL
				this.addSyllable(syllables, k-2);				//  -GO~REN
			}
			else {
				System.out.println("Error H.I. Table #"+tableNumber);
			}
		}
	}
	
	private void feminineSegolH(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 301, 330)){
			int k = word.size();
			if (inRange(tableNumber, 301, 314)){ // THE WORD IS IN MISHKAL MIKTELET/KATELET/KITELET/...
				if(inRange(tableNumber, 301, 302)){
					this.addSyllable(syllables, k-2);			//  -GVE~RET
				}
				else{
					this.addSyllable(syllables, k-2);			//  -AR-NE~VET
					this.addSyllable(syllables, k-3);			//  -AR~NE-VET
				}
			}
			else if (inRange(tableNumber, 315, 322)){ // 
				if (tableNumber == 320){
					this.addSyllable(syllables, k-2);			//  -MIT-NA-DE~VET
					this.addSyllable(syllables, k-3);			//  -MIT-NA~DE-VET
					this.addSyllable(syllables, k-4);			//  -MIT~NA-DE-VET
				}
				else{
					this.addSyllable(syllables, k-2);			//  -PO-E~LET
					this.addSyllable(syllables, k-3);			//  -PO~E-LET
				}
			}
			else if (inRange(tableNumber, 323, 323)){ // 
				this.addSyllable(syllables, k-2);				//  -MAS-KE~LET
				this.addSyllable(syllables, k-3);				//  -MAS~KE-LET
			}
			else if (inRange(tableNumber, 324, 330)){ // THE WORD IS IN MISHKAL KTOLET/MIKTOLET/TIKTOLET/KATOLET...
				if(tableNumber == 324){
					this.addSyllable(syllables, k-2);			//  -KTO~VAT
				}
				else{
					this.addSyllable(syllables, k-2);			//  -TI-NO~KET
					this.addSyllable(syllables, k-3);			//  -TI~NO-KET
				}
			}
			else {
				System.out.println("Error H.II. Table #"+tableNumber);
			}
		}
	}
	
	private void nehshalimH(ArrayList<HebrewLetter> word, ArrayList<Integer> syllables, int tableNumber){
		if (inRange(tableNumber, 331, 347)){
			int k = word.size();
			if (inRange(tableNumber, 331, 332)){ // 
					this.addSyllable(syllables, k-2);			//  -TA~VEH
			}
			else if (inRange(tableNumber, 333, 338)){ // THE WORD IS IN MISHKAL KAIL
				this.addSyllable(syllables, k-2);				//  -TA~ISH
			}
			else if (inRange(tableNumber, 339, 343)){ // LAMED"HEY
																//  -GO~REN
			}
			else if (inRange(tableNumber, 344, 346)){ // 
				this.addSyllable(syllables, k-2);				//  -KO~SHI
			}
			else if (inRange(tableNumber, 347, 347)){ // LAMED"VAV
				this.addSyllable(syllables, k-2);				//  -A~HU
			}
			else {
				System.out.println("Error H.III. Table #"+tableNumber);
			}
		}
	}

	public String toString(){
		String ret = new String("");
		for(int i=0; i<this._baseWords.size();i++){ 
			ret += this._baseWords.get(i).toString()+ ": "+this._syllabledWords.get(i).toString()+"\n";
		}
		return ret;
	}

	public String toString(int[] tableNum){
		String ret = new String("");
		for(int i=0; i<this._baseWords.size();i++){ 
			ret += this._baseWords.get(i).toString()+ ": "+this._syllabledWords.get(i).toString()+" "+tableNum[i]+"\n";
		}
		return ret;
	}
}
