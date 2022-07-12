package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create Excel sheet and pass the path along with name and extension in File objective
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		// Using WorkBookFactory class read the excel sheet
		// 1. how to read String Value
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);

		
		// 2. How to read Numeric Value
		double Number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();	
		System.out.println(Number);
		
		
		// 3. How to read Character value
		String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(mychar);
		
	
		// 4. How to read Boolean value
		boolean myvalue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(myvalue);
	}

}
