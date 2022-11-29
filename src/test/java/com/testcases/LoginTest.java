package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.webpages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage lp;
	
	public LoginTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		intialization();
		lp=new LoginPage(driver);
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Biodiversity Survey");
	}

	@Test(priority=3)
	public void FLOlogin()
	{
		lp.login(pr.getProperty("username"), pr.getProperty("password"));
		System.out.println("sucess");
	
	}
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = lp.validateApsbblogo();
		Assert.assertTrue(flag);
	}

	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
}
