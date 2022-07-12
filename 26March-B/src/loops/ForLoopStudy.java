package loops;

public class ForLoopStudy {

	public static void main(String[] args) 
	{
		// I want to print numbers 0-10 and increment by 1
		
		for(int a=0;a<=10;a++)
		{
			System.out.println(a);
				
		}

		System.out.println("=====================");
		
		
		// I want to print 2's table
		for(int a=2;a<=20;a=a+2)
		{
			System.out.println(a);
			
		}
		
		
		System.out.println("======================");
		
		
		// I want to print 5's table and incremented by 5
		
		for(int a=5;a<=50;a=a+5)
		{
			System.out.println(a);
		}
		
		System.out.println("=======================");
		
		
		// I want to print 5's table in reverse order decremented by 5
		
		for(int a=50;a>=5;a=a-5)
		{
			System.out.println(a);
		}
		
		System.out.println("========================");
	}

}
