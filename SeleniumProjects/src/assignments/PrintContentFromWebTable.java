package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentFromWebTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/table.html");
		List<WebElement> content = driver.findElements(By.tagName("td"));
		for (WebElement element : content) {
			System.out.println(element.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
