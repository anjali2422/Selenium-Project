package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	Actions act = new Actions(driver);
	WebElement uploadbutton = driver.findElement(By.id("uploadfile"));
	act.doubleClick(uploadbutton).perform();
	Runtime.getRuntime().exec("./autoItPrograms/OmayoFileupload.exe");

	}

}
