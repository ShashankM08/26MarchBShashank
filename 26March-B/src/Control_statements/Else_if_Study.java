package Control_statements;

public class Else_if_Study {

	public static void main(String[] args) 
	//  If marks>=60-->  You are in Dist
	// else if marks>=50---> 1st Class
	// else if marks>=40---> Pass
	// else you are fail
	
	{
		int marks=90;
		if (marks>=200)
		{
			System.out.println("You are in Distinction");
		}
        
		else if(marks>=50)
		{
			System.out.println("You are in first class");
		}
		
		else if(marks>=40)
		{
			System.out.println("You are Pass");
		}
		
		else
		{
			System.out.println("You are fail");
		}
	}

}
