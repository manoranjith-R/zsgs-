package cricket;

import java.util.Scanner;

public class Mains {

	public static void main(String[] args) {
		SelectTeam teamSelection=new SelectTeam();
		toss choice=new toss();
		Scanner input=new Scanner(System.in);
		System.out.println("SELECT FIRST TEAM");
		
		
		System.out.println("Select the team you want \n1.INDIA\n2.Pakistan\n3.Australian\n4.England");
		int firstTeam=input.nextInt();
		System.out.println("Select the oponent team \n1.INDIA\n2.Pakistan\n3.Australian\n4.England");
		int opponent=input.nextInt();
		if(firstTeam==opponent) {
			System.out.println("select differnt team");
			System.out.println("Select the oponent team \n1.INDIA\n2.Pakistan\n3.Australian\n4.England");
			opponent=input.nextInt();
		}
		System.out.println("How many  overs You want");
		int overs=input.nextInt();
		
		teamSelection.team(firstTeam,opponent);
		
		System.out.println("Choose \n0.head\n1.tail");
		int yourChoice=input.nextInt();
		choice.chooose(yourChoice,firstTeam,opponent,overs);
		
		
		
		
		
		
		
		
		
		
		

	}

}
