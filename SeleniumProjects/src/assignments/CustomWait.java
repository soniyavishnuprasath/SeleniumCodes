package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	int i=0;
	while(i<100)
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(NoSuchElementException e)
		{
			i++;
		}
	}
	
	driver.manage().window().minimize();
	driver.quit();
}
}
