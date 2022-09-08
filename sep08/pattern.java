package sep08;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=input.nextLine();
		if(str.length()%2!=0) {
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i==j||j+i==str.length()-1) {
					System.out.print(arr[j]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		}
		else {
			System.out.println("0");
		}
		

	}

}
