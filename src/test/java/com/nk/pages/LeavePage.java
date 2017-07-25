package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class LeavePage extends BasePageObject {

	public LeavePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By leaveHome = By.xpath("//a[@href='LeaveFormsHome.aspx']");
	By ApplyLeave = By.xpath("//a[@href='ApplyLeave.aspx']");
	
	
	public ApplyLeavePage applyleave() throws Exception
	{
	try {
		uiDriver.findElement(ApplyLeave).click();
	} catch (Exception e) {
		// TODO: handle exception
	}	
	
	return new ApplyLeavePage(uiDriver);
	}
	

}
