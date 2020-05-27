package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://es.calcuworld.com")
public class RegladetresPage extends PageObject {

    //CampoMatemáticas
    @FindBy(xpath = "//*[@id=\'areas\']/div[1]/a")
    WebElementFacade Matemáticas;
    //Regladetres
    @FindBy(xpath = "//*[@id=\'relacionados\']/div[1]/a/h5")
    WebElementFacade Regladetres;
    //Valor1
    @FindBy(id="dividendo")
    WebElementFacade txtDividendo;
    //Valor2
    @FindBy(id="divisor")
    WebElementFacade txtDivisor;
    //Valor2
    @FindBy(xpath = "//*[@id=\'post-770\']/div/div[3]/div[2]/form/div[2]/div[1]/input")
    WebElementFacade txtValor3;
    //Botóncalcular
    @FindBy(xpath = "//*[@id=\'btnCalcular_regla_tres\']")
    WebElementFacade btnCalcular;

    public void menuMatematicas() {
        Matemáticas.click();
        Regladetres.click();
    }
    public void Valor1(String datoPrueba) {
        txtDividendo.click();
        txtDividendo.clear();
        txtDividendo.sendKeys(datoPrueba);
    }
    public void Valor2(String datoPrueba) {
        txtDivisor.click();
        txtDivisor.clear();
        txtDivisor.sendKeys(datoPrueba);
    }
    public void Valor3(String datoPrueba) {
        txtValor3.click();
        txtValor3.clear();
        txtValor3.sendKeys(datoPrueba);
    }
    public void CalcularRdt(){
        btnCalcular.click();
    }


}
