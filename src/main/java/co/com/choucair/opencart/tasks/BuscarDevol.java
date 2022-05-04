package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarDevol implements Task {
    private Datos datos;
    public BuscarDevol(Datos datos) {
        this.datos = datos;
    }

    public static BuscarDevol pedido(Datos datos) { return Tasks.instrumented(BuscarDevol.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getIdDevolucion()).into(PagDashboard.RETURN_ID),
                Click.on(PagDashboard.BUTTON_FILTER));
    }
}
