package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://demo.actitime.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.com/");
	Thread.sleep(2000);
	Set<String> windows = driver.getWindowHandles();
	for (String wid : windows) {
		String url = driver.switchTo().window(wid).getCurrentUrl();
		if(url.equals("https://www.facebook.com/"))
		{
			driver.close();
			Thread.sleep(2000);
		}
		else if(url.equals("https://www.flipkart.com/"))
		{
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
		}
		else if(url.equals("https://demo.actitime.com/login.do"))
		{
			
			System.out.println(" windowsize= "+driver.manage().window().getSize());
			Thread.sleep(2000);
		}
		else if(url.equals("https://www.amazon.com/"))
		{
			System.out.println("windowposition = "+driver.manage().window().getPosition());
			Thread.sleep(2000);
		}
	}
	String window = driver.getWindowHandle();
	System.out.println("windows= "+window);
	driver.manage().window().minimize();
	driver.quit();
}
}
