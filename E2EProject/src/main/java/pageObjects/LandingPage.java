package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By signIn = By.cssSelector("[href*='sign_in']");
	By title = By.xpath("//*[text()='Featured Courses']");
	By navigationBar = By.cssSelector(".navigation.clearfix");

	public WebElement getLogin() {
		return driver.findElement(signIn);
		//return new LoginPage(driver);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavigationbar() {
		return driver.findElement(navigationBar);
	}
}
