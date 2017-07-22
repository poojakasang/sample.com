package pageObject;

import java.util.LinkedHashSet;

import org.openqa.selenium.WebElement;

import Generic.SeleniumClass;

public class Homepage extends SeleniumClass {

	private String linktextHomeLinks= "%s";
	WebElement element;
	private String tagnameHomeLink="a";
	
	
	
	public void clickLink(String linkname)
	{
		linktextHomeLinks=String.format(linktextHomeLinks,linkname);
		System.out.println(linktextHomeLinks);
		element=this.locateElement(linktextHomeLinks, "linktext");
		this.clickElemnt(element);
		
	}
	
	public LinkedHashSet<String> getAlllinks()
	{
		
		this.ListOfElements=super.locateElements(tagnameHomeLink,"tagName");
		
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs=super.getLinkTextFromWebElementList(this.ListOfElements);
		
		this.WriteExcel("abc.xlsx",lhs);
		//System.out.println(this.ListOfElements.size());
		
		return lhs;
		
	}
	
	public void verifyalllinks(LinkedHashSet<String> linktextlink)
	{
	//linktextlink.
	}
	
	
}
