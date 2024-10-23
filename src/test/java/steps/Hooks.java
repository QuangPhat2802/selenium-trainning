package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import core.BaseTest;

public class Hooks extends BaseTest {

    WebDriver driver;

    @Before
    public void setup() {
        driver = getDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}