package setSizeAndPosition;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// To change the position of browser
		System.out.println(driver.manage().window().getSize());    // Run--> Dimension of browser-- 1051,652
		
		
		// To set size of browser
		// Need to create object of dimension class and pass Width and Height as parameter
		 Dimension di= new Dimension(1051,600);
		 
		// Set size using Setsize Method
		 driver.manage().window().setSize(di);
		 
		

	}

}
