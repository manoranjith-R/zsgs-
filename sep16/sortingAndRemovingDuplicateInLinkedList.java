package sep16;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class sortingAndRemovingDuplicateInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		LinkedList list=new LinkedList();
		for(int i=0;i<5;i++) {
			System.out.println("Enter the element");
			list.add(input.nextInt());
		}
        HashSet set=new HashSet(list);
        for(Object o:set) {
        	System.out.println(o);
        }
	}

}
