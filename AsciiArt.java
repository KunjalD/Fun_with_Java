package edu.nyu.cs9053.homework3.oo;
import java.io.PrintStream;

public class AsciiArt {

	
	static final char A[][]=     {"--------.A.---------".toCharArray(),
								  "-------.A.A.--------".toCharArray(),
								  "------.A---A.-------".toCharArray(),
								  "-----.A-----A.------".toCharArray(),
								  "----.A-------A.-----".toCharArray(),
								  "---.A.A.A.A.A.A.----".toCharArray(),
								  "--.A-----------A.---".toCharArray(),
								  "--A-------------A.--".toCharArray(),
								  "-A.--------------A.-".toCharArray(),
								  "A-----------------A.".toCharArray()};
	
	static final char B[][]= {"-B.B.B.B.-----------".toCharArray(),
							  "-B-------.B---------".toCharArray(),
							  "-B---------.B-------".toCharArray(),
							  "-B----------B-------".toCharArray(),
							  "-B---------B--------".toCharArray(),
							  "-B-----B.B----------".toCharArray(),
							  "-B--------B.--------".toCharArray(),
							  "-B----------B-------".toCharArray(),
							  "-B----------B-------".toCharArray(),
							  "-B.B.B.B.B.B--------".toCharArray()};

	static final char C[][] = {"-----.C.C.C.C.C.C---".toCharArray(),
		  	      			   "----C---------------".toCharArray(),
		  	      			   "---C----------------".toCharArray(),
		  	      			   "--C-----------------".toCharArray(),
		  	      			   "-C------------------".toCharArray(),
		  	      			   "-C------------------".toCharArray(),
		  	      			   "--C-----------------".toCharArray(),
		  	      			   "--.C----------------".toCharArray(),
		  	      			   "---.C---------------".toCharArray(),
		  	  	  			   "-----.C.C.C.C.C.C---".toCharArray()};

	
	static final char D[][] = {"-D.D.D.D.D.D--------".toCharArray(),
		  	      			   "-D----------D-------".toCharArray(),
		  	      			   "-D-----------D------".toCharArray(),
		  	      			   "-D------------D-----".toCharArray(),
		  	      			   "-D-------------D----".toCharArray(),
		  	      			   "-D-------------D----".toCharArray(),
		  	      			   "-D-------------D----".toCharArray(),
		  	      			   "-D-------------D----".toCharArray(),
		  	      			   "-D------------D-----".toCharArray(),
		  	      			   "-D.D.D.D.D.D.D------".toCharArray()};
	
	static final char E[][] = {"E-E-E-E-E-E-E-E-E-E-".toCharArray(),
	  	          			   "E-:::::::::::::::::-".toCharArray(),
	  	          			   "E-------------------".toCharArray(),
	  	          			   "E-------------------".toCharArray(),
	  	          			   "E-E-E-E-E-E-E-E-E---".toCharArray(),
	  	          			   "E-E-E-E-E-E-E-E-E---".toCharArray(),
	  	          			   "E-------------------".toCharArray(),
	  	          			   "E-------------------".toCharArray(),
	  	          			   "E::::::::::::::::::-".toCharArray(),
	  	          			   "E-E-E-E-E-E-E-E-E-E-".toCharArray()};
	
	static final char F[][] = {"-.F.F.F.F.F.F.F.F.F-".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F.F.F.F.F.F.F-----".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray(),
		  	      			   "-.F-----------------".toCharArray()};
	
	static final char G[][] = {"-----G.G.G.G.G.G.---".toCharArray(),
		  	      			   "----G---------------".toCharArray(),
		  	      			   "---G----------------".toCharArray(),
		  	      			   "--G-----------------".toCharArray(),
		  	      			   "--G-----------------".toCharArray(),
		  	      			   "--G-----------------".toCharArray(),
		  	      			   "--G---------G.G.G---".toCharArray(),
		  	      			   "---G------------G---".toCharArray(),
		  	      			   "----G-----------G---".toCharArray(),
		  	      			   "------G.G.G.G.G.G---".toCharArray()};
	
	static final char H[][]  = {"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H.H.H.H.H.H.H.H.HH-".toCharArray(),
		  	  	  				"-HH.H.H.H.H.H.H.H.H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray(),
		  	  	  				"-H----------------H-".toCharArray()};
	
	static final char I[][] = {"-----IIIIIIIIII-----".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "---------II---------".toCharArray(),
		  	  	  			   "-----IIIIIIIIII-----".toCharArray()};
	
