package Generic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class SeleniumClass extends BaseClass {

	static WebDriver driver;
	protected WebElement element;
	protected List<WebElement> ListOfElements = new ArrayList<WebElement>();
	
	public void selectBrowser(String browsername)
	{
		System.out.println("Selecting" + browsername + "browser"
				+ "");
		String path=this.setpath("\\src\\test\\java\\Utilies\\");
		
	 if(browsername.equalsIgnoreCase("chrome"))
	 {
		System.setProperty("webdriver.chrome.driver",path +"chromedriver.exe");
		 driver=new ChromeDriver(); 
	 }
	 else if(browsername.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.chrome.driver", path+"geckodriver.exe");
		 driver=new FirefoxDriver();
	 }
	 else if(browsername.equalsIgnoreCase("ie"))
	 {
		 System.setProperty("webdriver.chrome.driver", path+"IEDriverServer.exe");
		 driver=new InternetExplorerDriver(); 
		 		 
	 }
	 
	 else{
		 
		 
		 System.out.println("incorrect browsername");
	 
	 }
	
	 driver.manage().window().maximize();
	}

	
	public void launchApp(String url)
	{
		System.out.println("Launching" + url);
		driver.get(url);
	}

	public void verifyCurrentUrl (String expectedURL)
	{
		String actualURL= driver.getCurrentUrl();
		assert actualURL.contains(expectedURL): expectedURL + " is not matching with" +actualURL;
	}

	
	public void closeApp(boolean closeAll)
	{
		if (closeAll=true)
		{
	 	driver.close();
		}
		else{
			driver.quit();
		}
	}

	public WebElement locateElement(String address, String type)
	{
		if(type.equalsIgnoreCase("linktext"))
		{
			return driver.findElement(By.linkText(address));
		}
		
		else if(type.equalsIgnoreCase("id"))
		{
			return driver.findElement(By.id(address));
		}
		
		else if(type.equalsIgnoreCase("name"))
		{
			return driver.findElement(By.name(address));
		}
		else if(type.equalsIgnoreCase("PartialLinktext"))
		{
			return driver.findElement(By.partialLinkText(address));
		}
		else if(type.equalsIgnoreCase("tagname"))
		{
			return driver.findElement(By.tagName(address));
		}
		else if(type.equalsIgnoreCase("classname"))
		{
			return driver.findElement(By.className(address));
		}
		else if(type.equalsIgnoreCase("cssSelector"))
		{
			return driver.findElement(By.cssSelector(address));
		}
		else if(type.equalsIgnoreCase("xpath"))
		{
			return driver.findElement(By.xpath(address));
		}
		
		return null;
		
	}

	
	public void clickElemnt(WebElement element)
	{
		element.click();
	}

	public List<WebElement> locateElements(String address, String type)
	{
		if(type.equalsIgnoreCase("linktext"))
		{
			return driver.findElements(By.linkText(address));
		}
		
		else if(type.equalsIgnoreCase("id"))
		{
			return driver.findElements(By.id(address));
		}
		
		else if(type.equalsIgnoreCase("name"))
		{
			return driver.findElements(By.name(address));
		}
		else if(type.equalsIgnoreCase("PartialLinktext"))
		{
			return driver.findElements(By.partialLinkText(address));
		}
		else if(type.equalsIgnoreCase("tagname"))
		{
			return driver.findElements(By.tagName(address));
		}
		else if(type.equalsIgnoreCase("classname"))
		{
			return driver.findElements(By.className(address));
		}
		else if(type.equalsIgnoreCase("cssSelector"))
		{
			return driver.findElements(By.cssSelector(address));
		}
		else if(type.equalsIgnoreCase("xpath"))
		{
			return driver.findElements(By.xpath(address));
		}
		
		return null;
		
	}

	public LinkedHashSet<String> getLinkTextFromWebElementList(List<WebElement> List)
		{
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		System.out.println(lhs);
		
			//for(WebElement elelment:List)
			//	{
			//lhs.add(elelment.getText());
				//}
			return lhs;
		}

	public void passValueToTextBox(WebElement element, String value)
	{
		element.sendKeys(value);
	}

	public void switchtoAnotherWindow()
	{
		String parenthandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();//handle contains parenthandle too.
		for(String key:handles)
		{
			if(key.equalsIgnoreCase(parenthandle))
			{
				continue;
			}
			else{
				driver.switchTo().window(key);
				System.out.println(driver.getTitle());
				break;
			}
			
		}
		
		//return element= this.switchWindow();
	}


	public void SelectValuefromDropdown(String type, String value, WebElement ddelement)
	{
		Select se1=new Select(ddelement);
		
		if(type.equalsIgnoreCase("index"))
		{
		 se1.selectByIndex(Integer.parseInt(value));	
			
		}
		else if(type.equalsIgnoreCase("value"))
		{
			se1.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("text"))
		{
			se1.selectByVisibleText(value);
		}
			
	}
}




