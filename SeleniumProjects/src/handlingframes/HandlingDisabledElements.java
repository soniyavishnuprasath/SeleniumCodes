package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/disabledElements.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('d2').value='manager'");
	
}
}
