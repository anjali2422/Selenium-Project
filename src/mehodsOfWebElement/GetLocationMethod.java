package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.selenium.dev/");
Point NewsElement = driver.findElement(By.xpath("//h2[text()='News']")).getLocation();
int xaxis = NewsElement.getX();
int yaxis = NewsElement.getY();
System.out.println("x axis of news webelement :"+ xaxis + " y axis of news webelement :"+yaxis);
}

}
