package com.hostfuly.taw.common.drivers;

import com.hostfuly.taw.common.Global;
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
