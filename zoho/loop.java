package zoho;

public class loop {

	public static void main(String[] args) {
		outerloop:
		for(int i=0;i<5;i++) {
			innerloop:
			for(int j=0;j<5;j++) {
				System.out.print(i);
				
			}
			if(i==3) {
			break outerloop;
			}
			System.out.println();
		}

	}

}
