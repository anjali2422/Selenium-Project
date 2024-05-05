package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		////This chatBox is design under the frame
		//handle frame first by Identify it..
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
	   chatBox.click();
	   //switch control to parent page
	   driver.switchTo().parentFrame();
	   
	   driver.findElement(By.id("chat-fc-name")).sendKeys("Anjali");
	   driver.findElement(By.id("chat-fc-email")).sendKeys("Anjali123");
	   driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
	   
	}

}
