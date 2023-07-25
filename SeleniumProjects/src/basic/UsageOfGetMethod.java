package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod {
public static void main(String[] args) {
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
