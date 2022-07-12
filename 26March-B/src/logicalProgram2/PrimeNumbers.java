package logicalProgram2;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		// 12--> Except 1 and 12
		// Check from 2 to 11
		
		int num=12;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			
		}
		
		if(count==1)
		{
			System.out.println("Given Number "+num+" is not a prime number");
		}
		else
		{
			System.out.println("Given Number is prime number");
		}

	}

}
