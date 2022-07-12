package interfaceStudy;

public class Demo implements MyInterface {

	public static void main(String[] args) 
	{
		Demo d= new Demo();
		d.test();
		d.test1();

	}

	@Override
	public void test() 
	{
		System.out.println("test class completed");
		
	}

	@Override
	public void test1() 
	{
		System.out.println("test1 class completed");
		
	}

}
