package thisAndSuperKeyward;

public class TU {
	
	int b=20;

	public static void main(String[] args)
	{
		TU tu= new TU();
		tu.test1();
		tu.test2();

	}
	
	public void test1()
	{
		int b=25;
		System.out.println("local vari "+b);
	}
	
	public void test2()
	{
		System.out.println("Global vari "+this.b);
		
		int sum2= 5+this.b;
		System.out.println("Globally "+sum2);
	}

}
