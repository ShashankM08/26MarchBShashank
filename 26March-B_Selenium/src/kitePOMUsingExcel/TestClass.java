package kitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, IOException, InterruptedException
	{
        
		
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		// We have to read---> Row=5th and Cell=0,1,2 th
		
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();  // But pin is in 982278 which is int and we are using String
		// so write "'982278" to change it to string
		
		
		// Now create obj of KiteLoginPage to call the methods which are 
		// Non Static in nature
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnloginButton();
		
		
		
		Thread.sleep(1000);
		// Now create obj of KitePinPage to call the methods
		KitePinPage pin= new KitePinPage(driver);
		pin.SendPin(PIN);
		pin.clickonContinueButton();
		
		
		Thread.sleep(1000);
		// Now create obj of KiteHomePage to call the methods
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName(UN);
		home.logOut();
		
		driver.close();

	}

}
