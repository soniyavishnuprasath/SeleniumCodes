package handlingframes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottomOfWebPage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	//scroll to the bottom of the webpage
	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	//scroll back to top
	j.executeScript("window.scrollTo(0,0)");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
