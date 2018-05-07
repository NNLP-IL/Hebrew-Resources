package classDistanceMetrices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import stringTools.EditDistanceCalculatorForTableMetric;
import table.Table;
import tablesManegment.TableGetter;
import hebrewVerb.VerbInflection;
import letters.*;


/**
 * 
 * @author ערן
 * This metric represents the similarity between the difference tables by the following scheme:
 *   if the tables are not of the same BINYAN: 
 *   		the difference is 1.
 * 	 else:
 * 			t1-t2Diff = 0
 * 			totalNumOfCells = number of existing morphology types in t1 OR t2 
 * 								(not including spelling)
 * 			for each cell in the table (a cell corresponds to morphology without spelling),
 * 				if the conjunction of the 
 * 					(inflections in the cell of table 1 and inflections in the cell of table 2)
 * 					is not empty: 
 * 						for each morphology:
 * 							if word differs in SHVA<->HATAF & DAGESH ONLY:
 * 								t1-t2Diff += 0.1*(number of such differences)
 * 							else if there is a difference:
 * 								t1-t2Diff += 0.8
 * 				else: t1-t2Diff++
 * 			the difference is t1-t2Diff/totalNumOfMorphologies
 */

public class VerbTablesDistanceMatric extends ClassDistanceMetric{

	protected Table[] _a;
	protected Table[] _b;
	protected Table[] _c;
	protected Table[] _d;
	protected Table[] _e;
	protected Table[] _f;
	protected Table[] _g;

	protected String[] _aNames;
	protected String[] _bNames;
	protected String[] _cNames;
	protected String[] _dNames;
	protected String[] _eNames;
	protected String[] _fNames;
	protected String[] _gNames;

	protected int[] _aBaseWordSize;
	protected int[] _bBaseWordSize;
	protected int[] _cBaseWordSize;
	protected int[] _dBaseWordSize;
	protected int[] _eBaseWordSize;
	protected int[] _fBaseWordSize;
	protected int[] _gBaseWordSize;

	public VerbTablesDistanceMatric(){
		super(TableGetter.getFlatBinyanimTableNames());
		List<Table[]> tables = TableGetter.getNewBinyanimTables();
		this._a = tables.get(0); this._b = tables.get(1); this._c = tables.get(2); 
		this._d = tables.get(3); this._e = tables.get(4); this._f = tables.get(5); 
		this._g = tables.get(6);
		List<String[]> tableNames = TableGetter.getBinyanimTableNames();
		this._aNames = tableNames.get(0); this._bNames = tableNames.get(1); 
		this._cNames = tableNames.get(2); this._dNames = tableNames.get(3);
		this._eNames = tableNames.get(4); this._fNames = tableNames.get(5); 
		this._gNames = tableNames.get(6);
		List<int[]> tablesBaseWordLength = TableGetter.getBinyanimTablesBaseWordLength();
		this._aBaseWordSize = tablesBaseWordLength.get(0); 
		this._bBaseWordSize = tablesBaseWordLength.get(1); 
		this._cBaseWordSize = tablesBaseWordLength.get(2); 
		this._dBaseWordSize = tablesBaseWordLength.get(3);
		this._eBaseWordSize = tablesBaseWordLength.get(4); 
		this._fBaseWordSize = tablesBaseWordLength.get(5); 
		this._gBaseWordSize = tablesBaseWordLength.get(6);
		fillDistanceForBinyan(this._a, this._aNames, this._aBaseWordSize);
		fillDistanceForBinyan(this._b, this._bNames, this._bBaseWordSize);
		fillDistanceForBinyan(this._c, this._cNames, this._cBaseWordSize);
		fillDistanceForBinyan(this._d, this._dNames, this._dBaseWordSize);
		fillDistanceForBinyan(this._e, this._eNames, this._eBaseWordSize);
		fillDistanceForBinyan(this._f, this._fNames, this._fBaseWordSize);
		fillDistanceForBinyan(this._g, this._gNames, this._gBaseWordSize);
	}

