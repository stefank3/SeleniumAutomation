package com.selenium.automation.common.drivers;

import com.selenium.automation.common.Global;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author Gjore.Zaharchev
 */
public class Edge extends Global implements Drivers {

    public WebDriver browser() {
        System.setProperty("webdriver.edge.driver", drivers + "MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        return driver;
    }
}
