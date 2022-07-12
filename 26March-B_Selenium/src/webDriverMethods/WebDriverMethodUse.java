package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodUse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1. get method is used to launch browser
		driver.get("https://paytm.com/");
		
		// 2. Close() method , used to close current tab
		//driver.close();
		
		// 3. quit() method, used to close all tabs open by selenium but yet not seen by us
		//driver.quit();
		
		// 4. maximize/minimize () method also knows as METHOD CASCADING--> Method inside method
		// We can change size and position of browser
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		
		// 5. Navigate() method, used to open application
		// We can move forward,backward,refresh the webpage
		//driver.navigate().to("https://www.google.com/");
		
		//driver.navigate().back();
		// Paytm--> Google--> Paytm
		
		//driver.navigate().forward();
		// Paytm-->Google
		
		//driver.navigate().refresh();
		// Paytm--> Google--> Refresh Google
		
		
		
		// 6. getTitle() method, Method used to get title of webpage
		//Return type= STRING
		// Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills----> in Console
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		// 7. getCurrentURL () 
		// Return type = STRING
		// https://paytm.com/ ----> in Console
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
