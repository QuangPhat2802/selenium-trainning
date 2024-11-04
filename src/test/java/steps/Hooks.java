package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import core.BaseTest;

public class Hooks extends BaseTest {
    @Before
    public void setup() {
        getDriver();
    }

    @After
    public void teardown() {
        closeDriver();
    }
}