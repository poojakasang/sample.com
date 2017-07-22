package stepdef;

import cucumber.api.java.en.Then;
import pageObject.MultipleWindows;

public class MultipleWindowsStefdef {
	
	MultipleWindows mw= new MultipleWindows();

	@Then("^Click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 mw.clickOnLink();  
	}

	@Then("^switch to another window$")
	public void switch_to_another_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mw.switchtoAnotherWindow();
	    	}

	@Then("^verify\"([^\"]*)\" is present in url$")
	public void verify_is_present_in_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
