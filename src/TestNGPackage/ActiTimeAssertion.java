package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ActiTimeAssertion {
  static WebDriver driver;
  @Test
  public void loginMethod() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do;jsessionid=2uju4bc1k5tf7\n");
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), "title");//Soft Assert
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  String titleOfhp = "actiTIME - Enter Time-Track";
	  Assert.assertEquals(driver.getTitle(), titleOfhp);//Hard Assert
	  WebElement logOut = driver.findElement(By.partialLinkText("LogOut"));
	  Assert.assertEquals(logOut.isDisplayed(), true);
	  logOut.click();
	  sa.assertAll();
  }
}
