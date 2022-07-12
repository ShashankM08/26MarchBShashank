package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet ls= new LinkedHashSet();
		
		ls.add("Pune");
		ls.add("Pune");
		ls.add('A');
		ls.add(123);
		ls.add(12.234);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);  // Order or insertion is not maintained
		
		// 1. Using for loop
		
		System.out.println("=============================");
		
		
		// Using For each loop
		for(Object z:ls)
		{
			System.out.println(z);
		}
		
		System.out.println("=============================");
		
		// 2. Using Iterator
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
