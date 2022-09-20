package co.com.choucair.swaglabs.stepdefinitions;
import co.com.choucair.swaglabs.model.Credencial;
import co.com.choucair.swaglabs.questions.Responder;
import co.com.choucair.swaglabs.questions.Validar;
import co.com.choucair.swaglabs.tasks.Abrir;
import co.com.choucair.swaglabs.tasks.Loguear;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SwaglabsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la plataforma web swaglab$")
    public void queElUsuarioIngresaALaPlataformaWebSwaglab() {
        OnStage.theActorCalled("JUAN").wasAbleTo(Abrir.pagina());
    }

    @Cuando("^digita las credenciales de acceso$")
    public void digitaLasCredencialesDeAcceso(List<Credencial> credencials) {
        OnStage.theActorInTheSpotlight().attemptsTo(Loguear.ingresar(credencials.get(0)));
    }

    @Entonces("^verifica el ingreso$")
    public void verificaElIngreso(List<Credencial> credencials) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.validar(credencials.get(0))));
    }

    @Entonces("^verifica el no ingreso$")
    public void verificaElNoIngreso(List<Credencial> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.bloqueo(tdatos.get(0))));
    }

    @Entonces("^verifica el ingreso con problemas$")
    public void verificaElIngresoConProblemas(List<Credencial> credencials) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.validar(credencials.get(0))));
    }

    @Entonces("^verifica el ingreso sin problemas$")
    public void verificaElIngresoSinProblemas(List<Credencial> credencials) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.validar(credencials.get(0))));
    }
}
