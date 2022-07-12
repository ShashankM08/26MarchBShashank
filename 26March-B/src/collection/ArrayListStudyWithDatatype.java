package collection;

import java.util.ArrayList;

public class ArrayListStudyWithDatatype {

	

	public static void main(String[] args)
	{
		// For Integer type
		ArrayList<Integer> ai = new ArrayList<>();
		
		ai.add(12);
		ai.add(10);
		ai.add(8);
		ai.add(6);
		ai.add(4);
		
		System.out.println(ai);
		
		for( Integer d:ai)
		{
			System.out.println(d);
			
		}
		
		
		System.out.println("==================================");
		
		// For Character type
		ArrayList<Character> as= new ArrayList<>();
		
		as.add('A');
		as.add('B');
		as.add('C');
		as.add('D');
		as.add('E');
		as.add('F');
		
		
		for(Character f:as)
		{
			System.out.println(f);
		}
		

	}

}
