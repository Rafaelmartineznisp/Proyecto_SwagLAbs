package co.com.choucair.swaglabs.questions;

import co.com.choucair.swaglabs.model.TDatos;
import co.com.choucair.swaglabs.userinterface.LocalizarSwagLabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCompra implements Question<Boolean> {
    private TDatos tdatos;

    public ValidarCompra(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static ValidarCompra validar(TDatos tdatos) {
        return new ValidarCompra(tdatos);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String comprobrar= Text.of(LocalizarSwagLabs.COMPRA).viewedBy(actor).asString();
        String dato = tdatos.getVerificarcompra();
        if(dato.equals(comprobrar)){
            resultado=true;

        }else {
            resultado=false;
        }
        return resultado;
    }
}
