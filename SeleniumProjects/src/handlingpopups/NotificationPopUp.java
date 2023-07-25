package handlingpopups;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	Thread.sleep(2000);
	driver.switchTo().frame(4);
	driver.findElement(By.xpath("//a[@class='close']")).click();
	}
}
