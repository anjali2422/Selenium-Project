package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/multiple%20dropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(multiselectDD);
sel.selectByIndex(1);
Thread.sleep(2000);

sel.selectByValue("v4");
Thread.sleep(2000);

sel.selectByVisibleText("API Testing");
Thread.sleep(1000);

sel.deselectByIndex(1);
Thread.sleep(1000);

sel.deselectByValue("v4");
Thread.sleep(1000);

sel.deselectByVisibleText("API Testing");
	}
}
