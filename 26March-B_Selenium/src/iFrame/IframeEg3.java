package iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(4000);
		
		String Text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(Text);
		
		String Text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(Text1);
		Thread.sleep(3000);
		
		// Now switch focus from main page to Frame1 to type something
		driver.switchTo().frame("frame1");
		WebElement txt = driver.findElement(By.xpath("//input[1]"));
		txt.sendKeys("Shashank");
		Thread.sleep(4000);
		txt.clear();
		
		
		
		Thread.sleep(2000);
		// Switching focus from frame1 to frame3 to checkbox
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(1000);
		
		// Switching focus to previous frame to write something
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[1]")).sendKeys("Batman");
		
		Thread.sleep(1000);
		// Switching focus to main frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//option[text()='Big Baby Cat']")).click();
		driver.findElement(By.xpath("//option[text()='Avatar']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		WebElement txt1 = driver.findElement(By.xpath("//input[1]"));
		txt1.sendKeys("Ironman");
		txt1.clear();
		
		
		
		

		
	}

}
