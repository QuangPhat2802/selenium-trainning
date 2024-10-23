package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.LoginPage;
import core.BaseTest;
import core.ConfigReader;
import org.testng.Assert;

public class LoginSteps  {

    WebDriver driver;;
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = BaseTest.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateTo((ConfigReader.getLoginUrl()));
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        String username = System.getenv("JIRA_EMAIL");
        String password = System.getenv("JIRA_PASSWORD");
        loginPage.login(username, password);
    }

    @Then("the {string} page is displayed")
    public void the_page_is_displayed(String pageTitle) {
        String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, pageTitle, "Page title does not match expected title after login.");
    }
}