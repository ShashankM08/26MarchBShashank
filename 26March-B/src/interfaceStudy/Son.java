package interfaceStudy;

public class Son implements Father, Mother {

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.love();
		s.nature();
		s.money();

		Father.test();  // Calling static method from another interface
		Mother.test();   // Calling static method from another interface

	}

	@Override
	public void love() 
	{
		
		System.out.println("Mother interface completed in Son's class");
	}

	@Override
	public void nature() 
	{
		
		System.out.println("Father interface completed in Son's class");
	}

	@Override
	public void money() {
		
		System.out.println("Shashank");
		
	}


	

	
	
}
