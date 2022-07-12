package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 
{
  @Test(groups= {"Sanity"})
  public void a() 
  {
	Reporter.log("a is running, Sanity ", true);
  }
  
   @Test(groups= {"Regression"})
   public void b() 
   {
	Reporter.log("b is running, regression", true);
	}
	  
    @Test(groups= {"Sanity"})
	public void c() 
	{
    Reporter.log("c is running, Sanity", true);
    }
	  
	 @Test(groups= {"Regression"})
     public void d() 
    {
     Reporter.log("d is running, Regression", true);
	}
}
