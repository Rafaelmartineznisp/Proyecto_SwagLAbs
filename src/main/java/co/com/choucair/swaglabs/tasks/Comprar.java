package co.com.choucair.swaglabs.tasks;

import co.com.choucair.swaglabs.model.TDatos;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Comprar implements Task {



    private TDatos tdatos;

    public Comprar(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static Comprar ingresar(TDatos tdatos) {
        return Tasks.instrumented(Comprar.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tdatos.getNombre()).into(LocalizarSwagLabs.NOMBRE),
                Enter.theValue(tdatos.getApellido()).into(LocalizarSwagLabs.APELLIDO),
                Enter.theValue(tdatos.getCodigopostal()).into(LocalizarSwagLabs.POSTAL),
                Click.on(LocalizarSwagLabs.CONTINUAR),
                Click.on(LocalizarSwagLabs.FINALIZAR)

        );

    }
}
