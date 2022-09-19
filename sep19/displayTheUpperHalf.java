package sep19;

import java.util.Scanner;

public class displayTheUpperHalf {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Number of Rows ");
		int row=input.nextInt();
		System.out.println("Enter the Number of Columns ");
		int column=input.nextInt();
		int twoDimonsonalArray[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			System.out.println("Enter the elements of row"+(i+1));
			for(int j=0;j<column;j++) {	
				twoDimonsonalArray[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			if(i<=j)
			System.out.print(twoDimonsonalArray[i][j]+" ");
			else {
			System.out.print("  ");
			}
		}
			System.out.println();
	}

	}

}
