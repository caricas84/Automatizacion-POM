package com.choucair.formacion.pageobjects;

import cucumber.api.java.ca.Cal;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


//@DefaultUrl("https://es.calcuworld.com")
@DefaultUrl("https://es.calcuworld.com/deporte-y-ejercicio/calculadora-de-calorias-diarias/")
public class CaloríasDiariasPage extends PageObject {

   /* //CampoDeporte
    @FindBy(xpath = "//*[@id=\'areas\']/div[9]/a")
    WebElementFacade Deporte;
    //CalculadoraCalorias
    @FindBy(xpath = "//*[@id=\'relacionados\']/div[26]/a")
    WebElementFacade Calcalorias;*/
    //Peso
    @FindBy(xpath = "//*[@id=\'appendedInput\']")
    WebElementFacade Peso;
    //NivelActividad
    @FindBy(xpath = "//*[@id=\'post-646\']/div/div[3]/div/div/div/div[1]/form/div[2]/div/input[4]")
    WebElementFacade Nivelact;
    //Botóncalcular
    @FindBy(xpath = "//*[@id=\'post-646\']/div/div[3]/div/div/div/div[2]/a")
    WebElementFacade btnCalcular;
    //Form Validation - Label informativo
    @FindBy(xpath="//*[@id=\'spanResultado\']/div/div[1]/h3")
    public WebElementFacade lblFormValidation;

    /*public void menuDeporte() {
        Deporte.click();
        Calcalorias.click();
    }*/

    public void agregarPeso(String required) {Peso.sendKeys(required);}
    public void agregarNivelact(){Nivelact.click();}
    public void agregarCalcular(){btnCalcular.click();}

}
