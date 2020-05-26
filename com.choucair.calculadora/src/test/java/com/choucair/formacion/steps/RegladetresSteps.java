package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.RegladetresPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class RegladetresSteps {
    RegladetresPage regladetresPage;

    @Step
    public void abrirM(){
        regladetresPage.open();
    }

    public  void menuM(){
        regladetresPage.menuMatematicas();
    }

    @Step
    public void diligenciar_datos_M(List<List<String>> data, int id)  {

        regladetresPage.Valor1(data.get(id).get(0).trim());
        //regladetresPage.Valor2(data.get(id).get(0).trim());
        regladetresPage.Valor3(data.get(id).get(0).trim());
    }
    @Step
    public void calcular_datos_Rdt()  {
        regladetresPage.CalcularRdt();
    }
}
