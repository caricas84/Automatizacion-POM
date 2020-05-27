package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.FormInlineValidationPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class FormInlineValidationSteps {
    FormInlineValidationPage formInlineValidationPage;
    @Step
    public void diligenciar_inline_datos_tabla(List<List<String>> data, int id) {
        formInlineValidationPage.Required(data.get(id).get(0).trim());
        formInlineValidationPage.email(data.get(id).get(1).trim());
        formInlineValidationPage.password(data.get(id).get(2).trim());
        formInlineValidationPage.confirm_password(data.get(id).get(3).trim());
        formInlineValidationPage.date(data.get(id).get(4).trim());
        formInlineValidationPage.url(data.get(id).get(5).trim());
        formInlineValidationPage.check();
        formInlineValidationPage.minimun_field_size(data.get(id).get(6).trim());
        formInlineValidationPage.maximun_field_size(data.get(id).get(7).trim());
        formInlineValidationPage.minimun_num_size(data.get(id).get(8).trim());
        formInlineValidationPage.maximun_num_size(data.get(id).get(9).trim());
        formInlineValidationPage.validate();
    }
    @Step
    public void verificar_ingreso_datos_formulario_exitoso(){
        formInlineValidationPage.form_sin_errores();
    }
    @Step
    public void verificar_ingreso_datos_con_errores(){
        formInlineValidationPage.form_con_errores();
    }
}
