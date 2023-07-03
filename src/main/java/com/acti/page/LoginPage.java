package com.acti.page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;
//***********************age E3e0ents***************************//
public class LoginPage  extends DriverScript{
	
	
	@FindBy(id="username") WebElement usernameTextbox;
	@FindBy(name ="pwd") WebElement passwordTextbox;
	@FindBy(xpath ="//div[text()='Login ']") WebElement loginButton;
	@FindBy(linkText= "Forgot your password?")WebElement forgotPasswordLink;
	
	//***********************Page Elements Initialization*************************//
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//****************************Page Elements Actions**************************//
     public String loginPageTitle()
     {
    	 return driver.getTitle();
    	 
     }
	public boolean forgotPasswordLink()
	{
		return forgotPasswordLink.isDisplayed();
	}
	
	
	public void enterUsername(String username)
	{
		usernameTextbox.clear();
		usernameTextbox.sendKeys(username);
		
	}
	 public void enterPassword(String password)
	 {
		 passwordTextbox.sendKeys(password);
		 
	 }
	 public void clickLoginButton() 
		 
		 {
	loginButton.click();
	

}
}
