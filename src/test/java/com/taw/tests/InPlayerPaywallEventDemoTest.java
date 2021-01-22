package com.taw.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InPlayerPaywallEventDemoTest extends BaseTest {

    @BeforeMethod
    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.to($("InPlayerURL"));


    }

    @Test
    public void verifyCreateUserPurchase() {
        input.enter(paywallPage.buyButton);
        button.click(paywallPage.signUpButton);
        input.type(paywallPage.email, "testuser.inplayer@inplayer.com");
        input.type(paywallPage.fullName, "John Doe");
        input.type(paywallPage.password, "1234567890A!");
        input.type(paywallPage.confirmPassword, "1234567890A!");
        button.click(paywallPage.terms);
        button.click(paywallPage.confirmBtn);
        wait.visibilityOfElement(paywallPage.creditCardnumber);
        validate.isElementPresent(paywallPage.creditCardnumber);
        input.clear(paywallPage.creditCardnumber);
        input.type(paywallPage.creditCardnumber, "4111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.cardholderName, "Automation Candidate");
        input.type(paywallPage.expiryDate, "11");
        input.type(paywallPage.expiryDate, "22");
        input.type(paywallPage.cvcCode, "958");
        button.click(paywallPage.confirmBtn);
        validate.isElementPresent(paywallPage.validationText);
        wait.textToBe(paywallPage.validationText, "SUCCESS!");
        validate.textEquals(paywallPage.validationText, "SUCCESS!");

    }

    @Test
    public void verifySignInGoogleUserPurchase() {
        input.enter(paywallPage.buyButton);
        button.click(paywallPage.signInGoogle);
        input.type(paywallPage.gmailEmail, "inplayer.testuser1@gmail.com");
        button.click(paywallPage.googleNext);
        input.type(paywallPage.gmailpassword, "1234567890A!");
        button.click(paywallPage.googlePasswordNext);
        wait.visibilityOfElement(paywallPage.creditCardnumber);
        validate.isElementPresent(paywallPage.creditCardnumber);
        input.clear(paywallPage.creditCardnumber);
        input.type(paywallPage.creditCardnumber, "4111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.creditCardnumber, "1111");
        input.type(paywallPage.cardholderName, "Automation Candidate");
        input.type(paywallPage.expiryDate, "11");
        input.type(paywallPage.expiryDate, "22");
        input.type(paywallPage.cvcCode, "958");
        button.click(paywallPage.confirmBtn);
        validate.isElementPresent(paywallPage.validationText);
        wait.textToBe(paywallPage.validationText, "SUCCESS!");
        validate.textEquals(paywallPage.validationText, "SUCCESS!");

    }

    @AfterMethod
    public void tear_down() {

        browser.close();
    }


}
