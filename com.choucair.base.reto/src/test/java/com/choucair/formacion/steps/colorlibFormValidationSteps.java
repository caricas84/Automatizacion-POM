package com.choucair.formacion.steps;

import au.com.bytecode.opencsv.CSVReader;
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import net.thucydides.core.annotations.Step;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class colorlibFormValidationSteps {
    ColorlibFormValidationPage colorlibFormValidationPage;
    ColorlibLoginPage colorlibLoginPage;
    @Step

    public void abrirFormulario() {
        colorlibLoginPage.open();
        colorlibLoginPage.ingresaAutenticar();
        colorlibLoginPage.ingresarDatos();
    }

    public void llenarDatos(String id) throws IOException {
        String CSV_file = "src/test/resources/Datadriven/badeDatos.csv";
        CSVReader reader = null;
        reader = new CSVReader(new FileReader(CSV_file));
        String[] cell = reader.readNext();
        while ((cell = reader.readNext()) != null) {
            if (id.equals(cell[0])) { //.trim() elimina espacios a los lados
                colorlibFormValidationPage.agregarREQUIRED(cell[1]);
                colorlibFormValidationPage.agregarEMAIL(cell[2]);
                colorlibFormValidationPage.agregarPASSWORD(cell[3]);
                colorlibFormValidationPage.agregarCONFIRM_PASSWORD(cell[4]);
                colorlibFormValidationPage.agregarDATE(cell[5]);
                colorlibFormValidationPage.agregarURL(cell[6]);
                colorlibFormValidationPage.agregarDIGITS_ONLY(cell[7]);
                colorlibFormValidationPage.agregarRANGE(cell[8]);
            }
        }
        reader.close();
    }
    }


