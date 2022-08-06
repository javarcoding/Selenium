package chapter_22_DatePicker;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_DropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.findElement(By.id("dob")).click();   //open the date picker
		
		//Month & Year Select
		WebElement monthele=driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		Select month_drp=new Select(monthele);
		month_drp.selectByVisibleText("Oct");
		
		WebElement yearele=driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select year_drp=new Select(yearele);
		year_drp.selectByVisibleText("1997");
		
		//Date Selection
		
		String date="10";
		
		List<WebElement> alldate=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calender\"]//td"));
		for (WebElement ele:alldate) 
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
