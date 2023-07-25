package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicatesFromList1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/weeklist.html");
		WebElement daylist = driver.findElement(By.id("a"));
		Select s=new Select(daylist);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			for(int j=i+1;j<alloptions.size();j++)
			{
			if(alloptions.get(i).getText().equals(alloptions.get(j).getText()))
			{
				System.out.println(alloptions.get(i).getText());
			}
		}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
