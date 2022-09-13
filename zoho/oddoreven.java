package zoho;

import java.util.Scanner;

public class oddoreven {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			int num=input.nextInt();
			if((num&1)==0) {
				System.out.println("is even");
			}
			else {
				System.out.println("is odd");
			}
			

	}

}
