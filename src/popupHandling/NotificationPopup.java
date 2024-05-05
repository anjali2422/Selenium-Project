package popupHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class NotificationPopup {
    static WebDriver drivers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser value");
		String browservalue = sc.next();
		if(browservalue.equalsIgnoreCase("Chrome"))
		{

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{
						FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			WebDriver driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{
					 EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			 EdgeDriver driver = new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		else
		{
			System.out.println("Enter valid browser name");
		}
		}

}


