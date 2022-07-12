package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		// Check box clicked/selected
		WebElement Check1 = driver.findElement(By.name("checkBoxOption1"));
		//Check1.click();   --> By opening this you will get "Check Box is Already Selected"
		
		
		
		//You will get "Check box is now selected" because check box by default de-selected
		if(Check1.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		
		else
		{
			Check1.click();
			System.out.println("Checkbox is now selected");
			
		}
				
		

	}

}
