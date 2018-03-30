import java.util.ArrayList;
import java.util.List;

public class Basketballworkoutnumbers {
	
	private static int o;
	private static int p;
	private String nameholder;
	private int holder;
	
	//made new private ints and strings that will be replaced by the Basketball stats
	public  Basketballworkoutnumbers(int one, int two, int three) {
		this.o=one;
		this.p=two;
		this.holder=three;
		//the class takes the special ints and strings needed from Basketball and makes them available for the other clases
	}
	public static void printBasketballs(List<String> Namechoice,List<String> Namechoice2, List<Double> rsection1 ,List<Double> rsection2 , int o, int p, int holder, String nameholder) {
	//the class takes the two lists, three ints, and the string from Basketball
	// 'o' represents a position that will indicate which statistics are greater between the two teams
	// 'p' grabs the winner and puts it into a new list
	// 'rsection1 takes the round priors data and compares it to find the data that will go to 'rsection2'
	// 'rsection2 is the new list that will get the winners data
	// 'nameholder' is just for moving the name of the team that won into the new list
	// 'Namechoice' takes the round priors names in which the winners names will be taken and moved to the next list
	// 'Namechoice2' is the new list that will get the winners names
	
		while(o<rsection1.size()) {
	//the loop goes till all the winners names and data is moved to new lists
			p=o;
	//p is reset every round since:
	//the stats are compared between the two facing teams if the first one is greater the if statement does not go off
	// if the second team stat is larger than the firsts then the second stat should be taken so p is incrimented
			if(rsection1.get(o)<rsection1.get(o+1)) {
			p=p+1;
			
			}
	//the winners name is taken out 
			nameholder=(Namechoice.get(p));		
	//the winners name  is put into a new list	
			Namechoice2.add(nameholder);
	//the winners team stats is moved to a new list		
			rsection2.add(rsection1.get(p));
	//o is incrimented to compare the next two teams		
			o=o+2;
	//p is set to zero as to be ready for the next game		
			p=0;
		}
	}


}
