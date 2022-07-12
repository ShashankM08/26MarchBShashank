package collection;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList a= new ArrayList<>();
		
		a.add("Velocity");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(123.123);
		a.add("Velocity");
		a.add(null);
		a.add(123);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size()); // 9 will display
		System.out.println(a.isEmpty());  // False
		System.out.println(a.contains(123));  // True
		System.out.println(a.get(1));  // A because position of A is 1
		System.out.println(a.indexOf("Velocity"));  // initial position of velocity is 0
		System.out.println(a.lastIndexOf("Velocity"));   // initial position of velocity is 5
		//System.out.println(a.remove(123));   It shows Out of Bound Exception because we put element instead of index
		System.out.println(a);
		
		
		System.out.println("=====================================");
		
		// Using for loop
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		
		
		System.out.println("=====================================");
		
		
		// Using Iterator
		
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("=====================================");
		
		// Using List Iterator
		
		ListIterator itr = a.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("=====================================");
		
		// Using For each loop
		for(Object v:a)
		{
			System.out.println(v);
		}
		
		
	}

}
