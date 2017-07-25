package com.nk.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.nk.utils.BaseTestObject;
import com.nk.common.HSConstants;
import com.nk.pages.HomePage;
import com.nk.pages.LoginPage;
import com.nk.utils.ExcelutilObject;

public class Hrms_Parameter_Login extends BaseTestObject {
	
	LoginPage objloginpage;
	HomePage objhomepage;
	
	
	/*
To pass multiple data to the application at runtime, we need to parameterize our test scripts.

This concept which we achieve by parameterization is called Data Driven Testing.

Type of Parameterization in TestNG-
To make parameterization more clear, we will go through the parameterization options in one the most popular framework for Selenium Webdriver - TestNG.

There are two ways by which we can achieve parameterization in TestNG

1. With the help of Parameters annotation and TestNG XML file.

2. With the help of DataProvider annotation.
	
	 */
	
	@Test(priority=1)
	@Parameters({ "sUsername", "sPassword" })
	
	public void ValidLogin(String sUsername, String sPassword) throws Exception
	{
		try 
		{
			
			objloginpage= new LoginPage(uiDriver);
			
			objloginpage.enterUsername(sUsername);
			objloginpage.enterPassword(sPassword);
			objhomepage=objloginpage.clickonSubmitButton();
			String LoggedInUser = objhomepage.getUsername();
			System.out.println(LoggedInUser);
			Thread.sleep(250);
		}

		catch (Exception e) 
		
		{
			throw new Exception("FAILED VERIFYING the LoginPage   TESTCASE" + "\n clickonSubmitButton" +e.getLocalizedMessage());
		}
	}
	
}
	

