package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FormInlineValidationPage extends PageObject {
    //CampoRequired
    @FindBy(xpath="//*[@id=\"required\"]")
    WebElementFacade Required;
    //Campo Email
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElementFacade txtEmail1;
    //Campo Password 1
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElementFacade Pass1;
    //Campo Password 2
    @FindBy(xpath = "//*[@id=\"confirm_password\"]")
    WebElementFacade Pass2;
    ///Campo Date
    @FindBy(xpath = "//*[@id=\"date\"]")
    WebElementFacade Date;
    //Campo Url
    @FindBy(xpath="//*[@id=\"url\"]")
    WebElementFacade Url;
    //Campo check
    @FindBy(xpath = "//*[@id=\"agree\"]")
    WebElementFacade Check;
    //CampoMinSize
    @FindBy(xpath = "//*[@id=\"minsize\"]")
    WebElementFacade Minsize;
    //Campo MaxSize
    @FindBy(xpath = "//*[@id=\"maxsize\"]")
    WebElementFacade Maxsize;
    //Campo MinNum
    @FindBy(xpath = "//*[@id=\"minNum\"]")
    public WebElementFacade MinNum;
    //Campo MaxNum
    @FindBy(xpath = "//*[@id=\"maxNum\"]")
    public WebElementFacade MaxNum;
    @FindBy(xpath="//*[@id=\"inline-validate\"]/div[12]/input")
    WebElementFacade btnValidate;
    //Globo Informativo
    @FindBy(xpath="//SPAN[@id='required-error']")
    public WebElementFacade globoInformativo;

    public void Required(String datoPrueba) {
        Required.click();
        Required.clear();
        Required.sendKeys(datoPrueba);
    }
    public void email(String datoPrueba) {
        txtEmail1.click();
        txtEmail1.clear();
        txtEmail1.sendKeys(datoPrueba);
    }
    public void password(String datoPrueba) {
        Pass1.click();
        Pass1.clear();
        Pass1.sendKeys(datoPrueba);
    }
    public void confirm_password(String datoPrueba) {
        Pass2.click();
        Pass2.clear();
        Pass2.sendKeys(datoPrueba);
    }
    public void date(String datoPrueba) {
        Date.click();
        Date.clear();
        Date.sendKeys(datoPrueba);
    }
    public void url(String datoPrueba) {
        Url.click();
        Url.clear();
        Url.sendKeys(datoPrueba);
    }

    public void check(){
        Check.click();
    }
    public void minimun_field_size(String datoPrueba) {
        Minsize.click();
        Minsize.clear();
        Minsize.sendKeys(datoPrueba);
    }
    public void maximun_field_size(String datoPrueba) {
        Maxsize.click();
        Maxsize.clear();
        Maxsize.sendKeys(datoPrueba);
    }

    public void minimun_num_size(String datoPrueba) {
        MinNum.click();
        MinNum.clear();
        MinNum.sendKeys(datoPrueba);
    }
    public void maximun_num_size(String datoPrueba) {
        MaxNum.click();
        MaxNum.clear();
        MaxNum.sendKeys(datoPrueba);
    }
    public void validate() {
        btnValidate.click();
    }
    public void form_sin_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(false));
    }
    public void form_con_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(true));
    }
}
