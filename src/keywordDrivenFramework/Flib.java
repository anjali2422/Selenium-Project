package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
// It is use to store generic reusable methods
	//All the generic reusable methods are non static
	//Read the data from excel file
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException  
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	//Write the data into excel file
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException 
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
	//Get the last row count from excel sheet
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	//Read the data from property file
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
