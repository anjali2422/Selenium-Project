package dynamicScreenshot;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	static WebDriver driver;
	
 
  @BeforeMethod
  public void setUp() 
  {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://127.0.0.1/login.do;jsessionid=2uju4bc1k5tf7");
  }
  
  //Generic reusable method for take the screenshot of failed method
  public void failedmethod(String failedMethodname)
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenshots/" + failedMethodname + ".png");
	  
		try {
			Files.copy(src, dest);
		} 
		catch (IOException e) 
		{
			
		}
  }

  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
