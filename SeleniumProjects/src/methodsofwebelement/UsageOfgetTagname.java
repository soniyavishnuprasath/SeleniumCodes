package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTagname {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	String tagNameOfLogin = loginButton.getTagName();
	System.out.println(tagNameOfLogin);
	if(tagNameOfLogin.equals("button"))
		loginButton.click();
	else
		System.out.println("not made with button tag");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
