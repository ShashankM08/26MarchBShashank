package thisAndSuperKeyward;

public class SKU extends B {

	int b=500;  // Global variable of same class
	
	public static void main(String[] args) 
	
	{
		SKU sk=new SKU();
		sk.Sha();

	}

	public void Sha()
	{
		int a=60;
		System.out.println("Local vari "+a);
		System.out.println("Global of same class "+this.b);
		System.out.println("Global of diff class "+super.q);
	}
	
}
