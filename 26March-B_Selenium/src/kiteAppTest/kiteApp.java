package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Inspect UserID, Password and Login and give same name to them
		
		// 1. UserID
		WebElement userID = driver.findElement(By.id("userid"));
		
		// 2. Password
		WebElement password = driver.findElement(By.id("password"));
		
		// 3. Login
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		
		// Now take actions on them
		userID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(2000);
		
		
		// Inspect Id and Click on Continue Button
		
		// 1. Inspect Id
		WebElement pin = driver.findElement(By.id("pin"));
		
		// 2. Continue Button
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(100);
		
		// Now take actions
		pin.sendKeys("982278");
		continueButton.click();
		Thread.sleep(1000);
		
		
		// Now inspect Username and get text of it
		
		// 1. Username
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		// 2. Get text of UserID
		String actualUserID = userName.getText();
		String expectedUserID = "ELR321";
		Thread.sleep(2000);
		
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID matching, TC passed");
		}
		
		else
		{
			System.out.println("User ID not matching, TC failed");
		}
		
		
		
		// Now to do logout
		// Now inspect UserID and logout also
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}		
		
		
}	
	


