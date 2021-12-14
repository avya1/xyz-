package com.bank.pages;

import com.bank.utility.Utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utilities {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
           WebElement customerSearch;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
          WebElement currency;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
            WebElement processButton;


    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
        log.info("duration is" +openAccount.getText() + "<br>");

    }
    public void selectCustomerSearch()  {
        selectFromDropDown(customerSearch,"6");
        log.info("duration is" +customerSearch.getText() + "<br>");
    }
    public void selectCurrency(){
        selectFromDropDown(currency,"Pound");
        log.info("duration is" +currency.getText() + "<br>");
    }
    public void clickOnProcessButton(){
        log.info("duration is" +processButton.getText() + "<br>");
        clickOnElement(processButton);

    }
    public void verifyPopWindowTextAndAccept(String exp){

        alertPopUpWindowAndVerifyText(exp);

    }


}
