package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My2ndSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// 1. X path By Attribute   by Flipkart
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi GM");   
		
		// 2. X path by Text {Anything written inside >< is called text}    By Flipkart
		//driver.findElement(By.xpath("//h2[text()='Shop Student Essentials']"));	     
		
		
		
		// 3. X path by Content by Facebook
		// 1. By Text Method
		//driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		// 2. By Attribute Method   by Facebook Login Button
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_d_Um')]"));
		
		
		// 4. X path by index by Velocity Practice Page
		//input[@name='radio'][3]   When we have 3 options with same code we have to specify [3] for clicking 3rd option
		//driver.findElement(By.xpath("//input[@name='radio'][3]")).click();
		
	
		

	}

}
