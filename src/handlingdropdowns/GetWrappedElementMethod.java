package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/multiple%20dropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(multiselectDD);
WebElement allOpts = sel.getWrappedElement();
System.out.println(allOpts.getText());
	}

	}

