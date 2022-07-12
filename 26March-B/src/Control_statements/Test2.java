package Control_statements;

public class Test2 {

	public static void main(String[] args) 
	{
		int marks=80;
		if(marks>=60 & marks<100)
		{
			System.out.println("You are in Distinction");
		}

		else if(marks>=50 & marks<60)
		{
			System.out.println("You are in First Class");
		}
		
		else if(marks>=40 & marks<50)
		{
			System.out.println("You are pass");
		}
		
		else
		{
			System.out.println("You are fail");
		}
	}
	

}
