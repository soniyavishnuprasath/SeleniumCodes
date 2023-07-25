package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions actions=new Actions(driver);
	Thread.sleep(2000);
	actions.dragAndDrop(source, target).perform();
	Thread.sleep(10000);
	driver.manage().window().maximize();
	driver.quit();
}
}
