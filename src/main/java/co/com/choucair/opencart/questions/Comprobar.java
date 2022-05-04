package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Comprobar implements Question {

    public static Comprobar devolucion() {
        return new Comprobar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagDashboard.COMPROBAR_INFO).viewedBy(actor).asString();
    }
}
