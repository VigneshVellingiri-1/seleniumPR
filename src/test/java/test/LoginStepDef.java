package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowsersSetup;

public class LoginStepDef extends BrowsersSetup{
	
	loginPage loginPage = new loginPage(getDriver());

	@Given("The user lanched the URL")
	public void the_user_lanched_the_url() {
		getDriver().get("https://www.saucedemo.com/v1/index.html");
	}
	
	
	@When("The user entered valid {string}")
	public void the_user_entered_valid(String userName) {
		loginPage.userName.sendKeys(userName);
	}

	@And("the user entered valid {string}")
	public void the_user_entered(String password) {
		loginPage.password.sendKeys(password);
	}

	@And("the user taped login button")
	public void the_user_taped_login_button() {
		
		loginPage.logInBtn.click();
	}

	@Then("the user should be logged successfull and navigate to home page")
	public void the_user_should_be_logged_successfull_and_navigate_to_home_page() {
		String CurrentURL = getDriver().getCurrentUrl();
		String ExpectedURL = "https://www.saucedemo.com/v1/inventory.html";
		
		Assert.assertEquals(CurrentURL, ExpectedURL);
		System.out.println("User Successfully logged in and landed on Home page..!");
		
	}
	
	@When("The user entered invalid user name")
	public void the_user_entered_invalid_user_name() {
	    loginPage.userName.sendKeys("axi");
	}
	@When("the user entered invalid password")
	public void the_user_entered_invalid_password() {
	    loginPage.password.sendKeys("Axi145");
	}
	@Then("the user should see the inline error message")
	public void the_user_should_see_the_inline_error_message() {
		
		Assert.assertTrue(loginPage.invalidCredantialErrorMsg.isDisplayed());
	}


}
