package parallerAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass4 {
	@Test
	  public void myMethod() throws InterruptedException 
	  {
		  
		    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com//");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			System.out.println("HI, Method is running");
			
			Reporter.log("Hi, method is running this is reprted output", true);
	  }
}
