package zoho;

public class bitwise {
	static int findCompliment(int num) {
		int temp=num;
		long i=1;
		while(i<=temp) {
			num^=i;
			i<<=1;
		}
		return num;
	}
	public static void main(String[] args) {
		int a=findCompliment(5);
		System.out.println(a);
		System.out.println(-8>>2);

	}

}
