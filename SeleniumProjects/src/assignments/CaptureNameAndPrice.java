package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureNameAndPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14 promax" + Keys.ENTER);
		//Thread.sleep(2000);
		List<WebElement> allnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println("product name=================================>price name");
		for (int i=0;i<allnames.size();i++) {
						System.out.println(allnames.get(i).getText() + "=============>" + allprice.get(i).getText());
			
		}

		driver.manage().window().maximize();
		driver.quit();
	}
}
