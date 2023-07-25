package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectOptionsFromList {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/weeklist.html");
	WebElement monthList = driver.findElement(By.id("a"));
	Select s=new Select(monthList);
	List<WebElement> monthSelect = s.getOptions();
	for (WebElement options : monthSelect) {
		s.selectByVisibleText(options.getText());
	}
	for (WebElement options1 : monthSelect) {
		s.deselectByVisibleText(options1.getText());
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
