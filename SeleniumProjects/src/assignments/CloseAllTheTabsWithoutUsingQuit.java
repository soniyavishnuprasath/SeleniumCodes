package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheTabsWithoutUsingQuit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println(allWindowIds.size());
	for (String wid : allWindowIds) {
		//System.out.println(wid);
		driver.switchTo().window(wid);
		driver.close();
	}
}
}
