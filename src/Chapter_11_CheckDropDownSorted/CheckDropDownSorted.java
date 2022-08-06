package Chapter_11_CheckDropDownSorted;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.twoplugs.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpSelect=new Select(drpElement);
		List<WebElement> options=drpSelect.getOptions();
		
		ArrayList originalList=new ArrayList<>();
		ArrayList tempList=new ArrayList();
		
		for (WebElement option:options)
		{
			originalList.add(option.getText());
			tempList.add(option.getText());	
		}
		
		System.out.println("Original List::"+originalList);
		System.out.println("Temp List::"+tempList);
		
		Collections.sort(tempList);   //sorted
		

		System.out.println("Original List::"+originalList);
		System.out.println("Temp List after sorting::"+tempList);
		
		if (originalList.equals(tempList))
		{
			System.out.println("DropDown Sorted ...");
		}
		else
		{
			System.out.println("DropDown Unsorted...");
		}
		
		
	}

}
