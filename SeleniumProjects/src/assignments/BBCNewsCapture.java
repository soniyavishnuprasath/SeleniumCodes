package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BBCNewsCapture {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	List<WebElement> busineessNews = driver.findElements(By.xpath("//h2[text()='Latest Business News']/following-sibling::ul/li/a"));
	 for(int i=0;i<busineessNews.size();i++)
	 {
	  System.out.println(busineessNews.get(i).getText());
	 }
	 driver.manage().window().minimize();
	 driver.quit();

}
}
