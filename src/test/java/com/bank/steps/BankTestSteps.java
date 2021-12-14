package com.bank.steps;

import com.bank.Case1Runner;
import com.bank.Case2Runner;
import com.bank.Case3Runner;
import com.bank.Case4Runner;
import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class BankTestSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on bank manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogin();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter firstname$")
    public void iEnterFirstname() {
        new AddCustomerPage().fillFistName();

    }

    @And("^I enter lastname$")
    public void iEnterLastname() {
        new AddCustomerPage().fillLastName();

    }

    @And("^I enter postcode$")
    public void iEnterPostcode() {
        new AddCustomerPage().fillPostCode();
    }

    @And("^I click on  add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().addCustomerButton();

    }

    @And("^I see popup window verify message and click on ok$")
    public void iSeePopupWindowVerifyMessageAndClickOnOk() {
        String exp="Customer added successfully with customer id :6";
        new  AddCustomerPage().verifyPopUpWindowAndClick(exp);
    }

    @And("^I click on open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new AccountPage().clickOnOpenAccount();
    }

    @And("^I Search customer that I created early$")
    public void iSearchCustomerThatICreatedEarly() {
        new AccountPage().selectCustomerSearch();
    }


    @And("^I click on process button$")
    public void iClickOnProcessButton() {
     new AccountPage().clickOnProcessButton();
    }

    @And("^I select currency$")
    public void iSelectCurrency() {
        new AccountPage().selectCurrency();
    }

    @Then("^I see popup window for account open and click ok$")
    public void iSeePopupWindowForAccountOpenAndClickOk() {
        String exp="Account created successfully with account Number :1016";
        new AccountPage().verifyPopWindowTextAndAccept(exp);

    }

    @When("^I repeat all Steps for open account$")
    public void iRepeatAllStepsForOpenAccount() throws InterruptedException {
        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case1Runner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I am on home page again$")
    public void iAmOnHomePageAgain() {
        new HomePage().clickOnHomeButton();
    }

    @When("^I click on customer login tab$")
    public void iClickOnCustomerLoginTab() {
       new HomePage().clickOnCustomerLogin();
    }

    @When("^I repeat all Steps for customer login log out$")
    public void iRepeatAllStepsForCustomerLoginLogOut() throws InterruptedException {

        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case2Runner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I Search created customer$")
    public void iSearchCreatedCustomer() {
        new CustomerLoginPage().searchCustomerFromDropDown();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I verify logout tab display and click on logout$")
    public void iVerifyLogoutTabDisplayAndClickOnLogout() {
        new CustomerLoginPage().verifyLogoutTabAndClickOnLogoutPage();
    }

    @When("^I repeat all the steps for money deposit$")
    public void iRepeatAllTheStepsForMoneyDeposit() throws InterruptedException {

        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case3Runner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I click on deposit tab$")
    public void iClickOnDepositTab() {
        new CustomersPage().clickOnDeposit();
    }

    @And("^I enter amount (\\d+)$")
    public void iEnterAmount(int arg0) {
        new CustomersPage().enterAmount100();
    }

    @And("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new CustomersPage().clickOnDepositButtonLast();
    }

    @And("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String exp) {
        new CustomersPage().verifyDepositSuccessfully(exp);

    }

    @When("^I repeal all steps for withdraw money$")
    public void iRepealAllStepsForWithdrawMoney() throws InterruptedException {
        Thread T1 = new Thread(new Thread(() -> {
            JUnitCore jExecFeature = new JUnitCore();
            Result result = jExecFeature.run(Case4Runner.class);
        }));

        T1.start();
        T1.join();
    }

    @And("^I click on withdraw tab$")
    public void iClickOnWithdrawTab() {
        new CustomersPage().clickOnWithDrawl();
    }

    @And("^I enter amount (\\d+) for withdraw$")
    public void iEnterAmountForWithdraw(int amount) {
        new CustomersPage().enterWithDrawlAmount50();
    }

    @And("^I click on withdraw button$")
    public void iClickOnWithdrawButton() {
        new CustomersPage().clickOnWithdrawButton();
    }
}
