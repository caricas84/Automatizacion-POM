package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.ComprarPageObjects;

public class ComprarSteps {
    ComprarPageObjects comprarPageObjects;
    @Step

    public void abrirUrl(){comprarPageObjects.open();}
    @Step

    public void buscar(){comprarPageObjects.buscarTV();}

}
