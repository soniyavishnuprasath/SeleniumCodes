package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resouce = driver.findElement(By.partialLinkText("Resources"));
		Actions actions = new Actions(driver);
		actions.moveToElement(resouce).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		WebElement loginButton = driver.findElement(By.id("loginspan"));
		actions.doubleClick(loginButton).perform();
		String expectedTitle = "Login - Vtiger";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle))
			System.out.println("pass: login page is displayed and its verfied");

		else
			System.out.println("Fail: login page is not displayed and its verfied");
		driver.manage().window().minimize();
		driver.quit();
	}
}
