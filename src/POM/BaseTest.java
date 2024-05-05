package POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest extends Flib implements IautoConstant{
static WebDriver driver;
public void openBrowser() throws IOException
{
	//read the data from property file to get the BrowserValue and url
	Flib flib = new Flib();
	String browserValue = flib.readpropertyData(PROP_PATH, "Browser");
	String url = flib.readpropertyData(PROP_PATH, "Url");
	if (browserValue.equalsIgnoreCase("chrome")) 
	{
		driver=new ChromeDriver();
	} 
	else if (browserValue.equalsIgnoreCase("firefox")) 
	{
		driver=new FirefoxDriver();
	}
	else if (browserValue.equalsIgnoreCase("Edge")) 
	{
		driver=new EdgeDriver();
	}
	else{
    System.out.println("Enter the valid Browser valur!!");
	}
	//Maximize the browser
	driver.manage().window().maximize();
	//Apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Launch the WebApplication
	driver.get(url);
}
public void closeBrowser() {
	driver.quit();
}
}
