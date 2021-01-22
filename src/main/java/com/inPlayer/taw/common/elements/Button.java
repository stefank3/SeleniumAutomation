package com.inPlayer.taw.common.elements;

import com.inPlayer.taw.common.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Gjore.Zaharchev
 */
public class Button extends ElementBase {

    /**
     * Submits the form by any form element.
     *
     * @param by provide locator
     */
    public void submit(final By by) {
        getElement(by).submit();
    }

    /**
     * Submits the form by any form element using index.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public void submit(final By by, final int index) {
        getAllElements(by).get(index).submit();
    }

    /**
     * Click on particular button or link.
     *
     * @param by provide locator
     */
    public void click(final By by) {
        getElement(by).click();
    }

    /**
     * Click on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public void click(final By by, final int index) {
        getAllElements(by).get(index).click();
    }

    /**
     * Double Click on particular button or link.
     *
     * @param by provide locator
     */
    public void doubleClick(final By by) {
        (new Actions(Global.driver)).doubleClick(getElement(by)).perform();
    }

    /**
     * Double Click on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public void doubleClick(final By by, final int index) {
        (new Actions(Global.driver)).doubleClick(getAllElements(by).get(index)).perform();
    }

    /**
     * Right click on particular button or link.
     *
     * @param by provide locator
     */
    public void rightClick(final By by) {
        (new Actions(Global.driver)).contextClick(getElement(by)).perform();
    }

    /**
     * Right Click on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public void rightClick(final By by, final int index) {
        (new Actions(Global.driver)).contextClick(getAllElements(by).get(index)).perform();
    }

    /**
     * Mouse Over on particular button or link.
     *
     * @param by provide locator
     */
    public void mouseOver(final By by) {
        (new Actions(Global.driver)).moveToElement(getElement(by)).perform();
    }

    /**
     * Mouse Over on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public void mouseOver(final By by, final int index) {
        (new Actions(Global.driver)).moveToElement(getAllElements(by).get(index)).perform();
    }

    public void jsClickBy(By by) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", by);
    }
}
