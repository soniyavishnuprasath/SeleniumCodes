package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingFromActiTime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("About your actiTIME")).click();
	Thread.sleep(3);
	driver.findElement(By.linkText("Read Service Agreement")).click();
	String expectedTitle="actiTIME Online Terms of Service";
	Set<String> windowIds = driver.getWindowHandles();
	for (String wid : windowIds) {
		driver.switchTo().window(wid);
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			 List<WebElement> allHeadings = driver.findElements(By.tagName("h2"));
			for (WebElement heading : allHeadings) {
				System.out.println(heading.getText());
			}				
			
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
