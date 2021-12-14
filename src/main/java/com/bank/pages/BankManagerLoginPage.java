package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utilities {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());
    public BankManagerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomer;

    public void clickOnAddCustomerTab(){

        clickOnElement(addCustomer);
        log.info("duration is" +addCustomer.getText() + "<br>");
    }
}
