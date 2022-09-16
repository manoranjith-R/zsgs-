package sep14;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			 int ar[]=Arrays.copyOfRange(arr, i, arr.length);
			System.out.println(Arrays.toString(ar));
		
		}

	}

}
