package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintProductAndPrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("i phone 11"+Keys.ENTER);
	List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println("product list --------------------------> price list");
	for (int i = 0; i < productList.size(); i++) {
		
			System.out.println(productList.get(i).getText()+"------------------------->"+priceList.get(i).getText());
		
		
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
