package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.LoginPage;
import com.choucair.formacion.pageobjects.MenuPage;
import net.thucydides.core.annotations.Step;

public class InlineValidationSteps {
    LoginPage loginPage;
    MenuPage menuPage;

    @Step

    public void login_colorlib(String strUsuario, String strPass){
        loginPage.open();
        loginPage.IngresarDatos(strUsuario, strPass);
        loginPage.VerificaHome();
    }
    @Step
    public void ingresar_form_validation(){
        menuPage.menuFormValidation();
    }


}
