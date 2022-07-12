package logicalProgram;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		// To find factorial of number
		// 4!= 4*3*2*1=24
		
		int num=6;
		int num1=1;
		
		for(int i=num;i>=1;i--)
		{
			num1=num1*i;
		}
		System.out.println("Factorial os number is "+num1);

	}

}
