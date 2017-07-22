package stepdef;

import cucumber.api.java.en.Then;
import pageObject.FormAuthentication;

public class FormAuthStefDef {
	
	FormAuthentication fau=new FormAuthentication();


@Then("^enter username as \"([^\"]*)\"$")
public void enter_username_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 fau.enterUserName(arg1);   
}

@Then("^enter password as \"([^\"]*)\"$")
public void enter_password_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    fau.enterPassword(arg1);
}

@Then("^click on login button$")
public void click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   fau.clickLogInButton();
}


@Then("^click on logout button$")
public void click_on_logout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   fau.clickLogOutButton();
}

}
