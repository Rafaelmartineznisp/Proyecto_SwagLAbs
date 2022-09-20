package co.com.choucair.swaglabs.stepdefinitions;

import co.com.choucair.swaglabs.model.Credencial;
import co.com.choucair.swaglabs.questions.Responder;
import co.com.choucair.swaglabs.questions.ValidarCompra;
import co.com.choucair.swaglabs.tasks.AgregarProducto;
import co.com.choucair.swaglabs.tasks.Comprar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CompraStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Y("^selecciona los productos a adquirir$")
    public void seleccionaLosProductosAAdquirir() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.agregar());

    }

    @Y("^llena el formulario de compra$")
    public void llenaElFormularioDeCompra(List<Credencial> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Comprar.ingresar(tdatos.get(0)));

    }

    @Entonces("^verifica la comprar realizada$")
    public void verificaLaComprarRealizada(List<Credencial> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompra.validar(tdatos.get(0))));
    }
}
