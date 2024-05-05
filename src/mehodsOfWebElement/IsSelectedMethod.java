package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://127.0.0.1/login.do;jsessionid=or6qn4dfb9xw");
WebElement checkbox = driver.findElement(By.name("remember"));
boolean verify = checkbox.isSelected();
System.out.println(verify);
Thread.sleep(1000);
checkbox.click();
boolean verify1 = checkbox.isSelected();
System.out.println(verify1);

}
}
