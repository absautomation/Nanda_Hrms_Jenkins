package com.nk.pages;

import javax.media.AudioDeviceUnavailableEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class ConsolidatedAttendanceDetails extends BasePageObject{

	public ConsolidatedAttendanceDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
By Jan_Month = By.xpath("//table[@id='ctl00_cphMain_gv_CountDetails']//tbody//tr[2]//td[1]");
By Total_Hours = By.xpath("//table[@id='ctl00_cphMain_gv_CountDetails']//tbody//tr[2]//td[7]");
	

public void  averageperday() throws Exception
{
try {
		String  Month = uiDriver.findElement(Jan_Month).getText();
		String nofoworkinghours = uiDriver.findElement(Total_Hours).getText();
		System.out.println(" Total working hours for the of "+Month+ " is : "+nofoworkinghours);
	
	} catch (Exception e) {
		// TODO: handle exception
	}

	}
}