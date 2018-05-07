package tablesTests;

import java.util.ArrayList;

import table.Table;
import hebrewVerb.VerbInflection;
import junit.framework.TestCase;
import a.*;
import b.*;
import c.*;
import d.*;
import e.*;
import f.*;
import g.*;
import letters.*;

public class NumberOfVerbsInTableTests extends TestCase{

	public NumberOfVerbsInTableTests(String name){
		super(name);
	}
	
	public void testTablesNumberOfInflectionsA(){
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		A5 a5 = new A5();
		A6 a6 = new A6();
		A7 a7 = new A7();
		A8 a8 = new A8();
		A9 a9 = new A9();
		A10 a10 = new A10();
		A11 a11 = new A11();
		A12 a12 = new A12();
		A13 a13 = new A13();
		A14 a14 = new A14();
		A15 a15 = new A15();
		A16 a16 = new A16();
		A17 a17 = new A17();
		A18 a18 = new A18();
		A19 a19 = new A19();
		A20 a20 = new A20();
		A21 a21 = new A21();
		A22 a22 = new A22();
		A23 a23 = new A23();
		A24 a24 = new A24();
		A25 a25 = new A25();
		A26 a26 = new A26();
		A27 a27 = new A27();
		A28 a28 = new A28();
		A29 a29 = new A29();
		A30 a30 = new A30();
		A31 a31 = new A31();
		A32 a32 = new A32();
		A33 a33 = new A33();
		A34 a34 = new A34();
		A35 a35 = new A35();
		A36 a36 = new A36();
		A37 a37 = new A37();
		A38 a38 = new A38();
		A39 a39 = new A39();
		A40 a40 = new A40();
		A41 a41 = new A41();
		A42 a42 = new A42();
		A43 a43 = new A43();
		A44 a44 = new A44();
		A44 a45 = new A45();
		A46 a46 = new A46();
		A47 a47 = new A47();
		A48 a48 = new A48();
		A49 a49 = new A49();
		A50 a50 = new A50();
		A51 a51 = new A51();
		A52 a52 = new A52();
		A53 a53 = new A53();
		A54 a54 = new A54();
		A55 a55 = new A55();
		A56 a56 = new A56();
		A57 a57 = new A57();
		
		HebrewLetter[] larr1 = {new Shin(), new Peh(), new KafSofit()};		//	SHAFACH  //
		a1.addToBaseVerbs(larr1);
		HebrewLetter[] larr1X2 = {new Bet(), new Dalet(), new Kuf()};		//	ZARAK  //
		a1.addToBaseVerbs(larr1X2);
		HebrewLetter[] larr2 = {new Shin(), new Bet(), new Tav()};			//	SHAVAT  //
		a2.addToBaseVerbs(larr2);
		HebrewLetter[] larr3 = {new Tsadi(), new Peh(), new NunSofit()};	//	TSAFAN  //
		a3.addToBaseVerbs(larr3);
		HebrewLetter[] larr4 = {new Lamed(), new Bet(), new Shin()};		//	LAVASH  //
		a4.addToBaseVerbs(larr4);
		HebrewLetter[] larr5 = {new Gimel(), new Dalet(), new Lamed()};		//	GADAL  //
		a5.addToBaseVerbs(larr5);
		HebrewLetter[] larr6 = {new Shin(), new Mem(), new NunSofit()};		//	SHAMAN  //
		a6.addToBaseVerbs(larr6);
		HebrewLetter[] larr7 = {new Kuf(), new Tet(), new NunSofit()};		//	KATON  //
		a7.addToBaseVerbs(larr7);
		HebrewLetter[] larr8 = {new Ain(), new Bet(), new Reish()};			//	AVAR  //
		a8.addToBaseVerbs(larr8);
		HebrewLetter[] larr9 = {new Ain(), new Gimel(), new NunSofit()};	//	AGAN  //
		a9.addToBaseVerbs(larr9);
		HebrewLetter[] larr10 = {new Het(), new Peh(), new Reish()};		//	HAFAR  //
		a10.addToBaseVerbs(larr10);
		HebrewLetter[] larr11 = {new Het(), new Reish(), new Dalet()};		//	HARAD  //
		a11.addToBaseVerbs(larr11);
		HebrewLetter[] larr12 = {new Het(), new Samech(), new Reish()};		//	HASAR  //
		a12.addToBaseVerbs(larr12);
		HebrewLetter[] larr13 = {new Het(), new Peh(), new TsadiSofit()};	//	HAFATS  //
		a13.addToBaseVerbs(larr13);
		HebrewLetter[] larr14 = {new Alef(), new Samech(), new Reish()};	//	ASAR  //
		a14.addToBaseVerbs(larr14);
		HebrewLetter[] larr15 = {new Alef(), new Reish(), new KafSofit()};	//	ARACH  //
		a15.addToBaseVerbs(larr15);
		HebrewLetter[] larr16 = {new Alef(), new Kaf(), new Lamed()};		//	ACHAL  //
		a16.addToBaseVerbs(larr16);
		HebrewLetter[] larr17 = {new Tsadi(), new Het(), new Kuf()};		//	TSAHAK  //
		a17.addToBaseVerbs(larr17);
		HebrewLetter[] larr18 = {new Nun(), new Het(), new Tav()};			//	TSAHAK  //
		a18.addToBaseVerbs(larr18);
		HebrewLetter[] larr19 = {new Tet(), new Het(), new NunSofit()};		//	TAHAN  //
		a19.addToBaseVerbs(larr19);
		HebrewLetter[] larr20 = {new Alef(), new Het(), new Zain()};		//	AHAZ  //
		a20.addToBaseVerbs(larr20);
		HebrewLetter[] larr21 = {new Alef(), new Hey(), new Bet()};			//	AHAV  //
		a21.addToBaseVerbs(larr21);
		HebrewLetter[] larr22 = {new Shin(), new Kaf(), new Het()};			//	SHAHAH  //
		a22.addToBaseVerbs(larr22);
		HebrewLetter[] larr23 = {new Sin(), new Mem(), new Het()};			//	SHAHAH  //
		a23.addToBaseVerbs(larr23);
		HebrewLetter[] larr24 = {new Tav(), new Mem(), new Hey()};			//	TAMH  //
		a24.addToBaseVerbs(larr24);
		HebrewLetter[] larr25 = {new Nun(), new Peh(), new Lamed()};		//	NAFAL  //
		a25.addToBaseVerbs(larr25);
		HebrewLetter[] larr26 = {new Nun(), new Zain(), new Lamed()};		//	NAZAL  //
		a26.addToBaseVerbs(larr26);
		HebrewLetter[] larr27 = {new Nun(), new Samech(), new Ain()};		//	NASA  //
		a27.addToBaseVerbs(larr27);
		HebrewLetter[] larr28 = {new Nun(), new Tav(), new NunSofit()};		//	NATAN  //
		a28.addToBaseVerbs(larr28);
		HebrewLetter[] larr29 = {new Yod(), new Reish(), new Dalet()};		//	YARAD  //
		a29.addToBaseVerbs(larr29);
		HebrewLetter[] larr30 = {new Yod(), new Reish(), new Shin()};		//	YARASH  //
		a30.addToBaseVerbs(larr30);
		HebrewLetter[] larr31 = {new Yod(), new Shin(), new NunSofit()};	//	YASHAN  //
		a31.addToBaseVerbs(larr31);
		HebrewLetter[] larr32 = {new Yod(), new Kaf(), new Lamed()};		//	YACHAL  //
		a32.addToBaseVerbs(larr32);
		HebrewLetter[] larr33 = {new Yod(), new Dalet(), new Ain()};		//	YADA  //
		a33.addToBaseVerbs(larr33);
		HebrewLetter[] larr34 = {new Yod(), new Gimel(), new Ain()};		//	YAGA  //
		a34.addToBaseVerbs(larr34);
		HebrewLetter[] larr35 = {new Kuf(), new MemSofit()};				//	KAM  //
		a35.addToBaseVerbs(larr35);
		HebrewLetter[] larr36 = {new Mem(), new Tav()};						//	MET  //
		a36.addToBaseVerbs(larr36);
		HebrewLetter[] larr37 = {new Shin(), new Reish()};					//	SHAR  //
		a37.addToBaseVerbs(larr37);
		HebrewLetter[] larr38 = {new Bet(), new Vav(), new Shin()};			//	BOSH  //
		a38.addToBaseVerbs(larr38);
		HebrewLetter[] larr39 = {new Nun(), new Ain()};						//	NA  //
		a39.addToBaseVerbs(larr39);
		HebrewLetter[] larr40 = {new Samech(), new Bet()};					//	SAV  //
		a40.addToBaseVerbs(larr40);
		HebrewLetter[] larr41 = {new Mem(), new Tsadi(), new Alef()};		//	MATSA  //
		a41.addToBaseVerbs(larr41);
		HebrewLetter[] larr42 = {new Sin(), new Nun(), new Alef()};			//	SANA  //
		a42.addToBaseVerbs(larr42);
		HebrewLetter[] larr43 = {new Het(), new Tet(), new Alef()};			//	HATA  //
		a43.addToBaseVerbs(larr43);
		HebrewLetter[] larr44 = {new Nun(), new Sin(), new Alef()};			//	NASA  //
		a44.addToBaseVerbs(larr44);
		HebrewLetter[] larr45 = {new Yod(), new Tsadi(), new Alef()};		//	YATSA  //
		a45.addToBaseVerbs(larr45);
		HebrewLetter[] larr46 = {new Yod(), new Reish(), new Alef()};		//	YARE  //
		a46.addToBaseVerbs(larr46);
		HebrewLetter[] larr47 = {new Bet(), new Alef()};					//	BA  //
		a47.addToBaseVerbs(larr47);
		HebrewLetter[] larr48 = {new Bet(), new Nun(), new Hey()};			//	BANA  //
		a48.addToBaseVerbs(larr48);
		HebrewLetter[] larr49 = {new Kaf(), new Bet(), new Hey()};			//	KAVA  //
		a49.addToBaseVerbs(larr49);
		HebrewLetter[] larr50 = {new Ain(), new Lamed(), new Hey()};		//	ALA  //
		a50.addToBaseVerbs(larr50);
		HebrewLetter[] larr51 = {new Het(), new Samech(), new Hey()};		//	HASA  //
		a51.addToBaseVerbs(larr51);
		HebrewLetter[] larr52 = {new Alef(), new Peh(), new Hey()};			//	AFA  //
		a52.addToBaseVerbs(larr52);
		HebrewLetter[] larr53 = {new Tet(), new Ain(), new Hey()};			//	TAAH  //
		a53.addToBaseVerbs(larr53);
		HebrewLetter[] larr54 = {new Nun(), new Tet(), new Hey()};			//	NATAH  //
		a54.addToBaseVerbs(larr54);
		HebrewLetter[] larr55 = {new Yod(), new Reish(), new Hey()};		//	YARAH  //
		a55.addToBaseVerbs(larr55);
		HebrewLetter[] larr56 = {new Hey(), new Yod(), new Hey()};			//	HAYA  //
		a56.addToBaseVerbs(larr56);
		HebrewLetter[] larr57 = {new Het(), new Yod()};						//	HAY  //
		a57.addToBaseVerbs(larr57);
		inflectAndCheckNumberOfInflections(a1,62);
		inflectAndCheckNumberOfInflections(a2,50);
		inflectAndCheckNumberOfInflections(a3,62);
		inflectAndCheckNumberOfInflections(a4,53);
		inflectAndCheckNumberOfInflections(a5,41);
		inflectAndCheckNumberOfInflections(a6,41);
		inflectAndCheckNumberOfInflections(a7,49);
		inflectAndCheckNumberOfInflections(a8,50);
		inflectAndCheckNumberOfInflections(a9,50);
		inflectAndCheckNumberOfInflections(a10,62);
		inflectAndCheckNumberOfInflections(a11,41);
		inflectAndCheckNumberOfInflections(a12,41);
		inflectAndCheckNumberOfInflections(a13,51);
		inflectAndCheckNumberOfInflections(a14,67);
		inflectAndCheckNumberOfInflections(a15,46);
		inflectAndCheckNumberOfInflections(a16,56);
		inflectAndCheckNumberOfInflections(a17,41);
		inflectAndCheckNumberOfInflections(a18,40);
		inflectAndCheckNumberOfInflections(a19,53);
		inflectAndCheckNumberOfInflections(a20,83);
		inflectAndCheckNumberOfInflections(a21,64);
		inflectAndCheckNumberOfInflections(a22,54);
		inflectAndCheckNumberOfInflections(a23,42);
		inflectAndCheckNumberOfInflections(a24,54);
		inflectAndCheckNumberOfInflections(a25,64);
		inflectAndCheckNumberOfInflections(a26,52);
		inflectAndCheckNumberOfInflections(a27,53);
		inflectAndCheckNumberOfInflections(a28,63);
		inflectAndCheckNumberOfInflections(a29,42);
		inflectAndCheckNumberOfInflections(a30,40);
		inflectAndCheckNumberOfInflections(a31,47);
		inflectAndCheckNumberOfInflections(a32,41);
		inflectAndCheckNumberOfInflections(a33,53);
		inflectAndCheckNumberOfInflections(a34,40);
		inflectAndCheckNumberOfInflections(a35,46);
		inflectAndCheckNumberOfInflections(a36,46);
		inflectAndCheckNumberOfInflections(a37,43);
		inflectAndCheckNumberOfInflections(a38,49);
		inflectAndCheckNumberOfInflections(a39,41);
		inflectAndCheckNumberOfInflections(a40,64);
		inflectAndCheckNumberOfInflections(a41,53);
		inflectAndCheckNumberOfInflections(a42,53);
		inflectAndCheckNumberOfInflections(a43,55);
		inflectAndCheckNumberOfInflections(a44,63);
		inflectAndCheckNumberOfInflections(a45,40);
		inflectAndCheckNumberOfInflections(a46,41);
		inflectAndCheckNumberOfInflections(a47,46);
		inflectAndCheckNumberOfInflections(a48,52);
		inflectAndCheckNumberOfInflections(a49,52);
		inflectAndCheckNumberOfInflections(a50,53);
		inflectAndCheckNumberOfInflections(a51,65);
		inflectAndCheckNumberOfInflections(a52,53);
		inflectAndCheckNumberOfInflections(a53,40);
		inflectAndCheckNumberOfInflections(a54,63);
		inflectAndCheckNumberOfInflections(a55,52);
		inflectAndCheckNumberOfInflections(a56,44);
		inflectAndCheckNumberOfInflections(a57,44);
	}
	
