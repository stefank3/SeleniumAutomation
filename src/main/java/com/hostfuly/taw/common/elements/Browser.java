package com.hostfuly.taw.common.elements;

import com.hostfuly.taw.common.utility.Constants;
import com.hostfuly.taw.common.Global;
import com.hostfuly.taw.common.drivers.SetUp;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browser extends ElementBase {

    //TODO implement method logic from SetUp class

    /**
     *
     */

    private final SetUp setUp = new SetUp();

    /**
     * Used to open browser and set Explicit wait
     */
    public void open() {
        setUp.setBrowser();
        setExplicitWait();
    }

    /**
     * Maximizes the browser
     */
    public void maximize() {
        try {
            Global.driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Set location of the browser
     *
     * @param x width
     * @param y height
     */
    public void move(final int x, final int y) {
        try {
            Global.driver.manage().window().setPosition(new Point(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Maximize the browser
     *
     * @param x width
     * @param y height
     */
    public void resize(final int x, final int y) {
        Dimension dimension = new Dimension(x, y);
        try {
            Global.driver.manage().window().setSize(dimension);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void minimize() {
        Global.driver.manage().window().setPosition(new Point(-2000, 0));
    }

    public void fullScreen() {
        Global.driver.manage().window().fullscreen();
    }

    /**
     * Close any instances of webdriver.
     */

    public void close() {
        Global.driver.quit();
    }

    private void setExplicitWait() {

        try {
            Global.waitElement = new WebDriverWait(Global.driver, Constants.ELEMENT_LOAD_TIMEOUTS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
