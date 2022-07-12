package generalisation;

public class Axis implements RBI {

	@Override
	public void loan() 
	{
		System.out.println("Axis loan rate is 5.5%");
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("Axis withdraw limit is 30k");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Axis deposit limit is 60k");
		
	}

}
