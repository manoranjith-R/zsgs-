package sep19;

import java.util.Scanner;
import java.util.*;
public class LargestSubArrayWithSum0 {
	static int maxLen(int arr[], int n)
	    {
	      int max=0;
	      int sum=0;
	      HashMap<Integer,Integer>map=new HashMap<>();
	         for(int i=0;i<n;i++){
	             sum+=arr[i];
	             if(sum==0){
	                 max=i+1;
	             }
	             Integer out=map.get(sum);
	             if(out!=null){
	                 max=Math.max(max,i-out);
	             }
	             else{
	                 map.put(sum,i);
	             }
	         }
	        return max;
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
		int result=maxLen(array,length);
		System.out.println(result);

	}

}
