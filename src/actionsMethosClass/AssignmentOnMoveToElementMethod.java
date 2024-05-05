package actionsMethosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnMoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
driver.findElement(By.id("denyBtn")).click();
WebElement targetcoins = driver.findElement(By.xpath("//a[text()='Coins ']"));

Actions act = new Actions(driver);
act.moveToElement(targetcoins).perform();

driver.findElement(By.xpath("//span[text()='1 gram' and(@data-p='gold-coins-weight-1gms,m')]")).click();
WebElement coin = driver.findElement(By.id("5920"));
if (coin.isDisplayed()) {
	Thread.sleep(1000);
	driver.quit();
}
else {
	System.out.println("Exception");
}
	}

}
