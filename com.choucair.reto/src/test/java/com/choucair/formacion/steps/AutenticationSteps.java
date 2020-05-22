package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AutenticationPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class AutenticationSteps {

    AutenticationPages autenticationPages;
    @Step

    public void abrir() {
        autenticationPages.open();
    }

    public void ingresarUsuario() {
        autenticationPages.ingresaAutenticar();
    }

    public void validar() {
        autenticationPages.validarRespuesta();
    }
}