	public void testTablesNumberOfInflectionsB(){
		B1 b1 = new B1();
		B2 b2 = new B2();
		B3 b3 = new B3();
		B4 b4 = new B4();
		B5 b5 = new B5();
		B6 b6 = new B6();
		B7 b7 = new B7();
		B8 b8 = new B8();
		B9 b9 = new B9();
		B10 b10 = new B10();
		B11 b11 = new B11();
		B12 b12 = new B12();
		B13 b13 = new B13();
		B14 b14 = new B14();
		B15 b15 = new B15();
		B16 b16 = new B16();
		B17 b17 = new B17();
		B18 b18 = new B18();
		B19 b19 = new B19();
		B20 b20 = new B20();
		B21 b21 = new B21();
		B22 b22 = new B22();
		B23 b23 = new B23();
		B24 b24 = new B24();
		B25 b25 = new B25();
		B26 b26 = new B26();
		B27 b27 = new B27();
		B28 b28 = new B28();
		B29 b29 = new B29();
		B30 b30 = new B30();
		B31 b31 = new B31();
		B32 b32 = new B32();
		B33 b33 = new B33();
		
		HebrewLetter[] larrB1 = {new Nun(), new Shin(), new Mem(), new Reish()};			//	NISHMAR  //
		b1.addToBaseVerbs(larrB1);
		HebrewLetter[] larrB2 = {new Nun(), new Kaf(), new Reish(), new Tav()};				//	NIHRAT  //
		b2.addToBaseVerbs(larrB2);
		HebrewLetter[] larrB3 = {new Nun(), new Tet(), new Mem(), new NunSofit()};			//	NITMAN  //
		b3.addToBaseVerbs(larrB3);
		HebrewLetter[] larrB4 = {new Nun(), new Reish(), new Tet(), new Bet()};				//	NIRTAV  //
		b4.addToBaseVerbs(larrB4);
		HebrewLetter[] larrB5 = {new Nun(), new Het(), new Shin(), new Bet()};				//	NEHSHAV  //
		b5.addToBaseVerbs(larrB5);
		HebrewLetter[] larrB6 = {new Nun(), new Ain(), new Zain(), new Reish()};			//	NEEZAR  //
		b6.addToBaseVerbs(larrB6);
		HebrewLetter[] larrB7 = {new Nun(), new Shin(), new Alef(), new Reish()};			//	NISHAR  //
		b7.addToBaseVerbs(larrB7);
		HebrewLetter[] larrB8 = {new Nun(), new Shin(), new Ain(), new NunSofit()};			//	NISHAN  //
		b8.addToBaseVerbs(larrB8);
		HebrewLetter[] larrB9 = {new Nun(), new Peh(), new Tav(), new Het()};				//	NIFTAH  //
		b9.addToBaseVerbs(larrB9);
		HebrewLetter[] larrB10 = {new Nun(), new Reish(), new Tav(), new Ain()};			//	NIRTA  //
		b10.addToBaseVerbs(larrB10);
		HebrewLetter[] larrB11 = {new Nun(), new Alef(), new Nun(), new Het()};				//	NEENAH  //
		b11.addToBaseVerbs(larrB11);
		HebrewLetter[] larrB12 = {new Nun(), new Tsadi(), new Lamed()};						//	NITSAL  //
		b12.addToBaseVerbs(larrB12);
		HebrewLetter[] larrB13 = {new Nun(), new Gimel(), new Shin()};						//	NIGASH  //
		b13.addToBaseVerbs(larrB13);
		HebrewLetter[] larrB14 = {new Nun(), new Tav(), new NunSofit()};					//	NITAN  //
		b14.addToBaseVerbs(larrB14);
		HebrewLetter[] larrB15 = {new Nun(), new Vav(), new Tsadi(), new Reish()};			//	NOTSAR  //
		b15.addToBaseVerbs(larrB15);
		HebrewLetter[] larrB16 = {new Nun(), new Vav(), new Alef(), new Shin()};			//	NOASH  //
		b16.addToBaseVerbs(larrB16);
		HebrewLetter[] larrB17 = {new Nun(), new Vav(), new Kaf(), new Het()};				//	NOHAH  //
		b17.addToBaseVerbs(larrB17);
		HebrewLetter[] larrB18 = {new Nun(), new Samech(), new Vav(), new Gimel()};			//	NASOG  //
		b18.addToBaseVerbs(larrB18);
		HebrewLetter[] larrB19 = {new Nun(), new Kaf(), new Vav(), new NunSofit()};			//	NAHON  //
		b19.addToBaseVerbs(larrB19);
		HebrewLetter[] larrB20 = {new Nun(), new Mem(), new Vav(), new Lamed()};			//	NIMOL  //
		b20.addToBaseVerbs(larrB20);
		HebrewLetter[] larrB21 = {new Nun(), new Zain(), new Vav(), new NunSofit()};		//	NIZON  //
		b21.addToBaseVerbs(larrB21);
		HebrewLetter[] larrB22 = {new Nun(), new Samech(), new Bet()};						//	NASAV  //
		b22.addToBaseVerbs(larrB22);
		HebrewLetter[] larrB23 = {new Nun(), new Kuf(), new Reish(), new Alef()};			//	NIKRA  //
		b23.addToBaseVerbs(larrB23);
		HebrewLetter[] larrB24 = {new Nun(), new Reish(), new Peh(), new Alef()};			//	NIRPA  //
		b24.addToBaseVerbs(larrB24);
		HebrewLetter[] larrB25 = {new Nun(), new Het(), new Bet(), new Alef()};				//	NEHBA  //
		b25.addToBaseVerbs(larrB25);
		HebrewLetter[] larrB26 = {new Nun(), new Sin(), new Alef()};						//	NISA  //
		b26.addToBaseVerbs(larrB26);
		HebrewLetter[] larrB27 = {new Nun(), new Dalet(), new Mem(), new Hey()};			//	NIDMAH  //
		b27.addToBaseVerbs(larrB27);
		HebrewLetter[] larrB28 = {new Nun(), new Reish(), new Alef(), new Hey()};			//	NIRAH  //
		b28.addToBaseVerbs(larrB28);
		HebrewLetter[] larrB29 = {new Nun(), new Het(), new Tsadi(), new Hey()};			//	NEHTSA  //
		b29.addToBaseVerbs(larrB29);
		HebrewLetter[] larrB30 = {new Nun(), new Hey(), new Nun(), new Hey()};				//	NEHENA  //
		b30.addToBaseVerbs(larrB30);
		HebrewLetter[] larrB31 = {new Nun(), new Ain(), new Sin(), new Hey()};				//	NAASA  //
		b31.addToBaseVerbs(larrB31);
		HebrewLetter[] larrB32 = {new Nun(), new Dalet(), new Het(), new Hey()};			//	NIDHA  //
		b32.addToBaseVerbs(larrB32);
		HebrewLetter[] larrB33 = {new Nun(), new Vav(), new Reish(), new Hey()};			//	NORA  //
		b33.addToBaseVerbs(larrB33);
		inflectAndCheckNumberOfInflections(b1,65);
		inflectAndCheckNumberOfInflections(b2,65);
		inflectAndCheckNumberOfInflections(b3,65);
		inflectAndCheckNumberOfInflections(b4,64);
		inflectAndCheckNumberOfInflections(b5,64);
		inflectAndCheckNumberOfInflections(b6,64);
		inflectAndCheckNumberOfInflections(b7,65);
		inflectAndCheckNumberOfInflections(b8,65);
		inflectAndCheckNumberOfInflections(b9,75);
		inflectAndCheckNumberOfInflections(b10,73);
		inflectAndCheckNumberOfInflections(b11,72);
		inflectAndCheckNumberOfInflections(b12,87);
		inflectAndCheckNumberOfInflections(b13,73);
		inflectAndCheckNumberOfInflections(b14,87);
		inflectAndCheckNumberOfInflections(b15,64);
		inflectAndCheckNumberOfInflections(b16,64);
		inflectAndCheckNumberOfInflections(b17,73);
		inflectAndCheckNumberOfInflections(b18,77);
		inflectAndCheckNumberOfInflections(b19,71);
		inflectAndCheckNumberOfInflections(b20,81);
		inflectAndCheckNumberOfInflections(b21,81);
		inflectAndCheckNumberOfInflections(b22,67);
		inflectAndCheckNumberOfInflections(b23,59);
		inflectAndCheckNumberOfInflections(b24,58);
		inflectAndCheckNumberOfInflections(b25,58);
		inflectAndCheckNumberOfInflections(b26,81);
		inflectAndCheckNumberOfInflections(b27,65);
		inflectAndCheckNumberOfInflections(b28,64);
		inflectAndCheckNumberOfInflections(b29,92);
		inflectAndCheckNumberOfInflections(b30,66);
		inflectAndCheckNumberOfInflections(b31,65);
		inflectAndCheckNumberOfInflections(b32,65);
		inflectAndCheckNumberOfInflections(b33,61);
	}

