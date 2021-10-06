package com.WebTesting.Tests;

import com.WebTesting.Utils.ConfigurationReader;
import com.WebTesting.Utils.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonTest {

    /**
     * User on the amazon search page
     * user navigates to search field enters wooden spoon
     * user selects OXO check box and selects first project
     * user verifies selection the adds to cart
     * user checks out
     */





    @BeforeMethod
    public static void urlStart(){
        Driver.getDriver().get(ConfigurationReader.getProperties("amazonUrl"));}

    @Test
    public void amazonTestCase(){



}
}
