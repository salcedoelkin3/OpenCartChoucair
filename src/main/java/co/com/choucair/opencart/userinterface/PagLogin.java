package co.com.choucair.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagLogin extends PageObject {
    public static final Target USUARIO = Target.the("ingresa usuario").located(By.id("input-username"));
    public static final Target CLAVE = Target.the("ingresa clave").located(By.id("input-password"));
    public static final Target LOGIN = Target.the("Boton login").located(By.xpath("//button[@type='submit']"));
}
