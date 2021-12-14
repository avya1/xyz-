$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BankTest.feature");
formatter.feature({
  "line": 1,
  "name": "XYZ Bank Test",
  "description": "As a user I am on home page of XYZ Bank and I can check all function perform by Bank manager and customer of bank",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7729575500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Bank manager should add customer successfully",
  "description": "",
  "id": "xyz-bank-test;bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Case1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on bank manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter firstname",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter postcode",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on  add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see popup window verify message and click on ok",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 101818100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 27075400,
  "error_message": "org.openqa.selenium.InvalidSelectorException: Compound class names not permitted\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#invalid_selector_exception\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027ANCHALT\u0027, ip: \u0027192.168.1.253\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: ManageDriver\r\n\tat org.openqa.selenium.By$ByClassName.\u003cinit\u003e(By.java:310)\r\n\tat org.openqa.selenium.By.className(By.java:100)\r\n\tat org.openqa.selenium.support.AbstractFindByBuilder.buildByFromShortFindBy(AbstractFindByBuilder.java:43)\r\n\tat org.openqa.selenium.support.FindBy$FindByBuilder.buildIt(FindBy.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.Annotations.buildBy(Annotations.java:79)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.\u003cinit\u003e(DefaultElementLocator.java:58)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.\u003cinit\u003e(DefaultElementLocator.java:46)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory.createLocator(DefaultElementLocatorFactory.java:33)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultFieldDecorator.decorate(DefaultFieldDecorator.java:57)\r\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:111)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:103)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:90)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:78)\r\n\tat com.bank.dirvermanager.ManageDriver.\u003cinit\u003e(ManageDriver.java:22)\r\n\tat com.bank.utility.Utilities.\u003cinit\u003e(Utilities.java:18)\r\n\tat com.bank.pages.HomePage.\u003cinit\u003e(HomePage.java:13)\r\n\tat com.bank.steps.BankTestSteps.iClickOnBankManagerLoginTab(BankTestSteps.java:25)\r\n\tat ✽.When I click on bank manager login tab(BankTest.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterFirstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterLastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterPostcode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iSeePopupWindowVerifyMessageAndClickOnOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 825954300,
  "status": "passed"
});
formatter.uri("case1.feature");
formatter.feature({
  "line": 1,
  "name": "XYZ Bank Test",
  "description": "As a user I am on home page of XYZ Bank and I can check all function perform by Bank manager and customer of bank",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3676904200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Bank manager should add customer successfully",
  "description": "",
  "id": "xyz-bank-test;bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Case1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on bank manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter firstname",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter postcode",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on  add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see popup window verify message and click on ok",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 46900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 2611800,
  "error_message": "org.openqa.selenium.InvalidSelectorException: Compound class names not permitted\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#invalid_selector_exception\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027ANCHALT\u0027, ip: \u0027192.168.1.253\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: ManageDriver\r\n\tat org.openqa.selenium.By$ByClassName.\u003cinit\u003e(By.java:310)\r\n\tat org.openqa.selenium.By.className(By.java:100)\r\n\tat org.openqa.selenium.support.AbstractFindByBuilder.buildByFromShortFindBy(AbstractFindByBuilder.java:43)\r\n\tat org.openqa.selenium.support.FindBy$FindByBuilder.buildIt(FindBy.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.Annotations.buildBy(Annotations.java:79)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.\u003cinit\u003e(DefaultElementLocator.java:58)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.\u003cinit\u003e(DefaultElementLocator.java:46)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory.createLocator(DefaultElementLocatorFactory.java:33)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultFieldDecorator.decorate(DefaultFieldDecorator.java:57)\r\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:111)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:103)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:90)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:78)\r\n\tat com.bank.dirvermanager.ManageDriver.\u003cinit\u003e(ManageDriver.java:22)\r\n\tat com.bank.utility.Utilities.\u003cinit\u003e(Utilities.java:18)\r\n\tat com.bank.pages.HomePage.\u003cinit\u003e(HomePage.java:13)\r\n\tat com.bank.steps.BankTestSteps.iClickOnBankManagerLoginTab(BankTestSteps.java:25)\r\n\tat ✽.When I click on bank manager login tab(case1.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterFirstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterLastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iEnterPostcode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankTestSteps.iSeePopupWindowVerifyMessageAndClickOnOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 820628600,
  "status": "passed"
});
});