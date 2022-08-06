package chapter_29_HandlingCookes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//How to capture cookies from the browser?
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies"+cookies.size());
		
		//How to print cookies from browser?
		for (Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
			
		}
		
		//How to add Cookie to the browser?
		Cookie cookieobj=new Cookie("MyCookies123", "123456");
		driver.manage().addCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after adding:"+cookies.size());//4
		
		//How to delete specific cookies from the browser?
		driver.manage().deleteCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after deletion:"+cookies.size());//3
		
		
		//How to delete all cookies from the browser?
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after adding:"+cookies.size());//0
		
		
	}

}
