package Chapter_5_Navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//***Get Method***
		//driver.get("https://www.snapdeal.com");
		//driver.get("https://www.amazon.com");
		
		//***Navigations Method***
		driver.navigate().to("https://www.snapdeal.com");
		driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().back();     //snapdeal
		driver.navigate().forward();  //amazon
		driver.navigate().refresh();  //refresh/reload the webPage
		
	}

}