	public void testTablesNumberOfInflectionsC(){
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		C4 c4 = new C4();
		C5 c5 = new C5();
		C6 c6 = new C6();
		C7 c7 = new C7();
		C8 c8 = new C8();
		C9 c9 = new C9();
		C10 c10 = new C10();
		C11 c11 = new C11();
		C12 c12 = new C12();
		C13 c13 = new C13();
		C14 c14 = new C14();
		C15 c15 = new C15();
		C16 c16 = new C16();
		C17 c17 = new C17();
		C18 c18 = new C18();
		C19 c19 = new C19();
		C20 c20 = new C20();
		C21 c21 = new C21();
		C22 c22 = new C22();
		C23 c23 = new C23();
		C24 c24 = new C24();
		C25 c25 = new C25();
		C26 c26 = new C26();
		C27 c27 = new C27();
		C28 c28 = new C28();
		C29 c29 = new C29();
		C30 c30 = new C30();
		HebrewLetter[] larrC1 = {new Tet(), new Peh(), new Lamed()};						//	TIPEL  //
		c1.addToBaseVerbs(larrC1);
		HebrewLetter[] larrC2 = {new Vav(), new Samech(), new Tav()};						//	VISET  //
		c2.addToBaseVerbs(larrC2);
		HebrewLetter[] larrC3 = {new Ain(), new Shin(), new NunSofit()};					//	ISHEN  //
		c3.addToBaseVerbs(larrC3);
		HebrewLetter[] larrC4 = {new Nun(), new Hey(), new Lamed()};						//	NIHEL  //
		c4.addToBaseVerbs(larrC4);
		HebrewLetter[] larrC5 = {new Gimel(), new Reish(), new Dalet()};					//	GERED  //
		c5.addToBaseVerbs(larrC5);
		HebrewLetter[] larrC6 = {new Shin(), new Reish(), new Tav()};						//	SHERET  //
		c6.addToBaseVerbs(larrC6);
		HebrewLetter[] larrC7 = {new Tav(), new Alef(), new Reish()};						//	TAEER  //
		c7.addToBaseVerbs(larrC7);
		HebrewLetter[] larrC8 = {new Mem(), new Alef(), new NunSofit()};					//	MEEN  //
		c8.addToBaseVerbs(larrC8);
		HebrewLetter[] larrC9 = {new Tet(), new Peh(), new Het()};							//	TIPAH  //
		c9.addToBaseVerbs(larrC9);
		HebrewLetter[] larrC10 = {new Alef(), new Reish(), new Het()};						//	EREACH  //
		c10.addToBaseVerbs(larrC10);
		HebrewLetter[] larrC11 = {new Alef(), new Reish(), new Ain()};						//	ERA  //
		c11.addToBaseVerbs(larrC11);
		HebrewLetter[] larrC12 = {new Nun(), new Vav(), new Peh(), new PehSofit()};			//	NOFEF  //
		c12.addToBaseVerbs(larrC12);
		HebrewLetter[] larrC13 = {new Alef(), new Vav(), new Tav(), new Tav()};				//	OTET  //
		c13.addToBaseVerbs(larrC13);
		HebrewLetter[] larrC14 = {new Kaf(), new Vav(), new Nun(), new NunSofit()};			//	KONEN  //
		c14.addToBaseVerbs(larrC14);
		HebrewLetter[] larrC15 = {new Shin(), new Vav(), new Het(), new Het()};				//	SOHAH  //
		c15.addToBaseVerbs(larrC15);
		HebrewLetter[] larrC16 = {new Kuf(), new Nun(), new Alef()};						//	KINE  //
		c16.addToBaseVerbs(larrC16);
		HebrewLetter[] larrC17 = {new Tsadi(), new Peh(), new Hey()};						//	TSIPAH  //
		c17.addToBaseVerbs(larrC17);
		HebrewLetter[] larrC18 = {new Alef(), new Het(), new Hey()};						//	AIHA  //
		c18.addToBaseVerbs(larrC18);
		HebrewLetter[] larrC19 = {new Gimel(), new Reish(), new Hey()};						//	GERA  //
		c19.addToBaseVerbs(larrC19);
		HebrewLetter[] larrC20 = {new Bet(), new Lamed(), new Bet(), new Lamed()};			//	BILBEL  //
		c20.addToBaseVerbs(larrC20);
		HebrewLetter[] larrC21 = {new Tav(), new Kaf(), new Nun(), new Tav()};				//	TIHNET  //
		c21.addToBaseVerbs(larrC21);
		HebrewLetter[] larrC22 = {new Ain(), new Tsadi(), new Bet(), new NunSofit()};		//	ITSBEN  //
		c22.addToBaseVerbs(larrC22);
		HebrewLetter[] larrC23 = {new Shin(), new Ain(), new Reish(), new KafSofit()};		//	SHIARECH  //
		c23.addToBaseVerbs(larrC23);
		HebrewLetter[] larrC24 = {new Hey(), new Bet(), new Hey(), new Bet()};				//	HIVHEV  //
		c24.addToBaseVerbs(larrC24);
		HebrewLetter[] larrC25 = {new Alef(), new Bet(), new Het(), new NunSofit()};		//	AIVHEN  //
		c25.addToBaseVerbs(larrC25);
		HebrewLetter[] larrC26 = {new Shin(), new Kaf(), new Nun(), new Ain()};				//	SHICHNEA  //
		c26.addToBaseVerbs(larrC26);
		HebrewLetter[] larrC27 = {new Shin(), new Ain(), new Shin(), new Ain()};			//	SHIASHEA  //
		c27.addToBaseVerbs(larrC27);
		HebrewLetter[] larrC28 = {new Tet(), new Alef(), new Tet(), new Alef()};			//	TITA  //
		c28.addToBaseVerbs(larrC28);
		HebrewLetter[] larrC29 = {new Peh(), new Lamed(), new Reish(), new Tet(), new Tet()};		//	FLIRTET  //
		c29.addToBaseVerbs(larrC29);
		HebrewLetter[] larrC30 = {new Samech(), new Nun(), new Kaf(), new Reish(), new NunSofit()};	//	SINCHREN  //
		c30.addToBaseVerbs(larrC30);
		inflectAndCheckNumberOfInflections(c1,50);
		inflectAndCheckNumberOfInflections(c2,50);
		inflectAndCheckNumberOfInflections(c3,50);
		inflectAndCheckNumberOfInflections(c4,50);
		inflectAndCheckNumberOfInflections(c5,50);
		inflectAndCheckNumberOfInflections(c6,50);
		inflectAndCheckNumberOfInflections(c7,50);
		inflectAndCheckNumberOfInflections(c8,50);
		inflectAndCheckNumberOfInflections(c9,61);
		inflectAndCheckNumberOfInflections(c10,61);
		inflectAndCheckNumberOfInflections(c11,13);
		inflectAndCheckNumberOfInflections(c12,40);
		inflectAndCheckNumberOfInflections(c13,40);
		inflectAndCheckNumberOfInflections(c14,40);
		inflectAndCheckNumberOfInflections(c15,49);
		inflectAndCheckNumberOfInflections(c16,50);
		inflectAndCheckNumberOfInflections(c17,62);
		inflectAndCheckNumberOfInflections(c18,62);
		inflectAndCheckNumberOfInflections(c19,62);
		inflectAndCheckNumberOfInflections(c20,40);
		inflectAndCheckNumberOfInflections(c21,40);
		inflectAndCheckNumberOfInflections(c22,40);
		inflectAndCheckNumberOfInflections(c23,80);
		inflectAndCheckNumberOfInflections(c24,40);
		inflectAndCheckNumberOfInflections(c25,40);
		inflectAndCheckNumberOfInflections(c26,49);
		inflectAndCheckNumberOfInflections(c27,98);
		inflectAndCheckNumberOfInflections(c28,80);
		inflectAndCheckNumberOfInflections(c29,40);
		inflectAndCheckNumberOfInflections(c30,40);
	}
	
