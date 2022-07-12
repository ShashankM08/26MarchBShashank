package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{

	public static void CaptureScreenshot(WebDriver driver, String TCID) throws IOException // TCID means TestCase Id
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\ScreenShot\\MyScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		// Screenshot not run
}
	
	public static String getDataFromPropertyFile(String key) throws IOException  // void changed to string
	{
		// Create obj of property file
		Properties prop= new Properties();
		FileInputStream myFile= new FileInputStream("C:\\Users\\SHASHANK\\eclipse-workspace\\26March-B_Selenium\\myProperties.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);  // You can give any name instead of "Key"
		// Whatever user will give read that and return value in response
		return value;
		
	}
	
}
