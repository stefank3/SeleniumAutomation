package com.taw.tests;


import com.google.common.base.Verify;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HostfulyOrbitzQueryTest extends BaseTest {

    @BeforeMethod
    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.to($("hostfulyURL"));


    }


    @Test
    public void verifyRentalSearch() {
        validate.isElementPresent(orbitzQueryPage.homePageLogo);
        validate.isTitleValid("Orbitz Hotel Deals, Flights, Cheap Vacations & Rental Cars");
        button.click(orbitzQueryPage.searchLocation);
        input.type(orbitzQueryPage.inputLocation, "Ohrid");
        button.click(orbitzQueryPage.selectLocResult);
        button.click(orbitzQueryPage.submitSearchLocation);
        validate.isChecked(orbitzQueryPage.rating);
        validate.isChecked(orbitzQueryPage.neibourhood);

    }

    @AfterMethod
    public void tear_down() {

        browser.close();
    }


}
