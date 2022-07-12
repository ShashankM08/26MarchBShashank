package casting;

public class upCasting {

	public static void main(String[] args)
	{
		Father f=new Father();
		f.car();
		f.bike();
		
		System.out.println("==============================");
		
		Son s=new Son();
		s.car();
		s.bike();
		s.education();
		
		System.out.println("===============================");
		
		
		Father f1= new Father(); // Up Casting
		// Assigning subclass properties to super class
		
		f1.car();
		f1.bike();
		//f1.education();----> Common properties are getting called and this is not common
		
		System.out.println("================================");		
		
		
		

	}

}
