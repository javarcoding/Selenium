package Chapter_12_AutoSuggestedDropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDownp_BingSearch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"sa_drw\"]//span"));
		
		System.out.println("Size of AutoSuggestion::"+list.size());
		
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
