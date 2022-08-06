package chapter_24_ActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement feature=driver.findElement(By.xpath("//a[@title=\"Women\"]"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(feature).perform();
		
		Action action=act.moveToElement(feature).build();
		action.perform();
		
	}

}
