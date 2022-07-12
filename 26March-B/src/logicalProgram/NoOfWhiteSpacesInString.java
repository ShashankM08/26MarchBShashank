package logicalProgram;

public class NoOfWhiteSpacesInString {

	public static void main(String[] args) 
	{
		// To find  or count spaces in string
		
		String a= " P   U   N E";
		// If it is a space then increase the count
		
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char myChar = a.charAt(i);
			
			if(myChar==' ')
			{
				count++;
			}
		}
		
		System.out.println("Numberof white spaces are "+a+" is "+count);

	}

}
