package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllUrlOfTheLinks {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
	Thread.sleep(2000);
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 System.out.println(allLinks.size());
	 for (WebElement links : allLinks) {
		System.out.println(links.getAttribute("href"));
	}
	 driver.manage().window().minimize();
	 driver.quit();
	
}
}
