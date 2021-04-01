package pages.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Locators.AddToBagPageLocators;
import pages.Locators.RunningProductSearchLocators;
import utils.SeleniumDriver;

public class AddToBagPageActions {
	
	AddToBagPageLocators  addToBagPageLocators=null;
	
	
	
	public AddToBagPageActions()
	{
		
		this.addToBagPageLocators=new AddToBagPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), addToBagPageLocators);
	}
	
	
	
	
	
	public void selectSize() {
		addToBagPageLocators.SelectSize.click();
	
	}
	
	
	public void addToBag() {
		addToBagPageLocators.AddToBag.click();
	
	}
	
	public String addToBagItemMessage() throws InterruptedException {
		
		SeleniumDriver.waitForPageToLoad();
		String addToBagMessage= addToBagPageLocators.AddToBagMessage.getText();
	    return addToBagMessage;
	}
	
	public String noOfItemsInBag() throws InterruptedException {
		
		SeleniumDriver.waitForPageToLoad();
		String actualNoOfItem= addToBagPageLocators.itemNum.getText();
		//int itemno=Integer.parseInt(actualNoOfItem);
	    return  actualNoOfItem;
	}
	
	public void viewBagButtonClick() {
		addToBagPageLocators.ViewBagButton.click();
	
	}
	
	public String cartPageTitle() throws InterruptedException {
		
		
		SeleniumDriver.waitForPageToLoad();
		String cartPage=addToBagPageLocators.YourBagTitle.getText();
	    return cartPage;
	}
	
	
	public void checkoutButtonClick() throws InterruptedException {
		SeleniumDriver.waitForPageToLoad();
		addToBagPageLocators.Checkoutbutton.click();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
