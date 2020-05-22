package com.choucair.formacion.steps;

import au.com.bytecode.opencsv.CSVReader;
import com.choucair.formacion.pageobjects.AutenticationPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.FileReader;
import java.io.IOException;

public class ValidationSteps {

    AutenticationPages autenticationPages;
    @Step

    public void abrirFormulario() {
        autenticationPages.open();
        autenticationPages.ingresaAutenticar();
        autenticationPages.ingresarDatos();
    }

    public void llenarDatos(String id) throws IOException {
        String CSV_file = "src/test/resources/Datadriven/badeDatos.csv";
        CSVReader reader = null;
        reader = new CSVReader(new FileReader(CSV_file));
        String[] cell = reader.readNext();
        while ((cell = reader.readNext()) != null) {
            if (id.equals(cell[0])) { //.trim() elimina espacios a los lados
                autenticationPages.agregarREQUIRED(cell[1]);
                autenticationPages.agregarEMAIL(cell[2]);
                autenticationPages.agregarPASSWORD(cell[3]);
                autenticationPages.agregarCONFIRM_PASSWORD(cell[4]);
                autenticationPages.agregarDATE(cell[5]);
                autenticationPages.agregarURL(cell[6]);
                autenticationPages.agregarDIGITS_ONLY(cell[7]);
                autenticationPages.agregarRANGE(cell[8]);
            }
        }
        reader.close();
    }
}
