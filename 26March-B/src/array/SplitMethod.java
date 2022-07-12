package array;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String s= "VELOCITY CORPORATE TRAINING CENTRE";
//		s.split(" ");
		String[] output= s.split(" ");
//		System.out.println(output);    // It shows garbage value because it gets confuse which value to print...... Why?
		
		
		System.out.println("===============================");
		
		for(int i=0;i<=output.length-1;i++)
		{
			
			System.out.println(output[i]);
		}

	}

}
