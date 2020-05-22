package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

    public class ColorlibMenuPage extends PageObject  {
        //Menú Forms
        @FindBy(xpath="//*[@id='menu']/li[6]/a/span[1]")
        public WebElementFacade menuForms;
        //Submenú Form General
        @FindBy(xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
        public WebElementFacade menuFormGenerals;
        //Submenú Form Validation
        @FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
        public WebElementFacade menuFormValidation;
        //Form Validation - Label informativo
        @FindBy(xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
        public WebElementFacade lblFormValidation;

        public void menuFormValidation(){
            menuForms.click();
            menuFormValidation.click();
            String strMensaje = lblFormValidation.getText();
            assertThat(strMensaje, containsString("Popup Validation"));
        }
}
