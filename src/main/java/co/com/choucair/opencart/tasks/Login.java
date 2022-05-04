package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.model.Datos;
import co.com.choucair.opencart.userinterface.PagLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private Datos datos;

    public Login(Datos datos) {
        this.datos = datos;
    }

    public static Login acceso(Datos datos) {
        return Tasks.instrumented(Login.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getUsuario()).into(PagLogin.USUARIO),
                Enter.theValue(datos.getClave()).into(PagLogin.CLAVE),
                Click.on(PagLogin.LOGIN));

    }
}
