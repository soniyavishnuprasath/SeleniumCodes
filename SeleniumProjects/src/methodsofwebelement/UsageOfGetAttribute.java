package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//identify the checkbox
	WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	String toolTipText = keepLoggedInCheckBox.getAttribute("title");
	System.out.println("titleAttValue = "+toolTipText);
	System.out.println("type = "+keepLoggedInCheckBox.getAttribute("type"));
	System.out.println("name = "+keepLoggedInCheckBox.getAttribute("name"));
	System.out.println("value = "+keepLoggedInCheckBox.getAttribute("value"));
	System.out.println("id = "+keepLoggedInCheckBox.getAttribute("id"));
	// attribute which not at all associated with the source code 
	System.out.println(keepLoggedInCheckBox.getAttribute("href"));
	//it will the return the null value

	driver.manage().window().minimize();
	driver.quit();
}
}
