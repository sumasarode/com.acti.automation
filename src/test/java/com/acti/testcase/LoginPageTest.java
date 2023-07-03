package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	
	@Test
	
	public void testLoginFunction() 
	{
		lp.enterUsername("admin");
		lp.enterPassword("manger");
		lp.clickLoginButton();
		String user =ep.getUserLoggedInfo();
		System.out.println(user);
		Assert.assertTrue(user.contains("Jhon"));
		ep.clickLogout();
	}
    @Test
 
    public void testForgotPasswordLinkIsDisplayed()
    {
    	boolean flag = lp.forgotPasswordLink();
    	Assert.assertTrue(flag);
    }
    @Test
  
    public void testLoginPageTitle()
    {
    	String title=lp.loginPageTitle();
    	Assert.assertTrue(title.contains(title));
    }
}
