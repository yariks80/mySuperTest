package com.it.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_URL;

public class DriverFactory {
    static WebDriver getDriver() {
        String property = System.getProperty("driver");
        WebDriver driver = null;
        if (property != null) {
            if ("chrome".equals(property)) {
                driver = new ChromeDriver();
            } else if ("gecko".equals(property)) {
                driver = new FirefoxDriver();
            }
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        return driver;
    }
}
