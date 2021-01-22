package com.taw.pageObjects;

import org.openqa.selenium.By;

public class InPlayerPaywallEventDemoPage  {


    public By loginButton = By.id("inplayer_login");
    public By signUpButton = By.linkText("SIGN UP");
    public By signInGoogle = By.xpath("//div[contains(@class,'socialoptions')]");
    public By gmailEmail = By.xpath("//*[@id='identifierId']");
    public By gmailpassword = By.xpath("//*[@id='password']/div[1]/div/div[1]/input");
    public By googleNext = By.xpath("//*[@id='identifierNext']/div/button/div[2]");
    public By googlePasswordNext = By.xpath("//*[@id='passwordNext']/div/button/div[2]");
    public By email = By.id("email");
    public By fullName = By.id("full_name");
    public By password = By.id("password");
    public By confirmPassword = By.id("password_confirmation");
    public By terms = By.id("ipx-register");
    public By confirmBtn = By.cssSelector("button[class|='inplayer-button']");
    public By buyButton = By.xpath("//*[@id='inplayer-73831']/div/div[3]/button");
    public By creditCardnumber = By.id("cnumber");
    public By cardholderName = By.id("cardName");
    public By expiryDate = By.id("expiry");
    public By cvcCode = By.id("cvc");
    public By validationText = By.xpath("//div[contains(@class,'inplayer-paywall')]/div/div[2]/div[3]/h4/span");
    public By inPlayerProfile = By.xpath("//div[contains(@class,'inplayer-toggle-menu')]");
    public By inPlayerMyAccount = By.className("inplayer-myaccount-btn");
    public By deleteAccount = By.xpath("//*[@id='ipx-maincontent']/div[3]/button[2]");





}
