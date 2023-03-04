package Temporaray;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tempt 
{
	public static void main(String[] args) throws InterruptedException
	{
		//1.Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        //2.Open Application
		driver.get("https://mail.google.com/");
		//3.Enter USername
	    driver.findElement(By.id("identifierId")).sendKeys("dabeshekhar@gmail.com"); 
	    //4.Click on next
         Thread.sleep(3000);          
        driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[2]")).click();
        Thread.sleep(3000);
        //5. Enter Pass
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("Shekhar@123");  
        //6.Click on Next
        driver.findElement(By.xpath("//*[text()='Next']")).click(); 
        //7.click on compose button
        Thread.sleep(3000);
        WebElement compose = driver.findElement(By.xpath("(//*[@role='button'])[13]"));
        WebDriverWait comp = new WebDriverWait(driver, 20);
        comp.until(ExpectedConditions.elementToBeClickable(compose));
        compose.click();
        //8.Enter mail
        Thread.sleep(3000);
        driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("dabeshekhar@gmail.com");
        //9.Enter subject
        Thread.sleep(3000);
        driver.findElementByXPath("//*[@name='subjectbox']").sendKeys("Test Mail");
        //10.Enter body
        Thread.sleep(3000);
        driver.findElementByXPath("//*[@class='Am Al editable LW-avf tS-tW']").sendKeys("Test email Body");
        Thread.sleep(3000);
        //11.Clivk on more option
        driver.findElementByXPath("(//*[@class='J-J5-Ji J-JN-M-I-JG'])[5]").click();
        Thread.sleep(3000);
        //12.cllick on lable
        driver.findElementByXPath("(//*[@class='J-N-Jz'])[9]").click();
        Thread.sleep(3000);
        //13.click on Social
        driver.findElementByXPath("(//*[@class='J-LC-Jz'])[1]").click();
        Thread.sleep(3000);
        //14.click on send
        driver.findElementByXPath("//*[text()='Send']").click();
        Thread.sleep(3000);
        //15.click on star
        driver.findElementByXPath("(//*[text()='Social'])[1]").click();
      Thread.sleep(3000);
      //16.click on social 
      driver.findElementByXPath("(//*[@class='aKz'])[3]").click();
      Thread.sleep(3000);
      //17.open mail 
      driver.findElementByXPath("(//*[@class='zA yO'])[1]").click();
      
      
      
      
        
        
        
	}
}
