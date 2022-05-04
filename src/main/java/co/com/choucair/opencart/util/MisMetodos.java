package co.com.choucair.opencart.util;


import co.com.choucair.opencart.model.Datos;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MisMetodos extends PageObject {
    private  Datos datos;
    public MisMetodos(){this.datos=datos;}

    public static Target INFORMACION(String value) {
        String dato = "//h3[contains(text(),'";
        String dato2 = "')]";
        String datoFinal = dato + value + dato2;
        return Target.the("verifica orden").located(By.xpath(datoFinal));
    }





    }






