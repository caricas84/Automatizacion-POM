package com.choucair.formacion.definition;

import com.choucair.formacion.pageobjects.FormInlineValidationPage;
import com.choucair.formacion.steps.FormInlineValidationSteps;
import com.choucair.formacion.steps.InlineValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class InlineValidationDefinition {
    @Steps
    InlineValidationSteps inlineValidationSteps;
    @Steps
    FormInlineValidationSteps formInlineValidationSteps;

    @Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
        inlineValidationSteps.login_colorlib(Usuario, Clave);
    }

    @Given("^Ingreso a la funcionalidad Forms Validation$")
    public void ingreso_a_la_funcionalidad_Forms_Validation(){
        inlineValidationSteps.ingresar_form_validation();
    }

    @When("^Diligencio formulario Inline Validation$")
    public void diligencio_formulario_Inline_Validation(DataTable dtDatosForm){
        List<List<String>> data = dtDatosForm.raw();

        for(int i=1; i<data.size(); i++){
            formInlineValidationSteps.diligenciar_inline_datos_tabla(data, i);
        }
    }

    @Then("^verifico ingreso exitoso$")
    public void verifico_ingreso_exitoso(){
        formInlineValidationSteps.verificar_ingreso_datos_formulario_exitoso();
    }
}
