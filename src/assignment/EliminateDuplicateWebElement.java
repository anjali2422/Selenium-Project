package assignment;

import java.time.Duration;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shree/Desktop/WCSA5/WebElement/multiple%20dropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel = new Select(multiselectDD);
//HashSet<String>hs=new HashSet<String>();
 TreeSet<String> ts=new TreeSet<String>();

List<WebElement> allOpts = sel.getOptions();

for (int i = 0; i < allOpts.size(); i++) {
	WebElement op = allOpts.get(i);
	String value = op.getText();
	ts.add(value);
}
for(String element:ts) {
	Thread.sleep(1000);
	System.out.println(element);
}
//for (int i = 0; i < allOpts.size(); i++) {
	//WebElement op = allOpts.get(i);
	//String value = op.getText();
	//hs.add(value);
//}
	//for(String element:hs) {
	//	Thread.sleep(1000);
	//System.out.println(element);
}
	}

