package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.partialLinkText("Resources"));
	Actions actions=new Actions(driver);
	actions.moveToElement(target).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String contactNumber = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]")).getText();
	System.out.println(contactNumber);
	driver.manage().window().minimize();
	driver.quit();
}
}
