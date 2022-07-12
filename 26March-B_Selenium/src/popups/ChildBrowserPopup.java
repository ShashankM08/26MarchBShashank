package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		// 1. How to get main page ID by singular getWindowHandle
		
		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);
		// ID remains unique till the browser is open, when we close it it get change
		
		System.out.println("====================================");
		
		// Currently our focus is on main page
		WebElement Click = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		Click.click();
		Thread.sleep(2000);
		
		
		
		Set<String> allPageID = driver.getWindowHandles();
		// Now use Iterator and set does not allow insertion in order
		Iterator<String> it = allPageID.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());  // It will display 1 ID of Main and 2 of child
//		}

		
		String mainPageiD = it.next(); // Will return main page ID
		String childPageID = it.next(); // Will return child page ID
		
		// Now we know both main page and child page id
		// Switching focus from main page to child page
		
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		
		// Now current focus is on child browser page
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		
		
		// Switching focus from child browser to main page
		driver.switchTo().window(mainPageiD);
		
		WebElement myElement = driver.findElement(By.xpath("Click below to open link in new tab"));
		System.out.println(myElement);
	}

}
