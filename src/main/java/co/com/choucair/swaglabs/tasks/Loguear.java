package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.model.TDatos;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguear implements Task {

    private TDatos tdatos;

    public Loguear(TDatos tdatos) {
        this.tdatos = tdatos;
    }


    public static Loguear ingresar(TDatos tdatos) {
        return Tasks.instrumented(Loguear.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Enter.theValue(tdatos.getUsuario()).into(LocalizarSwagLabs.INPUT_USUARIO),
             Enter.theValue(tdatos.getContrasenna()).into(LocalizarSwagLabs.INPUT_CONTRASENNA),
             Click.on(LocalizarSwagLabs.LOGIN)



     );

    }
}