	static final char J[][] = {"---JJJJJJJJJJJJJJ---".toCharArray(),
		  	  	  			   "---------JJ---------".toCharArray(),
		  	  	  			   "---------JJ---------".toCharArray(),
		  	  	  			   "---------JJ---------".toCharArray(),
		  	  	  			   "---------JJ---------".toCharArray(),
		  	  	  			   "---------JJ---------".toCharArray(),
		  	  	  			   "--J------JJ---------".toCharArray(),
		  	  	  			   "--JJ-----JJ---------".toCharArray(),
		  	  	  			   "---JJ....JJ---------".toCharArray(),
		  	  	  			   "----J.J.JJJ---------".toCharArray()};
	
	static final char K[][] =  {"-KK-----------K-K---".toCharArray(),
		  	  	  				"-KK---------K-K-----".toCharArray(),
		  	  	  				"-KK-------K-K-------".toCharArray(),
		  	  	  				"-KK-----K-K---------".toCharArray(),
		  	  	  				"-KKK-K-K------------".toCharArray(),
		  	  	  				"-KKK-K-K------------".toCharArray(),
		  	  	  				"-KK----K-K----------".toCharArray(),
		  	  	  				"-KK------K-K--------".toCharArray(),
		  	  	  				"-KK--------K-K------".toCharArray(),
		  	  	  				"-KK----------K-K----".toCharArray()};
	
	static final char L[][] = {"-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LL-----------------".toCharArray(),
		  	  	  			   "-LLLLLLLLLLLLLLLL---".toCharArray(),
		  	  	  			   "-LLLLLLLLLLLLLLLL---".toCharArray()};
	
	static final char M[][] =  {"-MMMM----------MMMM-".toCharArray(),
		  	  	  				"-MM- M--------M--MM-".toCharArray(),
		  	  	  				"-MM---M------M---MM-".toCharArray(),
		  	  	  				"-MM-----M---M----MM-".toCharArray(),
		  	  	  				"-MM------MMM-----MM-".toCharArray(),
		  	  	  				"-MM-------M------MM-".toCharArray(),
		  	  	  				"-MM--------------MM-".toCharArray(),
		  	  	  				"-MM--------------MM-".toCharArray(),
		  	  	  				"-MM--------------MM-".toCharArray(),
		  	  	  				"-MM--------------MM-".toCharArray()};
	
	static final char N[][] = {"-NNNN------------NN-".toCharArray(),
		  	  	  	           "-NN-NN-----------NN-".toCharArray(),
		  	  	  	           "-NN--NN----------NN-".toCharArray(),
		  	  	  	           "-NN---NN---------NN-".toCharArray(),
		  	  	  	           "-NN----NN--------NN-".toCharArray(),
		  	  	  	           "-NN-----NN-------NN-".toCharArray(),
		  	  	  	           "-NN------NN------NN-".toCharArray(),
		  	  	  	           "-NN--------NN----NN-".toCharArray(),
		  	  	  	           "-NN----------NN--NN-".toCharArray(),
		  	  	  			   "-NN------------NNNN-".toCharArray()};
	
	static final char O[][] = {"------O.O.O.O.------".toCharArray(),
		  	      			   "---.O----------O.---".toCharArray(),
		  	      			   "--.O------------O.--".toCharArray(),
		  	      			   "-.O--------------O.-".toCharArray(),
		  	      			   "-.O--------------O.-".toCharArray(),
		  	      			   "-.O--------------O.-".toCharArray(),
		  	      			   "-.O--------------O.-".toCharArray(),
		  	      			   "--.O------------O.--".toCharArray(),
		  	      			   "---.O---------.O.---".toCharArray(),
		  	  	  			   "------O.O.O.O.------".toCharArray()};
	
	static final char P[][] = {"-PP.P.P.P.P.P.P.----".toCharArray(),
		  	      			   "-PP-------------P.--".toCharArray(),
		  	      			   "-PP--------------P.-".toCharArray(),
		  	      			   "-PP--------------P.-".toCharArray(),
		  	      			   "-PP-------------P.--".toCharArray(),
		  	      			   "-PP.P.P.P.P.P.P.----".toCharArray(),
		  	      			   "-PP-----------------".toCharArray(),
		  	      			   "-PP-----------------".toCharArray(),
		  	      			   "-PP-----------------".toCharArray(),
		  	  	  			   "-PP-----------------".toCharArray()};
	
