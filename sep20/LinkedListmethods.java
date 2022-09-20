package sep20;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListmethods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println("Enter the size of LinkedList");
		int size=input.nextInt();
		for(int i=0;i<size;i++) {
			list.add(input.nextInt());
		}
	       list.addFirst(1);
	       list.addLast(5);
		System.out.println("The first element of LinkedList is "+list.getFirst());
		System.out.println("The last element of the LinKedList is "+list.getLast());
		
		LinkedList<Integer> copiedList=(LinkedList<Integer>) list.clone();
		for(int i=0;i<copiedList.size();i++) {
			System.out.println(" "+copiedList.get(i));
		}
			System.out.println(" "+copiedList.toString());
		
			System.out.println(copiedList.equals(list));
			
			System.out.println(copiedList==list);

	}

}
