package Chapter_14_HandleCheckBox;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1] Select specific checkbox
		//driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
		
		//2] select all the checkboxes
		List<WebElement> chckboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
		
		System.out.println("Total No. of checkboxes::"+chckboxes.size());
		
		//using for loop
		/*
		for (int i=0;i<=chckboxes.size(); i++) 
		{
			chckboxes.get(i).click();
		}
		
		//using for-each loop
		for (WebElement chbox:chckboxes) 
		{
			chbox.click();
		}
		
		//3] Select Multiple checkboxes by choice
		//Monday and Sunday
		
		for (WebElement chbox:chckboxes)
		{
			String checkboxname=chbox.getAttribute("id");
			if (checkboxname.equals("Monday")||checkboxname.equals("Sunday"))
			{
				chbox.click();
			}
		}
		*/
		//4)Select Last 2 Check Boxes
		
		//First count howmany checkboxes are there
		//formula= total checkboxes - how many check boxes u want to select or (last number of elements)
		//5=7-2
		
		int totalCheckboxes=chckboxes.size();
		/*
		for (int i=totalCheckboxes-2; i<=totalCheckboxes; i++) 
		{
			chckboxes.get(i).click();
			
		}
		*/
		//4] Select fast 3 checkBoxes
		for (int i=0; i<=totalCheckboxes; i++)
		{
			if (i<3) 
			{
				chckboxes.get(i).click();
			}
			
		}
	}

}
