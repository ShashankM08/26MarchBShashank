package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		HashSet hs =new HashSet();
		hs.add("Pune");
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);  // Random insertion with no duplicates
		
		System.out.println(hs.size());  // 8
		System.out.println(hs.isEmpty());  // False
		System.out.println(hs.contains(21)); // False
		
		
		System.out.println("=======================================");
		// We can use 
		//For loop
		//For each
		// Iterator
		
		// 1. Using For loop
		
		
		// 2.  Using For each loop
		for(Object a:hs)
		{
			System.out.println(a);
		}

		
		System.out.println("=======================================");
		
		// Using Iterator
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
