package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizemethod {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.selenium.dev/");
Dimension NewsElement = driver.findElement(By.xpath("//h2[text()='News']")).getSize();
int height = NewsElement.getHeight();
int width = NewsElement.getWidth();
System.out.println(height + " " + width);
}
}
