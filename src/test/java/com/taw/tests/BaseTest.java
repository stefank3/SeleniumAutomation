package com.taw.tests;

import com.inPlayer.taw.common.elements.Elements;
import com.taw.pageObjects.InPlayerPaywallEventDemoPage;

public class BaseTest extends Elements {

    // vm options -Dbrowser=chrome -Denvironment=TEST

   public InPlayerPaywallEventDemoPage paywallPage = new InPlayerPaywallEventDemoPage();

    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.to($("URL"));
    }

    public void tear_down() {
        browser.close();
    }
}
