package POM;

import java.io.IOException;

public class ValidCustomer_ProjectTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		//To open & close Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//To read userName,passWord,customer& project creds
		Flib flib = new Flib();
		
		// Perform valid login
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readpropertyData(PROP_PATH, "Username"), flib.readpropertyData(PROP_PATH, "Password"));
	    Thread.sleep(2000);
	    
	    //Work with all modules of homePage
	    HomePage hp = new HomePage(driver);
	    hp.click_on_Tasks_Module();
	    Thread.sleep(2000);
	    
	   //create new customer&project
	    TasksPage tp = new TasksPage(driver);
	    tp.create_New_Customer_method(flib.readExcelData(EXCEL_PATH, CUSTOMERS_PROJECTS_SHEETNAME, 1, 0));
	    Thread.sleep(2000);
	    
	    tp.create_New_Project_Method(flib.readExcelData(EXCEL_PATH, CUSTOMERS_PROJECTS_SHEETNAME, 1, 0), flib.readExcelData(EXCEL_PATH, CUSTOMERS_PROJECTS_SHEETNAME, 1, 1));
	    Thread.sleep(2000);
	    
	    hp.click_on_Logout_Link();
	    Thread.sleep(2000);
	    bt.closeBrowser();
	}

}
