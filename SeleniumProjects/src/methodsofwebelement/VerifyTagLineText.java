package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagLineText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement tagLineText = driver.findElement(By.className("_8eso"));
	String actualTagLineText = tagLineText.getText();
	System.out.println("actualTagLineText = "+actualTagLineText);
	String ExpectedTagLineText="Facebook helps you connect and share with the people in your life.";
	if(actualTagLineText.equals(ExpectedTagLineText))
		System.out.println("Pass: the tagLineText is found and its verified");
	else
		System.out.println("Fail: the tagLineText is not found and its verified");
	driver.manage().window().minimize();
	driver.quit();
}
}
