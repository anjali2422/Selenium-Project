package handlingdropdowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/multiple%20dropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(multiselectDD);

List<WebElement>dropdownOptions = sel.getOptions();
for (int  i= 0; i <dropdownOptions.size(); i++) {
	String options = dropdownOptions.get(i).getText();
	System.out.println(options);
	Thread.sleep(1000);
}
System.out.println();

List<WebElement>ops = sel.getOptions();
for ( WebElement we:ops) {
	String textOfOps = we.getText();
	System.out.println(textOfOps);
}
	}

}
