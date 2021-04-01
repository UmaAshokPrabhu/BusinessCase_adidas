package pages.Actions;

import org.openqa.selenium.support.PageFactory;

//import pages.Locators.AddToBagPageLocators;
import pages.Locators.ProductDeliveryLocators;
import utils.SeleniumDriver;

public class ProductDeliveryActions {
	
	ProductDeliveryLocators  productDeliveryLocators=null;
	
	
	
	public ProductDeliveryActions()
	{
		
		this.productDeliveryLocators=new ProductDeliveryLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), productDeliveryLocators);
	}
	
	
	public void fromCollectionPointClick() {
		productDeliveryLocators.fromCollectionPoint.click();
	}
	
	public void enterSearchLoc(String loc) {
		
		productDeliveryLocators.location.sendKeys(loc);
		
	}
	
     public void searchCollectionPoints() {
    	 SeleniumDriver.waitForPageToLoad();
		productDeliveryLocators.searchCollectionPoint.click();
		
	   }
     
     public String pickCollectionPoints() {
 		
 		String collectionAddress=productDeliveryLocators.collectionpointAddress.getText();
 		return collectionAddress;
 		
 	   }
	
	  public void collectHereBtn() {
		  
		  productDeliveryLocators.collectHereBtn.click();
		  
	  }
	  
 public String collectionAdresConf() {
		  
		 String collectionAddressConfirmation= productDeliveryLocators.collectionpointAddressConfirmation.getText();
		 return collectionAddressConfirmation;
		  
	  }
	
	

}
