package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowsersSetup;

public class loginPage{
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement logInBtn;
	
	@FindBy(xpath = "//h3[contains(text(),'Epic sadface:')]")
	public WebElement invalidCredantialErrorMsg;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
