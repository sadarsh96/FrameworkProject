package Academy;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBarTest extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized NavigationPage");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage for Navigation Bar Test");
	}

	@Test
	public void basePageNavigationBar() throws IOException {

		LandingPage landingPageObject = new LandingPage(driver);
		AssertJUnit.assertTrue(landingPageObject.getNavigationbar().isDisplayed());
		log.info("Navigation Bar verifiied");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
