package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ReuseMethodPage extends Utilities {
    private static final Logger log = LogManager.getLogger(ReuseMethodPage.class.getName());

    public ReuseMethodPage() {
        PageFactory.initElements(driver, this);
    }

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    AccountPage accountPage = new AccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customerPage = new CustomersPage();


    public void method1() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.fillFistName();
        addCustomerPage.fillLastName();
        addCustomerPage.fillPostCode();
        addCustomerPage.addCustomerButton();
        String expected = "Customer added successfully with customer id :6";
        addCustomerPage.verifyPopUpWindowAndClick(expected);

    }

    public void method2() {
        method1();
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLogin();
        accountPage.clickOnOpenAccount();
        accountPage.selectCustomerSearch();
        accountPage.selectCurrency();
        accountPage.clickOnProcessButton();
        String exp = "Account created successfully with account Number :1016";
        System.out.println(exp);
        accountPage.verifyPopWindowTextAndAccept(exp);
    }

    public void method3() throws InterruptedException {
        method2();
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchCustomerFromDropDown();
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(3000);
        customerLoginPage.verifyLogoutTabAndClickOnLogoutPage();
    }

    public void method4() throws InterruptedException {
        method3();
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchCustomerFromDropDown();
        customerLoginPage.clickOnLoginButton();
        customerPage.clickOnDeposit();
        customerPage.enterAmount100();
        customerPage.clickOnDepositButtonLast();
        String exp = "Deposit Successful";
        customerPage.verifyDepositSuccessfully(exp);
    }


}
