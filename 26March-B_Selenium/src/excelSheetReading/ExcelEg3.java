package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		// Create Excel sheet and pass the path along with name and extension in File objective
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		// Code for reading whole data from Excel Sheet
		Workbook book = WorkbookFactory.create(myfile);
		
		Sheet mySheet2 = book.getSheet("Sheet2");
		
		
		// Row is Constant
		// Column is Varying
		
		for(int i=0;i<=1;i++)  // Outer loop for Rows
		{
			for(int j=0;j<=2;j++)  // Inner loop for Columns
			{
				String value = mySheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			
			System.out.println();
		}

	}

}
