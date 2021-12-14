package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Bank Manager Login')]" )
    WebElement bankMangerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='customer()']")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(className = "btn home")
    WebElement homeButton;

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }

    public void clickOnBankManagerLogin(){
        clickOnElement(bankMangerLogin);

    }



}
