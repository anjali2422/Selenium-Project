package finalMock;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
         WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
     Actions act = new Actions(driver);
         act.moveToElement(target).perform();
         driver.findElement(By.xpath("//a[text()='Band']")).click();
	}

}
