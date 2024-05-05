package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=2uju4bc1k5tf7");
	//To read invalid usn & pwd from excel sheet
	Flib flib = new Flib();
	//Get the last count of the row
	int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
	Thread.sleep(2000);
	for (int i = 1; i <=rc; i++) {
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 1));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
	}
	Thread.sleep(2000);
	driver.quit();
}
}
