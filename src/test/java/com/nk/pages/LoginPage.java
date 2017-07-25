package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.apache.log4j.Logger;
import com.nk.utils.BasePageObject;

public class LoginPage extends BasePageObject
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By username=By.id("txt_Username");
	By Password=By.id("txt_Password");
	By LoginButton=By.id("btn_LogIn");
	
	
	String actualResult=null;
	String expectedResult=null;
	boolean flag=false;
	
	
	
//	public boolean verifyUsername() throws Exception
//	{
//		Log.info("Verifying the Username  is displyed on the Page");
//		try 
//		{
//			flag=isElementPresent(username);
//			Assert.assertTrue(flag, "username  Element Is Missing on the sreen");
//			return flag;
//		} 
//		catch (Exception e) 
//		{
//			throw new Exception("FAILED WHILE VERIFYING THE username MESSAGE LABEL " + " \n verifyUsername "+ e.getLocalizedMessage() );
//		}
//	}
	
	
	public void enterUsername(String uname) throws Exception
	{
		Log.info("Verifying the Username Message box is displyed on the Page");
		try 
		{
			uiDriver.findElement(username).sendKeys(uname);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE username MESSAGE LABEL " + " \n verifyUsername "+ e.getLocalizedMessage() );
		}
	}
	
//	public boolean verifyPassword() throws Exception
//	{
//		Log.info("Verifying the DashBoard Message box is displyed on the Page");
//		try 
//		{
//			flag=isElementPresent(Password);
//			Assert.assertTrue(flag, "Password message Element Is Missing on the sreen");
//			return flag;
//		} 
//		catch (Exception e) 
//		{
//			throw new Exception("FAILED WHILE VERIFYING THE Password MESSAGE LABEL " + " \n verifyPassword "+ e.getLocalizedMessage() );
//		}
//		
//		
//	}
	
	public void enterPassword(String pwd) throws Exception
	{
		Log.info("Verifying the DashBoard Message box is displyed on the Page");
		try 
		{
			uiDriver.findElement(Password).sendKeys(pwd);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE username MESSAGE LABEL " + " \n verifyUsername "+ e.getLocalizedMessage() );
		}
	}
	
	public HomePage clickonSubmitButton() throws Exception
	{
		Log.info("Verifying the DashBoard Message box is displyed on the Page");
		try 
		{
			uiDriver.findElement(LoginButton).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE username MESSAGE LABEL " + " \n verifyUsername "+ e.getLocalizedMessage() );
		}
		
		return new HomePage(uiDriver);
	}
	
	
}
