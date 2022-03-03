package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.cssSelector("#email");
	By password = By.cssSelector("#password");
	By submit = By.cssSelector("[name='commit']");
	By forgotPassword = By.cssSelector("[href*='identity/forgot']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public WebElement getForgotpasswordLink() {
		return driver.findElement(forgotPassword);
	}
	public ForgotPassword forgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}
}
