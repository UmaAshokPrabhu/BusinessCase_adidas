package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.SeleniumDriver;

public class RunningProductSearchLocators {
	@FindBy(how=How.NAME,using="q")
	public WebElement Searchtextbox;
	
	@FindBy(how=How.CLASS_NAME,using="grid-item___3rAkS")                          	
						
	public WebElement FirstSearchItem;
	
	
	@FindBy(how=How.ID,using="specifications")                          	
	
	public WebElement FirstSearchItemDetails;
	
   @FindBy(how=How.XPATH,using="//*[@id=\"navigation-target-specifications\"]/div/div/ul[2]")     
   	
	public WebElement ProductID1;
   
   
   @FindBy(how=How.XPATH,using="//*[@id=\\\"navigation-target-specifications\\\"]/div/div/ul[2]/li")     
  	
  	public WebElement ProductID;

   
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[2]/div/div/button")
	public WebElement CloseButton;
	
	@FindBy(how=How.NAME,using="//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/h1/span")
	public WebElement SearchItemName;
	
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/button[1]")
	public WebElement AcceptTrackingButton;
	
	@FindBy(how=How.CSS,using="label.gl-radio-input__option:nth-child(2) > span:nth-child(2)")
	public WebElement GBradiobtn;
	
	@FindBy(how=How.CSS,using="button.gl-cta:nth-child(2)")
	public WebElement Gobtn;
	

}
