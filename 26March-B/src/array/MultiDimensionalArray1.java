package array;

public class MultiDimensionalArray1 {

	public static void main(String[] args) 
	{
		//int a[] =new int[3];     // Single Dimensional Array
		int a[][]= new int [2][2];  // MultiDimensional Array
		
		
		// Array value assign
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//Usage
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
		
		
		// Now Usage using For loop
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+"");
			}
			
			System.out.println();
		}
	}

}
