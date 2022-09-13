package zoho;

import java.math.BigInteger;
import java.util.Scanner;

public class doublethenum {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("enter the position");
		int pos=input.nextInt();
		int ans=num;
		for(int i=1;i<pos;i++) {
			ans+=num;
			num=ans;
		}
		System.out.println(ans);
	}
	

}
