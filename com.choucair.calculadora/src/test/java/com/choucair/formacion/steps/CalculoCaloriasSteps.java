package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CalculoCaloriasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CalculoCaloriasSteps {
    CalculoCaloriasPage calculoCaloriasPage;

    @Step

    public void abrir(){
        calculoCaloriasPage.open();
    }

    @Step
    public void menu(){
        calculoCaloriasPage.menuDeporte();
    }

    @Step
    public void diligenciar_datos(List<List<String>> data, int id)  {

        calculoCaloriasPage.Peso(data.get(id).get(0).trim());
        calculoCaloriasPage.Nivelact();
    }
    @Step
    public void calcular_datos()  {
        calculoCaloriasPage.Calcular();
    }
}
