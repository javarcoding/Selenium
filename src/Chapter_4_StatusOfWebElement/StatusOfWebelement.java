package Chapter_4_StatusOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebelement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed() isEnabled()
		WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		
		System.out.println("Display Status::"+searchbox.isDisplayed());  //true
		System.out.println("Enabled Status::"+searchbox.isEnabled());    //true
		
		//isSelected
		WebElement male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		
		System.out.println("No radio Button Selected::");
		  
		System.out.println("Selected Status::"+male.isSelected());    //false
		System.out.println("Selected Status::"+female.isSelected());  //false
		
		System.out.println("Select Male radio Button::");
		
		male.click();
		
		System.out.println("Selected Status::"+male.isSelected());    //true
		System.out.println("Selected Status::"+female.isSelected());  //false

		System.out.println("Select female radio Button::");
		
		female.click();
		
		System.out.println("Selected Status::"+male.isSelected());   //false
		System.out.println("Selected Status::"+female.isSelected()); //true
		
	}

}
