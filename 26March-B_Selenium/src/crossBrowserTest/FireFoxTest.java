package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void myMethod() 
  {
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
