package pageObject;

import Generic.SeleniumClass;

public class FormAuthentication extends SeleniumClass{
	
	String xpathUserName=".//*[@id='username']";
	String xpathPassword=".//*[@id='password']";
	String xpathLoginButton=".//*[@id='login']/button";
	String xpathusernameisvalidmessage=".//*[@id='flash']";
	String xpathloggedin=".//*[@id='flash']";
	String xpathSecureArealabel=".//*[@id='content']/div/h2";
	String xpathWelcometo=".//*[@id='content']/div/h4";
	String xpathloggedout=".//*[@id='content']/div/a";
	
public void enterUserName(String uname)
{

	element =this.locateElement(xpathUserName, "xpath");
	this.passValueToTextBox(element, uname);
	
}

public void enterPassword(String pword)
{
	element =this.locateElement(xpathPassword, "xpath");
	this.passValueToTextBox(element,pword);
}

public void clickLogInButton()
{
	element= this.locateElement(xpathLoginButton, "xpath");
	this.clickElemnt(element);
}
	
public void clickLogOutButton()
{
	element= this.locateElement(xpathloggedout, "xpath");
	this.clickElemnt(element);
}


}
