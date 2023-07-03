package com.acti.base;
import java.io.File;


/*
 * Name: DriverScript
 * Description: This class file manages all the driver instances
 * developed By :Shantosh
 * Date:6/16/2023
 * Approved By Sh
 * 
 */
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverScript {
	
	public static WebDriver driver;
	Properties prop;
	
	public DriverScript()
	{
		try
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			 prop = new Properties();
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("unable to load the properties file please check"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
     public void intiApplication()
     
     {
    	 
		 String  browserValue = prop.getProperty("browser");
		 if(browserValue.equalsIgnoreCase("chrome"))
		 {
			 System.out.println("browser in use : "+browserValue);
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if(browserValue.equalsIgnoreCase("edge"))
		 {
			 System.out.println("browser in use : "+browserValue);
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver(); 
		 }
		 else if(browserValue.equalsIgnoreCase("firefox"))
		 {
	      System.out.println("browser in use : "+browserValue);
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 }
		 else
		 {
			 System.err.println(browserValue+  ":is not a support browser please check the config file");
		 }
			 
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     launchApplication();
     quitDriver();
     
     }
     
     public void launchApplication() {
     
     String url =prop.getProperty("url");
     driver.get(url);
}
public static void quitDriver()
{
	driver.close();
     
}
}
