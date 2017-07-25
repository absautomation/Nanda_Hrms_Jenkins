package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.utils.BasePageObject;

public class ApplyLeavePage extends BasePageObject {

	public ApplyLeavePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	String Earned_Leave = "null";
	String Personal_Leave = "null";
	
	By BalanceEarnedLeave = By.xpath("//tbody[1]/tr[3]/td[5]");
	By BalancePersonalLeave = By.xpath("//table[2]//tbody/tr[4]/td[5]");
	
	
	public void getEarnedleavedetails() throws Exception
	{
		try {
		Earned_Leave =  getText(BalanceEarnedLeave);	
		System.out.println();
		System.out.println();
		System.out.println("The no of avaliable Earned Leave is "+ Earned_Leave +" Days");
		
		System.out.println();
		Personal_Leave =  getText(BalancePersonalLeave);
		System.out.println("The no of avaliable Personal Leave is "+ Personal_Leave+ " Days");
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
}
