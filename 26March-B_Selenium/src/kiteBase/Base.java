package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	
	protected WebDriver driver;   
	// Declared globally
	// Visibility of webdriver is default and to operate it into another package we have to change it to Protected

public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	
    // How to use HeadlessBrowser
    ChromeOptions opt = new ChromeOptions();
    opt.addArguments("--disable-notification");
    //opt.addArguments("--incognito");
    driver= new ChromeDriver(opt); // Pass opt as parameter in ChromeDriver
	driver.get("https://kite.zerodha.com/");
	
	Reporter.log("Launching Browser....",true);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	
}
