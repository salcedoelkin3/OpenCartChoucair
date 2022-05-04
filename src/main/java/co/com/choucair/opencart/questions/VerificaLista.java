package co.com.choucair.opencart.questions;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificaLista implements Question {
    private PagDashboard pagDashboard;

    public static VerificaLista pedidos() {return new VerificaLista();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagDashboard.VER_LIST_ORDER).viewedBy(actor).asString();
    }
}
