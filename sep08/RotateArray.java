package sep08;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	static void leftRotate(int []arr,int n) {
		for(int i=0;i<n;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
	}
	static void RightRotate(int []arr,int n) {
		for(int i=0;i<n;i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		RightRotate(arr,num);
		System.out.println(Arrays.toString(arr));

	}

}
