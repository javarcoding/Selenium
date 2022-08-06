package chapter_10_JQueryDropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJQueryDropDown {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.Jqueryscript.net/demo/Drop-Drop-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoiceValues(driver, "choice 1");
		
		//selectChoiceValues(driver, "choice 1", "choice 2", "choice 2 1");
		
		//selectChoiceValues(driver, "all");
		
	}

	private static void selectChoiceValues(WebDriver driver, String... value) 
	{
		List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class=\"comboTreeTitle\"]"));
		
		if (!value[0].equalsIgnoreCase("all")) 
		{
			for (WebElement item:choiceList) 
			{
				String text=item.getText();
				
				for (String val:value) 
				{
					if (text.equals(val)) 
					{
						item.click();
						break;
					}
				}
			}
		}
		else 
		{
			try 
			{
				for (WebElement item:choiceList) 
				{
					item.click();
				}
			} 
			catch (Exception e) 
			{
		       
			}
		}
		driver.close();
	}

}
