package sep19;

import java.util.Scanner;
public class majorityElementsInArray {
	static int findMajority(int []arr) {
		int votes=0,majority=-1;
		for(int i=0;i<arr.length;i++) {
			if(votes==0) {
				majority=arr[i];
				votes=1;
			}
			else {
				if(majority==arr[i]) {
					votes++;
				}
				else {
					votes--;
				}
			}
		}
		int count=0;
		for (int j = 0; j < arr.length; j++) {
	        if (arr[j] == majority)
	            count++;
	    }
	    if (count > arr.length / 2)
	        return majority;
	    return -1;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length=input.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter the element");
			array[i]=input.nextInt();
		}
		
		int result=findMajority(array);
		if(result==-1) {
		System.out.println("There is no majority element");
		}
		else {
			System.out.println("The Majority element is "+result);
		}

	}

}
