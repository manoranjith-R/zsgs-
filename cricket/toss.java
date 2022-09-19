package cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class toss {
	void getName(String name) {
	       String team=name;
	}
	void chooose(int num,int Team1,int Team2,int overs) {
		String arr[]= {};
		String IndianPlayers[]= {"Rahul(BAT)","Rohit(CAPTAIN,BAT)","Virat Kholi(BAT)","Suryakumar Yadav(BAT)","Karthik(BAT & Wk)","Hardik Pandya(BAT & BOWL)","Jadeja(BAT & BOWL)","Axar(BAT & BOWL)","Chahal(BOWL)","D Chahar(BOWL)","Bhuvneshwar(BOWL)"};
		String PakistanPlayers[]= {"Rizwan(BAT & WK)","Babar Azam(CAPTAIN,BAT)","Fakhar Zaman(BAT)","Khushdil(BAT)","Ahmed(Bat & Bowl)","Shadab Khan(BAT & BOWL)","A Ali(BAT)","Nawaz(BAT & BOWL)","H Rauf(BOWL)","M Hasnain(BOWL)","N Shah(BOWL)"};
		String AustralianPlayers[]= {"D Warner(BAT)","A Finch(CAPTAIN,BAT)","S Smith(BAT)","G Maxwell(BAT)","M Stoinis(BAT & BOWL)","Al Carey(BAT & Wk)","Adam Zampa(Bowl)","P Cummins(BAT & BOWL)","M Starc(BOWL)","P Handscomb(BOWL)","N Coulter(BOWL)"};
		String EnglandPlayers[]= {"A Lees(BAT)","Z Crawley(BAT)","O Pope(BAT)","Root(BAT)","H Brook(BAT)","Strokes(CAPTAIN & BAT & BOWL)","Foakes(BAT & WK)","Broad(BOWL)","Robinson(BOWL)","J Leach(BOWL)","J Anderson(BOWL)"};
		List<String[]>teams=new ArrayList<>();
		teams.add(arr);
		teams.add(IndianPlayers);
		teams.add(PakistanPlayers);
		teams.add(AustralianPlayers);
		teams.add(EnglandPlayers);
		Scanner input=new Scanner(System.in);
		BatingAndBowling bat=new BatingAndBowling();
		Random cheak=new Random();
		int coin=cheak.nextInt(2);
		String firstTeam="";
		String opponent="";
	    switch(Team1) {
	    case 1:
			firstTeam="INDIA";
			break;
	    case 2:
			firstTeam="PAKISTAN";
			break;
	    case 3:
			firstTeam="AUSTRALIA";
			break;
	    case 4:
			firstTeam="ENGLAND";
			break;
	    }
	    switch(Team2) {
	    case 1:
	    	opponent="INDIA";
			break;
	    case 2:
	    	opponent="PAKISTAN";
			break;
	    case 3:
	    	opponent="AUSTRALIA";
			break;
	    case 4:
	    	opponent="ENGLAND";
			break;
	    }
		
		int FirstTeamScore=0;
		int SecoundTeamScore=0;
		int choice;
		if(coin==num) {
			System.out.println(firstTeam+" won the toss\n1.Bating\n2.Bowling");
			 int ch=input.nextInt();
			 if(ch==1) {
					 FirstTeamScore=bat.bating(teams.get(Team1),overs);
					 System.out.println(firstTeam+"score="+FirstTeamScore);
					SecoundTeamScore= bat.bating(teams.get(Team2),overs);
					System.out.println(opponent+"  score="+SecoundTeamScore);
			 }
			    
			 else {
					 SecoundTeamScore= bat.bating(teams.get(Team2),overs);

					 System.out.println(opponent+"  score="+SecoundTeamScore);
					 System.out.println();
					 FirstTeamScore=bat.bating(teams.get(Team1),overs);
					 System.out.println(firstTeam+"  score="+FirstTeamScore);
					 System.out.println();
				 }
		}
		else {
			 SecoundTeamScore= bat.bating(teams.get(Team2),overs);
			 System.out.println(opponent+"  score="+SecoundTeamScore);
			 System.out.println();
			 FirstTeamScore=bat.bating(teams.get(Team1),overs);
			 System.out.println(firstTeam+"  score="+FirstTeamScore);
			 System.out.println();
		}
			 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(SecoundTeamScore<FirstTeamScore) {
			System.out.println();
			System.out.println(firstTeam+" won the match");
		}
		else if(SecoundTeamScore==FirstTeamScore) {
			System.out.println("draw");
		}
		else {
			System.out.println();
			System.out.println(opponent+" won the match");
		}
	}

}
