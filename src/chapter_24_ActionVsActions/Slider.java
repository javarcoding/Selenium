package chapter_24_ActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("Location of min slider:"+min_slider.getLocation());  //(59, 251)
		System.out.println("Height and Width of the element:"+min_slider.getSize()); //(22, 21)
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();

		System.out.println("Location of min slider:"+min_slider.getLocation());  //(59, 251)
		System.out.println("Height and Width of the element:"+min_slider.getSize()); //(22, 21)
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -100, 0).perform();
		
		
	}

}
