package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptynessOfTheTextField {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		String valueAttvalue = userNameTextField.getAttribute("value");
		System.out.println("valueAttvalue = "+valueAttvalue);
		if(valueAttvalue.isEmpty())
		{
			System.out.println("boolean true : attribute value is empty");
		}
		else
		{
			System.out.println("boolean false : attribute value is not empty");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
