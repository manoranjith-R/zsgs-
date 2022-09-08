package sep08;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangingArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		int length=input.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int mid=0;
		if(arr.length%2==0) 
		{
		mid=(arr.length/2)-1;
		}
		else {
			mid=arr.length/2;
		}
		int temp=mid;
		int output[]=new int[arr.length];
		for(int i=0;i<arr.length;i+=2) {
			output[i]=arr[mid--];
		}
		for(int i=1;i<arr.length;i+=2) {
			output[i]=arr[++temp];
		}
		System.out.println(Arrays.toString(output));

	}

}
