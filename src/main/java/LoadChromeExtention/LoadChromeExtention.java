package LoadChromeExtention;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadChromeExtention
{
	public static void main(String[] args)
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addExtensions(new File(System.getProperty("user.dir") + "/resources/SampleChromeExtentions/extension_0_8_3_0.crx"));
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.google.co.in/");
		
	}
}
