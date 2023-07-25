package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionOfQspider {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("qspider");
	List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(.,'QSpiders')]"));
	System.out.println(sugg.size());
	for (WebElement auto : sugg) {
		String allSugg = auto.getText();
		System.out.println(allSugg);
		}
	driver.findElement(By.xpath("(//span[contains(.,'QSpiders')])[7]")).click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
