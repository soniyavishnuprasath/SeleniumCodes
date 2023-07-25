package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLastElementInSearch {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> listOfSugg = driver.findElements(By.xpath("//span[@class='r85cly']"));
	int count=listOfSugg.size();
	System.out.println(count);
	for (WebElement sugg : listOfSugg) {
		System.out.println(sugg.getText());
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='r85cly'])[8]")).click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
