package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheBussinessNewsFromBBC {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	//WebElement newsHeadings = driver.findElement(By.xpath("//h2[text()='Latest Business News']"));
	//Actions actions=new Actions(driver);
	//actions.moveToElement(newsHeadings).perform();
	List<WebElement> newsHeadings = driver.findElements(By.xpath("//a[@class='top-list-item__link']"));
	for (WebElement bussinessNews : newsHeadings) {
		System.out.println(bussinessNews.getText());
	}
	driver.manage().window().minimize();
	driver.quit();
	}
}
