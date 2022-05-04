package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Detalle implements Task {


    public static Detalle orden() { return Tasks.instrumented(Detalle.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagDashboard.DETALLE));
    }
}
