package Constructor;

public class UserDefinedConstructor {
	
	int a; // Variable Deceleration
	int b; // Variable Declaration
	
	
	public UserDefinedConstructor()
	{
		// User Defined Constructor
		// Constructor is called when an object of class is created
		System.out.println("UserDefinesConstructor is Running");
		a=900;
		b=800;
	}
	
	

	public static void main(String[] args) 
	
	{
		UserDefinedConstructor ud= new UserDefinedConstructor();  // Object created
        ud.add(); // Calling
        ud.sub(); //Calling
	}
	
	
	public void add()
	{
		int sum=a+b;   // Value of a and b received from constructor
		System.out.println("Sum is "+sum);
	}
	

	
	public void sub()
	{
		int sub= a-b;  // Value of a and b receive from constructor
		System.out.println("Substraction is "+sub);
	}
}
