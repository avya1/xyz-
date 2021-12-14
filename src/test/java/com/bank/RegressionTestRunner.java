package com.bank;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",//feature path we need tp give from src full path till package we can write it in side the curly brasses as well like {""}
        plugin = {"pretty","html:target/cucumber-report/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html","json:target/RunCuke/cucumber.json"},//pretty to make it colour full//this link used to create target folder it creates by default cucumber report//2nd link is to get extended report(ye sab target ke ander create hoga dekhna dikhayega)
        tags="@Regression"

)
public class RegressionTestRunner {
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";//extendreport ke andar wala config file ka path hai src aur samne / lagega
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));//this will give your system name
        //Reporter.setSystemInfo("User Name", "Anchal");//this will give your name
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }


}

