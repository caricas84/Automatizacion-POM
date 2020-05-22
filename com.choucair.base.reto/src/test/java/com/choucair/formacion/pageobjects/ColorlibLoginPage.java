package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

    @DefaultUrl("https://colorlib.com/polygon/metis/login.html")
    public class ColorlibLoginPage extends PageObject {

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

    }