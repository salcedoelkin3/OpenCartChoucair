package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarTask implements Task {
    private Datos datos;

    public RegistrarTask(Datos datos) {
        this.datos = datos;
    }

    public static RegistrarTask formulario(Datos datos) {
        return Tasks.instrumented(RegistrarTask.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getFromCode()).into(PagDashboard.CODIGO),
                Enter.theValue(datos.getFromName()).into(PagDashboard.FROM_NAME),
                Enter.theValue(datos.getFromEmail()).into(PagDashboard.FROM_EMAIL),
                Enter.theValue(datos.getToName()).into(PagDashboard.TO_NAME),
                Enter.theValue(datos.getToEmail()).into(PagDashboard.TO_EMAIL),
                Enter.theValue(datos.getMonto()).into(PagDashboard.AMOUNT),
                Click.on(PagDashboard.REGISTRAR));
    }
}
