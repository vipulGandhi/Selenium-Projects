/*
 In Irctc site, Search for trains from Bangalore to Mysore
Click on the element “Check Availability” button for  train named “Tipu sultan express”
 */

package GetTrainAvailability;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTrainAvailability
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		By fromStationBy = By.xpath("//p-autocomplete[@id='origin']");
		driver.findElement(fromStationBy).click();
		
		By fromStationInputBoxBy = By.xpath("(//input[@role='searchbox'])[1]");
		driver.findElement(fromStationInputBoxBy).sendKeys("bengaluru");
		
		By bangaluruStation = By.xpath("//span[text()='KSR BENGALURU - SBC']");
		
		wait.until(ExpectedConditions.elementToBeClickable(bangaluruStation));
		
		driver.findElement(bangaluruStation).click();
		
		By destinationStationBy = By.xpath("//p-autocomplete[@id='destination']");
		driver.findElement(destinationStationBy).click();
		
		By destinationStationInputBoxBy = By.xpath("(//input[@role='searchbox'])[2]");
		driver.findElement(destinationStationInputBoxBy).sendKeys("mysuru");
		
		By mysuruStation = By.xpath("//span[text()='MYSURU JN - MYS']");
		wait.until(ExpectedConditions.elementToBeClickable(mysuruStation));
		driver.findElement(mysuruStation).click();
		
		By searchButtonBy = By.xpath("//button[text()='Search']");
		driver.findElement(searchButtonBy).click();
		
		By mysoreExpressSleeperSeatsBy = By.xpath("((//strong[text()=' MYSURU EXPRESS (16231)']/../../following-sibling::div)[4]/div)[1]"
											+ "//strong[text()='Sleeper (SL)']/../following-sibling::div");
		wait.until(ExpectedConditions.elementToBeClickable(mysoreExpressSleeperSeatsBy));
		
		driver.findElement(mysoreExpressSleeperSeatsBy).click();
	}
}
