package chapter_27_OpenLinkInNewTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id=\"age\"]"));
		
		String tooltiptext=inputbox.getAttribute("title");
		
		System.out.println(tooltiptext);
	}

}
