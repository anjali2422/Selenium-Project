package POM;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		//To open & close Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		//Perform valid login operation
		//refer the WebElements from LoginPage POM
		LoginPage lp = new LoginPage(driver);
		//read the valid UserName & passWord
		Flib flib = new Flib();
		lp.validLogin(flib.readpropertyData(PROP_PATH, "username"), flib.readpropertyData(PROP_PATH, "Password"));
	 Thread.sleep(2000);
	 bt.closeBrowser();
	}

}
