package chapter_8_HandleDropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDowns {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		
		//Approach-1
		/*
		Select EmployementStatusdrp=new Select(driver.findElement(By.id("empsearch_employee_status")));
		EmployementStatusdrp.selectByVisibleText("Freelance");
		
		Select SubUnitdrp=new Select(driver.findElement(By.id("empsearch_sub_unit")));
		SubUnitdrp.selectByVisibleText("Engineering");
		
		Select JobTitledrp=new Select(driver.findElement(By.id("empsearch_job_title")));
		JobTitledrp.selectByVisibleText("Engineer");
		
		Select Includedrp=new Select(driver.findElement(By.id("empsearch_termination")));
		Includedrp.selectByVisibleText("Current Employees Only");
		*/
		
		//Approach-2
		WebElement EmployementStatusdrp=driver.findElement(By.id("empsearch_employee_status"));
		selectOptionFromDropDown(EmployementStatusdrp, "Freelance");
		
		WebElement SubUnitdrp=driver.findElement(By.id("empsearch_sub_unit"));
		selectOptionFromDropDown(SubUnitdrp, "Engineering");
		
		WebElement JobTitledrp=driver.findElement(By.id("empsearch_job_title"));
		selectOptionFromDropDown(JobTitledrp, "Engineer");
		
		WebElement Includedrp=driver.findElement(By.id("empsearch_termination"));
		selectOptionFromDropDown(Includedrp, "Current Employees Only");
		
		
	}

	public static void selectOptionFromDropDown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		
		List<WebElement> allOptions=drp.getOptions();
		for (WebElement option:allOptions) 
		{
			if (option.getText().equals(value)) 
			{
				option.click();
				break;
			}
			
		}
	}
	

}
