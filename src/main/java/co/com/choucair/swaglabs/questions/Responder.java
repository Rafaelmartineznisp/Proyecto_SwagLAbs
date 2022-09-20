package co.com.choucair.swaglabs.questions;

import co.com.choucair.swaglabs.model.TDatos;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Responder implements Question<Boolean> {
    private TDatos tdatos;
    //constructor
    public Responder(TDatos tdatos) {
        this.tdatos=tdatos;
    }

    public static Responder validar(TDatos tdatos) {
        return new Responder(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String comprobrar= Text.of(LocalizarSwagLabs.LOGUIADO).viewedBy(actor).asString();
        String dato = tdatos.getLogueado();
        if(dato.equals(comprobrar)){
            resultado=true;

        }else {
            resultado=false;
        }
        return resultado;
    }
}
