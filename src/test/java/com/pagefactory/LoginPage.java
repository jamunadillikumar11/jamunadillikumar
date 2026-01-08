package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClassEx;

public class LoginPage extends BaseClassEx {
	
		public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement passWord;

	@FindBy(xpath = "//input[@type='Submit']")
	public WebElement loginBtn;

	
	//Method
	public String getText1() {
		return null;
		
	}
	public String getText2() {
		return null;
		
	}
}