	static final char Q[][] = {"--------Q.Q.Q-------".toCharArray(),
		  	      			   "------Q.------Q.----".toCharArray(),
		  	      			   "----Q.----------Q.--".toCharArray(),
		  	      			   "---Q-------------Q.-".toCharArray(),
		  	      			   "---Q--------------Q-".toCharArray(),
		  	      			   "---Q--------------Q-".toCharArray(),
		  	      			   "----Q--------Q----Q-".toCharArray(),
		  	      			   "-----Q--------Q--Q--".toCharArray(),
		  	      			   "-------Q-------QQ---".toCharArray(),
		  	      			   "---------Q.Q.Q.-Q---".toCharArray()};
	
	static final char R[][] = {"RR.R.R.R.R.R.R------".toCharArray(),
		  	  	  			   "RR------------R-----".toCharArray(),
		  	  	  			   "RR-------------R----".toCharArray(),
		  	  	  			   "RR-------------R----".toCharArray(),
		  	  	  			   "RR-------------R----".toCharArray(),
		  	  	  			   "RR.R.R.R.R.R.R------".toCharArray(),
		  	  	  			   "RR--RR--------------".toCharArray(),
		  	  	  			   "RR---RR-------------".toCharArray(),
		  	  	  			   "RR-----RR-----------".toCharArray(),
		  	  	  			   "RR-------RR---------".toCharArray()};
	
	static final char S[][] = {"------SS.SS.SS.SS.--".toCharArray(),
		  	  	  			   "----SS--------------".toCharArray(),
		  	  	  			   "--SS----------------".toCharArray(),
		  	  	  			   "--SS----------------".toCharArray(),
		  	  	  			   "----SS--------------".toCharArray(),
		  	  	  			   "------SS-SSSSS------".toCharArray(),
		  	  	  			   "--------------SS----".toCharArray(),
		  	  	  			   "---------------SS---".toCharArray(),
		  	  	  			   "--------------SS----".toCharArray(),
		  	  	  			   "--.SS.SS.SS.SS------".toCharArray()};
	
	static final char T[][] = {"-TTTTTTTTTTTTTTTTTT-".toCharArray(),
		  	  	  			   "-TTTTTTTTTTTTTTTTTT-".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray(),
		  	  	  			   "--------TTT---------".toCharArray()};
	
	static final char U[][] = {"UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "UU----------------UU".toCharArray(),
		  	  	  			   "-UU--------------UU-".toCharArray(),
		  	  	  			   "--UUUUUUUUUUUUUUUU--".toCharArray()};
	
	static final char V[][] = {"VV----------------VV".toCharArray(),
		  	  	  			   "VV----------------VV".toCharArray(),
		  	  	  			   "VV----------------VV".toCharArray(),
		  	  	  			   "VV----------------VV".toCharArray(),
		  	  	  			   "-VV--------------VV-".toCharArray(),
		  	  	  			   "--VV------------VV--".toCharArray(),
		  	  	  			   "---VV----------VV---".toCharArray(),
		  	  	  			   "----VV--------VV----".toCharArray(),
		  	  	  			   "------VV----VV------".toCharArray(),
		  	  	  			   "--------VVVV--------".toCharArray()};
	
	static final char W[][] = {"WW----------------WW".toCharArray(),
		  	      			   "WW----------------WW".toCharArray(),
		  	      			   "WW-------WWW------WW".toCharArray(),
		  	      			   "WW-------WWW------WW".toCharArray(),
		  	      			   "WW-------W-W------WW".toCharArray(),
		  	      			   "-WW------W-W-----WW-".toCharArray(),
		  	      			   "-WW------W-W-----WW-".toCharArray(),
		  	      			   "--WW-----W-W----WW--".toCharArray(),
		  	      			   "---WW---W---W--WW---".toCharArray(),
		  	      			   "----WWWW-----WWW----".toCharArray()};
	
	static final char X[][] = {"-XX---------------XX".toCharArray(),
		  	      			   "---XX-----------XX--".toCharArray(),
		  	      			   "-----XX-------XX----".toCharArray(),
		  	      			   "-------XX---XX------".toCharArray(),
		  	      			   "---------XXX--------".toCharArray(),
		  	      			   "-------XX--XX-------".toCharArray(),
		  	      			   "-----XX------XX-----".toCharArray(),
		  	      			   "---XX----------XX---".toCharArray(),
		  	      			   "-XX-------------XX--".toCharArray(),
		  	      			   "XX----------------XX".toCharArray()};
	
