package co.com.choucair.opencart.tasks;

import co.com.choucair.opencart.userinterface.PagOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirTask implements Task {
    private PagOpencart pagOpencart;

    public static AbrirTask Pagina() {return Tasks.instrumented(AbrirTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(Open.browserOn(pagOpencart));

    }
}
