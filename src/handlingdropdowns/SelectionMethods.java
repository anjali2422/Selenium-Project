package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/single%20dropdown.html");
WebElement singleselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(singleselectDD);

sel.selectByIndex(1);
Thread.sleep(2000);

sel.selectByValue("v4");
Thread.sleep(2000);

sel.selectByVisibleText("API Testing");
	}

}
