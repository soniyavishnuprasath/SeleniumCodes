package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LoginButtonColor {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	//check the background-color
	String bgColor=loginButton.getCssValue("background-color");
	System.out.println(bgColor);
	String hexColor = Color.fromString(bgColor).asHex();
	System.out.println(hexColor);
	driver.manage().window().minimize();
	driver.quit();
}
}
