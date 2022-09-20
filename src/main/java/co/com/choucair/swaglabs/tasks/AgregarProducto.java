package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarProducto implements Task {

    public static AgregarProducto agregar() {
        return Tasks.instrumented(AgregarProducto.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LocalizarSwagLabs.AGREGAR),
                Click.on(LocalizarSwagLabs.CARRITO),
                Click.on(LocalizarSwagLabs.VERIFICAR)
        );

    }
}
