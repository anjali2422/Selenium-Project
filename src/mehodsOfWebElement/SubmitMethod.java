package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.instagram.com/");
 driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
 driver.findElement(By.name("password")).sendKeys("manager123");
 WebElement LoginButton = driver.findElement(By.xpath("//button[contains(@class,'acap _')]"));
LoginButton.submit();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
WebElement loginButton2 = driver.findElement(By.xpath("//button[text()=' Login ']"));
loginButton2.submit();

}
}
