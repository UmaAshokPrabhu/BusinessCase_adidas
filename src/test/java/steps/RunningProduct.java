package steps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Actions.AddToBagPageActions;
import pages.Actions.RunningProductSearchPageActions;
import utils.SeleniumDriver;


public class RunningProduct {
	
	RunningProductSearchPageActions runningProductSearchPageActions = new RunningProductSearchPageActions();
	AddToBagPageActions addToBagPageActions = new AddToBagPageActions();
	
	
	@Given("^Open  \"([^\"]*)\" url in the browser$")
	public void open_url_in_the_browser(String Url) throws Throwable {
		 SeleniumDriver.openPage(Url);
		 
	   
	   
	}
	
	@And("^user click UK Location button$")
	public void user_click_UK_Location_button() throws Throwable {
		runningProductSearchPageActions.locationcloseClick();
	    
	}

	@And("^user click Accept Tracking button$")
	public void user_click_Accept_Tracking_button() throws Throwable {
		runningProductSearchPageActions.trackingButtonClick();
	    
	}
	
	

	@When("^Enter \"([^\"]*)\" in the search textbox$")
	public void enter_in_the_search_textbox(String searchItem) throws Throwable {
		runningProductSearchPageActions.enterSearchText(searchItem);
	  
	}
	
	@And("^click First product item$")
	public void click_First_product_item() throws Throwable {
		runningProductSearchPageActions.selectFirstItem();
	    
	}
	
	@And("^User click close button$")
	public void user_click_close_button() throws Throwable {
		runningProductSearchPageActions.closeButton();
	    
	}

	
	

	@Then("^Verify the correct product url \"([^\"]*)\"$")
	public void verify_the_correct_product_url(String arg1) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		 String ActualPageURL= SeleniumDriver.getDriver().getCurrentUrl();
		 String productNum=runningProductSearchPageActions.productID();
		 System.out.println("ProductID-->" +productNum);
		 
		 
		
		
		System.out.println("Length" +productNum.length() ); 
		
		String newProductID=productNum.substring(14, 20);
		System.out.println("ProductID --->" +newProductID);
		System.out.println("Actual page URL-->"+ActualPageURL);
		
		Boolean correctProductPage=ActualPageURL.contains(newProductID);
		
		Assert.assertTrue(correctProductPage,"Correct ProductPage");
		
		/*
		 if (ActualPageURL.contains(newProductID)) {
			 System.out.println("Actual page URL-->"+ActualPageURL);
			 System.out.println("ProductID-->"+newProductID);
			 
			 
			 
		 }
		 else {
			 System.out.println("Incorrect pageProductID--> "+productNum);
			 System.out.println("Actual page URL-->"+ActualPageURL);
		 }*/
		 }
		 
	
	
	
	@When("^User select any size$")
	public void user_select_any_size() throws Throwable {
		
		addToBagPageActions.selectSize();
	}

	@And("^User click \"([^\"]*)\" button$")
	public void user_click_button(String arg1) throws Throwable {
		
		SeleniumDriver.waitForPageToLoad();
		addToBagPageActions.addToBag();
	   
	}

	@And("^check the product is added successfully to the bag message \"([^\"]*)\"$")
	public void check_the_product_is_added_successfully_to_the_bag_message(String message) throws Throwable {
		String ActualBagItemMessage=addToBagPageActions.addToBagItemMessage();
		Assert.assertEquals(ActualBagItemMessage, message);
	}
	
	@And("^verify \"([^\"]*)\" item added to the bag$")
	public void verify_item_added_to_the_bag(int noOfItems) throws Throwable {
	    String actualitem=addToBagPageActions.noOfItemsInBag();
	    System.out.println("Actual number of item--->" + actualitem);
	    
       System.out.println("Length-->" +actualitem.length() ); 
		
		String ItemNum=actualitem.substring(0, 1);
		 System.out.println("first char-->" +ItemNum ); 
	int newItemNum =Integer.parseInt(ItemNum);
		System.out.println("ItemNum-->" +newItemNum); 
	    
	   Assert.assertEquals(newItemNum, noOfItems, "One Item  added");
		
	}

	@And("^Click \"([^\"]*)\" button$")
	public void click_button(String arg1) throws Throwable {
		addToBagPageActions.viewBagButtonClick();
	    
	}

	@Then("^Verify the Cart page title \"([^\"]*)\" is displayed$")
	public void verify_the_Cart_page_title_is_displayed(String text) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String ActualPagetitle=addToBagPageActions.cartPageTitle();
		System.out.println("Your Bag title -->"+ActualPagetitle);
		Assert.assertEquals(ActualPagetitle, text);
	}

	
	@Then("^Click on checkout button$")
	public void click_on_checkout_button() throws Throwable {
		addToBagPageActions.checkoutButtonClick(); 
	}

	@Then("^verify you're on the delivery page by page url \"([^\"]*)\"$")
	public void verify_you_re_on_the_delivery_page_by_page_url(String deliveryurl) throws Throwable {
		
				 String ActualDeliveryPageURL= SeleniumDriver.getDriver().getCurrentUrl();
				 System.out.println("Actual page URL-->"+ActualDeliveryPageURL);
				    System.out.println("Expected page URL-->"+deliveryurl);
				   Assert.assertEquals(ActualDeliveryPageURL, deliveryurl);
	}





	
	
	
	
	
	
	
	
	
	
	
	
}
	