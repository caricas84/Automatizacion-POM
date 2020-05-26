package com.choucair.formacion.definition;

import com.choucair.formacion.steps.RegladetresSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class Regladetresdef {
    @Steps
    RegladetresSteps regladetresSteps;

    @Given("^que carolina necesita saber el resultado de una regla de tres$")
    public void que_carolina_necesita_saber_el_resultado_de_una_regla_de_tres() {
        regladetresSteps.abrirM();
        regladetresSteps.menuM();
    }

    @When("^ella ingrese los números necesarios$")
    public void ella_ingrese_los_números_necesarios(DataTable dtDatosForm) {
        List<List<String>> data = dtDatosForm.raw();

        for(int i=1; i<data.size(); i++){
            regladetresSteps.diligenciar_datos_M(data, i);
        }
    }

    @Then("^ella tendra resultado$")
    public void ella_tendra_resultado_esperado(){
        regladetresSteps.calcular_datos_Rdt();
    }

}

