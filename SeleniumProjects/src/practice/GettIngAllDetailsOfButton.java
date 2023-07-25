package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettIngAllDetailsOfButton {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	WebElement submit = driver.findElement(By.id("user_login_btn"));
	System.out.println("text of submit button is "+submit.getText());
	System.out.println("tag name is "+submit.getTagName());
	System.out.println("class attribute value is "+submit.getAttribute("class"));
	driver.manage().window().minimize();
	driver.quit();
}
}
