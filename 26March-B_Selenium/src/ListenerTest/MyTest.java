package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

// Put @Listeners(PackageName.classname.class as extension) tag here so that he can easily listen to properties present in Listener class

//@Listeners(ListenerTest.Listener.class)
public class MyTest {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Hi I am Mymethod1", true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("Hi I am Mymethod2", true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("Hi I am Mymethod3", true);
  }
}
