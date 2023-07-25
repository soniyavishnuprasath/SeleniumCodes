package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingTheAllignmentOfGenderRadioButton {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	int femaleRadio = driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).getLocation().getY();
	int maleRadio = driver.findElement(By.xpath("//label[.='Male']/following-sibling::input")).getLocation().getY();
	int customRadio = driver.findElement(By.xpath("//label[.='Custom']/following-sibling::input")).getLocation().getY();
	if(femaleRadio==maleRadio && femaleRadio==customRadio)
		System.out.println("Pass : all the gender radio buttons are alligned properly and its verfied");
	else
		System.out.println("Fail : all the gender radio buttons are not alligned properly and its verfied");
	driver.manage().window().minimize();
	driver.quit();
}
}
