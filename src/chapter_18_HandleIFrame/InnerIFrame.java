package chapter_18_HandleIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()=\"Iframe with in an Iframe\"]")).click();
		
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);  //here we are passign frame as a WebElement
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/frame"));
		driver.switchTo().frame(innerframe);  
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
		
		
	}

}
