package com.nk.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nk.pages.HomePage;
import com.nk.pages.LoginPage;
import com.nk.utils.BaseTestObject;

public class Hrms_DataProvider_Login extends BaseTestObject {

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
	
	@Test(dataProvider="logincredential")
	public void logindata(String Usr, String Pwd)
	{
		objloginpage= new LoginPage(uiDriver);
		try {
			objloginpage.enterUsername(Usr);
			objloginpage.enterPassword(Pwd);
			objhomepage=objloginpage.clickonSubmitButton();
			String LoggedInUser = objhomepage.getUsername();
			System.out.println("Logged in User is "+LoggedInUser);
			objhomepage.Logout();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 A variable of an object reference type is different from a variable of a primitive type. 
	 A variable of an object type is also called a reference. The variable itself does not contain the object, 
	 but contains a reference to the object. The reference points to somewhere else in memory where the whole object is stored. 
	 Via the reference stored in the variable you can access fields and methods of the referenced object. 
	 It is possible to have many different variables reference the same object. This is not possible with primitive data types.
	  */
	
	@DataProvider(name="logincredential")
	public Object[][] loginCredentails()
	{
		Object[][] usrpwdobj = {
				{"1309288","Sep@2013"},
				{"1703769","mj777"}
				
		};
		
		return usrpwdobj;
	}
	
	
}
