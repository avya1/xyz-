package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utilities {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());
    public CustomersPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessfully;
    /*@CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
    WebElement withDrawlTeb;

     */
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withDrawlTeb;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withDrawlAmount;
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withDrawlButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withDrawlSuccessfully;
    public void clickOnDeposit(){clickOnElement(deposit);
        log.info("duration is" +deposit.getText() + "<br>");
    }
    public void enterAmount100(){sendTextToElement(amount,"100");
        log.info("duration is" +amount.getText() + "<br>");;
    }
    public void clickOnDepositButtonLast(){clickOnElement(depositButton);
        log.info("duration is" +depositButton.getText() + "<br>");}
    public void verifyDepositSuccessfully(String exp){
        verifyPage(exp,depositSuccessfully);

    }
    public void clickOnWithDrawl(){

        clickOnElement(withDrawlTeb);
        log.info("duration is" +withDrawlTeb.getText() + "<br>");

    }
    public void enterWithDrawlAmount50(){
        sendTextToElement(withDrawlAmount,"50");
        log.info("duration is" +withDrawlAmount.getText() + "<br>");

    }
    public void clickOnWithdrawButton(){

        clickOnElement(withDrawlButton);
        log.info("duration is" +withDrawlButton.getText() + "<br>");
    }

    public void verifyWithdrawSuccessfully(String exp){
        verifyPage(exp,withDrawlSuccessfully);
    }



}
