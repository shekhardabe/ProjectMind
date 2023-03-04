package utility;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumOperations {
	
	public static ChromeDriver driver = null;
	
	public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserlaunch(Object[] InputParameters)
	{	
		try
		{
			String strBrowserName=(String)InputParameters[0];
		String strExe=(String)InputParameters[1];
				System.setProperty(strBrowserName,strExe);
				driver = new ChromeDriver();	
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input Given: "+InputParameters[0].toString());
		}
		
	
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input Given: "+InputParameters[0].toString());			
		}
		return outputParameters;
	} 
	
	
	public static Hashtable<String,Object> OpenApplication(Object[] InputParameters)
	{
		try
		{
			String path=(String)InputParameters[0]; 
			driver.get(path); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:OpenApplication,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:OpenApplication,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> MoveToElement(Object[] InputParameters) 
	{
		try
		{
			String path = (String)InputParameters[0];
			Actions act = new Actions(driver);																		    //Hover mouse on login button
			WebElement m1 = driver.findElementByXPath(path);
			act.moveToElement(m1).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:MoveToElement,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:MoveToElement,Input Given: "+InputParameters[0].toString());			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> ClickOnElement(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			driver.findElementByXPath(path).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	
	
	public static Hashtable<String,Object> RightClickOnElement(Object[] InputParameters)
	{
		try
		{
			String xpath=(String)InputParameters[0];
			Actions act=new Actions(driver);											                        
			WebElement xyz=driver.findElement(By.xpath(xpath));                
			act.contextClick(xyz).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	
	public static Hashtable<String,Object> AlertOption()
	{
		 driver.switchTo().alert();
	       Alert a=driver.switchTo().alert();
		   a.accept();
		return outputParameters;  
	}
	
	
	public static Hashtable<String,Object> GetTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		return outputParameters;  
	}
	
	public static Hashtable<String,Object> GetURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return outputParameters;  
	}
	
	public static Hashtable<String,Object> GetTagName()
	{
		List<WebElement>number=driver.findElementsByTagName("a");
	    int total=number.size();
	    System.out.println(total);
		return outputParameters;  
	}
	
	public static Hashtable<String,Object> GetIFrames()
	{
		List<WebElement>num=driver.findElementsByTagName("iframe");
		int abc=num.size();
		System.out.println(abc);
		return outputParameters;  
	}
	
	public static Hashtable<String,Object> SendTextPass(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
			 
			  
			driver.findElementByXPath(path).clear();
			driver.findElementByXPath(path).sendKeys(text);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> SendTextOnUi(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
		
			driver.findElement(By.xpath(path)).click();
			driver.findElementByXPath(path).sendKeys(text);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());			
		}
		return outputParameters;
	}

	public static Hashtable<String,Object> SendTextOnUi1(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
			 WebElement subject = driver.findElement(By.xpath(path));
		        WebDriverWait comp = new WebDriverWait(driver, 20);
		        comp.until(ExpectedConditions.elementToBeClickable(subject));
		        subject.sendKeys(text);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());			
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> SwitchtoTab()
	{
		
		
		try
		{
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> itr = ids.iterator();
			String one = itr.next();
			String two = itr.next();
			driver.switchTo().window(two);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SwitchtoTab,Input Given: ");
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SwitchtoTab,Input Given: ");			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> SwitchtoDefaultTab()
	{
		
		
		try
		{
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> itr = ids.iterator();
			String one = itr.next();
			String two = itr.next();
			driver.switchTo().window(one);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SwitchtoTab,Input Given: ");
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SwitchtoTab,Input Given: ");			
		}
		return outputParameters;
	}
	
	
	
	
	
	public static Hashtable<String,Object> SelectText(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
			Select sel = new Select(driver.findElement(By.xpath(path)));
			sel.selectByVisibleText(text);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SelectText,Input Given: "+InputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SelectText,Input Given: "+InputParameters[1].toString());
			
		}
		return outputParameters;
	}

	public static Hashtable<String,Object> ValidationbyGetText(Object[] InputParameters)
	{	
		try
		{
			String path = (String)InputParameters[0];
			String giventext = (String)InputParameters[1];
			
			String capturedtText = driver.findElement(By.xpath(path)).getText();
			
			if(giventext.equalsIgnoreCase(capturedtText))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("test case fail");
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	
	
}
