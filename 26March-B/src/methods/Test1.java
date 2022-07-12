package methods;

public class Test1 {

	public static void main(String[] args) 
	
	{
		Test1 t= new Test1();  // Creating object
		t.addition();	// Calling Non static regular of same class
		
		
		t.substraction();   // Calling non static of same class
		
		
		Test2 t2= new Test2();
		t2.mul();
		
		t2.div();

	}
    public void addition ()
    {
    	int a=20;
    	int b=10;
    	int sum=a+b;
    	System.out.println("Sum is "+sum);
    }
    
    
    public void substraction()
    {
    	int a=70;
    	int b=20;
    	int subs= a-b;
    	System.out.println("Substraction is "+subs);
    	
    }
}