	public void testTablesNumberOfInflectionsD(){
		D1 d1 = new D1();
		D2 d2 = new D2();
		D3 d3 = new D3();
		D4 d4 = new D4();
		D5 d5 = new D5();
		D6 d6 = new D6();
		D7 d7 = new D7();
		D8 d8 = new D8();
		D9 d9 = new D9();
		D10 d10 = new D10();
		D11 d11 = new D11();
		D12 d12 = new D12();
		D13 d13 = new D13();
		D14 d14 = new D14();
		D15 d15 = new D15();
		D16 d16 = new D16();
		D17 d17 = new D17();
		D18 d18 = new D18();
		D19 d19 = new D19();
		D20 d20 = new D20();
		D21 d21 = new D21();
		D22 d22 = new D22();
		HebrewLetter[] larrD1 = {new Kaf(), new Bet(), new Dalet()};						//	KIBED  //
		d1.addToBaseVerbs(larrD1);
		HebrewLetter[] larrD2 = {new Alef(), new Mem(), new Tav()};							//	UMAT  //
		d2.addToBaseVerbs(larrD2);
		HebrewLetter[] larrD3 = {new Het(), new Samech(), new NunSofit()};					//	HUSAN  //
		d3.addToBaseVerbs(larrD3);
		HebrewLetter[] larrD4 = {new Nun(), new Het(), new MemSofit()};						//	NUHAM  //
		d4.addToBaseVerbs(larrD4);
		HebrewLetter[] larrD5 = {new Tsadi(), new Reish(), new PehSofit()};					//	TSORAF  //
		d5.addToBaseVerbs(larrD5);
		HebrewLetter[] larrD6 = {new Nun(), new Hey(), new Lamed()};						//	NOHAL  //
		d6.addToBaseVerbs(larrD6);
		HebrewLetter[] larrD7 = {new Nun(), new Tsadi(), new Het()};						//	NUTSAH  //
		d7.addToBaseVerbs(larrD7);
		HebrewLetter[] larrD8 = {new Peh(),new Vav(), new Reish(), new Reish()};			//	PORAR  //
		d8.addToBaseVerbs(larrD8);
		HebrewLetter[] larrD9 = {new Dalet(),new Kaf(), new Alef()};						//	DUKA  //
		d9.addToBaseVerbs(larrD9);
		HebrewLetter[] larrD10 = {new Zain(),new Kaf(), new Hey()};							//	ZUKAH  //
		d10.addToBaseVerbs(larrD10);
		HebrewLetter[] larrD11 = {new Alef(),new Het(), new Hey()};							//	UHA  //
		d11.addToBaseVerbs(larrD11);
		HebrewLetter[] larrD12 = {new Gimel(),new Reish(), new Hey()};						//	GORA  //
		d12.addToBaseVerbs(larrD12);
		HebrewLetter[] larrD13 = {new Zain(),new Hey(), new Hey()};							//	ZOHA  //
		d13.addToBaseVerbs(larrD13);
		HebrewLetter[] larrD14 = {new Bet(),new Lamed(), new Bet(),new Lamed()};			//	BULBAL  //
		d14.addToBaseVerbs(larrD14);
		HebrewLetter[] larrD15 = {new Tav(),new Reish(), new Bet(),new Tav()};				//	TURBAT  //
		d15.addToBaseVerbs(larrD15);
		HebrewLetter[] larrD16 = {new Tav(),new Zain(), new Mem(),new NunSofit()};			//	TUZMAN  //
		d16.addToBaseVerbs(larrD16);
		HebrewLetter[] larrD17 = {new Shin(),new Ain(), new Reish(),new KafSofit()};		//	SHUARACH  //
		d17.addToBaseVerbs(larrD17);
		HebrewLetter[] larrD18 = {new Shin(),new Lamed(), new Hey(),new Bet()};				//	SHULHAV  //
		d18.addToBaseVerbs(larrD18);
		HebrewLetter[] larrD19 = {new Shin(),new Kaf(), new Nun(),new Ain()};				//	SHUCHNA  //
		d19.addToBaseVerbs(larrD19);
		HebrewLetter[] larrD20 = {new Zain(),new Ain(), new Zain(),new Ain()};				//	ZUAZA  //
		d20.addToBaseVerbs(larrD20);
		HebrewLetter[] larrD21 = {new Tet(),new Alef(), new Tet(),new Alef()};				//	TUTA  //
		d21.addToBaseVerbs(larrD21);
		HebrewLetter[] larrD22 = {new Samech(),new Nun(), new Kaf(),new Reish(),new NunSofit()}; //	SUNCHRAN  //
		d22.addToBaseVerbs(larrD22);
		inflectAndCheckNumberOfInflections(d1,68);
		inflectAndCheckNumberOfInflections(d2,68);
		inflectAndCheckNumberOfInflections(d3,68);
		inflectAndCheckNumberOfInflections(d4,68);
		inflectAndCheckNumberOfInflections(d5,68);
		inflectAndCheckNumberOfInflections(d6,68);
		inflectAndCheckNumberOfInflections(d7,70);
		inflectAndCheckNumberOfInflections(d8,34);
		inflectAndCheckNumberOfInflections(d9,68);
		inflectAndCheckNumberOfInflections(d10,80);
		inflectAndCheckNumberOfInflections(d11,80);
		inflectAndCheckNumberOfInflections(d12,80);
		inflectAndCheckNumberOfInflections(d13,80);
		inflectAndCheckNumberOfInflections(d14,68);
		inflectAndCheckNumberOfInflections(d15,68);
		inflectAndCheckNumberOfInflections(d16,68);
		inflectAndCheckNumberOfInflections(d17,272);
		inflectAndCheckNumberOfInflections(d18,68);
		inflectAndCheckNumberOfInflections(d19,70);
		inflectAndCheckNumberOfInflections(d20,280);
		inflectAndCheckNumberOfInflections(d21,136);
		inflectAndCheckNumberOfInflections(d22,68);
	}
	
