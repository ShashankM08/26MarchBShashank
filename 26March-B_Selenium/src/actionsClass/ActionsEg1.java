package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Click on Selenium and get the locator using Partial Text
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		//seleniumButton.click();
		
		// Selenium got clicked by webelement method but we have to learn this by using Actions Class
		
		
		
		// 1. create obj of Actions class
		Actions act= new Actions(driver);  // Create object of actions class and pass driver obj as parameter
		
		// 2. Using one of actions class actions, complete the process
		// Currently our mouse is at random place
		
		
		// (I) 1st Method
//		act.moveToElement(seleniumButton).perform();
//		act.click().perform();
//		
		
		// (II) 2nd Method
//		act.moveToElement(seleniumButton).click().build().perform();
		
		// (III) 3rd Method
		//act.click(seleniumButton).perform();
		
		
		// Now Right click (Context Click) using actions class
		// Inspect Right Click
		
		//WebElement RightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		// By using obj of actions class
		//act.moveToElement(RightClickButton).contextClick().build().perform();
		
		//act.contextClick(RightClickButton).perform();
		
		
		// Now click on Double click option
		// Inspect Double Click Button
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//act.moveToElement(doubleClickButton).build().perform();
		
		act.doubleClick(doubleClickButton).perform();
		
	}

}
