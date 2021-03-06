package com.nk.tests;

import org.testng.annotations.Test;
import com.nk.utils.BaseTestObject;
import com.nk.common.HSConstants;
import com.nk.pages.HomePage;
import com.nk.pages.LoginPage;
import com.nk.pages.PhotoUpload;
import com.nk.utils.ExcelutilObject;

public class Hrms_PhotoUpload extends BaseTestObject {
	
	LoginPage objloginpage;
	HomePage objhomepage;
	PhotoUpload objphoto;
	
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
			objphoto =  objhomepage.PhotoUpload();
			objphoto.BrowseFile();
			Thread.sleep(1000);
			objphoto.clickupload();
			
			Thread.sleep(500);
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
	

