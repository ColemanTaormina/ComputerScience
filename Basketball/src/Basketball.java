import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Basketball {
	public static void main(String [] args )throws IOException{
	Scanner infile= new Scanner(new File("BasketballStats"));
	//This section sends and gets back data from Basketballworkoutnumbers
	//below are the lists Names holding the winning teams names each list represents a new round
	List<String> Names = new ArrayList<String>();
	List<String> Names2 = new ArrayList<String>();
	List<String> Names3 = new ArrayList<String>();
	List<String> Names4 = new ArrayList<String>();
	List<String> Names5 = new ArrayList<String>();
	List<String> Names6 = new ArrayList<String>();
	List<String> Names7 = new ArrayList<String>();
	List<String> Names8 = new ArrayList<String>();
	//below are the lists data/statistics that go with which team is winning based on what round it is
	List<Double> r2 = new ArrayList<Double>();
	List<Double> r3 = new ArrayList<Double>();
	List<Double> r4 = new ArrayList<Double>();
	List<Double> r5 = new ArrayList<Double>();
	List<Double> r6 = new ArrayList<Double>();
	List<Double> r7 = new ArrayList<Double>();
	List<Double> r8 = new ArrayList<Double>();
	
//------------------------------------------
	//below is the loop that reads in the txt box named BasketballStats puting them into the first lists
	String w;
	double x,y,z;
	while (infile.hasNext()) {
		 w=infile.next();
		 Names.add(w);
		 x=infile.nextDouble();
		 y=infile.nextDouble();
		 z=infile.nextDouble();
		 r2.add(x+y+z);
	//	System.out.println(w +" "+x+" "+y+" "+z);
	}
	//prints out for the user to see who started
	System.out.println("The first round(should all ready be on your paper (just to show the default teams)):");
	System.out.println(Names);

	System.out.println();
	//------------------------------
	//these three ints and string will be vary important to the code to follow each will be sent to the Basketballworkoutnumbers where they are explained
	int o=0; 
	int p=0;
	String nameholder = "";
	int holder=0;
	
	System.out.println("(The winners are to be written down from the top to the bottom to the next pages side, top to bottom all of the second round)The winners of the second round are: ");
	//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
	Basketballworkoutnumbers.printBasketballs(Names,Names2, r2,r3,o,p,holder,nameholder);
	//prints out for the user to see the winners
	System.out.println(Names2);
	
	System.out.println();
	//--------------------------------------
	//resets the ints and string
	o=0;
	 p=0;
	 nameholder="";
	 holder=0;
	 System.out.println("The winners of the third round/sweet sixteen are: ");
	//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
	 Basketballworkoutnumbers.printBasketballs(Names2,Names3, r3,r4,o,p,holder,nameholder);
	//prints out for the user to see the winners
	System.out.println(Names3);
	
	System.out.println();
	//---------------------------------------
	//resets the ints and string
	o=0;
	 p=0;
	 nameholder="";
	 holder=0;
	 System.out.println("The winners of the fourth/elite eight round are: ");
	//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
	 Basketballworkoutnumbers.printBasketballs(Names3,Names4, r4,r5,o,p,holder,nameholder);
	//prints out for the user to see the winners
	 System.out.println(Names4);
	
	System.out.println();
	//------------------------------------------
	//resets the ints and string 
	o=0;
	 p=0;
	 nameholder="";
	 holder=0;
	 System.out.println("The winners of the fifth round/final four are: ");
	//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
	 Basketballworkoutnumbers.printBasketballs(Names4,Names5, r5,r6,o,p,holder,nameholder);
	//prints out for the user to see the winners
	 System.out.println(Names5);

	System.out.println();
	//------------------------------------------
	//resets the ints and string	
		o=0;
		 p=0;
		 nameholder="";
		 holder=0;
		 System.out.println("The winners of the sixth round/championship are: ");
		//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
		 Basketballworkoutnumbers.printBasketballs(Names5,Names6, r6,r7,o,p,holder,nameholder);
		//prints out for the user to see the winners
		 System.out.println(Names6);
		
		System.out.println();
		//------------------------------------------
		//resets the ints and string
		o=0;
		 p=0;
		 nameholder="";
		 holder=0;
		 System.out.println("The winner is: ");
		//calls the winners and the data that goes with those winners from the Basketballworkoutnumber 
		 Basketballworkoutnumbers.printBasketballs(Names6,Names7, r7,r8,o,p,holder,nameholder);
		//prints out for the user to see the winners
		 System.out.println(Names7);
		
		System.out.println();
	}
}
