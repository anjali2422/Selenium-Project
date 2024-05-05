package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//to Scroll Down
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		//to Scroll Up
		jse.executeScript("window.scrollBy(0,-1000)");
	}

}
