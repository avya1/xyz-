package com.bank;

import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utilities;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utilities {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Anchal");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenShortPath = Utilities.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShortPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        closeBrowser();
    }
}
