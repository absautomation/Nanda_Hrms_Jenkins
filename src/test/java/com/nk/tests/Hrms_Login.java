package com.nk.tests;

import org.testng.annotations.Test;
import com.nk.utils.BaseTestObject;
import com.nk.common.HSConstants;
import com.nk.pages.HomePage;
import com.nk.pages.LoginPage;
import com.nk.utils.ExcelutilObject;

public class Hrms_Login extends BaseTestObject {
	
	LoginPage objloginpage;
	HomePage objhomepage;
	
	@Test(priority=1)
	public void ValidLogin() throws Exception
	{
		try 
		{
			String userName=getExcelHRMSLogin(1, 1);
			String password=getExcelHRMSLogin(1, 2);
			
			objloginpage= new LoginPage(uiDriver);
			
			//objloginpage.verifyUsername();
			objloginpage.enterUsername(userName);
			//objloginpage.verifyPassword();
			objloginpage.enterPassword(password);
			objhomepage=objloginpage.clickonSubmitButton();
			String LoggedInUser = objhomepage.getUsername();
			System.out.println("Logged in User is "+LoggedInUser);
			System.out.println();
			
			Thread.sleep(250);
		}

		catch (Exception e) 
		
		{
			throw new Exception("FAILED VERIFYING the LoginPage   TESTCASE" + "\n clickonSubmitButton" +e.getLocalizedMessage());
		}
	}
	
	public String getExcelHRMSLogin(int row, int column) throws Exception
	{

	ExcelutilObject.setExcelFile(HSConstants.Path_TestData, "HRMSLogin");
	return ExcelutilObject.getCellData(row, column);
	}
}
	

