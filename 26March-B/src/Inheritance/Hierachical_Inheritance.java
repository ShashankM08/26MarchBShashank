package Inheritance;

public class Hierachical_Inheritance {

	public static void main(String[] args) 
	{
		
	// Creating Object	of Super Class--> Call only superclass's properties
		
		Mother1 m1= new Mother1();
		m1.recepie();
		
		
	// Creating object for Sub Class1--> We can call properties of super class amd subclass1 properties
		
		Child1 c1= new Child1();
		c1.kindness();
		c1.recepie();
		
		
	// creating object for Sub class2--> We can call properties of Super class and subclass2
		
		Child2 c2= new Child2();
		c2.cruelness();
		c2.recepie();

	}

}
