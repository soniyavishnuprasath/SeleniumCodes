package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithClassNameLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//no problem with id locator.
		//driver.findElement(By.id("content"));
		// InvalidSelectorException - Selenium - run - unchecked
		// when the class attribute contains space in it's value
		driver.findElement(By.className("fb_content clearfix "));
		driver.manage().window().minimize();
		driver.quit();
	}
}
