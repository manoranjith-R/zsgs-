package zoho;

import java.math.BigInteger;

public class chess {
	static BigInteger temp(BigInteger num,int a) {
		if(a==1) 
			return num;
	     a--;
	     return num.add(temp( num.add(num),a));
		
	}
	public static void main(String[] args) {
	  System.out.println(temp(BigInteger.valueOf(1),64));

	}

}
