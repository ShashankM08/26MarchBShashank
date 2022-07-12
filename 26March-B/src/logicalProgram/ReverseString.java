package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		// Take input from user and reverse it
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String a = sc.next();
		String b="";
		
		for(int i = a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);	
		}

		System.out.println("Original string is "+a);
		System.out.println("Reverse string is "+b);
	}

}
