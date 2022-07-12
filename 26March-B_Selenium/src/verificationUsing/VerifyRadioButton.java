package verificationUsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement RadioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		if(RadioButton1.isSelected())
		{
			Reporter.log("Radio button clicked, TC Passed", true);
		}
		
		else
		{
			Reporter.log("TC failed", true);
		}
		
		// Run--> TC failed,PASSED: myMethod  means whatever we are doing it will not reach upto TestNG
		
		
		
		// Now
		Assert.assertTrue(RadioButton1.isSelected(),"Radio button is not selected, TC Failed");
		//Run--> AssertionError: Radio button is not selected, TC Failed expected [true] but found [false]
		// If isSelected is selected then it must show true but it is showing false
		
}
}