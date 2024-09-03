package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomeSkibePage;

public class HomeSkibePageTest extends TestBase {

	HomeSkibePage home;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		home=new HomeSkibePage();
	}
	
	@Test
	public void verifyUrlofApplicationTest() {
		String expURL="https://beta-app.goskribe.com/";
		String actURL=home.verifyUrlofApplication();
		Assert.assertEquals(expURL, actURL);
		Reporter.log(actURL);
	}
	@Test
	public void verifyTitleOfPageTest() {
		String expTitle="Skribe Media";
		String actTitle=home.verifyTitleOfPage();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log(actTitle);
	}
	
	@Test
	public void verifynavigatetochaitimepageTest() throws InterruptedException {
		String expUrl="https://beta-app.goskribe.com/tea-time";
		String actUrl=home.verifynavigatetochaitimepage();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log(actUrl);
	}
	@Test
	public void verifynavigatetoLoginPageTest() {
		String expUrl="https://beta-app.goskribe.com/login";
		String actUrl=home.verifynavigatetoLoginPage();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log(actUrl);
	}
	@Test
	public void verifyvalidcreditialsLoginTest() {
		String expText="Username or Password is incorrect";
		String actText=home.verifyvalidcreditialsLogin();
		Assert.assertEquals(expText, actText);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
