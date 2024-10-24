package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    private static WebDriver driver;

    // Setup method for WebDriver initialization
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
            driver = new ChromeDriver();

            // Set default timeouts (optional)
            driver.manage().window().maximize();
        }
        return driver;
    }

    // Quit the WebDriver
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
