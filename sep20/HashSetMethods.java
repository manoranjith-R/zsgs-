package sep20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class HashSetMethods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();

		System.out.println("Enter the size of set ");
		int size=input.nextInt();
		System.out.println("Enter the Elements of Set");
		for(int i=0;i<size;i++) {
			set.add(input.nextInt());
		}
		System.out.println();
		System.out.println("Iterating by using iterator");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Iterating by using forEach");
		for(Object o:set) {
			System.out.println(o);
		}
		
		Object array[] =set.toArray();
		System.out.println("after  convertion into array");
		for(Object o:array) {
			System.out.println(o);
		}
		System.out.println("Enter the size of set2 ");
		int size2=input.nextInt();
		System.out.println("Enter the Elements of Set");
		for(int i=0;i<size2;i++) {
			set2.add(input.nextInt());
		}
		for(Object o:set) {
			for(Object p:set2) {
				if(o.equals(p)) {
					System.out.println(o);
				}
				
			}
		}
		set.retainAll(set2);
		System.out.println(set);
		set.clear();
		}

}
