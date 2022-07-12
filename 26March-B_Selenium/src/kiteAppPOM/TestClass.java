package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Now create obj of KiteLoginPage to call the methods which are 
		// Non Static in nature
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnloginButton();
		
		
		
		Thread.sleep(1000);
		// Now create obj of KitePinPage to call the methods
		KitePinPage pin= new KitePinPage(driver);
		pin.SendPin();
		pin.clickonContinueButton();
		
		
		Thread.sleep(1000);
		// Now create obj of KiteHomePage to call the methods
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName();
		home.logOut();
		
		driver.close();

	}

}
