package Control_statements;

public class NestedIfElseStudy {

	public static void main(String[] args) 
	{
	// If UN is valid--> Enter PWD
    // If PWD is valid--> Login Success
	// Else--> Incorrect PWD
	// Else UN is invalid--> Incorrect UN
		
		
		String UN="Velocity";
		String PWD="Velocity@123";
		
		if(UN=="Velocity")
		{
			System.out.println("Enter Passward");
			
			if(PWD=="Velocity@123")
			{
				System.out.println("Login Success");
			}
			
			else
			{
				System.out.println("Incorect PWD");
			}
		}
		
		else
		{
			System.out.println("incorrect UN");
		}
		
	}
}