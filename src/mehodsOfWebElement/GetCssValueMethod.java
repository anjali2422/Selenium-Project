package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 String cssProperty = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");
System.out.println(cssProperty);
}
}
