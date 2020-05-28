package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CaloríasDiariasPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class CaloríasDiariasSteps {

    CaloríasDiariasPage caloríasDiariasPage;
    @Step
    public void abrir(){
        caloríasDiariasPage.open();
    }
    @Step
    public void diligenciar_datos(List<List<String>> data, int id)  {
        caloríasDiariasPage.agregarPeso(data.get(id).get(0).trim());
        caloríasDiariasPage.agregarNivelact();
    }
    @Step
    public void obtiene_resultado()  {
        caloríasDiariasPage.agregarCalcular();
    }

}
