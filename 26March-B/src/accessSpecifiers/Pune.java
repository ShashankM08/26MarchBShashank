package accessSpecifiers;

public class Pune {

	public static void main(String[] args) 
	{
		Velocity v= new Velocity();
//		v.test1();  // Private and scope of this remains remains within class
		v.test2();  // Default and scope within package
		v.test3(); // Protected and scope remains within package but we can access from diff package by using inheritance operation
		v.test4(); // Public and scope remains throughout package

	}

	
}
