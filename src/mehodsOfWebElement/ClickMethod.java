package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/single%20dropdown.html");

//By storing
WebElement singleselectDD = driver.findElement(By.id("menu"));
singleselectDD.click();

//By method chaining
driver.findElement(By.id("menu")).click();
	}

}
