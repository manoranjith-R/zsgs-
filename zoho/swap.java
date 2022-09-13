package zoho;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println();
		int a=input.nextInt();
		int b=input.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+" "+"b="+b);

	}

}
