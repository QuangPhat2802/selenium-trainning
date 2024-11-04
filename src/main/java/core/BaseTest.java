package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    // ThreadLocal instance for WebDriver
    private static ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        // Determine the operating system and set the WebDriver path accordingly
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        }

        // Create a new ChromeDriver instance for the current thread
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize(); // Maximize the window (optional)
        return webDriver;
    });

    // Setup method for WebDriver initialization
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Quit the WebDriver
    public static void closeDriver() {
        WebDriver webDriver = driver.get(); // Get the driver for the current thread
        if (webDriver != null) {
            webDriver.quit(); // Quit the driver
            driver.remove(); // Clean up the ThreadLocal variable
        }
    }
}
