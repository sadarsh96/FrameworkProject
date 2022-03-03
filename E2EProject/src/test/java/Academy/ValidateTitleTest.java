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

public class ValidateTitleTest extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized titlePage");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to titlePage");
	}

	@Test
	public void basePageNavigationTitle() throws IOException {

		LandingPage landingPageobj = new LandingPage(driver);
		AssertJUnit.assertEquals(landingPageobj.getTitle().getText(), "Featured Courses123");
		log.info("Successfully Validated Text message in titlepage");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
