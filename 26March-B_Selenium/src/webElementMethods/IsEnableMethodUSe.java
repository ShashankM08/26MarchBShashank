package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUSe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		// Code to click on SignIn button of Discovery+
		Thread.sleep(5000);  // increase the sleep time to avoid exception
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		
		// Code to click on OTP Button
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));  //  Not Responding because it get click only when we put Mo. No. into it
		//System.out.println(getOTPButton.isEnabled());
		
		
		// Now find locator of Text Box to enter mobile number
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		Thread.sleep(2000);
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.click();
	}
	
	

}
