package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
	
	static WebDriver driver;
	public void openBrowser() throws IOException 
	{
		//Read the data from property file to get the browser value and UR
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData("PROP_PATH","Url");
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the valid browser value!!!");
			
			//Maximize the browser
			driver.manage().window().maximize();
			//Apply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Launch the webApplication
			driver.get(url);
		}
	}
public void closeBrowser() {
	driver.quit();
}
	}