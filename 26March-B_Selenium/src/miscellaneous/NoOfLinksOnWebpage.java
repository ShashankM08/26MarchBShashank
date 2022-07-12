package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));    // We used findElements here because we want to know multiple links available
		 System.out.println(links.size());
		 
		 // Now we know there are 25 links but who are those links?
		 // To know this we can use For each and Iterator
		 
		 Iterator<WebElement> it = links.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next().getText());
		 }

	}

}
