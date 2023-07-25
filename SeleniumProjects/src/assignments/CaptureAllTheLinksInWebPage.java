package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTheLinksInWebPage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	for (WebElement links : allLinks) {
		//getting all the link texts from the webpage
		System.out.println(links.getText());
		//geting only the links values
		//System.out.println(links.getAttribute("href"));
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
