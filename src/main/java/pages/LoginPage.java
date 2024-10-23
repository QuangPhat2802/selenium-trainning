package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(id = "username") private WebElement usernameField;
    @FindBy(id = "password") private WebElement passwordField;
    @FindBy(xpath = "//button[@id=\"login-submit\"]/span[.=\"Continue\"]") private WebElement continueButton;
    @FindBy(xpath = "//button[@id=\"login-submit\"]/span[.=\"Log in\"]") private WebElement loginButton;

    // Page-specific actions
    public void login(String username, String password) {
        this.waitUntilVisibilityOf(usernameField).sendKeys(username);
        continueButton.click();
        this.waitUntilVisibilityOf(passwordField).sendKeys(password);
        loginButton.click();
        this.waitForPageLoad();
    }


}