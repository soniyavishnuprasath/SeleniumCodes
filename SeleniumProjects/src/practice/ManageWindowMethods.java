package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//driver.manage().window().fullscreen();
	Thread.sleep(2000);
	Dimension targetSize=new Dimension(550, 400);
	driver.manage().window().setSize(targetSize);
	Thread.sleep(2000);
	Point targetPosition=new Point(700, 300);
	driver.manage().window().setPosition(targetPosition);
	Thread.sleep(2000);
	Point windowPosition = driver.manage().window().getPosition();
//	int xCoordinate = windowPosition.getX();
//	int yAxis = windowPosition.getY();
	System.out.println("x coordinate = "+windowPosition.getX());
	System.out.println("y coordinate = "+windowPosition.getY());
	System.out.println("windowPosition = "+windowPosition);
	Dimension sizeOfWindow = driver.manage().window().getSize();
	System.out.println("height = "+sizeOfWindow.getHeight());
	System.out.println("width = "+sizeOfWindow.getWidth());
	System.out.println("sizeOfWindow = "+sizeOfWindow);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
