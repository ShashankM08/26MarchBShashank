package thisAndSuperKeyword;

public class ThisU {

	int a=100;
	
	public static void main(String[] args) 
	
	{
		ThisU tu=new ThisU();
		tu.test();

	}
	
	public void test()
	{
		int a=20;
		System.out.println("Local Vari "+a);
		System.out.println("Global vari "+this.a);
	}

}
