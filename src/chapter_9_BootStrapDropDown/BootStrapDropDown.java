package chapter_9_BootStrapDropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfc.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@version=\"1.0\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]"));
		
		List<WebElement> producttype=driver.findElements(By.xpath("ul[@class=\"dropdown1 dropdown-menu\"]/li"));
		System.out.println(producttype.size());
		
		for (WebElement ptype:producttype) 
		{
			if(ptype.getText().equals("Account")) 
			{
				ptype.click();
				break;
			}
		}
		

	}

}
