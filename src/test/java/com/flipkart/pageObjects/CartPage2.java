package com.flipkart.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testCases.BaseClass;

public class CartPage2 extends BaseClass{

	//Added Comment in github
	
	public WebDriver ldriver;
	
	public CartPage2(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//div[text()='Remove']")
	@CacheLookup
	WebElement clickRemove;
	

	@FindBy(xpath="//span[text()='Price details']")
	@CacheLookup
	WebElement priceDetails;
	
@FindBy(xpath="//span[text()='Price details']")
	@CacheLookup
	WebElement priceDetail;
	
	
	public void clickRemoveFrom()
	{
		clickRemove.click();;
	}
	
}
