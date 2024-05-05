package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.selenium.dev/");
Rectangle NewsElement = driver.findElement(By.xpath("//h2[text()='News']")).getRect();
int xaxis = NewsElement.getX();
int yaxis = NewsElement.getY();

int height = NewsElement.getHeight();
int width = NewsElement.getWidth();
System.out.println("value of xaxis: " + xaxis +" value of yaxis: "+ yaxis+ " value of height: " +height 
		+ " value of width: " + width);
}
}
