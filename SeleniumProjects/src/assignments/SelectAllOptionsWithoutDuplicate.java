package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionsWithoutDuplicate {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/weeklist.html");
	WebElement dayslist = driver.findElement(By.id("a"));
	Select s=new Select(dayslist);
	List<WebElement> alloptions = s.getOptions();
	for (WebElement element : alloptions) {
		String days = element.getText();
		ts.add(days);
	}
	for (String wod : ts) {
		System.out.println(wod);
	}
	driver.manage().window().minimize();
	driver.quit();
	}
}
