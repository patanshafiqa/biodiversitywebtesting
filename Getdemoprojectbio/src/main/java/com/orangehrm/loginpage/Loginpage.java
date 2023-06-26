package com.orangehrm.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Loginpage {
	public WebDriver driver;

	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement loginbutton;

public void LoginPage() {
		PageFactory.initElements(driver, this);
}
    public void enterUserName(String userName) {
	username.sendKeys(userName);
}

	public void enterPassWord(String passWord) {
	password.sendKeys(passWord);
	}
	public void clickLoginButton() {
		loginbutton.click();
	}
}
