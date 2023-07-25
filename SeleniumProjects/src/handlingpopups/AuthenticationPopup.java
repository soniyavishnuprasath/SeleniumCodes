package handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//we can handle Authentication popup by sending username and pwd along with the main url 
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
