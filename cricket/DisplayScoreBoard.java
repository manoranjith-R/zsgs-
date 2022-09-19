package cricket;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class DisplayScoreBoard {

	void display(HashMap<String,Integer> ScoreBoard) {
		
		Set<Entry<String,Integer>> board = ScoreBoard.entrySet();
	   System.out.println();
       System.out.println("                  ScoreBoard");
       System.out.println();
       System.out.println("PLAYER NAME                              RUN");
       System.out.println();
		for(Entry<String,Integer> z : board) {
			 System.out.printf("%-40s %d\n",z.getKey(),z.getValue());
			

	}
		  System.out.println();

}}
