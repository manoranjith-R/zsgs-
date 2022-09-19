package sep19;

import java.util.Scanner;

public class twoDimensonalArray {
	static void display(int [][]array,int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int sumOfAllElements(int [][]array,int row,int column) {
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			sum+=array[i][j];
			}
		}
		return sum;
	}
	static int[] sumOfRowElements(int [][]array,int row,int column) {
		int sum[]=new int[row];
		
		for(int i=0;i<row;i++) {
			int sumOfElements=0;
			for(int j=0;j<column;j++) {
			sumOfElements+=array[i][j];
			
			}
			sum[i]=sumOfElements;
		}
		return sum;
	}
	static int[] sumOfColumnElements(int [][]array,int row,int column) {
		int sum[]=new int[row];
		
		for(int i=0;i<row;i++) {
			int sumOfElements=0;
			for(int j=0;j<column;j++) {
			sumOfElements+=array[j][i];
			
			}
			sum[i]=sumOfElements;
		}
		return sum;
	}
	static void transpose(int [][]array,int row,int column) {
		int result[][]=new int[column][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}

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
		display(twoDimonsonalArray,row,column);
		
		 int sum=sumOfAllElements(twoDimonsonalArray,row,column);
		 System.out.println("The total Sum is "+sum);
          
		 int sumOfRowElements[]= sumOfRowElements(twoDimonsonalArray,row,column);
		 
		 for(int i=0;i<row;i++) {
			 System.out.print("Sum of Elements of Row"+(i+1)+" ");
			 System.out.println(sumOfRowElements[i]);
		 }
		 int sumOfColumnElements[]=sumOfColumnElements(twoDimonsonalArray,row,column);
		
		 
		 for(int i=0;i<column;i++) {
			 System.out.print("Sum of Elements of column"+(i+1)+" ");
			 System.out.println(sumOfColumnElements[i]);
		 }
		 transpose(twoDimonsonalArray,row,column);

	}

}
