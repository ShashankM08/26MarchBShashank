package logicalProgram;

import java.util.Scanner;

public class PalendromString {

	public static void main(String[] args) 
	{
		//Original= MOM
		//Reverse= MOM
		//It means it is a Palendrom String
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String a = sc.next();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println("Original string is "+a);
		System.out.println("Reverse string is "+b);
		
		
		if(a.equals(b))
		{
			System.out.println("String is Palendrom");
		}
	
		else
		{
			System.out.println("String is not Paledrom");
		}

	}

}