	public void testTablesNumberOfInflectionsE(){
		E1 e1 = new E1();
		E2 e2 = new E2();
		E3 e3 = new E3();
		E4 e4 = new E4();
		E5 e5 = new E5();
		E6 e6 = new E6();
		E7 e7 = new E7();
		E8 e8 = new E8();
		E9 e9 = new E9();
		E10 e10 = new E10();
		E11 e11 = new E11();
		E12 e12 = new E12();
		E13 e13 = new E13();
		E14 e14 = new E14();
		E15 e15 = new E15();
		E16 e16 = new E16();
		E17 e17 = new E17();
		E18 e18 = new E18();
		E19 e19 = new E19();
		E20 e20 = new E20();
		E21 e21 = new E21();
		E22 e22 = new E22();
		E23 e23 = new E23();
		E24 e24 = new E24();
		E25 e25 = new E25();
		E26 e26 = new E26();
		E27 e27 = new E27();
		E28 e28 = new E28();
		E29 e29 = new E29();
		E30 e30 = new E30();
		E31 e31 = new E31();
		E32 e32 = new E32();
		E33 e33 = new E33();
		E34 e34 = new E34();
		E35 e35 = new E35();
		E36 e36 = new E36();
		E37 e37 = new E37();
		E38 e38 = new E38();
		E39 e39 = new E39();
		E40 e40 = new E40();
		E41 e41 = new E41();
		E42 e42 = new E42();
		E43 e43 = new E43();
		E44 e44 = new E44();
		E45 e45 = new E45();
		E46 e46 = new E46();
		E47 e47 = new E47();
		E48 e48 = new E48();
		E49 e49 = new E49();
		E50 e50 = new E50();
		E51 e51 = new E51();
		E52 e52 = new E52();
		E53 e53 = new E53();
		E54 e54 = new E54();
		E55 e55 = new E55();
		E56 e56 = new E56();
		E57 e57 = new E57();
		E58 e58 = new E58();
		E59 e59 = new E59();
		E60 e60 = new E60();
		HebrewLetter[] larrE1 = {new Hey(), new Tav(), new Lamed(), new Bet(), new Shin()};			//	HITLABESH  //
		e1.addToBaseVerbs(larrE1);
		HebrewLetter[] larrE2 = {new Hey(), new Tav(), new Ain(), new Shin(), new Tav()};			//	HITASHET  //
		e2.addToBaseVerbs(larrE2);
		HebrewLetter[] larrE3 = {new Hey(), new Tav(), new Het(), new Tav(), new NunSofit()};		//	HITHATEN  //
		e3.addToBaseVerbs(larrE3);
		HebrewLetter[] larrE4 = {new Hey(), new Shin(), new Tav(), new Lamed(), new Bet()};			//	HISHTALEV  //
		e4.addToBaseVerbs(larrE4);
		HebrewLetter[] larrE5 = {new Hey(), new Shin(), new Tav(), new Kaf(), new NunSofit()};		//	HISHTAKEN  //
		e5.addToBaseVerbs(larrE5);
		HebrewLetter[] larrE6 = {new Hey(), new Tsadi(), new Tet(), new Lamed(), new MemSofit()};	//	HITSTALEM  //
		e6.addToBaseVerbs(larrE6);
		HebrewLetter[] larrE7 = {new Hey(), new Zain(), new Dalet(), new Kuf(), new Kuf()};			//	HIZDAKEK  //
		e7.addToBaseVerbs(larrE7);
		HebrewLetter[] larrE8 = {new Hey(), new Zain(), new Dalet(), new Mem(), new NunSofit()};	//	HIZDAMEN  //
		e8.addToBaseVerbs(larrE8);
		HebrewLetter[] larrE9 = {new Hey(), new Tav(), new Reish(), new Het(), new TsadiSofit()};	//	HITRAHETS  //
		e9.addToBaseVerbs(larrE9);
		HebrewLetter[] larrE10 = {new Hey(), new Samech(), new Tav(), new Ain(), new Reish()};		//	HISTAER  //
		e10.addToBaseVerbs(larrE10);
		HebrewLetter[] larrE11 = {new Hey(), new Tsadi(), new Tet(), new Ain(), new Reish()};		//	HITSTAER  //
		e11.addToBaseVerbs(larrE11);
		HebrewLetter[] larrE12 = {new Hey(), new Zain(), new Dalet(), new Ain(), new Kuf()};		//	HIZDAEK  //
		e12.addToBaseVerbs(larrE12);
		HebrewLetter[] larrE13 = {new Hey(), new Tav(), new Gimel(), new Reish(), new Shin()};		//	HITGARESH  //
		e13.addToBaseVerbs(larrE13);
		HebrewLetter[] larrE14 = {new Hey(), new Samech(), new Tav(), new Reish(), new Kuf()};		//	HISTAREK  //
		e14.addToBaseVerbs(larrE14);
		HebrewLetter[] larrE15 = {new Hey(), new Tsadi(), new Tet(), new Reish(), new PehSofit()};	//	HITSTAREF  //
		e15.addToBaseVerbs(larrE15);
		HebrewLetter[] larrE16 = {new Hey(), new Zain(), new Dalet(), new Reish(), new Zain()};		//	HIZDAREZ  //
		e16.addToBaseVerbs(larrE16);
		HebrewLetter[] larrE17 = {new Hey(), new Tav(), new Peh(), new Alef(), new Reish()};		//	HITPAER  //
		e17.addToBaseVerbs(larrE17);
		HebrewLetter[] larrE18 = {new Hey(), new Samech(), new Tav(), new Alef(), new Bet()};		//	HISTAEV  //
		e18.addToBaseVerbs(larrE18);
		HebrewLetter[] larrE19 = {new Hey(), new Tav(), new Peh(), new Tav(), new Het()};			//	HITPATEAH  //
		e19.addToBaseVerbs(larrE19);
		HebrewLetter[] larrE20 = {new Hey(), new Shin(), new Tav(), new Gimel(), new Ain()};		//	HISHTAGEA  //
		e20.addToBaseVerbs(larrE20);
		HebrewLetter[] larrE21 = {new Hey(), new Tsadi(), new Tet(), new Nun(), new Ain()};			//	HITSTANEA  //
		e21.addToBaseVerbs(larrE21);
		HebrewLetter[] larrE22 = {new Hey(), new Tav(), new Alef(), new Reish(), new Het()};		//	HITAREAH  //
		e22.addToBaseVerbs(larrE22);
		HebrewLetter[] larrE23 = {new Hey(), new Sin(), new Tav(), new Reish(), new Ain()};			//	HISTAREA  //
		e23.addToBaseVerbs(larrE23);
		HebrewLetter[] larrE24 = {new Hey(), new Tav(), new Lamed(), new Vav(), new Tsadi(), new TsadiSofit()};		//	HITLOTSETS  //
		e24.addToBaseVerbs(larrE24);
		HebrewLetter[] larrE25 = {new Hey(), new Tav(), new Gimel(), new Vav(), new Nun(), new NunSofit()};			//	HITGONEN  //
		e25.addToBaseVerbs(larrE25);
		HebrewLetter[] larrE26 = {new Hey(), new Shin(), new Tav(), new Vav(), new Lamed(), new Lamed()};			//	HISHTOLEL  //
		e26.addToBaseVerbs(larrE26);
		HebrewLetter[] larrE27 = {new Hey(), new Tsadi(), new Tet(), new Vav(), new Peh(), new PehSofit()};			//	HITSTOFEF  //
		e27.addToBaseVerbs(larrE27);
		HebrewLetter[] larrE28 = {new Hey(), new Tav(), new Nun(), new Vav(), new Ain(), new Ain()};				//	HITNOEA  //
		e28.addToBaseVerbs(larrE28);
		HebrewLetter[] larrE29 = {new Hey(), new Tav(), new Reish(), new Peh(), new Alef()};		//	HITRAPA  //
		e29.addToBaseVerbs(larrE29);
		HebrewLetter[] larrE30 = {new Hey(), new Tav(), new Kaf(), new Samech(), new Hey()};		//	HITKASA  //
		e30.addToBaseVerbs(larrE30);
		HebrewLetter[] larrE31 = {new Hey(), new Shin(), new Tav(), new Nun(), new Hey()};			//	HISHTANA  //
		e31.addToBaseVerbs(larrE31);
		HebrewLetter[] larrE32 = {new Hey(), new Tsadi(), new Tet(), new Vav(), new Hey()};			//	HITSTAVA  //
		e32.addToBaseVerbs(larrE32);
		HebrewLetter[] larrE33 = {new Hey(), new Zain(), new Dalet(), new Kaf(), new Hey()};		//	HIZDAKA  //
		e33.addToBaseVerbs(larrE33);
		HebrewLetter[] larrE34 = {new Hey(), new Tav(), new Mem(), new Het(), new Hey()};			//	HITMAHA  //
		e34.addToBaseVerbs(larrE34);
		HebrewLetter[] larrE35 = {new Hey(), new Shin(), new Tav(), new Hey(), new Hey()};			//	HISHTAHA  //
		e35.addToBaseVerbs(larrE35);
		HebrewLetter[] larrE36 = {new Hey(), new Zain(), new Dalet(), new Hey(), new Hey()};		//	HIZDAHA  //
		e36.addToBaseVerbs(larrE36);
		HebrewLetter[] larrE37 = {new Hey(), new Tav(), new Gimel(), new Reish(), new Hey()};		//	HITGARA  //
		e37.addToBaseVerbs(larrE37);
		HebrewLetter[] larrE38 = {new Hey(), new Tav(), new Reish(), new Alef(), new Hey()};		//	HITRAA  //
		e38.addToBaseVerbs(larrE38);
		HebrewLetter[] larrE39 = {new Hey(), new Shin(), new Tav(), new Alef(), new Hey()};			//	HISHTAA  //
		e39.addToBaseVerbs(larrE39);
		HebrewLetter[] larrE40 = {new Hey(), new Tav(), new Mem(), new MemSofit()};					//	HITAMEM  //
		e40.addToBaseVerbs(larrE40);
		HebrewLetter[] larrE41 = {new Hey(), new Tet(), new Hey(), new Reish()};					//	HITAHER  //
		e41.addToBaseVerbs(larrE41);
		HebrewLetter[] larrE42 = {new Hey(), new Dalet(), new Yod(), new NunSofit()};				//	HIDAYEN  //
		e42.addToBaseVerbs(larrE42);
		HebrewLetter[] larrE43 = {new Hey(), new Tav(), new Gimel(), new Lamed(), new Gimel(), new Lamed()};		//	HITGALGEL  //
		e43.addToBaseVerbs(larrE43);
		HebrewLetter[] larrE44 = {new Hey(), new Tav(), new Ain(), new Tsadi(), new Bet(), new NunSofit()};			//	HITATSBEN  //
		e44.addToBaseVerbs(larrE44);
		HebrewLetter[] larrE45 = {new Hey(), new Shin(), new Tav(), new Het(), new Reish(), new Reish()};			//	HISHTAHRER  //
		e45.addToBaseVerbs(larrE45);
		HebrewLetter[] larrE46 = {new Hey(), new Tsadi(), new Tet(), new Mem(), new Tsadi(), new MemSofit()};		//	HITSTAMTSEM  //
		e46.addToBaseVerbs(larrE46);
		HebrewLetter[] larrE47 = {new Hey(), new Shin(), new Tav(), new Ain(), new Mem(), new MemSofit()};			//	HISHTAAMEM  //
		e47.addToBaseVerbs(larrE47);
		HebrewLetter[] larrE48 = {new Hey(), new Tav(), new Reish(), new Ain(), new Nun(), new NunSofit()};			//	HITRAANEN  //
		e48.addToBaseVerbs(larrE48);
		HebrewLetter[] larrE49 = {new Hey(), new Tav(), new Ain(), new Reish(), new Ain(), new Reish()};			//	HITARER  //
		e49.addToBaseVerbs(larrE49);
		HebrewLetter[] larrE50 = {new Hey(), new Shin(), new Tav(), new Lamed(), new Hey(), new Bet()};				//	HISHTALHEV  //
		e50.addToBaseVerbs(larrE50);
		HebrewLetter[] larrE51 = {new Hey(), new Tav(), new Alef(), new Zain(), new Reish(), new Het()};			//	HITAZREAH  //
		e51.addToBaseVerbs(larrE51);
		HebrewLetter[] larrE52 = {new Hey(), new Tav(), new Mem(), new Hey(), new Mem(), new Hey()};				//	HITMAHAMEHA  //
		e52.addToBaseVerbs(larrE52);
		HebrewLetter[] larrE53 = {new Hey(), new Shin(), new Tav(), new Kaf(), new Nun(), new Ain()};				//	HISHTACHNEA  //
		e53.addToBaseVerbs(larrE53);
		HebrewLetter[] larrE54 = {new Hey(), new Tav(), new Gimel(), new Ain(), new Gimel(), new Ain()};			//	HITAGAGEA  //
		e54.addToBaseVerbs(larrE54);
		HebrewLetter[] larrE55 = {new Hey(), new Shin(), new Tav(), new Ain(), new Shin(), new Ain()};				//	HISHTAASHEA  //
		e55.addToBaseVerbs(larrE55);
		HebrewLetter[] larrE56 = {new Hey(), new Zain(), new Dalet(), new Ain(), new Zain(), new Ain()};				//	HISHTAASHEA  //
		e56.addToBaseVerbs(larrE56);
		HebrewLetter[] larrE57 = {new Hey(), new Shin(), new Tav(), new Het(), new Vav(), new Hey()};					//	HISHTAHAVA  //
		e57.addToBaseVerbs(larrE57);
		HebrewLetter[] larrE58 = {new Hey(), new Dalet(), new Reish(), new Dalet(), new Reish()};						//	HIDARDER  //
		e58.addToBaseVerbs(larrE58);
		HebrewLetter[] larrE59 = {new Hey(), new Samech(), new Tav(), new Nun(), new Kaf(), new Reish(), new NunSofit()};	//	HISTANHREN  //
		e59.addToBaseVerbs(larrE59);
		HebrewLetter[] larrE60 = {new Hey(), new Tav(), new Peh(), new Tet(), new Reish()};					//	HITPUTAR  //
		e60.addToBaseVerbs(larrE60);
		inflectAndCheckNumberOfInflections(e1,40);
		inflectAndCheckNumberOfInflections(e2,40);
		inflectAndCheckNumberOfInflections(e3,40);
		inflectAndCheckNumberOfInflections(e4,40);
		inflectAndCheckNumberOfInflections(e5,40);
		inflectAndCheckNumberOfInflections(e6,40);
		inflectAndCheckNumberOfInflections(e7,40);
		inflectAndCheckNumberOfInflections(e8,40);
		inflectAndCheckNumberOfInflections(e9,40);
		inflectAndCheckNumberOfInflections(e10,40);
		inflectAndCheckNumberOfInflections(e11,40);
		inflectAndCheckNumberOfInflections(e12,40);
		inflectAndCheckNumberOfInflections(e13,40);
		inflectAndCheckNumberOfInflections(e14,40);
		inflectAndCheckNumberOfInflections(e15,40);
		inflectAndCheckNumberOfInflections(e16,40);
		inflectAndCheckNumberOfInflections(e17,40);
		inflectAndCheckNumberOfInflections(e18,40);
		inflectAndCheckNumberOfInflections(e19,49);
		inflectAndCheckNumberOfInflections(e20,49);
		inflectAndCheckNumberOfInflections(e21,49);
		inflectAndCheckNumberOfInflections(e22,49);
		inflectAndCheckNumberOfInflections(e23,49);
		inflectAndCheckNumberOfInflections(e24,40);
		inflectAndCheckNumberOfInflections(e25,40);
		inflectAndCheckNumberOfInflections(e26,40);
		inflectAndCheckNumberOfInflections(e27,40);
		inflectAndCheckNumberOfInflections(e28,49);
		inflectAndCheckNumberOfInflections(e29,40);
		inflectAndCheckNumberOfInflections(e30,46);
		inflectAndCheckNumberOfInflections(e31,46);
		inflectAndCheckNumberOfInflections(e32,80);
		inflectAndCheckNumberOfInflections(e33,46);
		inflectAndCheckNumberOfInflections(e34,46);
		inflectAndCheckNumberOfInflections(e35,46);
		inflectAndCheckNumberOfInflections(e36,46);
		inflectAndCheckNumberOfInflections(e37,46);
		inflectAndCheckNumberOfInflections(e38,46);
		inflectAndCheckNumberOfInflections(e39,46);
		inflectAndCheckNumberOfInflections(e40,79);
		inflectAndCheckNumberOfInflections(e41,79);
		inflectAndCheckNumberOfInflections(e42,79);
		inflectAndCheckNumberOfInflections(e43,40);
		inflectAndCheckNumberOfInflections(e44,40);
		inflectAndCheckNumberOfInflections(e45,40);
		inflectAndCheckNumberOfInflections(e46,40);
		inflectAndCheckNumberOfInflections(e47,40);
		inflectAndCheckNumberOfInflections(e48,40);
		inflectAndCheckNumberOfInflections(e49,40);
		inflectAndCheckNumberOfInflections(e50,40);
		inflectAndCheckNumberOfInflections(e51,48);
		inflectAndCheckNumberOfInflections(e52,48);
		inflectAndCheckNumberOfInflections(e53,49);
		inflectAndCheckNumberOfInflections(e54,49);
		inflectAndCheckNumberOfInflections(e55,49);
		inflectAndCheckNumberOfInflections(e56,49);
		inflectAndCheckNumberOfInflections(e57,80);
		inflectAndCheckNumberOfInflections(e58,79);
		inflectAndCheckNumberOfInflections(e59,40);
		inflectAndCheckNumberOfInflections(e60,70);
	}
	
