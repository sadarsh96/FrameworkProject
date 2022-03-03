package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePageTest extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized in HomePage");
		
	}

	@Test(dataProvider = "getData")
	public void basePageNavigationHome(String userName, String password) throws IOException {

		driver.get(prop.getProperty("url"));

		LandingPage landingPageobj = new LandingPage(driver);
		landingPageobj.getLogin().click();
		LoginPage loginPageObj = new LoginPage(driver);
		loginPageObj.getEmail().sendKeys(userName);
		loginPageObj.getPassword().sendKeys(password);
		loginPageObj.submit().click();
		ForgotPassword fp = loginPageObj.forgotPassword();
		fp.provideEmail().sendKeys("123@gmail.com");
		fp.submit().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] dataObject = new Object[2][2];
		dataObject[0][0] = "abc@gmail.com";
		dataObject[0][1] = "abc123";
		dataObject[1][0] = "def@gmail.com";
		dataObject[1][1] = "def456";
		return dataObject;
	}


	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
