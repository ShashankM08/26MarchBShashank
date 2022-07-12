package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		// Unordered List--> Whenever we search something on google the results get change on daily basis
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Inspect Google search bar and search "Honda"
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Honda");
		Thread.sleep(2000);
		
		// Now select multiple search options
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));   // By concept of Relative Xpath(Traversing from child to immediate parent)
		
		System.out.println(searchResults.size());  //Run:--> 10 in size
		
		
		
		// To know those elements which are 10 in size
		for(WebElement r:searchResults)
		{
			System.out.println(r.getText());
		}
		
		
		
		// For clicking on required result
		// If it is Honda Amaze then click on it
		
		// Using For each loop
		for(WebElement result:searchResults)
		{
			String actualText = result.getText();
			String expectedText= "honda amaze";
			
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
			}
		}

		
	}

}
