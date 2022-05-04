package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerificarDevol implements Question {
    private PagDashboard pagDashboard;

    public static VerificarDevol orden() { return new VerificarDevol();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagDashboard.VERIF_DEV).viewedBy(actor).asString();
    }
}
