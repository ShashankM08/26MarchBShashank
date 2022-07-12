package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/	");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		
		e.executeAsyncScript("arguments[0].scrollIntoView(true)", katraj);
		
		
		

	}

}
