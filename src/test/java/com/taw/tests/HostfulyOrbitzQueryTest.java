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
    public void verifyLogIn() {
        button.click(orbitzQueryPage.loginButton);
        button.click(orbitzQueryPage.signInButton);
        input.type(orbitzQueryPage.username,"stefank3@gmail.com");
        input.type(orbitzQueryPage.password,"K4jc3vski1!");
        button.click(orbitzQueryPage.rememberMeCheckBox);
        button.click(orbitzQueryPage.loginSubmitBtn);
        validate.isElementPresent(orbitzQueryPage.homePageLogo);
        validate.isTitleValid("Orbitz Hotel Deals, Flights, Cheap Vacations & Rental Cars");

    }

    @Test
    public void verifySignInGoogleUserPurchase() {
        verifyLogIn();
        input.type(orbitzQueryPage.searchLocation, "Ohrid");
        button.click(orbitzQueryPage.submitSearchLocation);
        validate.isChecked(orbitzQueryPage.rating);
        validate.isChecked(orbitzQueryPage.neibourhood);

    }

    @AfterMethod
    public void tear_down() {

        browser.close();
    }


}
