
package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class StepDefinition extends base{
	
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver = initializeDriver();
	}
	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(string);
	}
	@Given("Click on login link in homepage to land on sign in page")
	public void click_on_login_link_in_homepage_to_land_on_sign_in_page() {
		LandingPage landingPageobj = new LandingPage(driver);
		landingPageobj.getLogin().click();
	}
	
	@When("^user enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage loginPageObj = new LoginPage(driver);
		loginPageObj.getEmail().sendKeys(username);
		loginPageObj.getPassword().sendKeys(password);
		loginPageObj.submit().click();
    }
	@Then("Verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
		PortalHomePage portalHomePageObject = new PortalHomePage(driver);
	    Assert.assertTrue(portalHomePageObject.getSearchBox().isDisplayed());
	}



}

