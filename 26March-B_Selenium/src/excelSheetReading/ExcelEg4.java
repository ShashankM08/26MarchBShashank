package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create Excel sheet and pass the path along with name and extension in File objective
		File myfile= new File("C:\\Users\\SHASHANK\\Desktop\\Selenium\\Excel26MarchB.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		// Now get to know about, How many rows and column are present
		int totalNumberOfRows = mySheet.getLastRowNum();  // Will give total number of rows count
		int rowCount = totalNumberOfRows;
		System.out.println("total number of rows are "+rowCount);    // Run-->2 means 0,1,2
		
		
		// Now get to know know column
		short totalNumberOfCells = mySheet.getRow(totalNumberOfRows).getLastCellNum();
		//System.out.println("Total number of cell are "+totalNumberOfCells);  //Run-->3 means 0,1,2
		int cellCount = totalNumberOfCells-1;
		System.out.println("Total number of cell are "+cellCount);    //Run-->2 means 0,1,2
		
		
		
		for(int i=0;i<=rowCount-1;i++)  // Outerfor loop for rows
		{
			for(int j=0;j<=cellCount;j++)  // Inner loop for columns
			{
				Cell cellValue = mySheet.getRow(i).getCell(j);
				CellType dataType = cellValue.getCellType();
				
				if(dataType==CellType.STRING)  //======================> For STRING
				{
					String value = cellValue.getStringCellValue();
					System.out.println(value+ " ");
				}
				
				else if(dataType==CellType.NUMERIC)     //======================> For STRING
				{
					double value = cellValue.getNumericCellValue();
					System.out.println(value+ " ");
					
				}
				
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value = cellValue.getBooleanCellValue();
					System.out.println(value+ " ");
				}
				
				else if(dataType==CellType.BLANK)
				{
					System.out.println(" ");
				}
				
			}
			
			System.out.println();
		}
		
		

	}

}
