package com.WebTesting.Pages;

import com.WebTesting.Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonLocators {

    public amazonLocators(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(id = "nav-search-bar-form")
    public WebElement searchBarSearchButton;

    @FindBy(xpath = "//span[.='OXO']")
    public WebElement OXOClick;

    @FindBy (xpath = "//img[@src='https://m.media-amazon.com/images/I/714yvQFLL8L._AC_UL320_.jpg']")
    public WebElement firstWoodenSpoon;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
    public WebElement continueToCheckOut;




}
