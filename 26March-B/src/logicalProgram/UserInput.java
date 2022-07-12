package logicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		// How to take input from users by Scanners class
		Scanner sc= new Scanner(System.in);  // System.in to take input from user
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum is "+sum);

	}

}
