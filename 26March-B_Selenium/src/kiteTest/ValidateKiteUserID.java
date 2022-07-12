package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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

public class ValidateKiteUserID extends Base {
  
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="1234";
	
	
  @BeforeClass
  public void launchBrowser()
  {
	  openBrowser();   // In TestnG class we can take this directly but in normal class we have to create obj
	  login= new KiteLoginPage(driver);
	  home= new KiteHomePage(driver);
	  pin= new KitePinPage(driver);
  }
  
  
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  // Username and password is present in Utility class(excel) and it's a static method to call
	  login.sendUserName(Utility.readDataFromExcel(5, 0));
	  login.sendPassword(Utility.readDataFromExcel(5, 1));
	  login.clickOnloginButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	  
	  
	  pin.SendPin(Utility.readDataFromExcel(5, 2));
	  pin.clickonContinueButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  
  }
	
  @Test
  public void validateUSerID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(5, 0), "Actual and Expected is not matching, TC Fail");
	  // Actual taken from code and expected from Excel sheet
	  
	  Utility.CaptureScreenshot(driver, TCID);  // When TC Pass then take screenshot
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
