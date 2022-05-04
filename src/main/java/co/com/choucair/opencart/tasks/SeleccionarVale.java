package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarVale implements Task {

    public static SeleccionarVale regalos() { return Tasks.instrumented(SeleccionarVale.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagDashboard.SALES),
                Click.on(PagDashboard.VALE),
                Click.on(PagDashboard.VALE_REGALO));
        
    }
}
