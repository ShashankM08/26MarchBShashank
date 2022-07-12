package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) // Main Method
	{
		NonStaticMethodCall nsm= new NonStaticMethodCall();  //Object created in Main Method-->  Syntax= ClassName Obj Name=new ClassName();
		nsm.Mymethod();  // Calling Non static regular method from same class-->  Syntax=  ObjName.methodname();

	
		nsm.test(); // Calling Non static regular method from same class & Already object is defined
		
		
		
		NonStaticStudy nsm2= new NonStaticStudy();  // Object declare for new class
		nsm2.Bye();
		
		
	}
          public void Mymethod()  // Non Static Regular Method
          {
        	  System.out.println("Hi I am Non Static Regular Method From Same Class");
          }
	
          
          public void test()  // Non Static Regular Method
          {
        	  System.out.println("I am from Raisoni College");
          }
          
          
}
