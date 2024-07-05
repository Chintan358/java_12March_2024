package utill;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	String filePath;
	String sheetName;
	
	public ExcellReader(String filePath, String sheetName) {
		
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	public int rowCount()
	{
		int row = 0;
		
		try {
			XSSFWorkbook workbook  =new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			row =  worksheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int colCount()
	{
		int col = 0;
		
		try {
			XSSFWorkbook workbook  =new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			col = worksheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return col;
	}
	
	public String getData(int row,int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook  =new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	
}
