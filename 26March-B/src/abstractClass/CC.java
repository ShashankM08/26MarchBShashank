package abstractClass;

public class CC extends Sample{

// Concrete Class--> A class which provides definition to all incomplete methods,
//which are present in Abstract class using ** Extends Keyword**	
	
	public static void main(String[] args) 
	{
		CC c= new CC(); // Creating object of CC
		c.test(); // Calling complete method of Sample class
		c.test1();  // Calling Incomplete/ abstract class which is now completed here
		c.demo();  // Calling method of CC
		

	}

	@Override
	public void test1()  // Incomplete method now completed in Concrete class
	{
		System.out.println("This is Incomplete method which is now completed in concrete class");
		
	}

	public void demo()
	{
		System.out.println("Method of CC");
	}
}
