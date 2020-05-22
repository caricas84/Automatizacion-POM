package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationDefinition {

    @Steps
    PopupValidationSteps popupValidationSteps;
    @Steps
    com.choucair.formacion.steps.colorlibFormValidationSteps colorlibFormValidationSteps;

    @Given("^que carolina requiere autenticarse$")
    public void que_carolina_requiere_autenticarse(){
        popupValidationSteps.abrir();
    }

    @When("^ella ingresa usuario y contraseña en la plataforma$")
    public void ella_ingresa_usuario_y_contraseña_en_la_plataforma(){
        popupValidationSteps.ingresarUsuario();
    }

    @Then("^ella verifica respuesta exitosa TOC$")
    public void ella_verifica_respuesta_exitosa_TOC() {
        popupValidationSteps.validar();
    }

    @Given("^que carolina necesita validar un usuario$")
    public void que_carolina_necesita_validar_un_usario(){
        colorlibFormValidationSteps.abrirFormulario();
    }

    @When("^cuando lo ingresar a la plataforma \"([^\"]*)\"$")
    public void cuando_lo_ingresar_a_la_plataforma(String id){
        try {
            colorlibFormValidationSteps.llenarDatos(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^carolina verifica validacion exitosa o fallida$")
    public void carolina_verifica_validacion_exitosa_o_fallida(){
        // Write code here that turns the phrase above into concrete actions
    }

}
