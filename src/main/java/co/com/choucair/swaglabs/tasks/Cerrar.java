package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.model.TDatos;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Cerrar implements Task {

    public static Cerrar terminar() {
        return Tasks.instrumented(Cerrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LocalizarSwagLabs.MENU),
                         Click.on(LocalizarSwagLabs.SALIR)
                );

    }
}
