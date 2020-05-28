package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CaloriasQuemadasSteps;

public class CaloriasQuemadasDefinition {

    @Steps
    CaloriasQuemadasSteps caloriasSteps;

    @Given("^se encuentra en la pagina de calcular calorias$")
    public void seEncuentraEnLaPaginaDeCalcularCalorias() {
        caloriasSteps.abrirpagina();
    }

    @When("^se ingresa un (\\d+), se escoge un nivel de actividad$")
    public void seEscogeUnaSeIngresaEl(String peso) {
        caloriasSteps.ingresardatos(peso);
    }

    @Then("^se obtienen las calorias \"([^\"]*)\", se guarda la \"([^\"]*)\"$")
    public void seObtienenLasCaloriasSeGuardaLa(String resultado, String evidencia) {
        caloriasSteps.obtenerresultado(resultado,evidencia);
    }


}
