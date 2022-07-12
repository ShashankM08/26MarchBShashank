package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		
		// Creating object for Supermost class---> We can call Supermost class (i.e. Grandfather)
		Grandfather gf=new Grandfather();  // Obj created for Grandfather 
		gf.experiance();
		
		
		
		// Creating object for 2nd class (Father)---> We can call 2nd level class as well as supermost class properties
		Father f= new Father();
		f.money();
		
		f.experiance();  // Calling Grandfather's properties from father's object
		
		
		// Creating object for 3rd class----> We can call all class properties
		Daughter d= new Daughter();
		d.scooty();
				
		d.money();   // Calling Father's properties from Daughter's object
		d.experiance();  // Calling Grandfather's properties from Daughter's obj

	}

}
