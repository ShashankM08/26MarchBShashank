package Constructor;

public class UserDefinedWithParameterConstructor
{

	int p;
	int q;    // Variable Declaration
	int r;
	
	public UserDefinedWithParameterConstructor()  // User defined with no parameter constructor
	{
	p=10;
	q=20;      // Variable Initialization defined under constructor same as class
	r=20;
	
	}
	
	
	public UserDefinedWithParameterConstructor(int X)  // User Defined with one parameter constructor
	{
		p=X;
	}
	
	public UserDefinedWithParameterConstructor(int X, int Y)
	{
		p=X;
		q=Y;
	}
	
	public UserDefinedWithParameterConstructor(int X, int Y, int Z)
	{
		p=X;
		q=Y;
		r=Z;
		
	}
	
	public static void main(String[] args) 
	{
	
		UserDefinedWithParameterConstructor udc= new UserDefinedWithParameterConstructor();  //Object defining
		udc.addition();    // program will not run until object is not called

		
		UserDefinedWithParameterConstructor udc1= new UserDefinedWithParameterConstructor(700);
		udc1.addition();
		
		UserDefinedWithParameterConstructor udc2= new UserDefinedWithParameterConstructor(80,80);
		udc2.addition();
		
		UserDefinedWithParameterConstructor udc3= new UserDefinedWithParameterConstructor(200,20,10);
		udc3.addition();
			
	}
	
	
	

	public void addition() // method without parameter
	{
		int sum=p+q+r;
		System.out.println("Addition is "+sum);
	}
}