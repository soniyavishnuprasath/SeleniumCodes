package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxInAlphabeticalOrder {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/weeklist.html");
	WebElement dayslist = driver.findElement(By.id("a"));
	Select s=new Select(dayslist);
	List<WebElement> alloptions = s.getOptions();
	for (WebElement element : alloptions) {
		String alldaylist = element.getText();
		al.add(alldaylist);
	}
	Collections.sort(al);
	for (String lwd : al) {
		System.out.println(lwd);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
