package mehodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettagNameMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=or6qn4dfb9xw");
	String TagName = driver.findElement(By.id("loginButton")).getTagName();
	System.out.println(TagName);
	}

}
