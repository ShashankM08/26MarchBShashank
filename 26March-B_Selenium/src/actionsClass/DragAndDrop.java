package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// How to Drag and Drop using Actions class
		
		// 1. Create obj of Actions class and pass driver object
		
		Actions act= new Actions(driver);
		
		// 2.  We require Source and Destination
		
		// Locator of Source
		WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
				
		
		// Locator of Destination
		WebElement Destination = driver.findElement(By.id("amt8"));
		
		
		// By using Actions class methods perform desired actions
//		1. Move to element
//		2. Click and hold
//		3. Move to element(@estination)
//		4. Drop

		
		act.moveToElement(Source).clickAndHold().moveToElement(Destination).release().build().perform();
		
		//act.dragAndDrop(Source, Destination).perform();
	}

}
