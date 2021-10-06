package com.WebTesting.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.security.auth.login.Configuration;

public class Driver {

    private Driver(){
    }

    private static WebDriver driver;

    public static WebDriver getDriver(String args){

        if (driver == null){

            String Browser = args;

            switch (Browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();

        }
    }
}
