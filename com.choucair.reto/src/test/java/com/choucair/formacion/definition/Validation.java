package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ValidationSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Validation {
    @Steps
    ValidationSteps validationSteps;

    @Dado("^que carolina necesita validar un usuario$")
    public void que_carolina_necesita_validar_un_usario(){
        validationSteps.abrirFormulario();
    }

    @Cuando("^cuando lo ingresar a la plataforma \"([^\"]*)\"$")
    public void cuando_lo_ingresar_a_la_plataforma(String id){
        try {
            validationSteps.llenarDatos(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Entonces("^carolina verifica validacion exitosa o fallida$")
    public void carolina_verifica_validacion_exitosa_o_fallida(){
        // Write code here that turns the phrase above into concrete actions
    }

}
