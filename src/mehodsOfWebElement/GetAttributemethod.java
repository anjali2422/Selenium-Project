package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributemethod {
public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//By storing
WebElement AttributeValue = driver.findElement(By.xpath("//input[@placeholder='Username']"));
String placeholderValue = AttributeValue.getAttribute("placeholder");
System.out.println(placeholderValue);
}
}
