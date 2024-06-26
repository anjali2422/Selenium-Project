package actionsMethosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
driver.findElement(By.id("denyBtn")).click();
WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
Actions act = new Actions(driver);
act.moveToElement(target).perform();
driver.findElement(By.xpath("//a[text()='Band']")).click();	}

}
