package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class PhotoUpload extends BasePageObject {

	public PhotoUpload(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By BrowseLink = By.id("ctl00_cphMain_fu_EmpPhoto");
	By Upload = By.id("ctl00_cphMain_btn_Upload");
	
	public void BrowseFile()throws Exception
	{
		try {
			uiDriver.findElement(BrowseLink).sendKeys("C:\\Users\\Nkishore\\Pictures\\Photo 2.jpg");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickupload()throws Exception
	{
		try {
			uiDriver.findElement(Upload).click();
			alert();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