	public void testTablesNumberOfInflectionsF(){
		F1 f1 = new F1();
		F2 f2 = new F2();
		F3 f3 = new F3();
		F4 f4 = new F4();
		F5 f5 = new F5();
		F6 f6 = new F6();
		F7 f7 = new F7();
		F8 f8 = new F8();
		F9 f9 = new F9();
		F10 f10 = new F10();
		F11 f11 = new F11();
		F12 f12 = new F12();
		F13 f13 = new F13();
		F14 f14 = new F14();
		F15 f15 = new F15();
		F16 f16 = new F16();
		F17 f17 = new F17();
		F18 f18 = new F18();
		F19 f19 = new F19();
		F20 f20 = new F20();
		F21 f21 = new F21();
		F22 f22 = new F22();
		F23 f23 = new F23();
		F24 f24 = new F24();
		F25 f25 = new F25();
		F26 f26 = new F26();
		F27 f27 = new F27();
		F28 f28 = new F28();
		F29 f29 = new F29();
		F30 f30 = new F30();
		F31 f31 = new F31();
		F32 f32 = new F32();
		F33 f33 = new F33();
		F34 f34 = new F34();
		F35 f35 = new F35();
		F36 f36 = new F36();
		F37 f37 = new F37();
		F38 f38 = new F38();
		HebrewLetter[] larrF1 = {new Hey(), new Gimel(), new Dalet(), new Yod(), new Lamed()};			//	HIGDIL  //
		f1.addToBaseVerbs(larrF1);
		HebrewLetter[] larrF2 = {new Hey(), new Peh(), new Het(), new Yod(), new Tav()};				//	HIFHIT  //
		f2.addToBaseVerbs(larrF2);
		HebrewLetter[] larrF3 = {new Hey(), new Lamed(), new Bet(), new Yod(), new NunSofit()};			//	HILBIN  //
		f3.addToBaseVerbs(larrF3);
		HebrewLetter[] larrF4 = {new Hey(), new Het(), new Lamed(), new Yod(), new Tet()};				//	HEHLIT  //
		f4.addToBaseVerbs(larrF4);
		HebrewLetter[] larrF5 = {new Hey(), new Alef(), new Shin(), new Yod(), new MemSofit()};			//	HEESHIM  //
		f5.addToBaseVerbs(larrF5);
		HebrewLetter[] larrF6 = {new Hey(), new Alef(), new Zain(), new Yod(), new NunSofit()};			//	HEEZIN  //
		f6.addToBaseVerbs(larrF6);
		HebrewLetter[] larrF7 = {new Hey(), new Kaf(), new Reish(), new Yod(), new Het()};				//	HIHRIAH  //
		f7.addToBaseVerbs(larrF7);
		HebrewLetter[] larrF8 = {new Hey(), new Gimel(), new Bet(), new Yod(), new Hey()};				//	HIGBIHA  //
		f8.addToBaseVerbs(larrF8);
		HebrewLetter[] larrF9 = {new Hey(), new Kaf(), new Yod(), new Reish()};							//	HIKIR  //
		f9.addToBaseVerbs(larrF9);
		HebrewLetter[] larrF10 = {new Hey(), new Tsadi(), new Yod(), new Tav()};						//	HITSIT  //
		f10.addToBaseVerbs(larrF10);
		HebrewLetter[] larrF11 = {new Hey(), new Samech(), new Yod(), new Ain()};						//	HISIA  //
		f11.addToBaseVerbs(larrF11);
		HebrewLetter[] larrF12 = {new Hey(), new Gimel(), new Yod(), new Hey()};						//	HIGIHA  //
		f12.addToBaseVerbs(larrF12);
		HebrewLetter[] larrF13 = {new Hey(), new Vav(), new Shin(), new Yod(), new Bet()};				//	HOSHIV  //
		f13.addToBaseVerbs(larrF13);
		HebrewLetter[] larrF14 = {new Hey(), new Vav(), new Peh(), new Yod(), new Ain()};				//	HOFIA  //
		f14.addToBaseVerbs(larrF14);
		HebrewLetter[] larrF15 = {new Hey(), new Yod(), new Tet(), new Yod(), new Bet()};				//	HETIV  //
		f15.addToBaseVerbs(larrF15);
		HebrewLetter[] larrF16 = {new Hey(), new Kuf(), new Yod(), new MemSofit()};						//	HEKIM  //
		f16.addToBaseVerbs(larrF16);
		HebrewLetter[] larrF17 = {new Hey(), new Mem(), new Yod(), new Tav()};							//	HEMIT  //
		f17.addToBaseVerbs(larrF17);
		HebrewLetter[] larrF18 = {new Hey(), new Bet(), new Yod(), new NunSofit()};						//	HEVIN  //
		f18.addToBaseVerbs(larrF18);
		HebrewLetter[] larrF19 = {new Hey(), new Ain(), new Yod(), new Dalet()};						//	HEID  //
		f19.addToBaseVerbs(larrF19);
		HebrewLetter[] larrF20 = {new Hey(), new Nun(), new Yod(), new Ain()};							//	HENIA  //
		f20.addToBaseVerbs(larrF20);
		HebrewLetter[] larrF21 = {new Hey(), new Samech(), new Bet()};									//	HESEV  //
		f21.addToBaseVerbs(larrF21);
		HebrewLetter[] larrF22 = {new Hey(), new Gimel(), new NunSofit()};								//	HEGEN  //
		f22.addToBaseVerbs(larrF22);
		HebrewLetter[] larrF23 = {new Hey(), new Ain(), new Zain()};									//	HEEZ  //
		f23.addToBaseVerbs(larrF23);
		HebrewLetter[] larrF24 = {new Hey(), new Tsadi(), new Reish()};									//	HETSER  //
		f24.addToBaseVerbs(larrF24);
		HebrewLetter[] larrF25 = {new Hey(), new Reish(), new Ain()};									//	HERA  //
		f25.addToBaseVerbs(larrF25);
		HebrewLetter[] larrF26 = {new Hey(), new Mem(), new Tsadi(), new Yod(), new Alef()};			//	HEMTSI  //
		f26.addToBaseVerbs(larrF26);
		HebrewLetter[] larrF27 = {new Hey(), new Het(), new Bet(), new Yod(), new Alef()};				//	HEHBI  //
		f27.addToBaseVerbs(larrF27);
		HebrewLetter[] larrF28 = {new Hey(), new Het(), new Mem(), new Yod(), new Alef()};				//	HEHMI  //
		f28.addToBaseVerbs(larrF28);
		HebrewLetter[] larrF29 = {new Hey(), new Sin(), new Yod(), new Alef()};							//	HISI  //
		f29.addToBaseVerbs(larrF29);
		HebrewLetter[] larrF30 = {new Hey(),new Vav(), new Tsadi(), new Yod(), new Alef()};				//	HOTSI  //
		f30.addToBaseVerbs(larrF30);
		HebrewLetter[] larrF31 = {new Hey(),new Bet(), new Yod(), new Alef()};							//	HEVI  //
		f31.addToBaseVerbs(larrF31);
		HebrewLetter[] larrF32 = {new Hey(),new Reish(), new Tsadi(), new Hey()};						//	HIRTSA  //
		f32.addToBaseVerbs(larrF32);
		HebrewLetter[] larrF33 = {new Hey(),new Ain(), new Lamed(), new Hey()};							//	HEELA  //
		f33.addToBaseVerbs(larrF33);
		HebrewLetter[] larrF34 = {new Hey(),new Tet(), new Ain(), new Hey()};							//	HETAH  //
		f34.addToBaseVerbs(larrF34);
		HebrewLetter[] larrF35 = {new Hey(),new Reish(), new Alef(), new Hey()};						//	HERAH  //
		f35.addToBaseVerbs(larrF35);
		HebrewLetter[] larrF36 = {new Hey(),new Tet(), new Hey()};										//	HITA  //
		f36.addToBaseVerbs(larrF36);
		HebrewLetter[] larrF37 = {new Hey(), new Vav(), new Reish(), new Hey()};						//	HORE  //
		f37.addToBaseVerbs(larrF37);
		HebrewLetter[] larrF38 = {new Hey(), new Shin(), new Peh(), new Reish(), new Yod(), new TsadiSofit()};		//	HISHPRITS  //
		f38.addToBaseVerbs(larrF38);
		inflectAndCheckNumberOfInflections(f1,40);
		inflectAndCheckNumberOfInflections(f2,40);
		inflectAndCheckNumberOfInflections(f3,40);
		inflectAndCheckNumberOfInflections(f4,40);
		inflectAndCheckNumberOfInflections(f5,40);
		inflectAndCheckNumberOfInflections(f6,40);
		inflectAndCheckNumberOfInflections(f7,42);
		inflectAndCheckNumberOfInflections(f8,42);
		inflectAndCheckNumberOfInflections(f9,40);
		inflectAndCheckNumberOfInflections(f10,40);
		inflectAndCheckNumberOfInflections(f11,42);
		inflectAndCheckNumberOfInflections(f12,42);
		inflectAndCheckNumberOfInflections(f13,40);
		inflectAndCheckNumberOfInflections(f14,41);
		inflectAndCheckNumberOfInflections(f15,40);
		inflectAndCheckNumberOfInflections(f16,49);
		inflectAndCheckNumberOfInflections(f17,49);
		inflectAndCheckNumberOfInflections(f18,49);
		inflectAndCheckNumberOfInflections(f19,49);
		inflectAndCheckNumberOfInflections(f20,51);
		inflectAndCheckNumberOfInflections(f21,55);
		inflectAndCheckNumberOfInflections(f22,55);
		inflectAndCheckNumberOfInflections(f23,55);
		inflectAndCheckNumberOfInflections(f24,52);
		inflectAndCheckNumberOfInflections(f25,64);
		inflectAndCheckNumberOfInflections(f26,40);
		inflectAndCheckNumberOfInflections(f27,40);
		inflectAndCheckNumberOfInflections(f28,40);
		inflectAndCheckNumberOfInflections(f29,40);
		inflectAndCheckNumberOfInflections(f30,40);
		inflectAndCheckNumberOfInflections(f31,49);
		inflectAndCheckNumberOfInflections(f32,46);
		inflectAndCheckNumberOfInflections(f33,92);
		inflectAndCheckNumberOfInflections(f34,46);
		inflectAndCheckNumberOfInflections(f35,62);
		inflectAndCheckNumberOfInflections(f36,46);
		inflectAndCheckNumberOfInflections(f37,46);
		inflectAndCheckNumberOfInflections(f38,40);
	}
	
