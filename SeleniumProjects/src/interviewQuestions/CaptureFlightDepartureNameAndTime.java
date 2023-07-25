package interviewQuestions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureFlightDepartureNameAndTime {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cleartrip.com/");

		/*
		 * // Select the departure location (e.g., Bangalore) WebElement departureInput
		 * = driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * departureInput.sendKeys("Bangalore"); WebElement departureOption =
		 * driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]"));
		 * departureOption.click();
		 * 
		 * // Select the destination location (e.g., Goa) WebElement destinationInput =
		 * driver.findElement(By.xpath("//input[@placeholder='To']"));
		 * destinationInput.sendKeys("Goa"); WebElement destinationOption =
		 * driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]"));
		 * destinationOption.click();
		 */

        // Open the departure date picker
        WebElement departureDateInput = driver.findElement(By.xpath("//input[@id='DepartDate']"));
        departureDateInput.click();

        // Select the desired departure date (e.g., 18th)
        WebElement datePicker = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
        List<WebElement> dateElements = datePicker.findElements(By.tagName("a"));
        for (WebElement dateElement : dateElements) {
            if (dateElement.getText().equals("18")) {
                dateElement.click();
                break;
            }
        }

        // Capture the flight departure name and time
        WebElement departureNameElement = driver.findElement(By.xpath("//span[@class='fli-list-body-section']//p[@class='boldFont blackText airline-name']"));
        String departureName = departureNameElement.getText();

        WebElement departureTimeElement = driver.findElement(By.xpath("//span[@class='fli-list-body-section']//div[@class='time-section']"));
        String departureTime = departureTimeElement.getText();

        // Print the captured flight departure name and time
        System.out.println("Departure: " + departureName + " at " + departureTime);

        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.quit();
    }
}
