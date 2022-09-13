package zoho;

import java.util.Scanner;

public class decimaltobit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int bin=0,rem,place=1;
		while(num!=0) {
			rem=num%2;
			bin+=rem*place;
			num/=2;
			place*=10;
		}
		System.out.println(bin);

	}

}
