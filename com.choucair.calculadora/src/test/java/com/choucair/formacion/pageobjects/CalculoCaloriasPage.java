package com.choucair.formacion.pageobjects;

import cucumber.api.java.ca.Cal;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://es.calcuworld.com")
public class CalculoCaloriasPage extends PageObject {

    //CampoDeporte
    @FindBy(xpath = "//*[@id=\'areas\']/div[9]/a")
    WebElementFacade Deporte;
    //CalculadoraCalorias
    @FindBy(xpath = "//*[@id=\'relacionados\']/div[26]/a")
    WebElementFacade Calcalorias;
    //Peso
    @FindBy(xpath = "//*[@id=\'appendedInput\']")
    WebElementFacade txtPeso;
    //NivelActividad
    @FindBy(xpath = "//*[@id=\'post-646\']/div/div[3]/div/div/div/div[1]/form/div[2]/div/input[4]")
    WebElementFacade Nivelact;
    //Botóncalcular
    @FindBy(xpath = "//*[@id=\'post-646\']/div/div[3]/div/div/div/div[2]/a")
    WebElementFacade btnCalcular;
    //Form Validation - Label informativo
    @FindBy(xpath="//*[@id=\'spanResultado\']/div/div[1]/h3")
    public WebElementFacade lblFormValidation;

    public void menuDeporte() {
        Deporte.click();
        Calcalorias.click();
    }

    public void Peso(String datoPrueba) {
        txtPeso.click();
        txtPeso.clear();
        txtPeso.sendKeys(datoPrueba);
    }

    public void Nivelact(){
        Nivelact.click();
    }
    public void Calcular(){
        btnCalcular.click();
    }

}
