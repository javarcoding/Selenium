package chapter_23_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dhtmlgoodies.com/sripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(rome, italy).build().perform();   //drag and drop
		
		
	}

}
