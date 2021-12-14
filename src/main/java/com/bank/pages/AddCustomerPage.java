package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utilities {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
public AddCustomerPage()
    {PageFactory.initElements(driver,this);}
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFistName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']" )
     WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
      WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
      WebElement addCustomerButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
      WebElement homeButton;


    public void fillFistName() {

        sendTextToElement(enterFistName, "James");
        log.info("duration is" +enterFistName.getText() + "<br>");
    }
    public void fillLastName(){

        sendTextToElement(enterLastName,"Ore");
        log.info("duration is" +enterLastName.getText() + "<br>");
    }
    public void fillPostCode(){

        sendTextToElement(postCode, "40001");
        log.info("duration is" +postCode.getText() + "<br>");
    }
    public void addCustomerButton()
    {
        log.info("duration is" +addCustomerButton.getText() + "<br>");
        clickOnElement(addCustomerButton);

    }
    public void verifyPopUpWindowAndClick(String exp){

        alertPopUpWindowAndVerifyText(exp);
    }
    public void clickOnHomeButton(){

        clickOnElement(homeButton);
        log.info("duration is" +homeButton.getText() + "<br>");
    }




}
