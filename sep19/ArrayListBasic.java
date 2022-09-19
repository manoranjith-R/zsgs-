package sep19;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
	static ArrayList<String> mergeArrayList(ArrayList<String> first,ArrayList<String> secound){
		ArrayList<String> result=new ArrayList<String>();
		int lengthOfFirst=first.size(),i=0;
		int lengthOfSecound=secound.size(),j=0;
		while(i<lengthOfFirst&&j<lengthOfSecound) {
			result.add(first.get(i));
			result.add(secound.get(i));
			i++;
			j++;
		}
		while(i<lengthOfFirst) {
			result.add(first.get(i));
			i++;
		}
			while(j<lengthOfSecound) {
				result.add(secound.get(j));
				j++;
			}
			
			
			return result;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<String> first= new ArrayList<String> ();
		ArrayList<String> secound= new ArrayList<String> ();
		System.out.println("Enter the size of first arrayList ");
		int sizeOfFirstList=input.nextInt();
		System.out.println("Enter the size of secound arrayList ");
		int sizeOfSecoundList=input.nextInt();
		input.nextLine();
		for(int i=0;i<sizeOfFirstList;i++) {
			first.add(input.nextLine());
		}
		for(int i=0;i<sizeOfSecoundList;i++) {
			secound.add(input.nextLine());
		}
		
		ArrayList<String> result=mergeArrayList(first,secound);
		for(Object o:result) {
			System.out.print(" "+o);
		}
	}

}
