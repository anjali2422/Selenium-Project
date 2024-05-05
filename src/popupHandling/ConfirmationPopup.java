package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
				EdgeDriver driver=new EdgeDriver(); // launch Browser

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/confirmation.html");
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		//al.accept();
       // al.dismiss();
		System.out.println(al.getText());
		al.accept();
	}

}
