package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		
		// It allow only homogeneous data
		
		t.add(90);
	//	t.add('A');  // Cast Cast Exception--> because TreeSet allow only Homogeneous values
		t.add(10);
		t.add(80);
		t.add(20);
		t.add(1);
	//	t.add(null);  // Null Pointer Exception-->Does not allow null values
		
		System.out.println(t);
		
		
		// 1. Using For loop
		
		
		// 2. Using For each loop
		
		for(Object a:t)
		{
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		// 3. Using Iterator
		Iterator it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
