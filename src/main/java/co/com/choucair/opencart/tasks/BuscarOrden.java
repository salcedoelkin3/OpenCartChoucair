package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarOrden implements Task {
    private Datos datos;

    public BuscarOrden(Datos datos) {
        this.datos = datos;
    }

    public static BuscarOrden venta(Datos datos) { return Tasks.instrumented(BuscarOrden.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getIdpedidos()).into(PagDashboard.ORDER_ID),
                Click.on(PagDashboard.BUTTON_FILTER));

    }
}
