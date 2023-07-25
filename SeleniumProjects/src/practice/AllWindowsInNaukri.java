package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowsInNaukri {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	Set<String> allWID = driver.getWindowHandles();
	for (String wid : allWID) {
		driver.switchTo().window(wid);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.manage().window().minimize();
	driver.quit();

}
}
