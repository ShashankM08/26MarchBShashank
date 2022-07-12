package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		// Number taken by user and check Even or Odd
		// Number/2=Reminder=0 ====> EVEN
		
		// 10/2=0
		// 10%2=5
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given number is Even");
		}
		else
		{
			System.out.println("Given number is odd");
		}

	}

}
