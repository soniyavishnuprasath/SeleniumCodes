package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute1 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	try
	{
	driver.get("https://pib.gov.in/");
	}
	catch(WebDriverException e)
	{
		driver.navigate().refresh();
	}
	Thread.sleep(2000);
	WebElement azadi = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
	String toolTipText = azadi.getAttribute("title");
	System.out.println("toolTipText = "+toolTipText);
	String altAttValue = azadi.getAttribute("alt");
	System.out.println("altAttValue = "+altAttValue);
	driver.manage().window().minimize();
	driver.quit();
}
}
