package com.nk.tests;

import org.testng.annotations.Test;

import com.nk.common.HSConstants;
import com.nk.pages.Attendance;
import com.nk.pages.ConsolidatedAttendanceDetails;
import com.nk.pages.HomePage;
import com.nk.pages.LoginPage;
import com.nk.utils.BaseTestObject;
import com.nk.utils.ExcelutilObject;;


public class Hrms_Attendance extends BaseTestObject {

	Attendance objatt;
	LoginPage objloginpage;
	HomePage objhomepage; 
	ConsolidatedAttendanceDetails objconatt;
	

	@Test
	public void consolidatedattendancetest()throws Exception
	{
		try {
			String userName=getExcelHRMSLogin(2, 1);
			String password=getExcelHRMSLogin(2, 2);
			
			objloginpage= new LoginPage(uiDriver);
					
			objloginpage.enterUsername(userName);
			objloginpage.enterPassword(password);
			objhomepage = objloginpage.clickonSubmitButton();
			
			objhomepage.clickonhome();
			objatt = objhomepage.clickonattendance();
					
			objconatt=objatt.clickonconsolidatedattendance();
			objconatt.averageperday();
		
			Thread.sleep(250);
			
			} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
		
	public void att()
	{
		
	}
	
	
	public String getExcelHRMSLogin(int row, int column) throws Exception
	{

	ExcelutilObject.setExcelFile(HSConstants.Path_TestData, "HRMSLogin");
	return ExcelutilObject.getCellData(row, column);
	}	
	
	
}
