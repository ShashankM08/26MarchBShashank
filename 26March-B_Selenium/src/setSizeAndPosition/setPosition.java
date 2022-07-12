package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// How to set position of window
		System.out.println(driver.manage().window().getPosition());
		
		// create obj of point class and pass X and Y co=ordinate
		Point p= new Point(60,10);
		
		
		// Using setPosition method we can set browser position
		driver.manage().window().setPosition(p);
		
		
		

	}

}
