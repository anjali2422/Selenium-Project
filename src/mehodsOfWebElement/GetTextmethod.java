package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmethod {
public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://127.0.0.1/login.do;jsessionid=or6qn4dfb9xw");

//By storing
WebElement loginButton = driver.findElement(By.id("loginButton"));
String elementValue = loginButton.getText();
System.out.println(elementValue);
}
}
