package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.instagram.com/");
 driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
 driver.findElement(By.name("password")).sendKeys("manager123");
 boolean LoginButton = driver.findElement(By.xpath("//button[contains(@class,'acap _')]")).isEnabled();
System.out.println(LoginButton);
}
}
