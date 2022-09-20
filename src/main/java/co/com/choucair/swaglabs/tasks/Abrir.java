package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.userinterface.SwagLabsPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private SwagLabsPagina swagLabsPagina;

    public static Abrir pagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(swagLabsPagina));
    }
}
