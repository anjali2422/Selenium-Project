package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrenUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("httpe://www.instagram.com/");
String currentUrl=driver.getCurrentUrl();
System.out.println(currentUrl);
	}

}
