package cricket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class BatingAndBowling {
	int bating(String[] Players,int overs) {
		Random cheak=new Random();
		DisplayScoreBoard show=new DisplayScoreBoard();
		int score1=0;
		int score2=0;
		int player1=0,player2=1;
		int Strick=0;
		int score=0;
		HashMap<String,Integer> ScoreBoard=new HashMap<>();
		outer:
		for(int j=0;j<overs;j++) {
			
		for(int i=0;i<6;i++) {
			int run=cheak.nextInt(10);
			//-2==wkt
			if(Strick==0) {
			switch(run) {
			case 0:
				score1+=run;
		      	ScoreBoard.put(Players[player1], score1);
		      	break;
			case 2:
				score1+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 4:
				score1+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 6:
				score1+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 1:
				Strick=1;
		    	score1+=run;
		    	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 3:
				Strick=1;
		    	score1+=run;
		    	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 7:
				ScoreBoard.put(Players[player1++], score1);
				break;
			case 8:
				score1+=run;
				i--;
				break;
			case 9:
				int Extra=cheak.nextInt(6);
				score1+=run;
				i--;
				break;
			}
			}
			if(Strick==1) {
			switch(run) {
			case 0:
				score2+=run;
		      	ScoreBoard.put(Players[player1], score1);
		      	break;
			case 2:
				score2+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 4:
				score2+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 6:
				score2+=run;
		      	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 1:
				Strick=1;
		    	score2+=run;
		    	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 3:
				Strick=1;
		    	score1+=run;
		    	ScoreBoard.put(Players[player1], score1);
		    	break;
			case 7:
				ScoreBoard.put(Players[player1++], score1);
				break;
			case 8:
				score2+=run;
				i--;
				break;
			case 9:
				int Extra=cheak.nextInt(6);
				score2+=run;
				i--;
				break;
			}
			}
				if(player1==10||player2==9)
				{
					ScoreBoard.put(Players[player2++], score2);
					ScoreBoard.put(Players[player1++], score1);
					break outer;
				}
		
			}
			}
		show.display(ScoreBoard);
		Set<Entry<String,Integer>> board = ScoreBoard.entrySet();
		for(Entry<String,Integer> z : board) {
			score+=z.getValue();
		}	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	return score;
		
		
		
		
		
		
		
}

}