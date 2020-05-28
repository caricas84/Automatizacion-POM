package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;


@DefaultUrl("https://es.calcuworld.com/deporte-y-ejercicio/calculadora-de-imc/")

public class ImcPage extends PageObject {

    public void ingresar_datos(String altura, String peso) {
        WebElementFacade alturas = find(By.xpath("//*[@id=\"post-90\"]/div/form/div/div[2]/table/tbody/tr[1]/td[2]/div/div/input"));
        alturas.type(altura);

        WebElementFacade pesos = find(By.xpath("//*[@id=\"post-90\"]/div/form/div/div[2]/table/tbody/tr[2]/td[2]/div/div/input"));
        pesos.type(peso);

        WebElement sexo = find(By.xpath("//*[@id=\"post-90\"]/div/form/div/div[2]/table/tbody/tr[3]/td[2]/label[2]"));
        sexo.click();

        WebElement btnCalcular = find(By.xpath("//*[@id=\"post-90\"]/div/form/div/div[2]/table/tbody/tr[4]/td[2]/div/p/button"));
        btnCalcular.click();

        JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void obtener_resultado(String resultado, String evidencia) {

        WebElement result = find(By.xpath("//*[@id=\"post-90\"]/div/div[3]/strong/h3/div"));
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
