package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksExamp3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 
		 Iterator<WebElement> it=links.iterator();
		 while(it.hasNext())
		 {
			// System.out.println(it.next());  // It gives only webelements which we do not want
			 System.out.println(it.next().getText());
		 }

	}

}
