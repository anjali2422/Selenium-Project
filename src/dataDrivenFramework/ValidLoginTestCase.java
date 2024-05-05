package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends Flib{

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=2uju4bc1k5tf7");
     // Read the valid userName & password from actiTimetestdata excel file
		Flib flib = new Flib();
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0));
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
