package methods;

public class StaticMethodCall {

	public static void main(String[] args)
	{
	Sample();   // Calling Static Method From Same Class-->  Methodname();
	Sample1();  // Calling Static Method From Same Class
	StaticStudy.Mymethod();  // Calling Static Method From Different Class -->  Classname.Methodname
	StaticStudy.YourMethod();
	StaticStudy1.Batman();

	}
	
	public static void Sample() // Regular Static
	{
	System.out.println("HI I am Regular Static Method");	
	}

	
	
	
	public static void Sample1()  //Regular Static
	{
		System.out.println("My name is Shashank");
	}
}
