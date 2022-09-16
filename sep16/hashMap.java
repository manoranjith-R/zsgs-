package sep16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class hashMap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		TreeMap<String,Integer> map=new TreeMap<>();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the KEY and VALUE");
			map.put(input.nextLine(),input.nextInt() );
			input.nextLine();
		}
		Set<Entry<String,Integer>> entry=map.entrySet();

		for(Entry e:entry) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
		
		Object nextmap=map.clone();
		Set<Entry<String,Integer>> entrynext=map.entrySet();

		for(Entry e:entrynext) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		System.out.println(map.containsKey("Mano"));
		System.out.println();
		System.out.println(map.equals(nextmap));
		System.out.println(map==entrynext);
		
		
	}

}
