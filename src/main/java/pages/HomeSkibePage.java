package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomeSkibePage extends TestBase{

	
	@FindBy(xpath="//a[text()='Chai-Time']")
	private WebElement chaitime;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Log In']")
	private WebElement clickbtn;
	
	@FindBy(xpath="//div[@class='ms-3 text-sm font-normal text-red-500']")
	private WebElement errormesg;
	
	public HomeSkibePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyvalidcreditialsLogin() {
		loginbtn.click();
		username.sendKeys("wataneaditya1");
		password.sendKeys("Aditya@234");
		clickbtn.click();
		return errormesg.getText();
	}
	public String verifynavigatetoLoginPage() {
		loginbtn.click();
		return driver.getCurrentUrl();
	}
	public String verifynavigatetochaitimepage() throws InterruptedException {
		chaitime.click();
		Thread.sleep(4000);
		return driver.getCurrentUrl();
	}
	
	public String verifyUrlofApplication() {
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleOfPage() {
		return driver.getTitle();
	}
	
	
}
