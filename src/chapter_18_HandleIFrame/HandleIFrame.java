package chapter_18_HandleIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//1 st frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[@href=\"org/openqa/selenium/package-frame.html\"]"));
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//2 nd frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[@class=\"interfaceName\"]"));
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//3 rd frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[@href=\"index-all.html\"]"));
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
