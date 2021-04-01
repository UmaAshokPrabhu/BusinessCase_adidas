package pages.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToBagPageLocators {
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/div[3]/section[1]/div[1]/div[1]")
	public WebElement SelectItemsizeText;
	
	
	
	@FindBy(how=How.CSS,using="button.gl-label:nth-child(1)")
	public WebElement SelectSize;
	
	@FindBy(how=How.CSS,using=".gl-cta--full-width")
	public WebElement AddToBag;
	
	@FindBy(how=How.CSS,using="h5.gl-heading")
	public WebElement AddToBagMessage;
	
	@FindBy(how=How.CSS,using="a.gl-cta:nth-child(8)")
	public WebElement ViewBagButton;
	
	

	
	@FindBy(how=How.XPATH,using="//header/div[*]/div[*]/h3")
	                             
	public WebElement YourBagTitle;
	
	@FindBy(how=How.CSS ,using=".cart-page__actions--aside___88R0p > div:nth-child(1) > button:nth-child(1)")
	public WebElement Checkoutbutton;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"modal-root\"]/div/div/div/div[2]/div/section/div[3]/div[1]")
	public WebElement itemNum;
	

}
