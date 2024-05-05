package methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
			}

	}

