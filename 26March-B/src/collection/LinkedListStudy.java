package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args)
	{
		LinkedList ll= new LinkedList();
		
		ll.add("Velocity");
		ll.add(123);
		ll.add('A');
		ll.add("Velocity");
		ll.add(null);
		ll.add(null);
		ll.add(12.12);
		ll.add(true);
		
		System.out.println(ll);  // Order of insertion is maintained
		
		System.out.println(ll.size());  // 8
		System.out.println(ll.isEmpty());  // False because no space is empty
		System.out.println(ll.getFirst());  // Velocity because is it first
		System.out.println(ll.getLast()); // True because it is last
		
		System.out.println("==============================");
		System.out.println(ll.peek());  // Velocity--> It retrieve but does not remove element
		System.out.println(ll.peekFirst());  // Velocity--> but now remove
		System.out.println(ll.peekLast());  // True--> retrieve but not delete
		
		System.out.println(ll);
		
		System.out.println("==============================");

		System.out.println(ll.poll());  // Velocity--> it shows and deleted also
		System.out.println(ll);  // First Velocity is deleted
		System.out.println(ll.pollFirst());  // 123 will show because Velocity is already been deleted
		System.out.println(ll.pollLast());  // True which is present at last also get deleted
		
		System.out.println("==============================");
		
		System.out.println(ll.pop());  // It will show A because 123 already been deleted
		
		
		System.out.println("=============================");
		
		// We can use 
		//For loop
		//For each loop
		// Iterator
		// ListIterator
		
		
		// 1. Using for loop
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("=============================");
		
		
		// Using For each loop
		
		for(Object b:ll)
		{
			System.out.println(b);
		}
		
		System.out.println("=============================");
		
		// Using  Itrerator
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============================");
		
		
		// Using List Iterator
		ListIterator itr = ll.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	

}
