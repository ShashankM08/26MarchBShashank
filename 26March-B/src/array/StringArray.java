package array;

public class StringArray {

	public static void main(String[] args) 
	{
		String name[] = new String[6];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Seeta";
		
		
		//System.out.println(name[5]);    It shies NULL because we give only up to 2
		
		for(int i = 0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}

	}

}
