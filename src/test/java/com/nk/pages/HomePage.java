package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class HomePage extends BasePageObject
{
public HomePage(WebDriver driver) 
{
	super(driver);
}
String actualResult=null;
String expectedResult=null;
String UserName = null;


By name=By.id("ctl00_lblLoggedInUser");
By HomeLink = By.id("ctl00_cphHeader_lnk_topmenu1");
By LeaveLink = By.id("ctl00_cphMain_dl_Modules_ctl01_HyperLink1");
By Attendance = By.id("ctl00_cphMain_dl_Modules_ctl00_HyperLink1");
By PhotoUpload = By.id("ctl00_dl_quicklink_ctl01_lnk_quicklink"); 
By Logout = By.id("ctl00_lnkLogout");


//By DashboardMessage=By.id("ctl00_cphMain_Label2");
//By MyrequestStatusMessage=By.id("ctl00_cphMain_lbl_RecentHeading");
//By ReportiesRequestMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");
//By celebrationsMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");
//By EventsMessage=By.id("ctl00_cphMain_Label3");
//By AttendeneceRegulationCount=By.xpath("//tr[@id='ctl00_cphMain_MPRequest']/td[2]//following-sibling::td[1]");
//By onDutycount=By.xpath("//tr[@id='ctl00_cphMain_OTRequest']/td[2]/following-sibling:: td[1]");
//By LeaveRequestCount=By.xpath("//tr[@id='ctl00_cphMain_LeaveRequest']/td[2]/following-sibling:: td[1]");
//By CompoffCount=By.xpath("//tr[@id='ctl00_cphMain_CORequest']/td[2]/following-sibling:: td[1]");


public String getUsername() throws Exception
{
try {
	
	UserName=getText(name);
} catch (Exception e) 
{
	throw new Exception(e.getLocalizedMessage());
}
return UserName;	
}


public void clickonhome() throws Exception
{
	try {
		uiDriver.findElement(HomeLink).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
}


public LeavePage clickonleave() throws Exception
{
	try {
		uiDriver.findElement(LeaveLink).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return new LeavePage(uiDriver);
}

public Attendance clickonattendance() throws Exception
{
	try {
		uiDriver.findElement(Attendance).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return new Attendance(uiDriver);
}

public PhotoUpload PhotoUpload() throws Exception
{
	try {
		uiDriver.findElement(PhotoUpload).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return new PhotoUpload(uiDriver);
}


public void Logout()
{
	try {
		uiDriver.findElement(Logout).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
}


}
