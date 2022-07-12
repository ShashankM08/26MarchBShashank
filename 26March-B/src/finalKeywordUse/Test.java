package finalKeywordUse;

public class Test {
	
	int a=100;  // We can change this value
	final int b=100;  // We can't change this value, because of final keyword

	public static void main(String[] args) 
	
	{
		Test t=new Test();
		t.add();

	}
	
	

	public void add()
	{
		a=a+10;
		System.out.println(a);
		// b=b+10; not possible
	}
}
