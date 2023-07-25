package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureBBCBusinessNews {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bbc.com/");
	List<WebElement> allNews = driver.findElements(By.xpath("//h2[.='Latest Business News']/following-sibling::ul/li/a"));
	for (WebElement buss : allNews) {
		System.out.println(buss.getText());
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
