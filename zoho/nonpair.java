package zoho;

import java.util.Scanner;

public class nonpair {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int num=0;
		for(int i=0;i<arr.length;i++) {
		    num^=arr[i];
		}
		System.out.println(num);
	}

}
