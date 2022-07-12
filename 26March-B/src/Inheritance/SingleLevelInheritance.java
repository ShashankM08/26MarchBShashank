package Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
		// Calling mother's property using mother's object
		
		Mother m=new Mother();  // Object created for mother class
		m.nature(); // Calling Mother properties using mother obj
		m.love();
		
		System.out.println("============================");
		
		// Calling Son's properties using Son's obj
		
		Son s= new Son(); // Obj created for son's class
		s.laptop(); // Calling Son's properties using son's obj
		s.mobile();

		System.out.println("=============================");
		
		
		// Calling mother's properties using sons obj
		
		s.love(); // Calling mother's properties using son's obj
		s.nature();
	}

}
