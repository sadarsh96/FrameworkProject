package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailField = By.cssSelector("#email");
	By submit = By.cssSelector("[name='commit']");
	
	public WebElement provideEmail() {
		return driver.findElement(emailField);
		
	}
	public WebElement submit() {
		return driver.findElement(submit);
		
	}
}
