package handlingpopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/jsoni/OneDrive/Desktop/qspider/selenium/uploadfile.html");
	Thread.sleep(2000);
	File uploadfile=new File("./data/resume.docx");
	String abpath = uploadfile.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abpath);
	
}
}