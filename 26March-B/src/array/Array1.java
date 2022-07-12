package array;

public class Array1 {

	public static void main(String[] args) 
	{
		
		// A B C D E
		
		// 1. Array Declaration
		char grade[]= new char [7];
		
		// 2. Array Initialization
		grade [0]= 'A';
		grade [1]= 'B';
		grade [2]= 'C';
		grade [3]= 'D';
		grade [4]= 'E';
		grade [5]= 'F';     // Array Index out of Bounds Exception if we include F because char size 5 only
	    grade [6]= 'G';
		
		
		// 3. Array Usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		System.out.println(grade[6]);
		
		
		System.out.println("===========================");
		
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(grade[i]);
		}
		
		
		System.out.println("============================");
		
		// We know that Max Index= Length-1
		for(int i=0;i<=grade.length-1;i++)    // Dynamic Coding
		{
			System.out.println(grade[i]);    
		}
		
		
		System.out.println("=============================");
		
		// Now print in Reverse order
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
		
		
		
	
		
		
	
		
	}

}
