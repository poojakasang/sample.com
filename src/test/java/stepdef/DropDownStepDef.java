package stepdef;

import cucumber.api.java.en.Then;
import pageObject.Dropdown;

public class DropDownStepDef {

	Dropdown dd =new Dropdown();
	

	@Then("^select value by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void select_value_by_with(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		dd.selectValueStr(arg1, arg2);
	
	}
}

