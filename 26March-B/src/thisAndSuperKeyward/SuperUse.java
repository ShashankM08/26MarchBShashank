package thisAndSuperKeyward;

public class SuperUse extends A {
	
	int p=120; // Global variable of super class

	public static void main(String[] args) 
	{
		SuperUse su= new SuperUse();
		su.test();

	}
	
	public void test()
	{
		int p=1; // Local variable of Super class
		System.out.println("Local value of P is "+p); // Local value of P from same class
		
		System.out.println("Global variable of P from same class is "+this.p);
		// this SuperKeyward is use to access global variable from same class
		
		System.out.println("Global variable of P from Super Class "+super.p);
		// Super keyword is use to access global variable from super class
	}
	
	

}
