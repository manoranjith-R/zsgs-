package zoho;

import java.math.BigInteger;
import java.util.Scanner;

public class chesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		BigInteger num=input.nextBigInteger();
		//System.out.println("enter the position");
		//int pos=input.nextInt();
		
		BigInteger ans=num;
		
		for(int i=1;i<64;i++) {
			num=num.add(num);
			ans=ans.add(num);
		}
		System.out.println(ans);
		System.out.println();
	}

}
