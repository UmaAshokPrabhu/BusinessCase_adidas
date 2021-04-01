package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDeliveryLocators {
	
	@FindBy(how=How.CSS,using="div.delivery-option___1BUx0:nth-child(2)")
	public WebElement fromCollectionPoint;
	
	@FindBy(how=How.CSS,using="#pickpoint-search-input")
	public WebElement location;
	
	@FindBy(how=How.CSS,using="button.gl-cta--primary:nth-child(2)")
	public WebElement searchCollectionPoint;
	
	
	@FindBy(how=How.CSS,using=".store-card--focused___1GIA0 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	public WebElement collectionpointAddress;
	
	@FindBy(how=How.CSS,using="button.gl-cta:nth-child(4)")
	public WebElement collectHereBtn;
	
	
	@FindBy(how=How.CSS,using="div.gl-flex-justify-content-between:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
	public WebElement collectionpointAddressConfirmation;
	
	

}