	private void fillDistanceForBinyan(Table[] binyan, String[] binyanNames, int[] binyanBaseWordSize){
		for(int i=0; i<binyan.length; i++){
			for(int j=0; j<binyan.length; j++){
				if(binyanBaseWordSize[i] == binyanBaseWordSize[j]){
					if(binyan[i].getInflections().isEmpty()){
						binyan[i].addToBaseVerbs(this.makeMockupWord(binyanBaseWordSize[i]));
						binyan[i].inflectVerbs();
					}
					List<VerbInflection> iWords = binyan[i].getInflections().get(0);
					if(binyan[j].getInflections().isEmpty()){
						binyan[j].addToBaseVerbs(this.makeMockupWord(binyanBaseWordSize[j]));
						binyan[j].inflectVerbs();
					}
					List<VerbInflection> jWords = binyan[j].getInflections().get(0);
					HashMap<String, List<VerbInflection>> morphologiesI = this.getMorphologyToInflectionsMap(iWords);
					HashMap<String, List<VerbInflection>> morphologiesJ = this.getMorphologyToInflectionsMap(jWords);
					HashMap<String, List<VerbInflection>> allMorphs = this.getMorphologyToInflectionsMap(iWords);
					for(String morph : morphologiesJ.keySet()){
						allMorphs.put(morph, morphologiesJ.get(morph));
					}
					double totalMorphologyTypes = allMorphs.size();
					double tableMatchScore = 0;
					for(String morph : allMorphs.keySet()){
						if(morphologiesJ.containsKey(morph)&&morphologiesI.containsKey(morph)){
							int minMatchScore = Integer.MAX_VALUE;
							//VerbInflection matchA = null;
							//VerbInflection matchB = null;
							List<VerbInflection> iInfs = morphologiesI.get(morph);
							List<VerbInflection> jInfs = morphologiesJ.get(morph);
							EditDistanceCalculatorForTableMetric edc = new EditDistanceCalculatorForTableMetric(0, 1, 5, 6, 6);
							for(VerbInflection infI : iInfs){
								for(VerbInflection infJ : jInfs){
									// ignoring SHVAIIM
									String w1 = infI.toString().replace(HebrewLetter.DAGESH, "");
									String w2 = infJ.toString().replace(HebrewLetter.DAGESH, "");
									int currentMatchScore = edc.calc(w1, w2);
									if(currentMatchScore<minMatchScore){
										minMatchScore = currentMatchScore;
										//matchA = infI;
										//matchB = infJ;
									}
								}
							}
							//if(binyanNames[i].equals("F4")&&binyanNames[j].equals("F5")){
							//	System.out.println(matchA.toString()+","+matchB.toString()+","+minMatchScore);
							//}
							if (0<=minMatchScore&&minMatchScore<=4){
								// diff only in SHVA<->HATAF
								tableMatchScore +=0.1*minMatchScore;
							} else if(4<minMatchScore){
								// diff in vocalization or length
								tableMatchScore +=0.8;
							} else{ 
								// same word
								tableMatchScore +=0;
							}
							// Math.sqrt((double)minMatchScore/(double)(5*Math.max(matchA.toString().length(), matchB.toString().length())))
						}else{
							// some morphology exists in one table but not in the other
							tableMatchScore +=1;
						}
					}
					double distance = tableMatchScore/totalMorphologyTypes;
					this.putDistance(binyanNames[i], binyanNames[j], distance);
				}
			}
		}
	}

	private HebrewLetter[] makeMockupWord(int size){
		HebrewLetter[] ret = new HebrewLetter[size];
		for(int i=0; i<size; i++){
			ret[i] = new Bet();
		}
		return ret;
	}

	private HashMap<String, List<VerbInflection>> getMorphologyToInflectionsMap(List<VerbInflection> inflections){
		HashMap<String, List<VerbInflection>> morphologyToInflections = new HashMap<String, List<VerbInflection>>();
		for (VerbInflection iInf : inflections){
			String morph = getMorphologyWithoutSpelling(iInf);
			if(!morphologyToInflections.containsKey(morph)){
				List<VerbInflection> infs = new ArrayList<VerbInflection>();
				infs.add(iInf);
				morphologyToInflections.put(morph, infs);
			} else{
				List<VerbInflection> infs = morphologyToInflections.get(morph);
				infs.add(iInf);
				morphologyToInflections.put(morph, infs);
			}
		}
		return morphologyToInflections;
	}

	private String getMorphologyWithoutSpelling(VerbInflection inf){
		return inf.getTime().toString() + inf.getPerson().toString() + inf.getGender().toString() + inf.getNumber().toString();
	}
}
