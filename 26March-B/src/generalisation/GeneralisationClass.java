package generalisation;

public class GeneralisationClass {

	public static void main(String[] args) 
	
	{
		// Obj created for SBI and Axis and not for RBI because
		// RBI is an Interface so we can't create obj of it
		SBI s=new SBI();
		
		s.deposit();
		s.loan();
		s.withDraw();
		
		System.out.println("======================");
		
		
		Axis a=new Axis();
		a.deposit();
		a.loan();
		a.withDraw();

	}

}
