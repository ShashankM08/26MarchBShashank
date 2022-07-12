package collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector a= new Vector();
		// By doing so, 10 blocks are already created
		
		a.add("Velocity");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(123.123);
		a.add("Velocity");
		a.add(null);
		a.add(123);
		a.add(null);
		
		
		System.out.println(a);  // Run--> Result appears sequence wise
		
		System.out.println(a.size());  // Size--> 9
		System.out.println(a.isEmpty());  // False
		System.out.println(a.contains(123)); // True because 123 is present
		System.out.println(a.get(1));  //'1' means index and at that place A is present--> A
		System.out.println(a.indexOf(123));  // It returns 2, because its index is 2
		System.out.println(a.lastIndexOf("Velocity"));  // It returns 5
	//	System.out.println(a.remove(123));    OutOfBoundException because we put element instead of Index
		
		System.out.println(a.remove(1)); // A is removed
		System.out.println(a); // To check whether A is removed or not
		
		
		
		// By using For loop
		System.out.println("=================================================");
		
		for(int i = 0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));  // It will show seperate veriable
		}
		
		
		System.out.println("===================================================");
		
		
		
		// By using Iterator
		
		Iterator it = a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===================================================");
		
		// by using ListIterator
		
		ListIterator itr = a.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("===================================================");
		
		// For Each loop
		for(Object v:a)
		{
			System.out.println(v);
		}
		
		
		System.out.println("===================================================");
		
		
		
		// By Enumeration
		Enumeration ve = a.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		
		

	}

}
