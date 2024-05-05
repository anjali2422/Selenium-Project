package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
		//To open & close the browser
		BaseTest bt = new BaseTest();
     bt.openBrowser();
     //To read the validUsername & valid password
     Flib flib = new Flib();
     //Identify userName textBox and pass userName
     driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
   //Identify password textBox and pass password
     driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
     //Identify login button and click
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
     bt.closeBrowser();
    
	}

}
