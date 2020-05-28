package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ImcSteps;

public class ImcDefinition {

    @Steps
    ImcSteps imcSteps;

    @Given("^carolina se encuentra en la pagina para calcular IMC$")
    public void carolinaSeEncuentraEnLaPaginaParaCalcularIMC() {
        imcSteps.abrirpagina();

    }

    @When("^se ingresa la (\\d+), un (\\d+) y sexo$")
    public void seIngresaLaUnYSexo(String altura, String peso)  {
        imcSteps.ingresardatos(altura,peso);

    }

    @Then("^se obtiene \"([^\"]*)\" y se guarda la \"([^\"]*)\"$")
    public void seObtienenLasCaloriasSeGuardaLa(String resultado, String evidencia) {
        imcSteps.obtenerresultado(resultado,evidencia);
    }


}
