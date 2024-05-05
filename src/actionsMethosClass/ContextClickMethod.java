package actionsMethosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/single%20dropdown.html");
WebElement target = driver.findElement(By.id("menu"));
Actions act = new Actions(driver);
Thread.sleep(2000);
act.contextClick(target).perform();
	}

}
