
package methods;

public class PuneUniversity {

	public static void main(String[] args) 
	{
		
    PuneUniversity pu= new PuneUniversity();
    pu.StudentInfo();
    
    PuneUniversity pu1= new PuneUniversity();
    pu1.StudentInfo1();
    
    PuneUniversity pu2= new PuneUniversity();
    pu2.StudentInfo2();
    
    PuneUniversity pu3= new PuneUniversity();
    pu3.StudentInfo3();
    
    pu.StudentInfo("Prateek", "AM8098", "BBA", '4', 'A');
    pu.StudentInfo("Ashish", "PU8080", "MBA", '4', 'B');
    
    
	}

	public void StudentInfo() // Non static regular
	{
	// Name; PRN; Course; Year; Grade
		
		String Name= "Velocity";
		String PRN= "PU3480";
		String Course= "Engineering";
		int Year= 3;
		char Grade= 'A';
		
		System.out.println("Student name is "+Name);
		System.out.println("Student PRN is "+PRN);
		System.out.println("Student course is "+Course);
		System.out.println("Student year is "+Year);
		System.out.println("Student grade is "+Grade);
		System.out.println("============================");
		
	}
		
		public void StudentInfo1()
		{
			String Name= "Shashank";
			String PRN= "PU3480";
			String Course= "Engineering";
			int Year= 3;
			char Grade= 'A';
			
			System.out.println("Student name is "+Name);
			System.out.println("Student PRN is "+PRN);
			System.out.println("Student course is "+Course);
			System.out.println("Student year is "+Year);
			System.out.println("Student grade is "+Grade);
			System.out.println("============================");	
			
			
		}
		
		public void StudentInfo2()
		{
			String Name= "Mahesh";
			String PRN= "PU3480";
			String Course= "Engineering";
			int Year= 3;
			char Grade= 'A';
			
			System.out.println("Student name is "+Name);
			System.out.println("Student PRN is "+PRN);
			System.out.println("Student course is "+Course);
			System.out.println("Student year is "+Year);
			System.out.println("Student grade is "+Grade);
			System.out.println("============================");		
		}
		
		public void StudentInfo3()
		{
			String Name= "Vibhash";
			String PRN= "PU3480";
			String Course= "Engineering";
			int Year= 3;
			char Grade= 'A';
			
			System.out.println("Student name is "+Name);
			System.out.println("Student PRN is "+PRN);
			System.out.println("Student course is "+Course);
			System.out.println("Student year is "+Year);
			System.out.println("Student grade is "+Grade);
			System.out.println("============================");
			
		}
		
		public void StudentInfo(String name, String PRN, String course, int year, char grade)   //With parameter
		{
			System.out.println("Student name is "+name);
			System.out.println("Student PRN is "+PRN);
			System.out.println("Student course is "+course);
			System.out.println("Student year is "+year);
			System.out.println("Student grade is "+grade);
			System.out.println("============================");
		}
		
	}

