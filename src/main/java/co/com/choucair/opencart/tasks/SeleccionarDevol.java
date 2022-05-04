package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagDashboard;
import co.com.choucair.opencart.util.MisMetodos;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarDevol implements Task {

    private  Datos datos;
    public SeleccionarDevol(){
        this.datos=datos;

    }


    public static SeleccionarDevol  ventas(Datos datos) {
        return Tasks.instrumented(SeleccionarDevol.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PagDashboard.SALES),
                Click.on(PagDashboard.RETURNS)
                );

    }
}
