package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToAParticularElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	WebElement futurePlanet = driver.findElement(By.xpath("//span[text()='Future Planet']"));
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	actions.scrollToElement(futurePlanet).perform();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
