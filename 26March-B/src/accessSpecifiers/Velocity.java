package accessSpecifiers;

public class Velocity {

	public static void main(String[] args)
	{
		Velocity v= new Velocity(); // Object created
		v.test1(); // Calling Private and scope remains within the class
		v.test2(); // Calling Default and scope remains within package
		v.test3(); // Calling Protected and scope remains within package but we can access it from different package by using "Inheritance"
		v.test4(); // Calling Public and scope remains throughout package

	}
	
	private void test1()
	{
		System.out.println("I am Private method test1");
	}
	
	void test2()
	{
		System.out.println("I am Default method test2");
	}

	protected void test3()
	{
		System.out.println("I am Protected method test3");
	}
	
	public void test4()
	{
		System.out.println("I am Public method test4");
	}
}
