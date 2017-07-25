package com.nk.tests;

import org.testng.annotations.Test;

import com.nk.utils.BaseTestObject;
import com.nk.pages.LoginPage;
import com.nk.pages.ApplyLeavePage;
import com.nk.pages.HomePage;
import com.nk.pages.LeavePage;
import com.nk.common.HSConstants;
import com.nk.utils.ExcelutilObject;;

public class Hrms_Leaves extends BaseTestObject
{


LoginPage objloginpage;
HomePage objhomepage; 
LeavePage objleavepage;
ApplyLeavePage objapplyleavepage;


@Test(priority=1)
public void CheckLeaveBalance() throws Exception
{
	try 
	{
		String userName=getExcelHRMSLogin(3, 1);
		String password=getExcelHRMSLogin(3, 2);
						
		Object UserName = null;
		
		objloginpage= new LoginPage(uiDriver);
		
		//objloginpage.verifyUsername();
		objloginpage.enterUsername(userName);
		//objloginpage.verifyPassword();
		objloginpage.enterPassword(password);
		objhomepage=objloginpage.clickonSubmitButton();
		
	
		System.out.println();
		
		UserName =  objhomepage.getUsername();
		System.out.printf("Welcome " + UserName);
		objhomepage.clickonhome();
		objleavepage = objhomepage.clickonleave();
		
		objapplyleavepage = objleavepage.applyleave();
		objapplyleavepage.getEarnedleavedetails();
		
		Thread.sleep(1500);
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
