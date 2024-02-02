package com.selenium.automation.tests;

import com.selenium.automation.common.elements.Elements;

public class BaseTest extends Elements {

    // vm options -Dbrowser=chrome -Denvironment=TEST

    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.to($("URL"));
    }

    public void tear_down() {
        browser.close();
    }
}
