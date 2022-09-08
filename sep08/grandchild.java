package sep08;

import java.util.Scanner;

public class grandchild {

	public static void main(String[] args) {
	       String arr[][]= {{"luke","shaw"},{"wanye","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
	     //  Scanner input =new Scanner (System.in);
	      // String str=input.nextLine();
	       String str="ronaldo";
	       int j=1;
	       String child="";
	       for(int i=0;i<arr.length;i++) {
	    	   if(arr[i][j]==str) {
	    		   child=arr[i][j-1];
	    		   break;
	    		   
	    	   }
	       }
	       int count=0;
	       for(int i=0;i<arr.length;i++) {
	    	   if(arr[i][j]==child) {
	    		   count+=1;
	    	   }
	       }
	       System.out.println(count);

	}

}
