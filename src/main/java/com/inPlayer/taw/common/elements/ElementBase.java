package com.inPlayer.taw.common.elements;

import com.inPlayer.taw.common.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * @author gjore.zaharchev
 */
class ElementBase extends Global {

    /**
     * @param by provide locator
     * @return single WebElement
     */
    WebElement getElement(final By by) {
        return waitElement.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * @param by provide locator
     * @return list of WebElement
     */
    List<WebElement> getAllElements(final By by) {
        return waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((by)));
    }
}
