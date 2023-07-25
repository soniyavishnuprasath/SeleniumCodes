package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureFlightDepatureNameAndTime1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
	driver.findElement(By.xpath("(//p[contains(.,'Bangalore')])[1]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
	driver.findElement(By.xpath("(//p[contains(.,'Goa')])[1]")).click();
	driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
	Actions action=new Actions(driver);
	action.scrollByAmount(0	, 500).perform();
	driver.findElement(By.xpath("//div[@aria-label='Fri Jul 28 2023']")).click();
	driver.findElement(By.xpath("//span[.='Search flights']")).click();
	List<WebElement> flightName = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
	List<WebElement> deptTime = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
	for (int i = 0; i < flightName.size(); i++) {
		System.out.println(flightName.get(i).getText()+"---------->"+deptTime.get(i).getText());
	}
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
