package sep08;

import java.util.Arrays;
import java.util.Scanner;

public class matrixmultiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the frstmatrix row length ");
		int firstMatrixRow=input.nextInt();
		System.out.println("Enter the frstmatrix column length ");
		int firstMatrixColumn=input.nextInt();
		System.out.println("Enter the frstmatrix row length ");
		int secoundMatrixRow=input.nextInt();
		System.out.println("Enter the frstmatrix column length ");
		int secoundMatrixColumn=input.nextInt();
		
		
		int first[][]=new int[firstMatrixRow][firstMatrixColumn];
		int secound[][]=new int[secoundMatrixRow][secoundMatrixColumn];
		
		
		for(int i=0;i<firstMatrixRow;i++) {
			for(int j=0;j<firstMatrixColumn;j++) {
				first[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<secoundMatrixRow;i++) {
			for(int j=0;j<secoundMatrixColumn;j++) {
				secound[i][j]=input.nextInt();
			}
		}
		
		int output[][]=new int[firstMatrixRow][secoundMatrixColumn];
		
		for(int i=0;i<firstMatrixRow;i++) {
			for(int j=0;j<secoundMatrixColumn;j++) {
				for(int k=0;k<firstMatrixRow;k++) {
				
				output[i][j]+=(first[i][k]*secound[k][j]);
			
					
			}
		}
		

	}
		System.out.println(Arrays.deepToString(output));

	}
}
