package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("login-facebook-button")).click();
	Thread.sleep(3000);
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println(allWindowIds.size());
	for (String wid : allWindowIds) {
		System.out.println(wid);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
