package Chapter_6_FindElementVsFindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//findElement()  --> Return single webElement
		
		//1]
		WebElement searchBox=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		searchBox.sendKeys("xyz");
		
		//2] When we are using the locator which is finding multiple elements then findElement() method returns single webElement which is the first element
		WebElement ele=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
		System.out.println(ele.getText());
		
		//3]When Element is not present on WebPage then it throw NoSuchElementException
		//driver.findElement(By.xpath("//button[@type=\"login\"]"));
		
		
		//FindElements  --> Returns the multiples
		
		//1](Multiple WebElement)
		List<WebElement> links=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
		System.out.println("Number of WebElements captured::"+links.size());
		
		for (WebElement ele1:links)
		{
			System.out.println(ele1.getText());
			
		}
		//2] (Single WebElement )
		List<WebElement>logo=driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Number of WebElement Capture::"+logo.size());		

		//3] When Element is not present on WebPage than it returns 0
		List<WebElement> elements=driver.findElements(By.xpath("//img[contains(title, 'Electronic')]"));
		System.out.println("Number of WebElements Capture::"+elements.size());		

		
		driver.close();
		
		
		
	}

}
