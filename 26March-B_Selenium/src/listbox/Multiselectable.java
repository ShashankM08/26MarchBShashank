package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHASHANK\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement MultiselectElement = driver.findElement(By.name("cars"));
		Select s= new Select( MultiselectElement);
		System.out.println("Multiselect element is "+ s.isMultiple());
		// Run--> MultiSelect element is TRUE
		
		
		s.selectByVisibleText("Volvo"); // for option 1
		Thread.sleep(100);
		s.selectByValue("saab"); // for option 2
		Thread.sleep(100);
		s.selectByIndex(2); // For option 3
		Thread.sleep(100);
		s.selectByIndex(3); // For option 4
		Thread.sleep(100);

		//s.deselectAll();
		
		// We can use dSelect option by
		s.deselectByVisibleText("Volvo");
		Thread.sleep(100);
		s.deselectByValue("saab");
		Thread.sleep(100);
		s.deselectByIndex(2);
		Thread.sleep(100);
		s.deselectByIndex(3);
		Thread.sleep(100);
		
		
		
//		WebElement select = s.getFirstSelectedOption();  //It returns WebElement, we dont want
//		System.out.println(select);
//		System.out.println(s.getFirstSelectedOption().getText());
		
		s.getAllSelectedOptions();
	}

}
