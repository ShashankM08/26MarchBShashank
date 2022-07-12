package logicalProgram;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		// Multiplying tow numbers without using multiplication operator
		
		//5*4
		//Means 5+5+5+5
		
		int a=5;
		int b=4;
		int sum=0;
		
		for(int i=1;i<=4;i++)
		{
			sum=sum+a;
		}

		System.out.println("Multiplication is "+sum);
	}

}
