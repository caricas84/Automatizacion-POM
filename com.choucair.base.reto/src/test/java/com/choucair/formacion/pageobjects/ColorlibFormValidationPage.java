package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class ColorlibFormValidationPage extends PageObject {
    //Campo Required
    @FindBy(xpath = "//*[@id=\"required2\"]")
    WebElementFacade REQUIRED;
    //Campo Email
    @FindBy(xpath = "//*[@id=\"email2\"]")
    WebElementFacade EMAIL;
    //Campo Password
    @FindBy(xpath = "//*[@id=\"password2\"]")
    WebElementFacade PASSWORD;
    //Campo Confirm Password
    @FindBy(xpath = "//*[@id=\"confirm_password2\"]")
    WebElementFacade CONFIRM_PASSWORD;
    ///Campo Date
    @FindBy(xpath = "//*[@id=\"date2\"]")
    WebElementFacade DATE;
    //Campo Url
    @FindBy(xpath = "//*[@id=\"url2\"]")
    WebElementFacade URL;
    //Campo Digist Only
    @FindBy(xpath = "//*[@id=\"digits\"]")
    WebElementFacade DIGITS_ONLY;
    //Campo Range
    @FindBy(xpath = "//*[@id=\"range\"]")
    WebElementFacade RANGE;
    //Campo check
    @FindBy(xpath = "//*[@id=\"agree2\"]")
    WebElementFacade CHECK;

    public void agregarREQUIRED(String required) {
        REQUIRED.sendKeys(required);
    }
    public void agregarEMAIL(String email) {
        EMAIL.sendKeys(email);
    }
    public void agregarPASSWORD(String password) {
        PASSWORD.sendKeys(password);
    }
    public void agregarCONFIRM_PASSWORD(String confirm_password) {
        CONFIRM_PASSWORD.sendKeys(confirm_password);
    }
    public void agregarDATE(String date) {
        DATE.sendKeys(date);
    }
    public void agregarURL(String url) {
        URL.sendKeys(url);
    }
    public void agregarDIGITS_ONLY(String digits) {
        DIGITS_ONLY.sendKeys(digits);
    }
    public void agregarRANGE(String range) {
        RANGE.sendKeys(range);
        CHECK.click();
    }
}
