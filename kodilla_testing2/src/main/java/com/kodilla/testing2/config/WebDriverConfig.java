package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String OPERA = "OPERA_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "/Users/marcindomanski/Documents/Development/Selenium Drivers/Chrome/chromedriver");
        System.setProperty("webdriver.opera.driver", "/Users/marcindomanski/Documents/Development/Selenium Drivers/Opera/operadriver_mac64/operadriver");
//        System.setProperty("webdriver.firefox.driver", "/Users/marcindomanski/Documents/Development/Selenium\\ Drivers/Firefox/geckodriver");


        if(driver.equals(CHROME)) {
            return new ChromeDriver();
        } else if(driver.equals(OPERA)) {
            return new OperaDriver();
        } else {
            return null;
        }
    }
}
