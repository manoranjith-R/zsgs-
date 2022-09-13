package zoho;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int bin=input.nextInt();
		int rim,deci = 0;
		int i=0;
		while(bin!=0) {
			rim=bin%10;
			deci+=(int)(rim*Math.pow(2,i));
			bin/=10;
			i++;
		}
		System.out.println(deci);

	}

}
