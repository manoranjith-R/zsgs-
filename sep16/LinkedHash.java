package sep16;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHash {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
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
		
		map.clear();
		for(Entry e:entry) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
		Set<String>set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
		}
		

	}

}
