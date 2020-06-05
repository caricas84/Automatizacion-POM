package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.exito.com/")

public class ComprarPageObjects extends PageObject {

    public void buscarTV(){
        WebElementFacade tecnología = find(By.xpath("//*[@id=\"category-menu-exito\"]/div/nav/section/ul/li[2]"));
        tecnología.click();

        WebElementFacade tipoTec = find(By.xpath("//*[@id=\"category-menu-exito\"]/div/div/div[3]/div[2]/ul/li[1]/a"));
        tipoTec.click();
        waitFor(20).second();

        WebElementFacade tipoPantalla = find(By.xpath("//*[@id=\"Curvo\"]"));
        tipoPantalla.click();
        waitFor(20).second();

        WebElementFacade marca = find(By.xpath("//*[@id=\"SAMSUNG\"]"));
        marca.click();
        waitFor(13).second();

        WebElementFacade seleccionado = find(By.xpath("//IMG[@src='https://exitocol.vtexassets.com/arquivos/ids/2047871-500-auto?width=500&height=auto&aspect=true']"));
        seleccionado.click();
        waitFor(13).second();

        WebElementFacade agregar = find(By.xpath("//P[@class='exito-vtex-components-4-x-buyButtonLabel'][text()='¡Lo quiero!']"));
        agregar.click();
        waitFor(13).second();

        WebElementFacade carrito = find(By.xpath("//SPAN[@class='exito-header-3-x-minicartSpan'][text()='Mi carrito']"));
        carrito.click();
        waitFor(13).second();

        WebElementFacade textcarrito = find(By.xpath("//*[@id=\"product-name1497625\"]"));
        textcarrito.getText();
        waitFor(13).second();
    }
    public void verificarCompra() {

        WebElementFacade textcarrito = find(By.xpath("//*[@id=\"product-name1497625\"]"));
        //textcarrito.getText();
        waitFor(13).second();

        String canasta = textcarrito.getText();
        assertThat(canasta,containsString("Televisor LED Samsung Curvo 55 Pulgadas UHD 4K Smart Serie 7"));

    }
}
