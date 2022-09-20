package sep20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMethods {
	static List <Integer> list1=new ArrayList<>();
	static List <Integer> list2=new ArrayList<>();
	static void insertAtFirstPosition(int value){
		list1.add(0, value);
	}
	static int retriveAnElement(int position) {
		return list1.get(position);
	}
	static boolean searchAnElement(int element) {
		
		return list1.contains(element);
	}
	static int findIndex(int element) {
		return list1.indexOf(element);
	}
	static boolean compare(List <Integer> list1,List <Integer> list2) {
		return list1.containsAll(list2);
	}

	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in);
  System.out.println("enter the size of list1 ");
  int sizeOfList1=input.nextInt();
  System.out.println("Enter the list1 element");
	for(int i=0;i<sizeOfList1;i++) {
		list1.add(input.nextInt());
	}
	
	
	
	System.out.println("enter the size of list2 ");
	  int sizeOfList2=input.nextInt();
	  System.out.println("Enter the list2 element");
		for(int i=0;i<sizeOfList2;i++) {
			list2.add(input.nextInt());
		}
		
		
		
		System.out.println("enter the element you want to add in first index ");
		  int element=input.nextInt();
		insertAtFirstPosition(element);
		
	System.out.println("Enter the position you want to retrive");
	int position=input.nextInt();
	
	try{
	int output=retriveAnElement(position);
	System.out.println("It present in The index  "+output);
	}catch(Exception e) {System.out.println("INVALID POSITION");};
	
	System.out.println("Enter the element cheak wheather its present or not");
	int cheakElement=input.nextInt();
	try {
		boolean pos=searchAnElement(cheakElement);
		if(pos==true) {
		System.out.println(pos);
		System.out.println("It present in The index  "+findIndex(element));
		}
	}catch(Exception e) {System.out.println("Its not presnt in the list");};
	
	
	boolean present=compare(list1,list2);
	if(present) {
		System.out.println("The two lists contains same elements");
	}
	else {
		System.out.println("This two lists have different elements");
	}
	
	
	
	}

}
