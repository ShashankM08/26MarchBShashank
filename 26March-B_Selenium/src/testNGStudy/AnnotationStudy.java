package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy 
{
	
  @Test
 
  public void ValidateUserID() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/about-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    Reporter.log("UserID Validated", true);	  
  }
  
  
  
  @Test
  
  public void ValidateDashBoard() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/about-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    Reporter.log("DashBoard Validated", true);	  
  }
  
  @BeforeMethod
  public void loginKiteApp()
  {
	  Reporter.log("Login Success", true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser Launched", true);
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp()
  {
	  Reporter.log("Loggin Out...", true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser Closed", true);
  }
}
