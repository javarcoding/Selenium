package chapter_18_HandleIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");  //switch to outer iframe
		driver.switchTo().frame(0);
		
		System.out.println("Text present inside the inner frame"+driver.findElement(By.xpath("//h1")).getText());
		driver.switchTo().parentFrame();    //go to parent frame/outer frame
		
		WebElement text=driver.findElement(By.xpath("//p[contains(text(), 'You can use the height and width attributes to spe')]"));
		System.out.println("Text present in outer frame:"+ text);
		
	}

}
