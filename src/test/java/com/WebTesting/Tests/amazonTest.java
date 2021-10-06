package com.WebTesting.Tests;

import com.WebTesting.Pages.amazonLocators;
import com.WebTesting.Utils.ConfigurationReader;
import com.WebTesting.Utils.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class amazonTest {

    /**
     * User on the amazon search page
     * user navigates to search field enters wooden spoon
     * user selects OXO check box and selects first project
     * user verifies selection the adds to cart
     * user checks out
     */


    @BeforeMethod
    public static void urlStart() {
        Driver.getDriver().get(ConfigurationReader.getProperties("amazonUrl"));
    }

    @Test
    public void amazonTestCase() {
        amazonLocators amazonLocators = new amazonLocators();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        amazonLocators.searchBar.click();
        amazonLocators.searchBar.sendKeys("wooden spoon");
        amazonLocators.searchBarSearchButton.submit();

        wait.until(ExpectedConditions.elementToBeClickable(amazonLocators.OXOClick));
        amazonLocators.OXOClick.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        amazonLocators.firstWoodenSpoon.click();

        amazonLocators.addToCart.click();

        amazonLocators.continueToCheckOut.click();



    }
}
