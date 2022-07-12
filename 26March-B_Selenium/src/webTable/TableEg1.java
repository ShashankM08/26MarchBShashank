package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHASHANK\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		// Count no. of rows and columns
		// 1. Select whole table
		// 2. Find no. of rows means //table//tr
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));  // WebElements is used here
		System.out.println("Total Number of rows "+rows.size());
		
		// 3. find no. of Columns means  //table//tr[1]//th
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		System.out.println("Total no. of columns are "+columns.size());
		
		// 4. How to read whole columns/header
		//Using Iterator/ListIterator/for/for each
		
		// Using for each
		for(WebElement header:columns)
		{
			//System.out.println(header.getText()+" ");
			System.out.print(header.getText()+" ");
		}
		
		
		System.out.println("============================");
		
		
		// 5. how to read all rows of table
		List<WebElement> totalRows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("Total no. of rows are "+totalRows.size());
		
		//Using for each 
		for(WebElement tr:rows)
		{
			System.out.print(tr.getText()+" ");
		}
		
		
	}

}
