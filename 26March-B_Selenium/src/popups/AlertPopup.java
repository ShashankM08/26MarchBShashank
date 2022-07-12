package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		
		// 1. Shift the selenium focus from main page to Alert Popup
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		alt.accept();  // It get click the "OK" button of Alert Popup

	}

}
