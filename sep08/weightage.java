package sep08;

import java.util.Arrays;

public class weightage {
	static void sorting(int[][] arr) {
		Arrays.sort(arr,(a,b)->(Integer.compare(b[1], a[1])==0?Integer.compare(b[0], a[0]):Integer.compare(b[1], a[1])));
	}
	static boolean isSqrt (int num) {
		double temp=Math.sqrt(num);
		
		return (temp-Math.floor(temp)==0);
		
	}

	public static void main(String[] args) {
		int arr[]= {49,36,8,10,12};
		int output[][]=new int[5][2];
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(isSqrt(arr[i])) 
				count+=5;
			
			if(arr[i]%4==0&&arr[i]%6==0) 
				count+=4;
			
		   if(arr[i]%2==0) 
				count+=3;
			
			output[i][0]=arr[i];
			output[i][1]=count;
		}
		sorting(output);
		System.out.println(Arrays.deepToString(output));
		

	}

}
