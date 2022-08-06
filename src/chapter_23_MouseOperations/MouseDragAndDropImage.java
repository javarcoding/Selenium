package chapter_23_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
		WebElement Item1=driver.findElement(By.xpath("//ul[@id=\"gallary\"]/li[1]"));
		WebElement Item2=driver.findElement(By.xpath("//ul[@id=\"gallary\"]/li[2]"));
		
		WebElement trash=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		//Moved both items into trash
		Actions act=new Actions(driver);
		
		act.dragAndDrop(Item1, trash).perform();
		act.dragAndDrop(Item2, trash).perform();
		
	}

}
