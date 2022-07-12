package logicalProgram2;

public class ReverseNumberByConvert {

	public static void main(String[] args) 
	{
		// How to Reverse the number by Converting
		
		int OrgNum=123;
		
		// Convert it into String
		
		String OrgString = Integer.toString(OrgNum);
		String RevString="";
		
		for(int i=OrgString.length()-1;i>=0;i--)
		{
			RevString=RevString+OrgString.charAt(i);
		}
		
		int RevNum = Integer.parseInt(RevString);
		System.out.println("Original number is "+OrgNum);
		System.out.println("Reverse number is "+RevNum);
		

	}

}
