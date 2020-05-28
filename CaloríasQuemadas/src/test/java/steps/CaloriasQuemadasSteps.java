package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.CaloriasQuemadasPage;

public class CaloriasQuemadasSteps {

    CaloriasQuemadasPage caloriasQuemadasPage;
    @Step

    public void abrirpagina() {
        caloriasQuemadasPage.open();
    }

    @Step
    public void ingresardatos(String peso) {
        caloriasQuemadasPage.ingresar_datos(peso);
    }

    @Step
    public void obtenerresultado(String resultado, String evidencia) {
        caloriasQuemadasPage.obtener_resultado(resultado,evidencia);
    }
}


