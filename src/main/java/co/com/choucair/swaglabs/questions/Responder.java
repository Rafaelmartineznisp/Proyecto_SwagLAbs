package co.com.choucair.swaglabs.questions;

import co.com.choucair.swaglabs.model.Credencial;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Responder implements Question<Boolean> {
    private Credencial credencial;

    public Responder(Credencial credencial) {
        this.credencial=credencial;
    }

    public static Responder validar(Credencial credencial) {
        return new Responder(credencial);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String comprobrar= Text.of(LocalizarSwagLabs.LOGUIADO).viewedBy(actor).asString();
        String dato = credencial.getLogueado();
        if(dato.equals(comprobrar)){
            resultado=true;

        }else {
            resultado=false;
        }
        return resultado;
    }
}
