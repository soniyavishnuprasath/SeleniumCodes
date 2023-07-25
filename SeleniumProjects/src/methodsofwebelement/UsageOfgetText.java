package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(@href,'recover/initiate/?privacy_mutation_token')]"));
	String text = forgotPwdLink.getText();
	System.out.println("text = "+text);
	driver.manage().window().minimize();
	driver.quit();
}
}
