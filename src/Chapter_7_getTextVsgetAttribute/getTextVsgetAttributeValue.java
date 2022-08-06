package Chapter_7_getTextVsgetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement emailInputBox=driver.findElement(By.xpath("//input[@class=\"email\"]"));
		
		//clear text from input BOx
		emailInputBox.clear();
		emailInputBox.sendKeys("adm1123@gmail.com");
		
		//capture text from input Box
		System.out.println("Input Box");
		System.out.println("Result from getAttribute Method::"+emailInputBox.getAttribute("value"));
		System.out.println("REsult from getText Method::"+emailInputBox.getText());
		
		//Login Button
		System.out.println("Input Box");
		WebElement button=driver.findElement(By.xpath("//button[@class= \"button-1 login-button\"]"));
		
		System.out.println("Result from getAttribute Method::"+button.getAttribute("type"));
		System.out.println("Result from getAttribute Method::"+button.getAttribute("class"));
		
		System.out.println("Result form getText() Method::"+button.getText());
		
		WebElement e=driver.findElement(By.xpath("//*[@class=\"page-title\"]//h1"));
		System.out.println("Result form getText() Method::"+e.getText());
		
	}

}
