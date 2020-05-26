package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CalculoCaloriasSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;

public class CalculoCalorias {
  @Steps
  CalculoCaloriasSteps calculoCaloriasSteps;

    @Given("^que carolina necesita saber las calorías que debe consumir$")
    public void que_carolina_necesita_saber_las_calorías_que_debe_consumir(){
        calculoCaloriasSteps.abrir();
        calculoCaloriasSteps.menu();
    }

    @When("^ella ingrese los valores necesarios$")
    public void ella_ingrese_los_valores_necesarios(DataTable dtDatosForm){
      List<List<String>> data = dtDatosForm.raw();

      for(int i=1; i<data.size(); i++){
        calculoCaloriasSteps.diligenciar_datos(data, i);
      }
    }

    @Then("^ella obtendra resultado esperado$")
    public void ella_obtendra_resultado_esperado(){
      calculoCaloriasSteps.calcular_datos();
    }
}
