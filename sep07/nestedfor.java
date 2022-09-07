package sep07;

import java.util.Arrays;
import java.util.Scanner;

public class nestedfor {

	static void sorting(int[] arr){
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the ");
		int length= input.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		sorting(arr);
		System.out.println(Arrays.toString(arr));

	}

}
