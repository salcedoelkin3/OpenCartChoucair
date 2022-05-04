package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import co.com.choucair.opencart.util.MisMetodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificaDetalle implements Question<Boolean> {
    private MisMetodos misMetodos;
    private Datos datos;

    public VerificaDetalle(Datos datos) {
        this.datos = datos;
    }

    public static VerificaDetalle orden(Datos datos) {return new VerificaDetalle(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean verificacion;
        String lblDetalle = Text.of(misMetodos.INFORMACION(datos.getInfo())).viewedBy(actor).asString();
        if (lblDetalle == datos.getInfo()) {
            verificacion = true;
        }else {
            verificacion = false;
        }
        return true;
    }
}
