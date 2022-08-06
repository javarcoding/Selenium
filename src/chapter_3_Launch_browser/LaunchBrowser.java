package chapter_3_Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.geko.driver", "C://Users/adsul/Drivers/gekodriver/gekodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//Edge
		//System.setProperty("webdriver.edgee.driver", "C://Users/adsul/Drivers/gdgedriver/edgedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		System.out.println("Title of the webPage::"+driver.getTitle());
		System.out.println("Current URL of the webPage::"+driver.getCurrentUrl());
		//System.out.println("WebPage Source::"+driver.getPageSource());
		
		driver.close();
		
		

	}

}
