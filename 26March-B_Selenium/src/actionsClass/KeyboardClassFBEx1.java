package actionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardClassFBEx1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Firstly go to Create new Account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		// Select locator of Date
		WebElement Day = driver.findElement(By.id("day"));
		
		Actions act= new Actions(driver);
		
		act.click(Day).perform();
		
		
		for(int i=1;i<=8;i=i+1)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		
		act.sendKeys(Keys.ENTER).perform();

		
		
		// Write Shashank using capslock
		WebElement firstName = driver.findElement(By.name("firstname"));
		//firstName.sendKeys("Shashank");
		
		//act.keyDown(firstName, Keys.SHIFT).sendKeys("s").build().perform();  // Run--> Y
		
		act.keyDown(firstName, Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("hashank").build().perform();
		
	}


	
	
	
}
