package Chapter_20_WebTable1;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1]How many rows in table
		
		int rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Total number of rows::"+rows);
		
		//2] How many columns in table
		
		int cols=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total number of rows::"+cols);
		
		//3] Retrieve the specific rows/column data
		String value=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).getText();
		System.out.println("The value is::"+value);
		
		//4]Retrieve all the data from the table 
		
		System.out.println("Data from table::");
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println("The value is::"+value);
			}
			
			System.out.println();	
		}
		
		//5] Print release
		
		for ( int r=2; r<=rows; r++)
		{
			String company=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td[1]")).getText();
			if (company.equals("Ernst Handel")) 
			{
				String contact=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td[2]")).getText();
				String country=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td[2]")).getText();
				
				System.out.println(company+" " +contact+" " +country);
				
			}
			
			
		}
		
		
	}

}
