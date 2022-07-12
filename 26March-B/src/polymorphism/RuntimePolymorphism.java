package polymorphism;

public class RuntimePolymorphism {

 //Method Overriding--> Acquiring superclass method into sub class with the help of extends keyword
 // and changing definition according to sub class specification	
	
	public static void main(String[] args) 
	
	{
		A a= new A(); // Obj of A
		B b= new B(); // Obj of B
		
		a.test();  // Both method are same but we differentiate on the basis of object
		b.test();  // Both method are same but we differentiate on the basis of object
		
		System.out.println("==========================");
		
		b.test();
		a.test();

	}

	
}
