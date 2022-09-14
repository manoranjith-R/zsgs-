package cricket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class BatingAndBowling {
	int bating(String[] Players) {
		Random cheak=new Random();
		
//		for(int i=0;i<11;i++)
//		System.out.println(Players[i]);
		int score1=0;
		int score2=0;
		int player1=0,player2=1;
		int Strick=0;
		int score=0;
		HashMap<String,Integer> ScoreBoard=new HashMap<>();
		outer:
		for(int j=0;j<5;j++) {
			if(Strick==1) {
				Strick=0;
			}
			else {
				Strick=1;
			}
		for(int i=0;i<6;i++) {
			int run=cheak.nextInt(-3,7);
			//-2==wkt
			if(Strick==0) {
			    if(run==-2) 
			    {	
			    //	System.out.println("hi");
			    	ScoreBoard.put(Players[player1++], score1);
			     }
			    if(run==1||run==3) 
			    {
			    	Strick=1;
			    	score1+=run;
			    	score+=run;
			    	ScoreBoard.put(Players[player1++], score1);
			    	//System.out.println("h");
			    }
			    if(run==0||run==4||run==6||run==2) {
			    	score1+=run;
			      	score+=run;
			    	//System.out.println("he");
			      	ScoreBoard.put(Players[player1++], score1);
			    }
			    if(Strick==1) {
			    	//System.out.println("hel");
				    if(run==-2) 
				    {	
				    	ScoreBoard.put(Players[player2++], score2);
				    	//System.out.println("hell");
				     }
				    if(run==1||run==3) 
				    {
				    	//System.out.println("hello");
				    	Strick=0;
				    	score2+=run;
				      	score+=run;
				      	ScoreBoard.put(Players[player2++], score2);
				    }
				    if(run==0||run==4||run==6||run==2) {
				    	//System.out.println("hi hello");
				    	score2+=run;
				      	score+=run;
				      	ScoreBoard.put(Players[player2++], score2);
				    }
				if(player1==9||player2==9) {
					//System.out.println("bye");
					ScoreBoard.put(Players[player2++], score2);
					ScoreBoard.put(Players[player1++], score1);
					break outer;
				}
			}
		}
			}
		
	}
		Set<Entry<String,Integer>> board = ScoreBoard.entrySet();
		for(Entry<String,Integer> z : board) {
			System.out.println(z);
}
		System.out.println();
		
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	return score;
		
		
		
		
		
		
		
}

}