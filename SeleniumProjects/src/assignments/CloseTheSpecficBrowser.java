package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheSpecficBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Thread.sleep(3000);
	String parentTitle = driver.getTitle();
	System.out.println(parentTitle);
	Set<String> allWindowIds = driver.getWindowHandles();
	for (String wid : allWindowIds) {
		String allWindowTitle = driver.switchTo().window(wid).getTitle();
		if(allWindowTitle.equals(parentTitle))
		{
			//closing the parent window
			driver.close();
		}
		else
		{
			//closing all other window expect the parent window.
			//driver.close();
		}
	}
	Thread.sleep(5000);
	}
}
