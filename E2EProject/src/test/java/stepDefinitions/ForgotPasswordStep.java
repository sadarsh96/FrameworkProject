package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import resources.base;

public class ForgotPasswordStep extends base {

	LoginPage loginPageObject;
	ForgotPassword forgotPasswordObject;
	@Given("Login window is displayed")
	public void login_window_is_displayed() throws IOException {
		driver = initializeDriver();
		driver.get("https://rahulshettyacademy.com");
		LandingPage landingPageobj = new LandingPage(driver);
		landingPageobj.getLogin().click();
		loginPageObject = new LoginPage(driver);
		Assert.assertTrue(loginPageObject.getEmail().isDisplayed());
	}
	@When("user click on forgot password link")
	public void user_click_on_forgot_password_link() {
		loginPageObject.getForgotpasswordLink().click();
	}
	@Then("Reset password is displayed")
	public void reset_password_is_displayed() {
	   forgotPasswordObject = new ForgotPassword(driver);
	   Assert.assertTrue(forgotPasswordObject.provideEmail().isDisplayed());
	    
	}
	
}
