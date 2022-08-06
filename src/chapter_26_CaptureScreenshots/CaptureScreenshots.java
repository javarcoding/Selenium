package chapter_26_CaptureScreenshots;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//FullPage Screenshot
		/*
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepage.png");
		FileUtils.copyfile(src, trg);
		
		//Screenshot of section/portion of the page
		
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepage.png");
		FileUtils.copyfile(src, trg);
		
		//Screenshot of section/portion of the page
	
		WebElement ele=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\homepage.png");
		FileUtils.copyfile(src, trg);
		
		*/
		
	}

}
