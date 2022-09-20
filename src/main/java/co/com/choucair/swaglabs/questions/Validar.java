package co.com.choucair.swaglabs.questions;

import co.com.choucair.swaglabs.model.Credencial;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<Boolean> {
 private Credencial tdatos;

    public Validar(Credencial tdatos) {
        this.tdatos = tdatos;
    }

    public static Validar bloqueo(Credencial tdatos) {
        return  new Validar(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String comprobrar= Text.of(LocalizarSwagLabs.NOLOGUIADO).viewedBy(actor).asString();
        String dato = tdatos.getLogueado();
        if(dato.equals(comprobrar)){
            resultado=true;

        }else {
            resultado=false;
        }
        return resultado;
    }
}
