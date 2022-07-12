package TypesOfVariables;

public class GlobalAndLocalVariable {
	
	int a=100;  // Global variable or Permanent Variable always declare outside Method/Block/Constructor
	            // This is Global Non Static Variable
	
	static int b=2000;  // Global Static Variable

	public static void main(String[] args) 
	{
		GlobalAndLocalVariable gac= new GlobalAndLocalVariable();  // Object created for same class
		
		System.out.println("Value of a is "+gac.a);  // Calling Non Static Global Variable of Same Class----> Syntax= ObjName.Variable
		System.out.println("Value of b is "+b);  // Calling Static Variable of Same class----> Syntax= Variable name
		
		
		System.out.println("Value of y is "+Test.y);  // Calling Global Static Variable of same class-----> Syntax= Classname.Variable
		
		Test t = new Test();   // Object created for different class
		System.out.println("Value of x is "+t.x);  // Calling Non Static Global Variable of different class----> Syntax= Objname.Variable
		
         
		gac.addition();
		gac.sub();
		
		
		
	}

	public void addition()
	{
		int p=100;  // p is Local Variable known to addition method only
		int sum=p+10;
		int sum1=a+100; // a is Global Variable known to whole class
		System.out.println("Addition is "+sum1);
		System.out.println("Add is "+sum);
	}
	
	public void sub()
	{
		int q=20;
		int sub=a-q;  // p is local variable known to addition method only
		int sub1=a-q; // a is Global variable known to whole class
		System.out.println("Substraction is "+sub1);
		System.out.println("Subs is "+sub);
	}
	
	
}
