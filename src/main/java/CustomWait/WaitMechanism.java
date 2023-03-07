package CustomWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMechanism
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		float pollingTime = 0.5f;
		int waitDution = 10;
		float timeSpent = 0f;
		
		WebElement webElement = null;
		
		while (timeSpent < waitDution)
		{
			try
			{
				webElement = driver.findElement(null);
				break;
			}
			catch (Exception e)
			{

					try {
						Thread.sleep((long) pollingTime);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

			}
			timeSpent ++;
		}
		
		if (webElement == null)
		{
			try {
				throw new Exception("NoElementFound");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}

// Find the element
// if the element is not found, wait for polling time

// polling 
