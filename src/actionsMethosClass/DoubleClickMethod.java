package actionsMethosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=or6qn4dfb9xw");
	new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	driver.findElement(By.id("uploadNewLogoOption")).click();
	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	Thread.sleep(2000);
	driver.quit();
	}

}
