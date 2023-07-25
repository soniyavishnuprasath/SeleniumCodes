package methodsoflocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfByClassName1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement tagLineText = driver.findElement(By.className("_8eso"));
	System.out.println(tagLineText.getText());
	driver.manage().window().minimize();
	driver.quit();
}
}
