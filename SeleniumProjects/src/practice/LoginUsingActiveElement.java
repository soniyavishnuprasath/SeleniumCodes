package practice;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingActiveElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys("soniya"+Keys.TAB+"vishnu"+Keys.TAB+Keys.TAB);
	driver.switchTo().activeElement().click();
	
}
}
