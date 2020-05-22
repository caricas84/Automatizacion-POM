package com.choucair.formacion.steps;

import au.com.bytecode.opencsv.CSVReader;
import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

import java.io.FileReader;
import java.io.IOException;

public class PopupValidationSteps {
    ColorlibLoginPage colorlibLoginPage;
    ColorlibMenuPage colorlibMenuPage;

    @Step

    public void abrir() {
        colorlibLoginPage.open();
    }

    public void ingresarUsuario() {
        colorlibLoginPage.ingresaAutenticar();
    }

    public void validar() {
        colorlibLoginPage.validarRespuesta();
    }
}
