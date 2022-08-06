package chapter_23_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3school.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		field1.clear();
		field1.sendKeys("Welcome to Selenium");
		
		WebElement button=driver.findElement(By.xpath("//button[@onblclick=\"myFunction()\"]"));
		
		
		//Double Click action
		
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		
		
	}

}
