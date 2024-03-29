package com.saucedemo;

import com.cucumber.listener.Reporter;
import com.saucedemo.browserfactory.ManageBrowser;
import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            String screeShotPath = Utility.getScreenshot(ManageBrowser.driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screeShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }
}
