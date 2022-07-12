package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.Base;
import kitePOMnew.KiteHomePage;
import kitePOMnew.KiteLoginPage;
import kitePOMnew.KitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityProp;

public class ValidateKiteUserIDUsingProperty extends Base {
  
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="5555";
	
	
  @BeforeClass
  public void launchBrowser()
  {
	  openBrowser();   // In TestnG class we can take this directly but in normal class we have to create obj
	  login= new KiteLoginPage(driver);
	  home= new KiteHomePage(driver);
	  pin= new KitePinPage(driver);
  }
  
  
  @BeforeMethod
  public void loginToKiteApp() throws IOException
  {
	  login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
	  login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
	  login.clickOnloginButton();
	  
	  
	  pin.SendPin(UtilityProp.getDataFromPropertyFile("PIN"));
	  pin.clickonContinueButton();
	  
  }
	
  @Test
  public void validateUSerID() throws EncryptedDocumentException, IOException 
  {
	
	  Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	  // Expected is stored in property file so call in that manner 
	  UtilityProp.CaptureScreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  home.logOut();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	 driver.close();  
  }
}
