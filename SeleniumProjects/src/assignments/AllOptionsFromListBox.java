package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsFromListBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	WebElement monthList = driver.findElement(By.id("month"));
	Select s=new Select(monthList);
	List<WebElement> MonthSelect = s.getOptions();
	for (WebElement options : MonthSelect) {
		System.out.println(options.getText());
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
