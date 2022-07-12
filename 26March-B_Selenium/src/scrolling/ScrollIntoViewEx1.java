package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/about-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement Selenium = driver.findElement(By.xpath("//span[text()='Selenium']"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;

		j.executeScript("arguments[0].scrollIntoView(true)", Selenium);
	}

}
