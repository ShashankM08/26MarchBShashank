package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

// Put @Listeners(PackageName.classname.class as extension) tag here so that he can easily listen to properties present in Listener class

//@Listeners(ListenerTest.Listener.class)------> Comment this to use this in XML Level
public class MyTest2 {
  @Test
  public void myMethod4() 
  {
	  Reporter.log("Hi I am Mymethod4", true);
  }
  
  @Test
  public void myMethod5() 
  {
	  Assert.fail();
	  Reporter.log("Hi I am Mymethod5", true);
  }
  
  @Test(dependsOnMethods = {"myMethod5"})
  public void myMethod6() 
  {
	  Reporter.log("Hi I am Mymethod6", true);
  }
}
