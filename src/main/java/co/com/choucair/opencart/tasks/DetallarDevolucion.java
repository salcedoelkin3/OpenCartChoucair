package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.PagDashboard;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DetallarDevolucion implements Task {


    public static DetallarDevolucion devolucion() {
        return Tasks.instrumented(DetallarDevolucion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagDashboard.DETALLE_RETURN));
    }
}

