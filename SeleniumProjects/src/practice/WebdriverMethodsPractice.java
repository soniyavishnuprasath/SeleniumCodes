package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsPractice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
