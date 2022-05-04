package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.PagDashboard;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarRegistro implements Question {
    public static VerificarRegistro fallido() {
        return new VerificarRegistro();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagDashboard.GUARDAR_REGISTRO).viewedBy(actor).asString();
    }
}