	static final char Y[][] = {"-YY--------------YY-".toCharArray(),
		  	      			   "--YY------------YY--".toCharArray(),
		  	      			   "---YY----------YY---".toCharArray(),
		  	      			   "----YY--------YY----".toCharArray(),
		  	      			   "-----YY------YY-----".toCharArray(),
		  	      			   "------YY----YY------".toCharArray(),
		  	      			   "--------Y..Y--------".toCharArray(),
		  	      			   "---------YY---------".toCharArray(),
		  	      			   "---------YY---------".toCharArray(),
		  	      			   "---------YY---------".toCharArray()};
	
	static final char Z[][] = {"-Z.z.Z.z.Z.z.Z.z.Z.z".toCharArray(),
		  	  	  			   "------------------Z-".toCharArray(),
		  	  	  			   "-----------------Z--".toCharArray(),
		  	  	  			   "---------------Z----".toCharArray(),
		  	  	  			   "-------------Z------".toCharArray(),
		  	  	  			   "-----------Z--------".toCharArray(),
		  	  	  			   "---------Z----------".toCharArray(),
		  	  	  			   "-------Z------------".toCharArray(),
		  	  	  			   "-----Z--------------".toCharArray(),
		  	  	  			   "-z.Z.z.Z.z.Z.z.Z.z.Z".toCharArray()};
	
	static final char ZERO[][] = {"-------.00000.------".toCharArray(),
			   					  "------0-------0-----".toCharArray(),
			   					  "-----0---------0----".toCharArray(),
			   					  "----0-----------0---".toCharArray(),
			   					  "----0-----------0---".toCharArray(),
			   					  "----0-----------0---".toCharArray(),
			   					  "----0-----------0---".toCharArray(),
			   					  "-----0---------0----".toCharArray(),
			   					  "------0-------0-----".toCharArray(),
			   					  "-------.00000.------".toCharArray()};
	
	static final char ONE[][] = {"--------111---------".toCharArray(),
			  					 "-------1-11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "---------11---------".toCharArray(),
			  					 "-------111111-------".toCharArray()};
	
	static final char TWO[][] = {"-------2.2.2.2.2----".toCharArray(),
			  					 "-----2-----------2--".toCharArray(),
			  					 "-----------------2--".toCharArray(),
			  					 "----------------.2--".toCharArray(),
			  					 "---------------2.---".toCharArray(),
			  					 "--------------2.----".toCharArray(),
			  					 "-----------.2.------".toCharArray(),
			  					 "---------.2---------".toCharArray(),
			  					 "------.2.-----------".toCharArray(),
			  					 "-----2.2.2.2.2.2.2.2".toCharArray()};
	
	static final char THREE[][] = {"------3333333333----".toCharArray(),
			  					   "----3------------3--".toCharArray(),
			  					   "-----------------3--".toCharArray(),
			  					   "-----------------3--".toCharArray(),
			  					   "---------3-3-3-3----".toCharArray(),
			  					   "-----------------3--".toCharArray(),
			  					   "-----------------3--".toCharArray(),
			  					   "-----------------3--".toCharArray(),
			  					   "----------------3---".toCharArray(),
			  					   "----3-3-3-3-3-3-----".toCharArray()};
	
	static final char FOUR[][] = {"--------------44----".toCharArray(),
			  					  "------------4--4----".toCharArray(),
			  					  "----------4----4----".toCharArray(),
			  					  "--------4------4----".toCharArray(),
			  					  "------4--------4----".toCharArray(),
			  					  "----4----------4----".toCharArray(),
			  					  "--4------------4----".toCharArray(),
			  					  "4.4.4.4.4.4.4..4.4--".toCharArray(),
			  					  "---------------4----".toCharArray(),
			  					  "---------------4----".toCharArray()};
	
	static final char FIVE[][] = {"--555555555555555---".toCharArray(),
			  					  "--5-----------------".toCharArray(),
			  					  "--5-----------------".toCharArray(),
			  					  "--5-----------------".toCharArray(),
			  					  "--5-5-5-5-5---------".toCharArray(),
			  					  "------------5-------".toCharArray(),
			  					  "-------------5------".toCharArray(),
			  					  "--------------5-----".toCharArray(),
			  					  "------------5-------".toCharArray(),
			  					  "--5-5-5-5-5---------".toCharArray()};
	
	static final char SIX[][] = {"-----------6-6------".toCharArray(),
			  					 "---------6----------".toCharArray(),
			  					 "-------6------------".toCharArray(),
			  					 "------6-------------".toCharArray(),
			  					 "-----6--------------".toCharArray(),
			  					 "-----6-6-6-6-6------".toCharArray(),
			  					 "-----6---------6----".toCharArray(),
			  					 "------6--------6----".toCharArray(),
			  					 "-------6------6-----".toCharArray(),
			  					 "---------6.6.6------".toCharArray()};
	
