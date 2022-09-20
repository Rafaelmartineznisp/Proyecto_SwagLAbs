package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.model.Credencial;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguear implements Task {

    private Credencial credencial;

    public Loguear(Credencial credencial) {
        this.credencial = credencial;
    }


    public static Loguear ingresar(Credencial credencial) {
        return Tasks.instrumented(Loguear.class,credencial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Enter.theValue(credencial.getUsuario()).into(LocalizarSwagLabs.INPUT_USUARIO),
             Enter.theValue(credencial.getContrasenna()).into(LocalizarSwagLabs.INPUT_CONTRASENNA),
             Click.on(LocalizarSwagLabs.LOGIN)



     );

    }
}
