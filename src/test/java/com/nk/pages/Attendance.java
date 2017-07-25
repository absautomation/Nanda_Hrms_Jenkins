package com.nk.pages;

import javax.print.attribute.standard.RequestingUserName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class Attendance extends BasePageObject {

	public Attendance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	By consolidatedattendance = By.xpath("//div[2]//div[1]//ul//li[4]");
	
	
	public ConsolidatedAttendanceDetails clickonconsolidatedattendance()throws Exception
	{
		try {
			uiDriver.findElement(consolidatedattendance).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ConsolidatedAttendanceDetails(uiDriver);
	}
	
	
	
}
