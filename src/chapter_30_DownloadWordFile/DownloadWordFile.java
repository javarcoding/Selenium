package chapter_30_DownloadWordFile;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) 
	{	
		String locations=System.getProperty("user.dir")+"\\download\\";
		/*
		//chrome
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", locations);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		//Edge
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", locations);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		
		 */
		
		
		
		
	}
	

}
