package com.choucair.formacion.definition;

import com.choucair.formacion.steps.AutenticationSteps;
import com.choucair.formacion.steps.ValidationSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Autentication {

    @Steps
    AutenticationSteps autenticationSteps;
    ValidationSteps validationSteps;

    @Dado("^que carolina requiere autenticarse$")
    public void que_carolina_requiere_autenticarse(){
        autenticationSteps.abrir();
    }

    @Cuando("^ella ingresa usuario y contraseña en la plataforma$")
    public void ella_ingresa_usuario_y_contraseña_en_la_plataforma(){
        autenticationSteps.ingresarUsuario();
    }

    @Entonces("^ella verifica respuesta exitosa TOC$")
    public void ella_verifica_respuesta_exitosa_TOC() {
        autenticationSteps.validar();
    }
}
