package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterPage extends DriverScript {
	
// *************************************** Page Elements *********************************************//
	
	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement userloggedIn;
	@FindBy(id = "logoutLink") WebElement logoutLink;
	@FindBy(xpath = "//a[@class='content tasks']") WebElement taskMenu;
	
// *************************************** Page Elements Initialization ******************************//
	
	public EnterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
// *************************************** Page Elements Actions *************************************//
	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}
	
	public String getUserLoggedInfo()
	{
		return userloggedIn.getText();
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}

}
