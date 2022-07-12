package array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		// Initialization and Declaration both at same time 
		int rollNum[]= {1,2,3,4,5,6};  // Here no need to use new because directly memory is assigned
		
		// Usage
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		
		
		
		System.out.println("========================================");
		
		// To see this in sequence, By using Sort Method
		int rollnum[]= {6,2,4,1,3,5};
		// Sort Method Use()
		Arrays.sort(rollnum);
		for(int i=0;i<=rollnum.length-1;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("=========================================");
		
		
		// Now to see same in reverse order by using Sort Method
		Arrays.sort(rollnum);
		for(int i=rollnum.length-1;i>=1;i--)
		{
			System.out.println(i);
		}
		
		

	}

}
