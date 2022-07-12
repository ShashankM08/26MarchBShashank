package thisAndSuperKeyward;

public class ThisUse {

//	this keyword is used to access global variable from same/current class.
	int a=10; // Non static global variable
    static int b=99;  // We can not use this because we can't create duplicate of static b
	
	public static void main(String[] args) 
	{
		ThisUse tu =new ThisUse(); // Obj created
		tu.test(); // Calling
		
		

	}
	
	public void test()
	{
		int a=100; // Local variable
		System.out.println("Local variable a is "+a);
		System.out.println("Global value of a is "+this.a);
		
		System.out.println("=====================================");
		
		
		
		int b=100;
		System.out.println("Value of B is "+b);
		System.out.println("Global value of B is "+this.b);
		
		int sub1=20+this.b;
		System.out.println("Value of sub2 is "+sub1);
		
		System.out.println("=====================================");
		
		int add1=1+a;
		System.out.println("Value of add1 is "+add1);
		
		
		
		// I want to use Global value of a
		int add2=1+this.a;
		System.out.println("Value of add2 is "+add2);
		
		
		
		
	}

}
