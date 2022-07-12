package interfaceStudy;

public interface Mother 
{

	public void love();
	public void money();
	
	static void test()  // Change complete method to static
	{
		System.out.println("Static test method from mother interface");
	}
}
