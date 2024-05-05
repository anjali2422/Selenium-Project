package POM;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//Refer the webElements of loginPage by using POM class
		LoginPage lp = new LoginPage(driver);
		//To read invalidUsername & passWord
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
		 for (int i = 1; i <=rc; i++) {
			 lp.invalidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0), flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 1));
		}
		 Thread.sleep(2000);
		 bt.closeBrowser();
	}

}
