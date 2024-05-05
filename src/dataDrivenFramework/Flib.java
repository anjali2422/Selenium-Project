package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Flib {
//It is use o store generic reusable methods
	//All the generic reusable methods are non static
	//Read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);//Provide path of file which we want to work with
		Workbook wb = WorkbookFactory.create(fis);//Make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//provide sheetName
		Row row = sheet.getRow(rowCount);//Get into the desired row
		Cell cell = row.getCell(cellCount);//Get into the desired cell
		String data = cell.getStringCellValue();//Use to read the value /data from cell
		return data;
	}
	//Write the data into ExcelSheet
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	//Get the last row count from excelSheet
 public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis = new FileInputStream(excelPath);
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet(sheetName);
	 int row = sheet.getLastRowNum();//It is use to get last count of row where we store the data
	 return row;
 }
}
