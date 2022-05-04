package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarVale implements Question {


    public static VerificarVale regalo() { return new  VerificarVale();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagDashboard.VERIF_VALE).viewedBy(actor).asString();
    }
}
