package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.page.EnterPage;
import com.acti.page.LoginPage;

public class BaseTest extends DriverScript {
	
	LoginPage lp;
	EnterPage ep;
	
	@BeforeMethod
	public void setUp() {
		intiApplication();
		lp = new LoginPage();
		ep = new EnterPage();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
