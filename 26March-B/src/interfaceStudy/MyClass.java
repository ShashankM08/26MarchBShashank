package interfaceStudy;

public class MyClass implements MyInterface {

	// This is Implements class used to provide definitions to all incomplete methods
	
	public static void main(String[] args) 
	{
		
		MyClass m=new MyClass();
		m.test();
		m.test1();
		//a=a+10; not possible because it is final

	}

	@Override
	public void test()
	{
		System.out.println("Test method completed in implements class");
		
	}

	@Override
	public void test1() 
	{
		
		System.out.println("Test1 method completed in implements class");
	}
	
}
