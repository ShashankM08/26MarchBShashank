package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		// Write "Good Morning" in Suggestion class example
		
		// Inspect Suggestion Class Example
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Good Morning");
		
		
		// How to do sendkeys using Actions Class
		
		// 1.  Creating obj of Actions class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		// 2. Using sendKeys method of actions class perform sendKeys task
		//act.moveToElement(textBox).click().sendKeys("Good Morning").build().perform();
		
		act.sendKeys(textBox, "Good Eve").perform();
		
		
		Thread.sleep(2000);
		
		
		// Now for dropdown
//		1. Click on Mouse
//		2. Dropdown the keybard
//		3. Option 3 suppose and press Enter
//		4. fix the position 3, click on the page so that the option get locked

		
		// How to handle dropdown using Actions class
		// Inspect Dropdown
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		
		// Using Actions class method, Handle the dropdown
		act.moveToElement(dropDown).click(dropDown).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
	

}
