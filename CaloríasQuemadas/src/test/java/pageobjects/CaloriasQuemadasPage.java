package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;


@DefaultUrl("https://es.calcuworld.com/deporte-y-ejercicio/calculadora-de-calorias-diarias/")

public class CaloriasQuemadasPage extends PageObject {

    public void ingresar_datos(String peso) {

        WebElementFacade pesos = find(By.xpath("//*[@id=\"appendedInput\"]"));
        pesos.type(peso);

        WebElement Nivel = find(By.xpath("//*[@id=\'post-646\']/div/div[3]/div/div/div/div[1]/form/div[2]/div/input[4]"));
        Nivel.click();

        WebElement btnCalcular = find(By.xpath("//*[@id=\'post-646\']/div/div[3]/div/div/div/div[2]/a"));
        btnCalcular.click();

        JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void obtener_resultado(String resultado, String evidencia) {

        WebElement result = find(By.xpath("//*[@id=\"spanResultado\"]/div/div[2]/p[1]/span"));
        String calorias = result.getText();

        calorias.contentEquals(resultado);

        TakesScreenshot captura = (TakesScreenshot)this.getDriver();
        File archivo = captura.getScreenshotAs(OutputType.FILE);
        File desti = new File("C:\\Users\\ccastano\\Desktop/" + evidencia +".png");
        try {
            FileUtils.copyFile(archivo,desti);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
