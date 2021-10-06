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

    @FindBy(linkText = "OXO")
    public WebElement OXOClick;




}
