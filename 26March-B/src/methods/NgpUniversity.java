package methods;

public class NgpUniversity {

	public static void main(String[] args) 
	
	{
		
		NgpUniversity nu= new NgpUniversity(); //Obj Decleration
		nu.Info(); //Calling without parameter
		
		NgpUniversity nu1= new NgpUniversity();
		nu1.Info1();
		
		
		
		nu.Info("Prateek", "NN2020", "Engg", 4, 'B'); //Calling with variable
		
		
	}

	
	public void Info ()
	{
		
	// Name, PRN, Course, Year, Grade
		
		String name= "Shashank";
		String PRN= "NU2020";
		String course= "Engineering";
		int year= 4;
		char grade= 'A';
		
		
		System.out.println("My name is "+name);
		System.out.println("My PRN is "+PRN);
		System.out.println("My course is "+course);
		System.out.println("My year is "+year);
		System.out.println("My grade is "+grade);
		System.out.println("========================");
		
		
			
	}
	
	public void Info1 ()
	{
		// Name, PRN, Course, Year, Grade
		
				String name= "Rajesh";
				String PRN= "NU2020";
				String course= "Engineering";
				int year= 4;
				char grade= 'A';
				
				
				System.out.println("My name is "+name);
				System.out.println("My PRN is "+PRN);
				System.out.println("My course is "+course);
				System.out.println("My year is "+year);
				System.out.println("My grade is "+grade);
				System.out.println("========================");
	}
	
	
	public void Info (String name, String PRN, String course, int year, char grade)
	{
		
		System.out.println("My name is "+name);
		System.out.println("My prn is "+PRN);
		System.out.println("My course is "+course);
		System.out.println("My year is "+year);
		System.out.println("My grade is "+grade);
		System.out.println("==================================");
	}
	
	
	
	
	
	
}
