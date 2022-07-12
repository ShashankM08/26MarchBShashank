package abstractClass;

public class S2 extends S1 {

	public static void main(String[] args) 
	
	{
		S2 s = new S2();
		s.Shashank1();
		s.Shashank();
		s.V2();

	}

	@Override
	public void Shashank1()
	{
		
		System.out.println("Pune is Incomplete method");
	}

	public void V2()
	{
		System.out.println("Own method of S2");
	}
	
}
