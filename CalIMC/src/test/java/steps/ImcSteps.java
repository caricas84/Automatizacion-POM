package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.ImcPage;

public class ImcSteps {

    ImcPage imcPage;
    @Step

    public void abrirpagina() {
        imcPage.open();
    }

    @Step
    public void ingresardatos(String altura, String peso) {
        imcPage.ingresar_datos(altura,peso);
    }

    @Step
    public void obtenerresultado(String resultado, String evidencia) {
        imcPage.obtener_resultado(resultado,evidencia);
    }
}


