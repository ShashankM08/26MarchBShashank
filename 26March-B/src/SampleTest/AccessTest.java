package SampleTest;
import accessSpecifiers.Velocity;
public class AccessTest extends Velocity {

	public static void main(String[] args) 
	{
	Velocity v=new Velocity();
	v.test4(); // Because its Public and we can access it throughout Project

	
	
	AccessTest at= new AccessTest ();
	at.test3(); // Protected and calling it in another method using inheritance
	at.test4(); // Public and scope remains throughout project
	}
	

	
}
