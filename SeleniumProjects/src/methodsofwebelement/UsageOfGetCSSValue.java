package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCSSValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// find the login button
		WebElement loginButton = driver.findElement(By.name("login"));
		String bgColor = loginButton.getCssValue("background-color");
		System.out.println(bgColor);
		//get the font family
		String fontFamily=loginButton.getCssValue("font-family");
		System.out.println(fontFamily);
		String fontSize = loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		String height=loginButton.getCssValue("line-height");
		System.out.println(height);
		String width=loginButton.getCssValue("width");
		System.out.println(width);
		String color=loginButton.getCssValue("color");
		System.out.println(color);
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		

	}
}
