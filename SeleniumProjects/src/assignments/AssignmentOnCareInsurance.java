package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnCareInsurance {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	WebElement policyNumberTextField = driver.findElement(By.id("policynumber"));
	policyNumberTextField.sendKeys("123");
	policyNumberTextField.sendKeys(Keys.TAB);
	WebElement month = driver.findElement(By.className("ui-datepicker-month"));
	Select monthSelect = new Select(month);
	monthSelect.selectByVisibleText("June");
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	Select yearSelect=new Select(year);
	yearSelect.selectByValue("2015");
	driver.findElement(By.linkText("23")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	Thread.sleep(2000);
	String errorMsg = driver.findElement(By.id("policynumberError")).getText();
	if(errorMsg.isEmpty())
		System.out.println("Error Text is not displayed and its verfied");
	else
		System.out.println("Error text is displayed and its verfied");
	driver.manage().window().minimize();
	driver.quit();
	
	
		
		

}
}
