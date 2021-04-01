package pages.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import pages.Locators.RunningProductSearchLocators;
import utils.SeleniumDriver;

public class RunningProductSearchPageActions {
	
	RunningProductSearchLocators  runningProductSearchLocators=null;
	
	public RunningProductSearchPageActions()
	{
		
		this.runningProductSearchLocators=new RunningProductSearchLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), runningProductSearchLocators);
	}
	
	
	public void locationcloseClick() {
		//runningProductSearchLocators.LocCloseButton.click();
		SeleniumDriver.waitForPageToLoad();
		runningProductSearchLocators.GBradiobtn.click();
		SeleniumDriver.waitForPageToLoad();
		//runningProductSearchLocators.Gobtn.sendKeys(Keys.ENTER);
		
		Actions actions=new Actions(SeleniumDriver.getDriver());
		actions.doubleClick(runningProductSearchLocators.Gobtn).perform();
		
	}
	
	public void trackingButtonClick() {
		runningProductSearchLocators.AcceptTrackingButton.click();
		
	}
	

	public void enterSearchText(String searchItem) {
		
		runningProductSearchLocators.Searchtextbox.sendKeys(searchItem);
		runningProductSearchLocators.Searchtextbox.sendKeys(Keys.ENTER);
		
		
	}
	
	public void selectFirstItem() throws InterruptedException {
		
		
		
		SeleniumDriver.waitForPageToLoad();
		
		 runningProductSearchLocators.FirstSearchItem.click();
		
	}
	
	
	public String productID() throws InterruptedException {
		String pIDName="Product code: ";
		String pnameid=null;
		runningProductSearchLocators.FirstSearchItemDetails.click();
		
		SeleniumDriver.waitForPageToLoad();
		
		
		
		List<WebElement> ele=SeleniumDriver.getDriver().findElements(By.xpath("//*[@id=\"navigation-target-specifications\"]/div/div/ul[2]/li"));
		System.out.println("num of list items"+  ele.size());
		
		
				for(WebElement pID: ele) {
				  pnameid=pID.getText();
				  System.out.println("ProductDetails-->"+ pnameid);
				  
					 if(pnameid.contains(pIDName)) 
					 {
						 System.out.println("ProductID--> "+ pnameid); 
						 return pnameid;
					 }	    
								
				}
				
				return pnameid;
				
		
		
	}
	
	
	
	
	public void closeButton() throws InterruptedException {
		
		
		
		 runningProductSearchLocators.CloseButton.click();
		
	}
	
	
	
}
