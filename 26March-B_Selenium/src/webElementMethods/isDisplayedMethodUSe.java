package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethodUSe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));  // To Hide
		WebElement show = driver.findElement(By.id("show-textbox"));  // To Show
		WebElement textbox = driver.findElement(By.name("show-hide"));   // For Textbox
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("Thankyou, Checkbox is displayed");
		}

		else
		{
			System.out.println("Can't find Checkbox");
		}
		
	
		hide.click();
		if(textbox.isDisplayed())
		{
			System.out.println("Thanks, Checkbox is displayed");
		}
		
		else
		{
			System.out.println("Can't find Checkbox");
		}
		
		
		// YOU WILL GET
		// Thankyou, Checkbox is displayed
		//Can't find Checkbox
	}

}
