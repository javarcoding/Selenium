package chapter_17_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//Alert Window with OK Button
		/*
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		//Alert window with OK and Cancel Button
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();   //Close the alert using OK button
		
		driver.switchTo().alert().dismiss();  //Close the alert using Cancel button
		
		*/
		//Alert window with input box, capture text from Alert
		
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println("The massage displayed on the alert::"+alt.getText());
		alt.sendKeys("Welcome");
		Thread.sleep(3000);
		alt.accept();
		
	}

}
