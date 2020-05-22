package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class AutenticationPages extends PageObject {

    //Campo usuario
    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    WebElementFacade USUARIO;
    //Campo clave
    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    WebElementFacade CLAVE;
    //Validación
    @FindBy(xpath = "//*[@id=\"toc\"]")
    WebElementFacade RESPUESTA;
    //Formulario
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    WebElementFacade CLICK_FORMULARIO;
    //Validación formulario
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    WebElementFacade CLICK_VALIDACION;
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

    public void ingresaAutenticar() {
        USUARIO.click();
        USUARIO.sendKeys("demo");
        CLAVE.click();
        CLAVE.typeAndEnter("demo");
    }
    public void validarRespuesta() {
        String labelv = "TOC";
        String strMensaje = RESPUESTA.getText();
        assertThat(strMensaje, containsString(labelv));
    }
    public void ingresarDatos() {
        CLICK_FORMULARIO.click();
        CLICK_VALIDACION.click();
    }
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
