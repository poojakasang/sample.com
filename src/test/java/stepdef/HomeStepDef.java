package stepdef;

import java.util.LinkedHashSet;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageObject.Homepage;

public class HomeStepDef {
	
	Homepage hp=new Homepage();

	@When("^user selects \"([^\"]*)\" browser$")
	public void user_selects_browser(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step1");
	    hp.selectBrowser(arg1);
	}

	@When("^launches \"([^\"]*)\"$")
	public void launches(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step2");
	  hp.launchApp(arg1);
	}


@Then("^verify \"([^\"]*)\" is present in url$")
public void verify_is_present_in_url(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	hp.verifyCurrentUrl(arg1);
   
}



@Then("^click on \"([^\"]*)\" link$")
public void click_on_link(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   hp.clickLink(arg1);
   
}


@Then("^get all links present on home page$")
public void get_all_links_present_on_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//hp.getAlllinks();
   LinkedHashSet<String> lhs=hp.getAlllinks();
	hp.verifyalllinks(lhs);
}

	@After
	@Then("^close application$")
	public void close_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step5");
	    hp.closeApp(true);
	   
	}

  
}    	



	

	
	

