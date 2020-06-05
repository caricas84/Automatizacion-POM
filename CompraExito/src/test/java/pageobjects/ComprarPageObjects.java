package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.exito.com/")
public class ComprarPageObjects extends PageObject {
    public void buscarTV(){
        WebElementFacade tecnología = find(By.xpath("//*[@id=\"category-menu-exito\"]/div/nav/section/ul/li[2]"));
        tecnología.click();

        WebElementFacade tipoTec = find(By.xpath("//*[@id=\"category-menu-exito\"]/div/div/div[3]/div[2]/ul/li[3]/a"));
        tipoTec.click();


    }
}
