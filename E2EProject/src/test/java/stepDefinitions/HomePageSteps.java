package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class HomePageSteps extends base {

	   @Given("^User successfully logged in$")
	    public void user_successfully_logged_in() throws Throwable {
		   driver = initializeDriver();
		   driver.get("https://rahulshettyacademy.com");
		   LandingPage landingPageobj = new LandingPage(driver);
			landingPageobj.getLogin().click();
			LoginPage loginPageObj = new LoginPage(driver);
			loginPageObj.getEmail().sendKeys("test99@gmail.com");
			loginPageObj.getPassword().sendKeys("123456");
			loginPageObj.submit().click();
			
	    }

	    @Then("^home page should be displayed with search box$")
	    public void home_page_should_be_displayed_with_search_box() throws Throwable {
	    	PortalHomePage portalHomePageObject = new PortalHomePage(driver);
		    Assert.assertTrue(portalHomePageObject.getSearchBox().isDisplayed());
	    }
}
