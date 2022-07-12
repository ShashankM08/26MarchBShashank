package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create Excel sheet and pass the path along with name and extension in File objective
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		// Enter into the file
		Workbook book = WorkbookFactory.create(myfile);
		
		// Enter into the sheet
		Sheet mySheet = book.getSheet("Sheet1");
		
		// Enter into the row
		Row myRow = mySheet.getRow(0);
		
		// Enter into the cell/column
        Cell myCell = myRow.getCell(0);
        
        
        System.out.println(myCell.getCellType());
        // Run==> for 0,0 String
        // Run==> for 2,0 Numeric
        // Run==> for 3,1 Boolean

	}

}
