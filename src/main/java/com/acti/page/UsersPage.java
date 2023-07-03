
package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;
import com.acti.utils.Helper;

public class UsersPage extends DriverScript {

// *************************************** Page Elements *********************************************//

	@FindBy(xpath = "//div[text()='Add New']") WebElement addNewButton;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]") WebElement custNameTextBox;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement custDescTextArea;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCustomerButton;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement successMsg;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']" )
	WebElement buttonAction;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']")
	WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;
	

// *************************************** Page Elements Initialization ******************************//

	public UsersPage() 
	{
		PageFactory.initElements(driver, this);
	}

// *************************************** Page Elements Actions *************************************//
	
	public void clickDeletePermanently()
	{
		buttonDeletePermanently.click();
		Helper.sleep();
	}
	
	public void clickDelete()
	{
		buttonDelete.click();
	}
	
	public void clickAction()
	{
		buttonAction.click();
		Helper.sleep();
	}
	
	public void clickEditButton()
	{
		buttonEdit.click();
		Helper.sleep();
	}
	
	public void clickSearchedCustomer()
	{
		searchedCustomer.click();
	}
	
	public void searchCreatedCustomer(String customername) 
	{
		textboxStartTyping.sendKeys(customername);
	}
	
	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickNewCustomerOption()
	{
		newCustomerOption.click();
		Helper.sleep();
	}
	
	public void enterCustomerName(String custName)
	{
		custNameTextBox.sendKeys(custName);
	}
	
	public void enterCustomerDescription(String custDesc)
	{
		custDescTextArea.sendKeys(custDesc);
	}
	
	public void clickCreateCustomerButton()
	{
		createCustomerButton.click();
	}
	
	public String getSuccessMessage()
	{
		return successMsg.getText();
	}

}
