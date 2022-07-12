package generalisation;

public class SBI implements RBI

{

	@Override
	public void loan() 
	{
		System.out.println("SBI loan rate is 9.8%");
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("SBI withdraw limit is 50k");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("SBI deposit limit is 25k");
		
	}

	
}
