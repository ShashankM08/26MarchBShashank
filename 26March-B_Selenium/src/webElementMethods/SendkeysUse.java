package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// 1. sendKeys() method
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Velocity");
		Thread.sleep(1000);   // Here select Add Throw Decleration Option
		
		
		// 2. clear() method		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(1000);
		

		
	}

}