	static final char SEVEN[][] = {"-7777777777777777---".toCharArray(),
			  					   "---------------7----".toCharArray(),
			  					   "--------------7-----".toCharArray(),
			  					   "-------------7------".toCharArray(),
			  					   "------------7-------".toCharArray(),
			  					   "-----------7--------".toCharArray(),
			  					   "----------7---------".toCharArray(),
			  					   "---------7----------".toCharArray(),
			  					   "--------7-----------".toCharArray(),
			  					   "------7-------------".toCharArray()};
	
	static final char EIGHT[][] = {"---------88888------".toCharArray(),
			  					   "--------8-----8-----".toCharArray(),
			  					   "-------8-------8----".toCharArray(),
			  					   "--------8-----8-----".toCharArray(),
			  					   "-----------8--------".toCharArray(),
			  					   "---------8---8------".toCharArray(),
			  					   "-------8------8-----".toCharArray(),
			  					   "------8--------8----".toCharArray(),
			  					   "-------8-------8----".toCharArray(),
			  					   "--------8-8-8-8-----".toCharArray()};
	
	static final char NINE[][] = {"-------99999999.----".toCharArray(),
			  					  "------9---------9---".toCharArray(),
			  					  "-----9-----------9--".toCharArray(),
			  					  "-----9-----------9--".toCharArray(),
			  					  "------9----------9--".toCharArray(),
			  					  "--------9-9-9-9-99--".toCharArray(),
			  					  "----------------9---".toCharArray(),
			  					  "---------------9----".toCharArray(),
			  					  "--------------9-----".toCharArray(),
			  					  "----------9-9-------".toCharArray()};
	
	static PrintStream asciiArt = new PrintStream(System.out);
	
	// checks for a commandline argument and calls the object of 
	// the letter class 
	public static void main(String[] args) {	
		
		if(args[0].length()==1){	
		String letter =args[0].toString();
		Letter objLetter = new Letter(new char[10][20],asciiArt);
			switch(letter){
			case "A":
				objLetter.asciiChar = A;
				break;
			case "B":
				objLetter.asciiChar = B;
				break;
			case "C":
				objLetter.asciiChar = C;
				break;
			case "D":
				objLetter.asciiChar = D;
				break;
			case "E":
				objLetter.asciiChar = E;
				break;
			case "F":
				objLetter.asciiChar = F;
				break;
			case "G":
				objLetter.asciiChar = G;
				break;
			case "H":
				objLetter.asciiChar = H;
				break;
			case "I":
				objLetter.asciiChar = I;
				break;
			case "J":
				objLetter.asciiChar = J;
				break;
			case "K":
				objLetter.asciiChar = K;
				break;
			case "L":
				objLetter.asciiChar = L;
				break;
			case "M":
				objLetter.asciiChar = M;
				break;
			case "N":
				objLetter.asciiChar = N;
				break;
			case "O":
				objLetter.asciiChar = O;
				break;
			case "P":
				objLetter.asciiChar = P;
				break;
			case "Q":
				objLetter.asciiChar = Q;
				break;
			case "R":
				objLetter.asciiChar = R;
				break;
			case "S":
				objLetter.asciiChar = S;
				break;
			case "T":
				objLetter.asciiChar = T;
				break;
			case "U":
				objLetter.asciiChar = U;
				break;
			case "V":
				objLetter.asciiChar = V;
				break;
			case "W":
				objLetter.asciiChar = W;
				break;
			case "X":
				objLetter.asciiChar = X;
				break;
			case "Y":
				objLetter.asciiChar = Y;
				break;
			case "Z":
				objLetter.asciiChar = Z;
				break;
			case "0":
				objLetter.asciiChar = ZERO;
				break;
			case "1":
				objLetter.asciiChar = ONE;
				break;
			case "2":
				objLetter.asciiChar = TWO;
				break;
			case "3":
				objLetter.asciiChar = THREE;
				break;
			case "4":
				objLetter.asciiChar = FOUR;
				break;
			case "5":
				objLetter.asciiChar = FIVE;
				break;
			case "6":
				objLetter.asciiChar = SIX;
				break;
			case "7":
				objLetter.asciiChar = SEVEN;
				break;
			case "8":
				objLetter.asciiChar = EIGHT;
				break;
			case "9":
				objLetter.asciiChar = NINE;
				break;
			default:
                System.out.println("Unknown Character");
                System.exit(-1);
			}
			objLetter.print();
		}
			
		}	
}
