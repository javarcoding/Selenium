package chapter_22_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		String year="2022";
		String month="feb";
		String date ="10";
		
		driver.findElement(By.id("onward_cal")).click();
		
		while (true)
		{
			String monthyear=driver.findElement(By.xpath("//*[@class=\"monthTitle\"]")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) 
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@class=\"next\"]")).click();
			}
			
		}
		
		//Date Selection
	
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]/tbody/tr/td"));
		
		for (WebElement ele:alldates)
		{
			String dt=ele.getText();
			if (dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
	}

}