	public void testTablesNumberOfInflectionsG(){
		G1 g1 = new G1();
		G2 g2 = new G2();
		G3 g3 = new G3();
		G4 g4 = new G4();
		G5 g5 = new G5();
		G6 g6 = new G6();
		G7 g7 = new G7();
		G8 g8 = new G8();
		G9 g9 = new G9();
		G10 g10 = new G10();
		G11 g11 = new G11();
		G12 g12 = new G12();
		G13 g13 = new G13();
		G14 g14 = new G14();
		G15 g15 = new G15();
		G16 g16 = new G16();
		G17 g17 = new G17();
		G18 g18 = new G18();
		G19 g19 = new G19();
		G20 g20 = new G20();
		G21 g21 = new G21();
		G22 g22 = new G22();
		G23 g23 = new G23();
		G24 g24 = new G24();
		HebrewLetter[] larrG1 = {new Hey(), new Zain(), new Kaf(), new Reish()};					//	HUZKAR  //
		g1.addToBaseVerbs(larrG1);
		HebrewLetter[] larrG2 = {new Hey(), new Shin(), new Bet(), new Tav()};						//	HUSHBAT  //
		g2.addToBaseVerbs(larrG2);
		HebrewLetter[] larrG3 = {new Hey(), new Tet(), new Mem(), new NunSofit()};					//	HUTMAN  //
		g3.addToBaseVerbs(larrG3);
		HebrewLetter[] larrG4 = {new Hey(), new Ain(), new Mem(), new Dalet()};						//	HUAMAD  //
		g4.addToBaseVerbs(larrG4);
		HebrewLetter[] larrG5 = {new Hey(), new Bet(), new Hey(), new Lamed()};						//	HUVHAL  //
		g5.addToBaseVerbs(larrG5);
		HebrewLetter[] larrG6 = {new Hey(), new Nun(), new Het(), new Tav()};						//	HUNHAT  //
		g6.addToBaseVerbs(larrG6);
		HebrewLetter[] larrG7 = {new Hey(), new Tet(), new Ain(), new NunSofit()};					//	HUTAN  //
		g7.addToBaseVerbs(larrG7);
		HebrewLetter[] larrG8 = {new Hey(), new Peh(), new Tav(), new Ain()};						//	HUFTA  //
		g8.addToBaseVerbs(larrG8);
		HebrewLetter[] larrG9 = {new Hey(), new Gimel(), new Bet(), new Hey()};						//	HUGBAH  //
		g9.addToBaseVerbs(larrG9);
		HebrewLetter[] larrG10 = {new Hey(), new Kaf(), new Reish()};								//	HUKAR  //
		g10.addToBaseVerbs(larrG10);
		HebrewLetter[] larrG11 = {new Hey(), new Tsadi(), new Tav()};								//	HUTSAT  //
		g11.addToBaseVerbs(larrG11);
		HebrewLetter[] larrG12 = {new Hey(), new Samech(), new Ain()};								//	MUSA  //
		g12.addToBaseVerbs(larrG12);
		HebrewLetter[] larrG13 = {new Hey(),new Vav(), new Reish(), new Dalet()};					//	HURAD  //
		g13.addToBaseVerbs(larrG13);
		HebrewLetter[] larrG14 = {new Hey(),new Vav(), new Mem(), new Tav()};						//	HUMAT  //
		g14.addToBaseVerbs(larrG14);
		HebrewLetter[] larrG15 = {new Hey(),new Vav(), new Bet(), new NunSofit()};					//	HUVAN  //
		g15.addToBaseVerbs(larrG15);
		HebrewLetter[] larrG16 = {new Hey(),new Vav(), new Alef(), new Reish()};					//	HUAR  //
		g16.addToBaseVerbs(larrG16);
		HebrewLetter[] larrG17 = {new Hey(),new Vav(), new Nun(), new Ain()};						//	HUNA  //
		g17.addToBaseVerbs(larrG17);
		HebrewLetter[] larrG18 = {new Hey(),new Vav(), new Mem(), new Samech()};					//	HUMAS  //
		g18.addToBaseVerbs(larrG18);
		HebrewLetter[] larrG19 = {new Hey(),new Het(), new Bet(), new Alef()};						//	HUHBA  //
		g19.addToBaseVerbs(larrG19);
		HebrewLetter[] larrG20 = {new Hey(),new Vav(), new Bet(), new Alef()};						//	HUVA  //
		g20.addToBaseVerbs(larrG20);
		HebrewLetter[] larrG21 = {new Hey(),new Reish(), new Shin(), new Hey()};					//	HURSHA  //
		g21.addToBaseVerbs(larrG21);
		HebrewLetter[] larrG22 = {new Hey(),new Tet(), new Ain(), new Hey()};						//	HUTAH  //
		g22.addToBaseVerbs(larrG22);
		HebrewLetter[] larrG23 = {new Hey(),new Tet(), new Hey()};									//	HUTH  //
		g23.addToBaseVerbs(larrG23);
		HebrewLetter[] larrG24 = {new Hey(),new Ain(),new Lamed(), new Hey()};						//	HUALAH  //
		g24.addToBaseVerbs(larrG24);
		inflectAndCheckNumberOfInflections(g1,68);
		inflectAndCheckNumberOfInflections(g2,68);
		inflectAndCheckNumberOfInflections(g3,68);
		inflectAndCheckNumberOfInflections(g4,272);
		inflectAndCheckNumberOfInflections(g5,68);
		inflectAndCheckNumberOfInflections(g6,68);
		inflectAndCheckNumberOfInflections(g7,68);
		inflectAndCheckNumberOfInflections(g8,70);
		inflectAndCheckNumberOfInflections(g9,70);
		inflectAndCheckNumberOfInflections(g10,68);
		inflectAndCheckNumberOfInflections(g11,68);
		inflectAndCheckNumberOfInflections(g12,70);
		inflectAndCheckNumberOfInflections(g13,34);
		inflectAndCheckNumberOfInflections(g14,34);
		inflectAndCheckNumberOfInflections(g15,34);
		inflectAndCheckNumberOfInflections(g16,34);
		inflectAndCheckNumberOfInflections(g17,35);
		inflectAndCheckNumberOfInflections(g18,45);
		inflectAndCheckNumberOfInflections(g19,68);
		inflectAndCheckNumberOfInflections(g20,34);
		inflectAndCheckNumberOfInflections(g21,80);
		inflectAndCheckNumberOfInflections(g22,80);
		inflectAndCheckNumberOfInflections(g23,80);
		inflectAndCheckNumberOfInflections(g24,320);
	}
	
	private static void inflectAndCheckNumberOfInflections(Table t, int inflictions){
		t.inflectVerbs();
		for(ArrayList<VerbInflection> vInfections : t.getInflections()){
			assertEquals(inflictions, vInfections.size());
		}
		
	}
	
}
