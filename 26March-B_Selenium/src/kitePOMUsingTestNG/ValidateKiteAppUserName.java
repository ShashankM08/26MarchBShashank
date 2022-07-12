package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	
	
	// Declare the things globally which have to be re-used several times
	WebDriver driver;
	Sheet mySheet;
	
	// Now declare objects globally as well
	KiteLoginPage login;
	KitePinPage pin;
    KiteHomePage home;
  
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
	    // How to use HeadlessBrowser
	    ChromeOptions opt = new ChromeOptions();
	    //opt.addArguments("--headless");    // and pass the object "opt" as a parameter in ChromeDriver so that he knows to open headless browser
	    //opt.addArguments("--disable-notification");
	    //opt.addArguments("--incognito");
	    driver= new ChromeDriver(opt); // Pass opt as parameter in ChromeDriver
		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("Launching Browser....",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
        File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		
		
		// Defining objects which are created above
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
		
  }
	
	
  @BeforeMethod
  public void loginToKiteApp()
  {
	// We have to read---> Row=5th and Cell=0,1,2 th
		
	     String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
			
		 String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
			
		 String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();  // But pin is in 982278 which is int and we are using String
		 // so write "'982278" to change it to string 
		 
		 
		 login.sendUserName(UN);
		 Reporter.log("Sending Username", true);
		 login.sendPassword(PWD);
		 Reporter.log("Sending Password", true);
		 login.clickOnloginButton();
		 Reporter.log("Clicking on login button", true);
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 
		 pin.SendPin(PIN);
		 Reporter.log("Sending PIN", true);
		 pin.clickonContinueButton();
		 Reporter.log("Clicking on continue button", true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	  
  }
	
	
  @Test
  public void validateUserName() 
  {
	  // Get expectedUN from sheet which we passed in this class
	  String expectedUN = mySheet.getRow(5).getCell(0).getStringCellValue();  
	  // Get ActualUN which is already been declare by us in KiteHomePage
	  String actualUN = home.getActualUserName();
	  
	  Reporter.log("Validating UserName", true);
	  
	  
	  Assert.assertEquals( actualUN, expectedUN, "Actual and Expected userId not matching, TC fails");
	  Reporter.log("Actual and Expected userId matching, TC PASS", true);
  }
  
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.logOut();
	  Reporter.log("Logging Out......", true);
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("Closing Browser", true);
	  driver.close();
  }
}
