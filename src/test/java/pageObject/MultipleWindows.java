package pageObject;

import org.openqa.selenium.WebElement;

import Generic.SeleniumClass;

public class MultipleWindows extends SeleniumClass {
	
	String xpathMultipleWindows=".//*[@id='content']/ul/li[29]/a";
	String xpathClickHere=".//*[@id='content']/div/a";
	String xpathNewWindow="html/body/div[1]/h3";

	
	public void clickOnLink()
	{
		element=this.locateElement(xpathClickHere,"xpath");
		this.clickElemnt(element);
	}
	
	
	
}
