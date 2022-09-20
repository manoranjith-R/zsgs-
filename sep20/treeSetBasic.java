package sep20;

import java.util.Scanner;
import java.util.TreeSet;

public class treeSetBasic {

	public static void main(String[] args) {
		TreeSet <String> tree=new TreeSet();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of tree");
		int size=input.nextInt();
		System.out.println("Enter the elements of tree");
		for(int i=0;i<size;i++) {
			tree.add(input.nextLine());
		}
		for(Object o:tree) {
			System.out.println(o);
		}
		
		}
	}


