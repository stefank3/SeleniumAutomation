package com.taw.pageObjects;

import org.openqa.selenium.By;

public class HostfilyOrbitzQueryPage {


    public By loginButton = By.xpath("//*[@id='secondaryNav']/*[@id='gc-custom-header-nav-bar-acct-menu']/button");
    public By signInButton = By.cssSelector("a[data-stid|='link-header-account-signin']");
    public By username = By.id("FormEmailInput");
    public By password = By.id("loginFormPasswordInput");
    public By rememberMeCheckBox = By.id("loginFormRememberMeCheck");
    public By loginSubmitBtn = By.id("loginFormSubmitButton");
    public By searchLocation = By.cssSelector("button[aria-label|='Going to']");
    public By submitSearchLocation = By.cssSelector("button[data-testid|='submit-button']");
    public By homePageLogo = By.cssSelector("img[alt|='orbitz logo']");
    public By rating = By.cssSelector("input[id|='radio-guestRating-']");
    public By neibourhood = By.cssSelector("input[id|='radio-neighborhood-2651']");

}
