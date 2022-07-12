package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLTableEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=ipl+table&oq=ipl+table&aqs=chrome..69i57j0i433i512j0i512l8.4268j0j7&sourceid=chrome&ie=UTF-8#cobssid=s&sie=lg;/g/11p5qpzt6t;5;/m/03b_lm1;st;fp;1;;");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("total no. of rows "+rows.size());

	}

}
