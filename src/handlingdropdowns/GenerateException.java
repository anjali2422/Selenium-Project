package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/single%20dropdown.html");
WebElement singleselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(singleselectDD);
Thread.sleep(2000);
sel.selectByIndex(2);

Thread.sleep(1000);
sel.deselectByIndex(2);
	}

}
