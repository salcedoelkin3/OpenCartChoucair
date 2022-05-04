package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarTask implements Task {

    public static BuscarTask moduloPedidos() { return Tasks.instrumented(BuscarTask.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagDashboard.SALES),
                Click.on(PagDashboard.ORDERS));

    }
}
