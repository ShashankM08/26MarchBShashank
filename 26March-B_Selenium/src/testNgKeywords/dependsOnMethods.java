package testNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test 
	  public void d() throws InterruptedException 
	  {
		 Assert.fail();
		 Reporter.log("d is running", true);
		  
	  }
	  
	  @Test (dependsOnMethods= {"d"})
	  public void a()
	  {
		  Reporter.log("a is running", true);
		  // a got skipped because it's dependancy is on d and d got failed
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("v is running", true);
		  // v got passed
	  }
}
