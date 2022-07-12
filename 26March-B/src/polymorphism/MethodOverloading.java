package polymorphism;

public class MethodOverloading {

	// Compile time polymorphism
	
	// Method Overloading--> Declaring multiple method with same method name bt with different argument in same class
	
	public static void main(String[] args) 
	{
		MethodOverloading m= new MethodOverloading();
		m.add();
		m.add(20, 40);

	}

	public void add()
	{
		int a=10;
		int b=30;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}	
		
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("summision is "+sum);
	}
	
}
