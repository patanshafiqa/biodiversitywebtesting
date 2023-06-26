package com.orangehrm.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangehrm.loginpage.Loginpage;

import Base.TestBase;

public class Login extends TestBase{
	WebDriver driver;
	Loginpage lp;
	 
    public Login()
    {
    	super();
    	
    }
    
    @Test(priority = 1)
    public void validatelogin(WebDriver driver) throws IOException
    {
  
    	lp=new Loginpage();
    	lp.enterUserName(prop.getProperty("username"));
    	lp.enterPassWord(prop.getProperty("password"));
    	lp.clickLoginButton();
    }
}

