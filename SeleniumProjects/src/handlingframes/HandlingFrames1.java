package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/page1.html");
	driver.findElement(By.id("t1")).sendKeys("qsp");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("jsp");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
