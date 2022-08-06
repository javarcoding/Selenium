package Chapter_15_HandleBrowserWindows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		//1] getwindowHandle()
		
		String WindowID=driver.getWindowHandle();   //return ID of single browser window
		
		System.out.println(WindowID);    //CDwindow-291CF7681BB03A635F45BD15A084F061

		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click(); //Open another browser window =child window
	
		//2] getWindowHandles()
		
		Set<String> WindowIDs=driver.getWindowHandles();  //return ID's of multiple browser windows
		
		//First Method- Iterator()  //This method is used to retrive the ID from windowIDs
		/*
		Iterator<String> it=WindowIDs.iterator();
		
		String parentWindowID=it.next();
		String childWindowID=it.next();
		
		System.out.println("Parent Window ID::"+parentWindowID);
		System.out.println("Child Window ID::"+childWindowID);
		*/
		//Second Method -Using List/ ArrayList
		
		List<String> WindowIDsList=new ArrayList(WindowIDs);  //convert Set --> List
		

		String parentWindowID=WindowIDsList.get(0);  //Parent window ID
		String childWindowID=WindowIDsList.get(1);   //child Window ID
		
		System.out.println("Parent Window ID::"+parentWindowID);
		System.out.println("Child Window ID::"+childWindowID);
		
		//How to use windows ID's for Switching
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title"+driver.getTitle());
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title"+driver.getTitle());
		
	
		
	}
	

}
