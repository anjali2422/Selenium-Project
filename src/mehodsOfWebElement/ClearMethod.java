package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("http://127.0.0.1/login.do;jsessionid=or6qn4dfb9xw");

//By Storing
WebElement usnTB = driver.findElement(By.name("username"));
WebElement pwdTB = driver.findElement(By.name("pwd"));
usnTB.sendKeys("admin");
pwdTB.sendKeys("manager");
usnTB.clear();
pwdTB.clear();
}
}
