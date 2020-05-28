package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CaloríasDiariasSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;

public class CaloríasDiariasDefinition {
  @Steps
  CaloríasDiariasSteps caloríasDiariasSteps;

  @Given("^que carolina necesita saber las calorías que debe consumir$")
  public void que_carolina_necesita_saber_las_calorías_que_debe_consumir() {
    caloríasDiariasSteps.abrir();
  }

  @When("^ella ingrese los valores necesarios$")
  public void ella_ingrese_los_valores_necesarios(DataTable dtDatosForm) {
    List<List<String>> data = dtDatosForm.raw();

    for(int i=1; i<data.size(); i++){
      caloríasDiariasSteps.diligenciar_datos(data, i);
    }
  }

  @Then("^se obtienen las calorias, se guarda la <evidencia>$")
  public void se_obtienen_las_calorias_se_guarda_la_evidencia() {
    caloríasDiariasSteps.obtiene_resultado();
  }

}
