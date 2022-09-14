package cricket;

import java.util.ArrayList;
import java.util.List;

public class SelectTeam {
	static void display(String[] arr) {
		for(String i:arr) {
			System.out.println(i);
		}
		System.out.println();
	}

void team(int num,int num2) {

String IndianPlayers[]= {"Rahul(BAT)","Rohit(CAPTAIN,BAT)","Virat Kholi(BAT)","Suryakumar Yadav(BAT)","Karthik(BAT & Wk)","Hardik Pandya(BAT & BOWL)","Jadeja(BAT & BOWL)","Axar(BAT & BOWL)","Chahal(BOWL)","D Chahar(BOWL)","Bhuvneshwar(BOWL)"};
String PakistanPlayers[]= {"Rizwan(BAT & WK)","Babar Azam(CAPTAIN,BAT)","Fakhar Zaman(BAT)","Khushdil(BAT)","Ahmed(Bat & Bowl)","Shadab Khan(BAT & BOWL)","A Ali(BAT)","Nawaz(BAT & BOWL)","H Rauf(BOWL)","M Hasnain(BOWL)","N Shah(BOWL)"};
String AustralianPlayers[]= {"D Warner(BAT)","A Finch(CAPTAIN,BAT)","S Smith(BAT)","G Maxwell(BAT)","M Stoinis(BAT & BOWL)","Al Carey(BAT & Wk)","Adam Zampa(Bowl)","P Cummins(BAT & BOWL)","M Starc(BOWL)","P Handscomb(BOWL)","N Coulter(BOWL)"};
String EnglandPlayers[]= {"A Lees(BAT)","Z Crawley(BAT)","O Pope(BAT)","Root(BAT)","H Brook(BAT)","Strokes(CAPTAIN & BAT & BOWL)","Foakes(BAT & WK)","Broad(BOWL)","Robinson(BOWL)","J Leach(BOWL)","J Anderson(BOWL)"};

List<String[]>teams=new ArrayList<>();
teams.add(IndianPlayers);
teams.add(PakistanPlayers);
teams.add(AustralianPlayers);
teams.add(EnglandPlayers);

if(num==1) {
	System.out.println("INDIA");
	System.out.println();
 display(IndianPlayers);
 
}
if(num==2) {
	System.out.println("PAKISTAN");
	System.out.println();
	 display(PakistanPlayers);
	}
if(num==3) {
	System.out.println("AUSTRALIA");
	System.out.println();
	 display(AustralianPlayers);
	}
if(num==4) {
	System.out.println("ENGLAND");
	System.out.println();
	 display(IndianPlayers);
	}

if(num2==1) {
	System.out.println("INDIA");
	System.out.println();
 display(IndianPlayers);
}
if(num2==2) {
	System.out.println("PAKISTAN");
	System.out.println();
	 display(PakistanPlayers);
	}
if(num2==3) {
	System.out.println("AUSTRALIA");
	System.out.println();
	 display(AustralianPlayers);
	}
if(num2==4) {
	System.out.println("ENGLAND");
	System.out.println();
	 display(EnglandPlayers);
	}
}
}