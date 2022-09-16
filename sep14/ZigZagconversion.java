package sep14;

import java.util.Scanner;

public class ZigZagconversion {
	public static String convert(String s, int numRows) {
        StringBuilder[] str=new StringBuilder[numRows];
      for(int i=0;i<numRows;i++){
          str[i]=new StringBuilder();
      }
      
      char []arr=s.toCharArray();
      int index=0;
      while(index<s.length()){
          for(int i=0;i<numRows&&index<s.length();i++){
              str[i].append(arr[index++]);
          }
           for(int i=numRows-2;i>0&&index<s.length();i--){
              str[i].append(arr[index++]);
          }     
      }
      StringBuilder res=str[0];
      for(int i=1;i<numRows;i++){
          res.append(str[i].toString());
      }
      return res.toString();
  }
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=input.nextLine();
		System.out.println("Enter the row");
		int row=input.nextInt();
		System.out.println(convert(str,row));
 

	}

	
}
