package pageObject;

import Generic.SeleniumClass;

public class Dropdown extends SeleniumClass {

	String xpathdropdown=".//*[@id='content']/ul/li[9]/a";
	String xpathDropdownList=".//*[@id='content']/div/h3";
	String xpathselectaOption=".//*[@id='dropdown']";
	
	public void selectValueStr(String type, String value)
	{
		element=this.locateElement(xpathselectaOption, "xpath");
		super.SelectValuefromDropdown(type, value, element);
	}
	
	
}
