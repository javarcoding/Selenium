package Chapter_28_JavascriptExecutorDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) 
	{/*
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//Syntax
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executescript(script, args);
		
		//flash:- 
		WebElement logo1=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		JavaScriptUntil.flash(logo, driver);
		
		//Drawing border & take screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		JavaScriptUntil.flash(logo, driver);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//screenshot/logo.png");
		FileUtils.copyfile(src, trg);
		
		//Getting title of the page
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		//Click Action
		WebElement reglink=driver.findElement(By.xpath("//a[@normalize-space()=\"Register\"]"));
		JavaScriptUntil.flash(reglink, driver);
		
		//Generate Alert
		//JavaScriptUtil.generateAlert(driver, "This is my Alert...");
		
		//Refreshing the page
		JavaScriptUntil.refreshBorderByJS(driver);
		
		//Scrolling down page
		JavaScriptUntil.scrollPageDown(driver);
		
		//Scroll up page
		JavaScriptUntil.scrollPageUp(driver);
		
		//zoom page
		JavaScriptUntil.zoomPageByJS(driver);
		
		*/
	}

}
