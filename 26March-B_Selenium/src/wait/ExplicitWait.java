package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// Creating obj of WebDriverWait
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
		
		
		// Inspect About Us
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		
		aboutUs.click();

	}

}
