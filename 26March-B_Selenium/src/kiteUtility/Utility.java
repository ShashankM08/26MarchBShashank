package kiteUtility;

import java.io.File;

import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v100.page.Page.CaptureScreenshotFormat;

public class Utility 
{

	// Excel
	// Screenshot
	// Browser Closing
	
	// Methods should be Static and Generic(By passing some parameter)
	// Because you are going these methods to any of test classes so they are going to used many times
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		// Now you have to get the value of Row and Cell from user so pass Row and Cell as parameter
		
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;  // Change Public void to Public String
	}
	
	
	
	// Take screenshot but it will overrite
	// So, our requirement is we want that name which we put in code
	
	public static void CaptureScreenshot(WebDriver driver, String TCID) // TCID means TestCase Id
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\ScreenShot\\MyScreenshot"+TCID+".png");
	    
		// Screenshot not run
		
		
    
	

	
}	
}
