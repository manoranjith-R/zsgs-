package zoho;

import java.util.Scanner;

public class poweroftwo {
	static boolean ispoweroftwo(int num) {
		int temp=num;
		if((temp&(temp-1))==0)
			return true;
		return false;
			
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
	if(ispoweroftwo(num)) {
		System.out.println(num+"  is power of two");
	}
	else {
		System.out.println(num+"  is not a power of two");
	}

	}

}
