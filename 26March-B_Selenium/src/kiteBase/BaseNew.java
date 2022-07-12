package kiteBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import kiteUtility.UtilityProp;

public class BaseNew 
{
	
	protected WebDriver driver; 
   public void openBrowser() throws IOException
   {
	   ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notification");
	    //opt.addArguments("--incognito");
	    driver= new ChromeDriver(opt); // Pass opt as parameter in ChromeDriver
		driver.get("https://kite.zerodha.com/");  // Now no need to take from direct link
		// Take from property file
		// getDataFromUrl is a static method which is of UtilityProp class, we havt to call that method here
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));  // It will fetch Url 
		
		Reporter.log("Launching Browser....",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
   
   
   
   
   
   
   
   }
	
}
