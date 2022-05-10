package com.taw.tests;

import com.hostfuly.taw.common.elements.Elements;
import com.taw.pageObjects.HostfilyOrbitzQueryPage;

public class BaseTest extends Elements {

    // vm options -Dbrowser=chrome -Denvironment=TEST

   public HostfilyOrbitzQueryPage orbitzQueryPage = new HostfilyOrbitzQueryPage();

    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.to($("URL"));
    }

    public void tear_down() {
        browser.close();
    }
}
