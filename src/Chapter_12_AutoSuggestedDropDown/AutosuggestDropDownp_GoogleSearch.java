package Chapter_12_AutoSuggestedDropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDownp_GoogleSearch
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//li"));
		System.out.println("AutoSuggested Size::"+list.size());
		
		for (WebElement listItem:list)
		{
			if (listItem.getText().contains("download"))
			{
				listItem.click();
				break;
			}
			
		}
	}

}
