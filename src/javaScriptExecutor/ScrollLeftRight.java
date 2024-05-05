package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftRight {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//to Scroll left
		jse.executeScript("window.scrollBy(-5000,0)");
		Thread.sleep(2000);
		//to Scroll right
		jse.executeScript("window.scrollBy(5000,0)");
	}

}
