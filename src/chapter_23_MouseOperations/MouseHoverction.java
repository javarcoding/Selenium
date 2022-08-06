package chapter_23_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demo.opencart.com");
		driver.manage().window().maximize();
		
		WebElement desktopMenu=driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
		WebElement MacMenuItem=driver.findElement(By.xpath("//a[text()=\"Mac(1)\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktopMenu).moveToElement(MacMenuItem).click().perform();
		
	}

}
