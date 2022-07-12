package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy1 {
  @Test
  public void rechargePhone() 
  {
	  Reporter.log("Recharge done", true);
  }
  @BeforeMethod
  public void loginToRechargePortal() 
  {
	  Reporter.log("Login Successful", true);
  }

  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("Logout Done", true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser launched", true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser Cosed", true);
  }

}
