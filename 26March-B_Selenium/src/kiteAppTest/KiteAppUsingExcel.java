package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// Create Excel sheet and pass the path along with name and extension in File objective
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		// We have to read---> Row=5th and Cell=0,1,2 th
		
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();  // But pin is in 982278 which is int and we are using String
		// so write "'982278" to change it to string
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		userID.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		Thread.sleep(2000);
		
		
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continueButton.click();
		Thread.sleep(2000);
		
		
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserID=userName.getText();
		String expectedUserID=UN;
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID matching, TC passed");
			
		}
		
		else
		{
			System.out.println("User ID not matching, TC failed");
		}
		
		
		
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
