package com.bank.pages;

import com.bank.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utilities {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    public CustomerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement logOut;
     public void searchCustomerFromDropDown(){
         selectFromDropDown(searchCustomer,"6");
         log.info("duration is" +searchCustomer.getText() + "<br>");
     }
     public void clickOnLoginButton(){
         log.info("duration is" +loginButton.getText() + "<br>");
         clickOnElement(loginButton);

     }
     public void verifyLogoutTabAndClickOnLogoutPage(){
         Boolean isDisplay=driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
         if(isDisplay){
             String exp="James Ore";
             verifyPage(exp,logOut);
         }
         else{
             System.out.println("logOut tab is not display");
         }
     }


}
