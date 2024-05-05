package handlingdropdowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/multiple%20dropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(multiselectDD);
for (int i = 2; i<=4; i++) {
	sel.selectByIndex(i);
}
List<WebElement> allOpts = sel.getAllSelectedOptions();
//for (int i = 0; i <allOpts.size(); i++) {
	//Thread.sleep(1000);
	//System.out.println(allOpts.get(i).getText());
for(WebElement we:allOpts) {
	System.out.println(we.getText());
}
	}
	}
