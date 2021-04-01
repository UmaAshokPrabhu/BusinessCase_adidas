package steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Actions.ProductDeliveryActions;

public class DeliverySteps {
	
	ProductDeliveryActions   productDeliveryActions =new ProductDeliveryActions();
	
	
	@When("^user click From a collection point$")
	public void user_click_From_a_collection_point() throws Throwable {
		productDeliveryActions.fromCollectionPointClick();
	   
	}

	@And("^user type \"([^\"]*)\" in the location textbox$")
	public void user_type_in_the_location_textbox(String loc) throws Throwable {
		productDeliveryActions.enterSearchLoc(loc);
	}

	@And("^user click \"([^\"]*)\" button$")
	public void user_click_button(String arg1) throws Throwable {
		productDeliveryActions.searchCollectionPoints();
	   
	}

	@And("^From list user pick any collection point$")
	public void from_list_user_pick_any_collection_point() throws Throwable {
		productDeliveryActions.collectHereBtn();
	    
	}

	@Then("^correct collection point is selected$")
	public void correct_collection_point_is_selected() throws Throwable {
		String ActualCollectAdd1=productDeliveryActions.pickCollectionPoints();
		String ActualCollectAdd2=productDeliveryActions.collectionAdresConf();
		System.out.println(ActualCollectAdd1);
		System.out.println(ActualCollectAdd2);
		Assert.assertEquals(ActualCollectAdd1, ActualCollectAdd2, "True");
		
	    
	}


}
