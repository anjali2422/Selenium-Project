package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign In / Join AJIO']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("anjalidesai9902@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	}


