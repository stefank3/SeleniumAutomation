package com.inPlayer.taw.common.elements;

import com.inPlayer.taw.common.Global;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Gjore.Zaharchev
 */
public class Alerts extends ElementBase {

    /**
     * Accepts the alert.
     */
    public void accept() {
        Global.waitElement.until(ExpectedConditions.alertIsPresent());
        Alert alert = Global.driver.switchTo().alert();
        alert.accept();
    }

    /**
     * Dismiss the alert.
     */
    public void dismiss() {
        Global.waitElement.until(ExpectedConditions.alertIsPresent());
        Alert alert = Global.driver.switchTo().alert();
        alert.dismiss();
    }

    /**
     * Types text in the alert.
     *
     * @param value String accepted
     */
    public void type(final String value) {
        Global.waitElement.until(ExpectedConditions.alertIsPresent());
        Alert alert = Global.driver.switchTo().alert();
        alert.sendKeys(value);
    }

    //TODO implement more methods if missing

}
