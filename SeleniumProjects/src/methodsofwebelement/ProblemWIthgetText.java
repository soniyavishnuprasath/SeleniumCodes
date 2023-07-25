package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWIthgetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement divTag = driver.findElement(By.className("_8esl"));
	String divTagName = divTag.getTagName();
	System.out.println("divTagName = "+divTagName);
	String divText = divTag.getText();
	//here the <div> has no tag text
	//getText() will capture both main and sub tag Text.
	//System.out.println("divText = "+divText);
	System.out.println("<"+divTagName+">"+divText+"<"+divTagName+">");
	System.out.println("==============================================================");
	WebElement actualTag = driver.findElement(By.className("_8eso"));
	String actualTagName = actualTag.getTagName();
	System.out.println("actualTagName = "+actualTagName);
	String actualText = actualTag.getText();
	System.out.println("<"+actualTagName+">"+actualText+"<"+actualTagName+">");
	driver.manage().window().minimize();
	driver.quit();
}
}
