package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		Thread.sleep(4000);
		
		// We just read the Blogger and print the same
		String Text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		System.out.println(Text);
		
		
		//changing focus from main page to frame1
		driver.switchTo().frame("Frame1"); // Now you are inside frame1
		String Text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(Text1);
		
		// Switch focus from frame to main page
		driver.switchTo().parentFrame();
		
		// Click on Pavilion Button present in main page
		//Xpath by linked text
		
		String Text2 = driver.findElement(By.partialLinkText("Pavilion")).getText();
		System.out.println(Text2);
		
		
		
		System.out.println("Hi, I am making changes for GITHUB");
		
		
		
		
		

	}

}
